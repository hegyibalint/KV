package hu.bme.mit.kv.svgtransformer;

import java.io.IOException;

import hu.bme.mit.kv.model.railroadmodel.SectionModel;

public class Main {
	public static void main(String[] args) throws IOException {
		Transformer t = new Transformer();
		SectionModel sectionModel = t.transform();
		Transformer.saveToXML(sectionModel);
	}

}
