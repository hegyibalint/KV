package hu.bme.mit.kv.svgtransformer;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.apache.batik.anim.dom.SAXSVGDocumentFactory;
import org.apache.batik.anim.dom.SVGOMPathElement;
import org.apache.batik.anim.dom.SVGOMRectElement;
import org.apache.batik.bridge.BridgeContext;
import org.apache.batik.bridge.DocumentLoader;
import org.apache.batik.bridge.GVTBuilder;
import org.apache.batik.bridge.UserAgent;
import org.apache.batik.bridge.UserAgentAdapter;
import org.apache.batik.dom.svg.SVGPathContext;
import org.apache.batik.util.XMLResourceDescriptor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.w3c.dom.Document;
import org.w3c.dom.svg.SVGMatrix;

import hu.bme.mit.kv.model.modelutil.ModelUtil;
import hu.bme.mit.kv.model.railroadmodel.Dimension;
import hu.bme.mit.kv.model.railroadmodel.ModelFactory;
import hu.bme.mit.kv.model.railroadmodel.Point;
import hu.bme.mit.kv.model.railroadmodel.Rectangle;
import hu.bme.mit.kv.model.railroadmodel.Section;
import hu.bme.mit.kv.model.railroadmodel.SectionModel;
import hu.bme.mit.kv.model.railroadmodel.Turnout;

public class Transformer {
	public SectionModel transform() throws IOException {
		String parser = XMLResourceDescriptor.getXMLParserClassName();
	    SAXSVGDocumentFactory f = new SAXSVGDocumentFactory(parser);
	    
	    File svgFile = new File("res/board.svg");
	    Document doc = f.createDocument(svgFile.toURI().toString());

	    UserAgent userAgent = new UserAgentAdapter();
	    DocumentLoader loader = new DocumentLoader(userAgent);
	    BridgeContext ctx = new BridgeContext(userAgent, loader);
	    ctx.setDynamic(true);
	    
	    GVTBuilder builder = new GVTBuilder();
	    builder.build(ctx, doc);
	    
	    SectionModel sectionModel = ModelUtil.createReadySectionModel();
	    for(Section section : sectionModel.getSections()) {
	    	fillSectionWithPoints(section, doc);
	    }
	    
	    return sectionModel;
	}

	private void fillSectionWithPoints(Section section, Document doc) {
		if (section instanceof Turnout) {
			fillTurnout((Turnout)section, doc);
		} else {
			fillRail(section, doc);
		}
	}

	private static void fillTurnout(Turnout turnout, Document doc) {
		String idStr = Integer.toHexString(turnout.getId());
		String id = "0x" + (idStr.length() == 1 ? "0" : "")  + idStr;
		SVGOMRectElement rectElement = (SVGOMRectElement)doc.getElementById(id);
		
		Point origin = ModelFactory.eINSTANCE.createPoint();
		origin.setX(rectElement.getX().getBaseVal().getValue());
		origin.setY(rectElement.getY().getBaseVal().getValue());
		
		Dimension size = ModelFactory.eINSTANCE.createDimension();
		size.setWidth(rectElement.getWidth().getBaseVal().getValue());
		size.setHeight(rectElement.getHeight().getBaseVal().getValue());
		
		SVGMatrix ctm = rectElement.getCTM();
		double[][] array = {{ctm.getA(), ctm.getC(), ctm.getE()}, {ctm.getB(), ctm.getD(), ctm.getF()}, {0.0, 0.0, 1.0}};
		Jama.Matrix mtx = new Jama.Matrix(array);
		Jama.Matrix inv = mtx.inverse();
		
		Rectangle rect = ModelFactory.eINSTANCE.createRectangle();
		rect.getInverseMatrix().add(inv.get(0, 0));
		rect.getInverseMatrix().add(inv.get(0, 1));
		rect.getInverseMatrix().add(inv.get(0, 2));
		rect.getInverseMatrix().add(inv.get(1, 0));
		rect.getInverseMatrix().add(inv.get(1, 1));
		rect.getInverseMatrix().add(inv.get(1, 2));
		rect.setOrigin(origin);
		rect.setSize(size);
		
		turnout.setRectangle(rect);
	}

	private void fillRail(Section section, Document doc) {
		String idStr = Integer.toHexString(section.getId());
		String id = "0x" + (idStr.length() == 1 ? "0" : "")  + idStr;
		SVGOMPathElement pathElement = (SVGOMPathElement)doc.getElementById(id);
		SVGPathContext pathCtx = (SVGPathContext)pathElement.getSVGContext();
		
		for (float i = 0; i < pathCtx.getTotalLength(); i += 3.0) {
			Point point = ModelFactory.eINSTANCE.createPoint();
			java.awt.geom.Point2D.Float pointAtLength = (java.awt.geom.Point2D.Float)pathCtx.getPointAtLength(i);
			point.setX(pointAtLength.getX());
			point.setY(pointAtLength.getY());
			section.getPoints().add(point);
		}
	}

	public static void saveToXML(SectionModel model) {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("kv", new XMIResourceFactoryImpl());

		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.createResource(URI.createURI("../hu.bme.mit.kv.event/res/SectionModel.kv"));

		resource.getContents().add(model);
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Successfully converted SVG to EMF model");
	}
}
