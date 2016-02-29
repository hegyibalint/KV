package hu.bme.mit.kv.transformer

import org.eclipse.equinox.app.IApplication
import org.eclipse.equinox.app.IApplicationContext

class Application implements IApplication {
	
	override start(IApplicationContext context) throws Exception {
		val t = new Transformator()
		t.loadSVG()
		t.transform()
		t.saveToXML()
		
		return EXIT_OK
	}
	
	override stop() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
}