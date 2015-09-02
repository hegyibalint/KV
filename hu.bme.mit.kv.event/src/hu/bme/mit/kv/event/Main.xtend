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
	def void networkTest(){
		val DatagramSocket socket = new DatagramSocket(24000)
		var boolean flag = true
		
		while(flag){
			val buffer = newByteArrayOfSize(1024*16);
		
			val packet = new DatagramPacket(buffer, buffer.length);
			socket.receive(packet);
			val trimmed = new String(packet.data).trim
			val data = JsonObject.readFrom(trimmed)
			
			val trains = data.get("trains").asArray
			for(i : trains){
				val train = i.asObject
				val id = train.get("id").asInt
				val posX = train.get("x").asDouble
				val posY = train.get("y").asDouble
				val speed = train.get("speed").asDouble
				val direction = train.get("dir").asString
				
				println("ID = " + id +"\tX = " + posX + "\tY = " + posY + "\tspeed = " + speed + "\tdirection = " + direction)
				val modelTrain = trainModel.trains.filter[t | t.id == id].head
				modelTrain.x = posX
				modelTrain.y = posY
//				modelTrain.speed = speed
				modelTrain.goingClockwise = (direction.equals("CW"))
				
				println(ModelUtil.toHexa(findClosestSection(modelTrain, sectionModel).id))

			}
			
		}
	}
} 