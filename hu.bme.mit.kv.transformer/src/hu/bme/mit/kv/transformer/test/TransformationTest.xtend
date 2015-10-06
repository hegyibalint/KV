package hu.bme.mit.kv.transformer.test

import org.junit.Test
import javax.xml.transform.Transformer
import hu.bme.mit.kv.transformer.Transformator

class TransformationTest {
	@Test
	def void transformationTest() {
		val t = new Transformator()
		t.loadSVG()
		t.transform()
	}
}