package hu.bme.mit.kv.event

import org.eclipse.viatra.cep.core.metamodels.automaton.EventContext
import org.junit.Test
import org.eclipse.viatra.cep.core.api.engine.CEPEngine
import org.eclipse.viatra.cep.core.api.engine.ResetTransformations
import org.junit.Before
import org.eclipse.viatra.cep.examples.sosym.tests.internal.DefaultRealm
import hu.bme.mit.kv.event.mapping.QueryEngine2ViatraCep
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl 
import hu.bme.mit.kv.model.modelutil.ModelUtil
import org.eclipse.emf.common.util.URI
import java.util.Random
import hu.bme.mit.kv.model.railroadmodel.SectionModel
import hu.bme.mit.kv.model.railroadmodel.TrainModel

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

		sectionModel = ModelUtil.createReadySectionModel
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
		var asd = ResetTransformations.toGraphViz(engine.internalModel)
		println(asd)
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
		
//		sectionModel.sections.forEach[ | ]
	}
} 