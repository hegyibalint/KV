package hu.bme.mit.kv.event

import org.eclipse.viatra.cep.core.metamodels.automaton.EventContext
import org.junit.Test
import org.eclipse.viatra.cep.core.api.engine.CEPEngine
import org.eclipse.viatra.cep.core.api.engine.ResetTransformations

class Main {
	extension CepFactory factory = CepFactory.instance
	@Test
	def void testFunction(){

		
		var engine = CEPEngine.newEngine().eventContext(EventContext.CHRONICLE).rules(allRules).prepare(); 
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
		var asd = hu.bme.mit.kv.model.modelutil.ModelUtil.createReadyModel
	}
} 