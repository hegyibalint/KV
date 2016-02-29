package hu.bme.mit.kv.manager

import hu.bme.mit.kv.railroadmodel.util.RailroadModelProvider
import hu.bme.mit.kv.receiver.Receiver
import org.eclipse.equinox.app.IApplication
import org.eclipse.equinox.app.IApplicationContext

class Application implements IApplication {
	
	override start(IApplicationContext context) throws Exception {
		val provider = new RailroadModelProvider()
		val receiver = new Receiver(provider)
		
		//val safetylogic = new SafetyLogic(provider)
		//val pathfinder = new PathFinder(provider)
		
		receiver.startReceiving()
		
		return EXIT_OK
	}
	
	override stop() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
}