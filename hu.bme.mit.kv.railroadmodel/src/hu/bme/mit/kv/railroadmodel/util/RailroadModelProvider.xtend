package hu.bme.mit.kv.railroadmodel.util

import hu.bme.mit.kv.railroadmodel.RailRoadModel
import hu.bme.mit.kv.railroadmodel.RailroadModelFactory
import hu.bme.mit.kv.railroadmodel.SectionModel
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

class RailroadModelProvider {

	static extension RailroadModelFactory = RailroadModelFactory.eINSTANCE

	val RailRoadModel model = createLoadedRRM
	
	public def rrm() {
		return model
	}
	
	public def tm() {
		return model.trainModel
	}
	
	public def sm() {
		return model.sectionModel
	}

	private def RailRoadModel createLoadedRRM() {
		var model = createRailRoadModel
		model.trainModel = createTrainModel
		model.sectionModel = loadSectionModel
		return model
	}

	private static def SectionModel loadSectionModel() {
		val reg = Resource.Factory.Registry.INSTANCE
		val m = reg.getExtensionToFactoryMap()
		m.put("kv", new XMIResourceFactoryImpl())

		val resSet = new ResourceSetImpl()
		val resource = resSet.getResource(
			URI.createURI("platform:/plugin/hu.bme.mit.kv.railroadmodel/processed/SectionModel.railroadmodel"), true)

		return resource.contents.head as SectionModel
	}
}