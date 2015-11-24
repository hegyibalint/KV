package hu.bme.mit.kv.transformer.test

import hu.bme.mit.kv.transformer.Transformator
import org.junit.Test

class TransformationTest {
	@Test
	def void transformationTest() {
		val t = new Transformator()
		t.loadSVG()
		t.transform()
		t.saveToXML()
	}
}