package hu.bme.mit.kv.safetylogic

import hu.bme.mit.kv.railroadmodel.RailRoadModel
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.incquery.runtime.api.IncQueryEngine
import org.eclipse.incquery.runtime.emf.EMFScope

import static hu.bme.mit.kv.railroadmodel.util.RailroadModelHelper.*

class SafetyLogic {
	//static extension RailroadModelFactory = RailroadModelFactory.eINSTANCE
	
	var RailRoadModel rrm
	public var IncQueryEngine queryEngine
	
	var JSONReceiver jsonReceiver
	public var Estimator estimator
	
	new() {
		rrm = createLoadedRRM
		loadIncQuery()
		
		jsonReceiver = new JSONReceiver(rrm.trainModel)
		estimator = new Estimator(rrm.sectionModel)
		
		//processMessages()
	}
	
	def processMessages() {
		while (true) {
			jsonReceiver.postTrainPositions()
			estimator.estimateTrainPositions()
		}
	}
	
	def loadIncQuery() {
		val reg = Resource.Factory.Registry.INSTANCE
		val m = reg.getExtensionToFactoryMap()
		m.put("model", new XMIResourceFactoryImpl())

		val resourceSet = new ResourceSetImpl()
		val resource = resourceSet.createResource(URI.createURI("railroad.model"))
		resource.getContents().add(rrm)

		queryEngine = IncQueryEngine.on(new EMFScope(resourceSet))
	}
	
	
}