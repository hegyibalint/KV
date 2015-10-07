package hu.bme.mit.kv.transformer

import Jama.Matrix
import hu.bme.mit.kv.railrloadmodel.railroadmodel.ModelFactory
import hu.bme.mit.kv.railrloadmodel.railroadmodel.Point
import hu.bme.mit.kv.railrloadmodel.railroadmodel.Section
import hu.bme.mit.kv.railrloadmodel.railroadmodel.SectionModel
import hu.bme.mit.kv.railrloadmodel.railroadmodel.Switch
import hu.bme.mit.kv.railrloadmodel.railroadmodel.Trackable
import java.io.IOException
import java.net.URL
import java.util.Collections
import org.apache.batik.bridge.BridgeContext
import org.apache.batik.bridge.DocumentLoader
import org.apache.batik.bridge.GVTBuilder
import org.apache.batik.bridge.UserAgentAdapter
import org.apache.batik.dom.svg.SAXSVGDocumentFactory
import org.apache.batik.dom.svg.SVGOMPathElement
import org.apache.batik.dom.svg.SVGOMRectElement
import org.apache.batik.dom.svg.SVGPathContext
import org.apache.batik.util.XMLResourceDescriptor
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.xtend.lib.annotations.Accessors
import org.w3c.dom.Document

class Transformator {
	static extension ModelFactory factory = ModelFactory.eINSTANCE

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
	
	def pairUp(Trackable a, Trackable b) {
		println(a.id + "<->" + b.id)
		a.neighbours += b;
		b.neighbours += a;
	}

	dispatch def void intersect(Section a, Section b) {
		val test = [ Point p1, Point p2 |
			val dist = p1.distanceFrom(p2)
			if (dist < 0.05) {
				pairUp(a, b)		
			}
		]

		test.apply(a.line.start, b.line.start) 
		test.apply(a.line.start, b.line.end) 
		test.apply(a.line.end, b.line.start)
		test.apply(a.line.end, b.line.end)
	}

	dispatch def void intersect(Section a, Switch b) {
		if (b.rectangle.isPointInside(a.line.start)) {
			pairUp(a, b)
		} else if(b.rectangle.isPointInside(a.line.end)) {
			pairUp(a, b)
		}
	}

	dispatch def void intersect(Switch a, Section b) {
		_intersect(b, a)
	}
	
	dispatch def void intersect(Switch a, Switch b) {
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

			val powerable = createPowerable
			powerable.id = Integer::parseUnsignedInt(element.id.substring(2), 16)

			val step = ctx.totalLength / 10;
			for (var stepc = 0; stepc <= 9; stepc++) {
				val section = createSection
				section.id = element.id + "_" + stepc;
				
				section.line = createLineFrom(getPositionAtLength(ctx, step * stepc),
					getPositionAtLength(ctx, step * (stepc + 1)))

				sm.trackables += section
				powerable.sections += section
			}

			sm.powerables += powerable
		}
	}

	def fillTurnouts() {
		val elements = doc.getElementById("Turnouts").getElementsByTagName("rect");
		for (var i = 0; i < elements.length; i++) {
			val element = elements.item(i) as SVGOMRectElement;
			val turnout = createSwitch
			//turnout.id = Integer::parseUnsignedInt(element.id.substring(2), 16)
			turnout.id = element.id.substring(2)

			val origin = createPoint
			origin.setX(element.getX().getBaseVal().getValue());
			origin.setY(element.getY().getBaseVal().getValue());

			val size = createDimension
			size.setWidth(element.getWidth().getBaseVal().getValue());
			size.setHeight(element.getHeight().getBaseVal().getValue());

			val ctm = element.getCTM();
			val double[][] array = #[#[ctm.a, ctm.c, ctm.e], #[ctm.b, ctm.d, ctm.f], #[0.0, 0.0, 1.0]];
			val mtx = new Matrix(array);
			val inv = mtx.inverse();

			val rect = createRectangle
			var inverseList = rect.inverseMatrix
			inverseList += inv.get(0, 0)
			inverseList += inv.get(0, 1)
			inverseList += inv.get(0, 2)
			inverseList += inv.get(1, 0)
			inverseList += inv.get(1, 1)
			inverseList += inv.get(1, 2)
			rect.setOrigin(origin);
			rect.setSize(size);

			turnout.setRectangle(rect);

			sm.trackables += turnout
		}
	}

	def void saveToXML() {
		val reg = Resource.Factory.Registry.INSTANCE;
		val m = reg.getExtensionToFactoryMap();
		m.put("kv", new XMIResourceFactoryImpl());

		val resSet = new ResourceSetImpl();
		val resource = resSet.createResource(URI.createURI("../hu.bme.mit.kv.event/res/SectionModel.kv"));

		resource.getContents().add(this.sm);
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Successfully converted SVG to EMF model");
	}

}