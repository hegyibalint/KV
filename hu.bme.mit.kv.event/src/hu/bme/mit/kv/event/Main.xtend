package hu.bme.mit.kv.event

import hu.bme.mit.kv.event.mapping.QueryEngine2ViatraCep
import hu.bme.mit.kv.json.JsonObject
import hu.bme.mit.kv.model.modelutil.ModelUtil
import hu.bme.mit.kv.model.railroadmodel.Section
import hu.bme.mit.kv.model.railroadmodel.SectionModel
import hu.bme.mit.kv.model.railroadmodel.Train
import hu.bme.mit.kv.model.railroadmodel.TrainModel
import java.net.DatagramPacket
import java.net.DatagramSocket
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.incquery.runtime.api.IncQueryEngine
import org.eclipse.incquery.runtime.emf.EMFScope
import org.eclipse.viatra.cep.core.api.engine.CEPEngine
import org.eclipse.viatra.cep.core.metamodels.automaton.EventContext
import org.eclipse.viatra.cep.examples.sosym.tests.internal.DefaultRealm
import org.junit.Before
import org.junit.Test
import hu.bme.mit.kv.model.railroadmodel.Point
import kvcontrol.senders.SectionStateRequestSender
import kvcontrol.requests.AbstractRequest
import kvcontrol.senders.TurnoutDirectionRequestSender
import hu.bme.mit.kv.queries.TrainGoingToCutTheTurnoutMatch
import hu.bme.mit.kv.queries.TrainGoingToCutTheTurnoutMatcher
import hu.bme.mit.kv.queries.TrainsNextTurnoutMatcher
import hu.bme.mit.kv.queries.InSameRailroadPartMatcher
import hu.bme.mit.kv.queries.SectionsInSameRailroadPartAsTrainMatcher
import hu.bme.mit.kv.queries.SectionNeighborMatcher

class Main {
	extension CepFactory factory = CepFactory.instance
	
	var DefaultRealm realm;

	var QueryEngine2ViatraCep mapping
	var Resource resource
	var ResourceSet resourceSet
	var CEPEngine eventEngine
	var IncQueryEngine queryEngine

	var SectionModel sectionModel // root of the runtime EMF model
	var TrainModel trainModel
	
	@Before
	def void setUp() {
		realm = new DefaultRealm;

		eventEngine = CEPEngine.newEngine().eventContext(EventContext.CHRONICLE).rules(allRules).prepare(); 

		sectionModel = ModelUtil.loadReadySectionModel
		trainModel = ModelUtil.createReadyTrainModel(sectionModel)

		val reg = Resource.Factory.Registry.INSTANCE
		val m = reg.getExtensionToFactoryMap()
		m.put("model", new XMIResourceFactoryImpl())

		resourceSet = new ResourceSetImpl()
		resource = resourceSet.createResource(URI.createURI("railroad.model"))
		resource.getContents().add(sectionModel)
		resource.getContents().add(trainModel)
		
		queryEngine = IncQueryEngine.on(new EMFScope(resourceSet))
		

		mapping = QueryEngine2ViatraCep.register(resourceSet, eventEngine.streamManager.newEventStream)

	}
	 
	@Test
	def void testFunction(){
		println("=================================")	
//		var asd = ResetTransformations.toGraphViz(engine.internalModel)
//		println(asd)
//		var eventStream = engine.getStreamManager().newEventStream();
//		eventStream.push(createA_Event)
//		eventStream.push(createB_Event)
//		eventStream.push(createA_Event)
//		eventStream.push(createB_Event)
	}
	
	@Test
	def void modelTest(){
		val train1 = trainModel.trains.get(0);
		val train2 = trainModel.trains.get(1);
		
		sectionModel.sections.forEach[ firstSection | sectionModel.sections.forEach[ secondSection | println('''==============''') println(''''Train1 : «firstSection.id»; Train2 : «secondSection.id»''') train1.currentlyOn = firstSection; train2.currentlyOn = secondSection  ] ]
	}
	
	@Test
	def void serverTest(){
		AbstractRequest.defaultPort = 8080
		val sender = new SectionStateRequestSender;
//		sender.disableSection(22);
//		
//		Thread.sleep(500);
//		
//		sender.enableSection(22);
		
		
		sectionModel.sections.forEach[section |  sender.disableSection(section.id) Thread.sleep(250)]
		
		Thread.sleep(2000)
		sectionModel.sections.forEach[section |  sender.enableSection(section.id) Thread.sleep(250)]
		
	}
		
	
	
