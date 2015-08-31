package hu.bme.mit.kv.event

import hu.bme.mit.kv.event.mapping.QueryEngine2ViatraCep
import hu.bme.mit.kv.model.modelutil.ModelUtil
import hu.bme.mit.kv.model.railroadmodel.SectionModel
import hu.bme.mit.kv.model.railroadmodel.TrainModel
import java.net.DatagramPacket
import java.net.DatagramSocket
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.viatra.cep.core.api.engine.CEPEngine
import org.eclipse.viatra.cep.core.metamodels.automaton.EventContext
import org.eclipse.viatra.cep.examples.sosym.tests.internal.DefaultRealm
import org.junit.Before
import org.junit.Test
import hu.bme.mit.kv.json.JsonObject

class Main {
	extension CepFactory factory = CepFactory.instance
	
	var DefaultRealm realm;

	var QueryEngine2ViatraCep mapping
	var Resource resource
	var ResourceSet resourceSet
	var CEPEngine engine

	var SectionModel sectionModel // root of the runtime EMF model
	var TrainModel trainModel
	
	@Before
	def void setUp() {
		realm = new DefaultRealm;

		engine = CEPEngine.newEngine().eventContext(EventContext.CHRONICLE).rules(allRules).prepare(); 

		sectionModel = ModelUtil.loadReadySectionModel
		trainModel = ModelUtil.createReadyTrainModel(sectionModel)

		val reg = Resource.Factory.Registry.INSTANCE
		val m = reg.getExtensionToFactoryMap()
		m.put("model", new XMIResourceFactoryImpl())

		resourceSet = new ResourceSetImpl()
		resource = resourceSet.createResource(URI.createURI("railroad.model"))
		resource.getContents().add(sectionModel)
		resource.getContents().add(trainModel)
		

		mapping = QueryEngine2ViatraCep.register(resourceSet, engine.streamManager.newEventStream)

	}
	 
	@Test
	def void testFunction(){
		println("=================================")	
		//var asd = ResetTransformations.toGraphViz(engine.internalModel)
		//println(asd)
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
	def void networkTest(){
		val DatagramSocket socket = new DatagramSocket(24000)
		
		val buffer = newByteArrayOfSize(1024*16);
		
		val packet = new DatagramPacket(buffer, buffer.length);
		socket.receive(packet);
		val trimmed = new String(packet.data).trim
		val data = JsonObject.readFrom(trimmed)
		
	}
} 