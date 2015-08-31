package hu.bme.mit.kv.svgtransformer;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.apache.batik.anim.dom.SAXSVGDocumentFactory;
import org.apache.batik.anim.dom.SVGOMGElement;
import org.apache.batik.anim.dom.SVGOMPathElement;
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
import org.w3c.dom.NodeList;

import hu.bme.mit.kv.model.railroadmodel.ModelFactory;
import hu.bme.mit.kv.model.railroadmodel.Point;
import hu.bme.mit.kv.model.railroadmodel.Section;
import hu.bme.mit.kv.model.railroadmodel.SectionModel;

public class Main {

	public static void main(String[] args) throws IOException {
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
	    
	    List<SVGOMPathElement> paths = getSectionPaths(doc);
	    SectionModel sectionModel = ModelFactory.eINSTANCE.createSectionModel();
	    for(SVGOMPathElement path : paths) {
	    	fillModelWithPath(path);
	    }
	    
	    saveToEmf(sectionModel);
	}

	private static void saveToEmf(SectionModel model) {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("sectionModel", new XMIResourceFactoryImpl());

		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.createResource(URI.createURI("SectionModel.kv"));

		resource.getContents().add(model);
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void fillModelWithPath(SVGOMPathElement path) {
		Section section = ModelFactory.eINSTANCE.createSection();

		SVGPathContext pathCtx = (SVGPathContext)path.getSVGContext();

		section.setId(Integer.parseInt(path.getId(), 16));
		for (float i = 0; i < pathCtx.getTotalLength(); i += 1.0) {
			Point point = ModelFactory.eINSTANCE.createPoint();
			java.awt.geom.Point2D.Double pointAtLength = (java.awt.geom.Point2D.Double)pathCtx.getPointAtLength(i);
			point.setX(pointAtLength.getX());
			point.setY(pointAtLength.getY());
			section.getPoints().add(point);
		}
	}

	private static List<SVGOMPathElement> getSectionPaths(Document doc) {
		List<SVGOMPathElement> paths = new ArrayList<>();

		SVGOMGElement sectionGroup = (SVGOMGElement)doc.getElementById("Sections");
		NodeList sectionChild = sectionGroup.getChildNodes();
		for (int i = 0; i < sectionChild.getLength(); ++i) {
			if (sectionChild.item(i) instanceof SVGOMPathElement) {
				SVGOMPathElement pathElement = (SVGOMPathElement)sectionChild.item(i);
				paths.add(pathElement);
			}
		}

		return paths;
	}

}
