package hu.bme.mit.kv.event

import hu.bme.mit.kv.json.JsonObject
import hu.bme.mit.kv.model.modelutil.ModelUtil
import hu.bme.mit.kv.model.railroadmodel.ModelFactory
import hu.bme.mit.kv.model.railroadmodel.Point
import hu.bme.mit.kv.model.railroadmodel.Section
import hu.bme.mit.kv.model.railroadmodel.SectionModel
import hu.bme.mit.kv.model.railroadmodel.Train
import hu.bme.mit.kv.model.railroadmodel.TrainModel
import hu.bme.mit.kv.model.railroadmodel.Turnout
import hu.bme.mit.kv.queries.InSameRailroadPartMatcher
import hu.bme.mit.kv.queries.SectionNeighborMatcher
import hu.bme.mit.kv.queries.SectionsInSameRailroadPartAsTrainMatcher
import hu.bme.mit.kv.queries.TrainGoingToCutTheTurnoutMatcher
import hu.bme.mit.kv.queries.TrainIsGoingToHitMatcher
import hu.bme.mit.kv.queries.TrainsNextTurnoutMatcher
import java.net.DatagramPacket
import java.net.DatagramSocket
import kvcontrol.requests.AbstractRequest
import kvcontrol.senders.SectionStateRequestSender
import kvcontrol.senders.TurnoutDirectionRequestSender
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.incquery.runtime.api.IncQueryEngine
import org.eclipse.incquery.runtime.emf.EMFScope
import org.eclipse.viatra.cep.examples.sosym.tests.internal.DefaultRealm
import org.junit.Before
import org.junit.Test

import static kvcontrol.requests.AbstractRequest.*
import hu.bme.mit.kv.queries.SoloSectionMatcher

class Main {
	val Object lock = new Object;
	var DefaultRealm realm;

	var Resource resource
	var ResourceSet resourceSet
	var IncQueryEngine queryEngine

	var SectionModel sectionModel // root of the runtime EMF model
	var TrainModel trainModel

	@Before
	def void setUp() {
		realm = new DefaultRealm;

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
	}
	
	@Test
	def void graphViz(){
		println(ModelUtil.toGraphViz(sectionModel));
	}

	@Test
	def void modelTest() {
		val train1 = trainModel.trains.get(0);
		val train2 = trainModel.trains.get(1);

		sectionModel.sections.forEach [ firstSection |
			sectionModel.sections.forEach [ secondSection |
				println('''==============''')
				println(''''Train1 : «firstSection.id»; Train2 : «secondSection.id»''')
				train1.currentlyOn = firstSection;
				train2.currentlyOn = secondSection
			]
		]
	}

	@Test
	def void serverTest() {
		AbstractRequest.defaultPort = 8080
		val sender = new SectionStateRequestSender;

		sectionModel.sections.forEach[section|sender.disableSection(section.id) Thread.sleep(250)]

		Thread.sleep(2000)
		sectionModel.sections.forEach[section|sender.enableSection(section.id) Thread.sleep(250)]

	}

	def Turnout findOccupiedTurnout(Train t, SectionModel sm) {
		val p = ModelFactory.eINSTANCE.createPoint
		p.x = t.x
		p.y = t.y

		val filtered = sm.sections.filter[section|section instanceof Turnout]
		for (Section s : filtered) {
			val turnout = s as Turnout
			if(turnout.rectangle.isPointInside(p)) {
				return turnout
			}
		}

		return null
	}

