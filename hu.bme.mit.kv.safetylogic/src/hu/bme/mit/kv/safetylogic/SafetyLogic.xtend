package hu.bme.mit.kv.safetylogic

import hu.bme.mit.kv.railroadmodel.RailroadModelFactory
import hu.bme.mit.kv.railroadmodel.SectionModel
import hu.bme.mit.kv.railroadmodel.TrainModel
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.incquery.runtime.api.IncQueryEngine
import org.eclipse.incquery.runtime.emf.EMFScope

class SafetyLogic {
	static extension RailroadModelFactory = RailroadModelFactory.eINSTANCE
	
	var TrainModel tm
	var SectionModel sm
	var IncQueryEngine queryEngine
	
	var JSONReceiver jsonReceiver
	var Estimator estimator
	
	new() {
		tm = createTrainModel
		
		loadSectionModel()
		loadIncQuery()
		
		jsonReceiver = new JSONReceiver(tm)
		estimator = new Estimator(sm)
		
		processMessages()
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
		resource.getContents().add(sm)
		resource.getContents().add(tm)

		queryEngine = IncQueryEngine.on(new EMFScope(resourceSet))
	}
	
	def loadSectionModel() {
		val reg = Resource.Factory.Registry.INSTANCE
		val m = reg.getExtensionToFactoryMap()
		m.put("kv", new XMIResourceFactoryImpl())

		val resSet = new ResourceSetImpl()
		val resource = resSet.getResource(URI.createURI("platform:/plugin/hu.bme.mit.kv.safetylogic/res/SectionModel.kv"), true)

		this.sm = resource.contents.head as SectionModel
	}
	
	
}