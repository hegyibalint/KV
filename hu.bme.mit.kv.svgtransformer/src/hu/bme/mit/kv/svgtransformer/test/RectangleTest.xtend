package hu.bme.mit.kv.svgtransformer.test

import hu.bme.mit.kv.model.railroadmodel.ModelFactory
import hu.bme.mit.kv.model.railroadmodel.Turnout
import hu.bme.mit.kv.svgtransformer.Transformer
import org.junit.Test

import static org.junit.Assert.*;
import hu.bme.mit.kv.model.railroadmodel.SectionModel
import org.junit.Before

class RectangleTest {
	var Turnout turnout1
	
	@Before
	def void setUp() {
		val t = new Transformer()
		val sectionModel = t.transform()
		
		val section1 = sectionModel.sections.filter[s | s.id == 4].head
		turnout1 = section1 as Turnout
	}
	
	@Test
	def void testInside() {
		val point = ModelFactory.eINSTANCE.createPoint
		point.x = 80
		point.y = 11
		assertTrue(turnout1.rectangle.isPointInside(point));
	}
	
	@Test
	def void testOutside1() {
		val point = ModelFactory.eINSTANCE.createPoint
		point.x = 58
		point.y = 11
		assertFalse(turnout1.rectangle.isPointInside(point));
	}
	
	@Test
	def void testOutside2() {
		val point = ModelFactory.eINSTANCE.createPoint
		point.x = 110
		point.y = 10
		assertFalse(turnout1.rectangle.isPointInside(point));
	}
}