	def findClosestPoint(Train t, Section s) {
		var minValue = Double.MAX_VALUE

		for (Point p : s.points) {
			var dist = (t.x - p.x) * (t.x - p.x) + (t.y - p.y) * (t.y - p.y)
			if(minValue > dist) {
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
			if(minDist > dist) {
				minDist = dist
				minSec = s
			}
		}

		return minSec
	}

	@Test
	def void turnoutReaderTest() {
		AbstractRequest.defaultPort = 8080
		val sender = new TurnoutDirectionRequestSender
//		var turnoutIds = #[0x81, 0x82, 0x83, 0x84, 0x85];
		var turnoutIds = #[0x86, 0x87];
		while(true) {
			for (id : turnoutIds) {
				println(id + "switch state = " + sender.isTurnoutStraight(id))
			}
			Thread.sleep(1000)
		}

	}

	@Test
	def void patternTest() {
		var train1 = trainModel.trains.findFirst[t|t.id == 1]
		train1.currentlyOn = ModelUtil.getSectionByID(sectionModel, 0xB);
		train1.goingClockwise = true

		var train0 = trainModel.trains.findFirst[t|t.id == 0]
		train0.currentlyOn = ModelUtil.getSectionByID(sectionModel, 0xB);
		train1.goingClockwise = false;

		for (match : TrainGoingToCutTheTurnoutMatcher.on(queryEngine).allMatches) {
			println("CUT")
		}

		for (match : TrainsNextTurnoutMatcher.on(queryEngine).allMatches) {
			println("train " + match.train.id + " next turnout = " + match.turnout.id)
		}

		for (match : SectionsInSameRailroadPartAsTrainMatcher.on(queryEngine).allMatches) {
			println("train " + match.train.id + " is in the same part as section " + match.section.id)
		}

		for (match : InSameRailroadPartMatcher.on(queryEngine).allMatches) {
			println("In same railroad : " + ModelUtil.toHexa(match.section.id) + " with " + ModelUtil.toHexa(match.someSection.id))
		}

		for (match : SectionNeighborMatcher.on(queryEngine).allMatches) {
			println("Section = " + match.s1.id + " is the neighbor of section = " + match.s2.id)
		}
		
		for(match : SoloSectionMatcher.on(queryEngine).allMatches){
			println("SoloSection = 0x" + ModelUtil.toHexa(match.section.id))
		}
		
//		for(match : SoloBlindTrackMatcher.on(queryEngine).allMatches){
//			println("SoloBlindTrack =  0x" + ModelUtil.toHexa(match.section.id) )
//		} 
	}

	@Test
	def void englishTurnoutTest() {
		var reader = new TurnoutReader(sectionModel, lock)
		var thread = new Thread(reader);
		thread.start

		var englishTurnout = ModelUtil.getEnglishTurnout(sectionModel)
		while(true) {
			println("cw = " + ModelUtil.toHexa(englishTurnout.clockwise.id) + "\tccw = " + ModelUtil.toHexa(englishTurnout.counterClockwise.id) + "\tnot = " + ModelUtil.toHexa(englishTurnout.notConnectedSection.id) + "\tnotcw = " + ModelUtil.toHexa(englishTurnout.notConnectedClockwiseSection.id))
			Thread.sleep(1000)
		}
	}

	@Test
	def void networkTest() {
		var reader = new TurnoutReader(sectionModel, lock)
		var thread = new Thread(reader);
		thread.start

		val DatagramSocket socket = new DatagramSocket(24000)
		var boolean flag = true

		while(flag) {
			val buffer = newByteArrayOfSize(1024 * 16)
			val sender = new SectionStateRequestSender
			val packet = new DatagramPacket(buffer, buffer.length)

			socket.receive(packet);
			val trimmed = new String(packet.data).trim
			var JsonObject data;
			try {
				parseJsonFromPacket(lock, sectionModel, trainModel, trimmed)
			} catch(Exception e) {
				println("failed to parse json, here is the file : ")
				println(trimmed);
				data = null
			}
			var trainHitMatchers = TrainIsGoingToHitMatcher.on(queryEngine).allMatches
			val cutMatches = TrainGoingToCutTheTurnoutMatcher.on(queryEngine).allMatches
//			var matches = TrainsNextTurnoutMatcher.on(queryEngine).allMatches
//			if(matches.size == 0){
//				println("baj van")
//			} 
			
			
			
			if(cutMatches.size == 0 && trainHitMatchers.size == 0){
				//TODO later
			}
			if(cutMatches.size == 0) {
				println("No cut")
			} else {
				for (match : cutMatches) {
					println("Train #" + match.train.id + " is going to cut turnout #" + match.turnout.id)
					match.train.currentlyOn.enabled = false
//					sender.disableSection(match.train.currentlyOn.id);
				}
			}


			if(trainHitMatchers.size == 0) {
				println("No train is going to hit the other");
			}

			for (match : trainHitMatchers) {
				println("Train #" + match.t1.id + " is going to hit train #" + match.t2.id)
				match.t1.currentlyOn.enabled = false
//				sender.disableSection(match.t1.currentlyOn.enabled);
			}
			
			TrainsNextTurnoutMatcher.on(queryEngine).allMatches.forEach[match | println(match.train.id + " -> " + match.turnout.id)  ]

//			sectionModel.sections.filter[section|section.enabled == true].forEach [
//				sender.enableSection(it.id)
//			]
			sectionModel.sections.forEach[if(it.enabled == true) sender.enableSection(it.id) else sender.disableSection(it.id) ]
		}

	}

	def parseJsonFromPacket(Object object, SectionModel model, TrainModel model2, String trimmed) {
		val data = JsonObject.readFrom(trimmed)
		val timestamp = data.get("timestamp").asLong
		val trains = data.get("trains").asArray
		synchronized(lock) {
			for (section : sectionModel.sections) {
				section.enabled = true
			}

			for (i : trains) {
				val jsonTrain = i.asObject
				val id = jsonTrain.get("id").asInt
				val posX = jsonTrain.get("x").asDouble
				val posY = jsonTrain.get("y").asDouble
				val speed = jsonTrain.get("speed").asDouble
				val direction = jsonTrain.get("dir").asString

				var modelTrain = trainModel.trains.findFirst[t|t.id == id]
				//XXX this should be in somewhere else?
				if(modelTrain == null){
					modelTrain = ModelUtil.addTrain(trainModel, id);
					
				}
				
				modelTrain.x = posX
				modelTrain.y = posY
				if(!direction.toUpperCase.equals("NONE")) {
					modelTrain.goingClockwise = (direction.equals("CW"))
				}

				var Section occupied = findOccupiedTurnout(modelTrain, sectionModel)
				if(occupied == null) { //If it's not on a turnout, it must be on a section
					occupied = findClosestSection(modelTrain, sectionModel)
				}

				println(timestamp + "#:\tID = " + modelTrain.id + "\tX = " + modelTrain.x + "\tY = " + modelTrain.y + /* "\tspeed = " + speed +  */ "\tdirection = " + modelTrain.isGoingClockwise + "\tsection = 0x" + ModelUtil.toHexa(occupied.id))
				modelTrain.currentlyOn = occupied
				

				
			}
		}
	}

} 