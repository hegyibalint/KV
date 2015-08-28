package hu.mit.bme.kv.cvreceiver.tests;

import java.io.IOException;

import org.apache.batik.anim.dom.SAXSVGDocumentFactory;
import org.apache.batik.bridge.BridgeContext;
import org.apache.batik.bridge.DocumentLoader;
import org.apache.batik.bridge.GVTBuilder;
import org.apache.batik.bridge.UserAgent;
import org.apache.batik.bridge.UserAgentAdapter;
import org.apache.batik.util.XMLResourceDescriptor;
import org.junit.Test;
import org.w3c.dom.Document;

public class MainTest {

	@SuppressWarnings("unused")
	@Test
	public void test() throws IOException {
		String parser = XMLResourceDescriptor.getXMLParserClassName();
	    SAXSVGDocumentFactory f = new SAXSVGDocumentFactory(parser);
	    String uri = "http://www.example.org/diagram.svg";
	    Document doc = f.createDocument("platform:/plugin/hu.mit.bme.kv.cvreceiver/res/board.svg");

	    UserAgent userAgent = new UserAgentAdapter();
	    DocumentLoader loader = new DocumentLoader(userAgent);
	    BridgeContext bridgeContext = new BridgeContext(userAgent, loader);
	    
	    (new GVTBuilder()).build( bridgeContext, doc );
	}

}
