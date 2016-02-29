package hu.bme.mit.kv.safetylogic

import hu.bme.mit.kv.railroadmodel.util.RailroadModelProvider
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.incquery.runtime.api.IncQueryEngine
import org.eclipse.incquery.runtime.emf.EMFScope

class SafetyLogic {
	//static extension RailroadModelFactory = RailroadModelFactory.eINSTANCE
	
	var RailroadModelProvider provider
	public var IncQueryEngine queryEngine
	
	public var Estimator estimator
	
	new(RailroadModelProvider provider) {
		this.provider = provider
		estimator = new Estimator(provider)
		
		loadIncQuery()
	}
	
	def loadIncQuery() {
		queryEngine = IncQueryEngine.on(new EMFScope(provider.rrm))
	}
	
	
}