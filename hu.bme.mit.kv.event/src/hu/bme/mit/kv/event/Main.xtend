package hu.bme.mit.kv.event

import org.eclipse.viatra.cep.core.metamodels.automaton.EventContext
import org.junit.Test
import org.eclipse.viatra.cep.core.api.engine.CEPEngine
import org.eclipse.viatra.cep.core.api.engine.ResetTransformations
import org.junit.Before
import hu.bme.mit.kv.model.railroadmodel.RailRoadModel
import org.eclipse.viatra.cep.examples.sosym.tests.internal.DefaultRealm
import hu.bme.mit.kv.event.mapping.QueryEngine2ViatraCep
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl 
import hu.bme.mit.kv.model.modelutil.ModelUtil
import org.eclipse.emf.common.util.URI
import java.util.Random

class Main {
	extension CepFactory factory = CepFactory.instance
	
	var DefaultRealm realm;

	var QueryEngine2ViatraCep mapping
	var Resource resource
	var ResourceSet resourceSet
	var CEPEngine engine

	var RailRoadModel ref // root of the runtime EMF model
	
	@Before
	def void setUp() {
		realm = new DefaultRealm;

		engine = CEPEngine.newEngine().eventContext(EventContext.CHRONICLE).rules(allRules).prepare(); 

		ref = ModelUtil.createReadyModel

		val reg = Resource.Factory.Registry.INSTANCE
		val m = reg.getExtensionToFactoryMap()
		m.put("model", new XMIResourceFactoryImpl())

		resourceSet = new ResourceSetImpl()
		resource = resourceSet.createResource(URI.createURI("teqball.model"))
		resource.getContents().add(ref)

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
		var rand = new Random();
		while(true){
			ref.trains.get(0).currentlyOn = ref.sections.get(Math.abs(rand.nextInt%20))
		}
	}
} 