	def findClosestPoint(Train t, Section s) {
		var minValue = Double.MAX_VALUE
		
		for (Point p : s.points) {
			var dist = (t.x - p.x)*(t.x - p.x) +  (t.y - p.y)*(t.y - p.y)
			if (minValue > dist) {
				minValue = dist
			}
		}
		
		return minValue
	}
	
	def findClosestSection(Train t, SectionModel sm) {
		var Section minSec
		var minDist = Double.MAX_VALUE
		
		for (Section s : sm.sections) {
			var dist = findClosestPoint(t, s)
			if (minDist > dist) {
				minDist = dist
				minSec = s 
			}
		}
		
		return minSec
	}
	
	@Test
	def void turnoutReaderTest(){
		AbstractRequest.defaultPort = 8080
		val sender = new TurnoutDirectionRequestSender
		var turnoutIds = #[0x81,0x82,0x83,0x84,0x85];
		while(true){
			for(id : turnoutIds){
				println(id + "switch state = " + sender.isTurnoutStraight(id))
			}
			Thread.sleep(10000)
		}		
		
	}
	
	@Test
	def void patternTest(){
//		var reader = new TurnoutReader(sectionModel) //TODO this kills the CV
//		var thread = new Thread(reader);
//		thread.run
		
		
		Thread.sleep(500)
		
		var train = trainModel.trains.findFirst[t | t.id == 1]
		train.currentlyOn = ModelUtil.getSectionByID(sectionModel, 0xB);
		train.goingClockwise = true
		
		for(match : TrainGoingToCutTheTurnoutMatcher.on(queryEngine).allMatches){
			println("CUT")
//			var sender = new SectionStateRequestSender
//			sender.disableSection(match.train.currentlyOn.id); 
		}
		
		for(match : TrainsNextTurnoutMatcher.on(queryEngine).allMatches){
			println("train " + match.train.id + " next turnout = " + match.turnout.id)
		}
		
		for(match : SectionsInSameRailroadPartAsTrainMatcher.on(queryEngine).allMatches) {
			println("train " + match.train.id + " is in the same part as seciton " + match.section.id)
		} 
		
		for (match : InSameRailroadPartMatcher.on(queryEngine).allMatches){
			println("works?")
		}
		
		for (match : SectionNeighborMatcher.on(queryEngine).allMatches){
			println("asd = " + match.s1.id + " asd = " + match.s2.id)
		}
	}
	
	
	@Test
	def void networkTest(){
//		var reader = new TurnoutReader(sectionModel) //TODO this kills the CV
//		var thread = new Thread(reader);
//		thread.run
		
		val DatagramSocket socket = new DatagramSocket(24000)
		var boolean flag = true
		
		while(flag){
			val buffer = newByteArrayOfSize(1024*16);
		
			val packet = new DatagramPacket(buffer, buffer.length);
			
			println("Recieving a packet!")
			socket.receive(packet);
			println("Packet recieved")
			val trimmed = new String(packet.data).trim
//			println(trimmed);
			val data = JsonObject.readFrom(trimmed)
			val timestamp = data.get("timestamp").asLong
			val trains = data.get("trains").asArray
			for(i : trains){
				val train = i.asObject
				val id = train.get("id").asInt
				val posX = train.get("x").asDouble
				val posY = train.get("y").asDouble
				val speed = train.get("speed").asDouble
				val direction = train.get("dir").asString

				
				val modelTrain = trainModel.trains.findFirst[t | t.id == id]
				modelTrain.x = posX
				modelTrain.y = posY
//				modelTrain.speed = speed
				modelTrain.goingClockwise = (direction.equals("CW"))
				var closestSection = findClosestSection(modelTrain, sectionModel).id
				println(timestamp + "#:\tID = " + modelTrain.id +"\tX = " +  modelTrain.x + "\tY = " +  modelTrain.y + "\tspeed = " + speed + "\tdirection = " +  modelTrain.isGoingClockwise + "\tsection = 0x"+ModelUtil.toHexa(closestSection))
				modelTrain.currentlyOn = ModelUtil.getSectionByID(sectionModel, closestSection)
				
				for(match : TrainGoingToCutTheTurnoutMatcher.on(queryEngine).allMatches){
					println("CUT")
					var sender = new SectionStateRequestSender
					sender.disableSection(match.train.currentlyOn.id); 
				}
				
				for(match : TrainsNextTurnoutMatcher.on(queryEngine).allMatches){
					println("train " + match.train.id + " next turnout = " + match.turnout.id)
				}
				for(match : InSameRailroadPartMatcher.on(queryEngine).allMatches){
					
				}
				
				
			}
			
		}
	}
} 