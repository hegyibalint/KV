package hu.bme.mit.kv.transformer

import Jama.Matrix
import hu.bme.mit.kv.railrloadmodel.railroadmodel.ModelFactory
import hu.bme.mit.kv.railrloadmodel.railroadmodel.Point
import hu.bme.mit.kv.railrloadmodel.railroadmodel.Rail
import hu.bme.mit.kv.railrloadmodel.railroadmodel.RailEndPoint
import hu.bme.mit.kv.railrloadmodel.railroadmodel.RailPoint
import hu.bme.mit.kv.railrloadmodel.railroadmodel.SectionModel
import hu.bme.mit.kv.railrloadmodel.railroadmodel.Turnout
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

		val turnouts = sm.sections.filter[it instanceof Turnout] as Turnout[]
		val rails = sm.sections.filter[it instanceof Rail] as Rail[]

		turnouts.forEach [ to |
			rails.forEach [ rail |
				rail.endpoints.forEach [ ep |
					if (ep.nextSection == null) {
						if (to.rectangle.isPointInside(ep.position)) {
							println(Integer.toHexString(rail.id) + "-->" + Integer.toHexString(to.id))
							ep.nextSection = to
							to.notConnected += rail
						} else {
							rails.filter[rail2|rail != rail2].forEach [ rail2 |
								rail2.endpoints.forEach [ ep2 |
									if (ep.position.distanceFrom(ep2.position) < 0.05) {
										println(Integer.toHexString(rail.id) + "<==>" + Integer.toHexString(rail2.id))
										ep.nextSection = rail2
									}
								]
							]
						}
					}
				]
			]
		]
	}

	def Point getPositionAtLength(SVGPathContext ctx, float length) {
		val p = ctx.getPointAtLength(length);

		val position = createPoint
		position.x = p.x
		position.y = p.y

		return position
	}

	def RailEndPoint getRailEndPointFromLength(SVGPathContext ctx, float length) {
		val railPoint = createRailEndPoint
		railPoint.position = getPositionAtLength(ctx, length)

		return railPoint
	}

	def RailPoint getRailPointFromLength(SVGPathContext ctx, float length) {
		val railPoint = createRailPoint
		railPoint.position = getPositionAtLength(ctx, length)

		return railPoint
	}

	def fillRails() {
		val elements = doc.getElementById("Sections").getElementsByTagName("path");
		for (var i = 0; i < elements.length; i++) {
			val element = elements.item(i) as SVGOMPathElement;
			val ctx = element.SVGContext as SVGPathContext

			val rail = createRail
			rail.id = Integer::parseUnsignedInt(element.id.substring(2), 16)

			rail.endpoints.add(getRailEndPointFromLength(ctx, 0.0f))
			rail.endpoints.add(getRailEndPointFromLength(ctx, ctx.totalLength))

			val step = ctx.totalLength / 10;
			for (var stepc = 1; stepc <= 9; stepc++) {
				rail.points.add(getRailPointFromLength(ctx, step * stepc))
			}

			rail.points.head.neighbours.add(rail.endpoints.get(0))
			rail.points.last.neighbours.add(rail.endpoints.get(1))

			for (var p = 0; p < rail.points.size; p++) {
				if (p > 0)
					rail.points.get(p).neighbours.add(rail.points.get(p - 1))
				if (p + 1 < rail.points.size)
					rail.points.get(p).neighbours.add(rail.points.get(p + 1))
			}

			// println("Section #" + element.id + " added")
			sm.sections.add(rail);
		}
	}

	def fillTurnouts() {
		val elements = doc.getElementById("Turnouts").getElementsByTagName("rect");
		for (var i = 0; i < elements.length; i++) {
			val element = elements.item(i) as SVGOMRectElement;
			val turnout = createTurnout
			turnout.id = Integer::parseUnsignedInt(element.id.substring(2), 16)

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
			rect.getInverseMatrix().add(inv.get(0, 0));
			rect.getInverseMatrix().add(inv.get(0, 1));
			rect.getInverseMatrix().add(inv.get(0, 2));
			rect.getInverseMatrix().add(inv.get(1, 0));
			rect.getInverseMatrix().add(inv.get(1, 1));
			rect.getInverseMatrix().add(inv.get(1, 2));
			rect.setOrigin(origin);
			rect.setSize(size);

			turnout.setRectangle(rect);

			// println("Turnout #" + element.id + " added")
			sm.sections.add(turnout);
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