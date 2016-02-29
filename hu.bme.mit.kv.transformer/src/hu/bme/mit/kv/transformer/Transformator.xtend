package hu.bme.mit.kv.transformer

import hu.bme.mit.kv.railroadmodel.Point
import hu.bme.mit.kv.railroadmodel.RailRegion
import hu.bme.mit.kv.railroadmodel.RailroadModelFactory
import hu.bme.mit.kv.railroadmodel.Region
import hu.bme.mit.kv.railroadmodel.SectionModel
import hu.bme.mit.kv.railroadmodel.SwitchRegion
import java.io.IOException
import java.net.URL
import java.util.Collections
import org.apache.batik.bridge.BridgeContext
import org.apache.batik.bridge.DocumentLoader
import org.apache.batik.bridge.GVTBuilder
import org.apache.batik.bridge.UserAgentAdapter
import org.apache.batik.dom.svg.SAXSVGDocumentFactory
import org.apache.batik.dom.svg.SVGOMPathElement
import org.apache.batik.dom.svg.SVGOMPolygonElement
import org.apache.batik.dom.svg.SVGPathContext
import org.apache.batik.util.XMLResourceDescriptor
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.xtend.lib.annotations.Accessors
import org.w3c.dom.Document

import static extension hu.bme.mit.kv.railroadmodel.util.RailroadModelHelper.*

class Transformator {
	static extension RailroadModelFactory factory = RailroadModelFactory.eINSTANCE

	var Document doc;

	@Accessors(PUBLIC_GETTER, PROTECTED_SETTER)
	SectionModel sm = createSectionModel;

	def loadSVG() {
		val parser = XMLResourceDescriptor.getXMLParserClassName();
		val f = new SAXSVGDocumentFactory(parser);

		val fileUrl = new URL("platform:/plugin/hu.bme.mit.kv.transformer/res/board.svg")		
		doc = f.createDocument(fileUrl.toURI().toString());

		val userAgent = new UserAgentAdapter();
		val loader = new DocumentLoader(userAgent);
		val ctx = new BridgeContext(userAgent, loader);
		ctx.setDynamic(true);

		val builder = new GVTBuilder();
		builder.build(ctx, doc);
	}

	def transform() {
		fillRails()
		fillTurnouts()
		
		for (var i = 0; i < (sm.trackables.size - 1); i++) {
			for (var j = i+1; j < (sm.trackables.size); j++) {
				val t1 = sm.trackables.get(i)
				val t2 = sm.trackables.get(j)
				
				intersect(t1, t2)
			}
		}
	}

	def createLineFrom(Point start, Point end) {
		val line = createLine
		line.start = start
		line.end = end
		return line
	}
	
	def pairUp(Region a, Region b) {
		println(a.id + "<->" + b.id)
		a.neighbours += b;
		b.neighbours += a;
	}

	dispatch def void intersect(RailRegion a, RailRegion b) {		
		val test = [ Point p1, Point p2 |
			//println("Dist: " + p1.distanceFrom(p2))
			if(p1.isProximity(p2, 0.5)) {
				pairUp(a, b)		
			}
		]
		
		test.apply(a.line.start, b.line.start) 
		test.apply(a.line.start, b.line.end)
		test.apply(a.line.end, b.line.start)
		test.apply(a.line.end, b.line.end)
	}

	dispatch def void intersect(RailRegion a, SwitchRegion b) {
		if (b.rectangle.isPointInside(a.line.start, 0.5)) {
			pairUp(a, b)
		}
		if(b.rectangle.isPointInside(a.line.end, 0.5)) {
			pairUp(a, b)
		}
	}

	dispatch def void intersect(SwitchRegion a, RailRegion b) {
		_intersect(b, a)
	}
	
	dispatch def void intersect(SwitchRegion a, SwitchRegion b) {
		return
	}

	def Point getPositionAtLength(SVGPathContext ctx, float length) {
		val p = ctx.getPointAtLength(length);

		val position = createPoint
		position.x = p.x
		position.y = p.y

		return position
	}

	def fillRails() {
		val elements = doc.getElementById("Sections").getElementsByTagName("path");
		for (var i = 0; i < elements.length; i++) {
			val element = elements.item(i) as SVGOMPathElement;
			val ctx = element.SVGContext as SVGPathContext

			val powerable = createPowerableGroup
			powerable.id = Integer::parseUnsignedInt(element.id.substring(2), 16)
			println("Creating powerable " + powerable.id);

			val step = ctx.totalLength / 10.001f;
			for (var stepc = 0; stepc <= 9; stepc++) {
				val section = createRailRegion
				section.id = powerable.id + "_" + stepc;
				println("Creating region " + section.id);
				
				section.line = createLineFrom(
					getPositionAtLength(ctx, step * stepc),
					getPositionAtLength(ctx, step * (stepc + 1))
				)
					
				sm.trackables += section
				powerable.regions += section
			}

			sm.groups += powerable
		}
	}

	def fillTurnouts() {
		val elements = doc.getElementById("Turnouts").getElementsByTagName("polygon");
		for (var i = 0; i < elements.length; i++) {
			val element = elements.item(i) as SVGOMPolygonElement;

			val powerable = createSwitchGroup
			powerable.id = Integer::parseUnsignedInt(element.id.substring(2), 16)
			val turnout = createSwitchRegion
			//turnout.id = Integer::parseUnsignedInt(element.id.substring(2), 16)
			turnout.id = element.id.substring(2)
			powerable.regions += turnout

			val rect = createRectangle
			for (var j = 0; j < element.points.numberOfItems; j++) {
				val p = createPoint
				p.x = element.points.getItem(j).x
				p.y = element.points.getItem(j).y
				rect.corners += p
			}

			turnout.rectangle = rect
			sm.trackables += turnout
			sm.groups += powerable
		}
	}

	def void saveToXML() {
		val reg = Resource.Factory.Registry.INSTANCE;
		val m = reg.getExtensionToFactoryMap();
		m.put("kv", new XMIResourceFactoryImpl());

		val resSet = new ResourceSetImpl();
		val resource = resSet.createResource(URI.createURI("../hu.bme.mit.kv.railroadmodel/processed/SectionModel.railroadmodel"));

		resource.getContents().add(this.sm);
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Successfully converted SVG to EMF model");
	}

}