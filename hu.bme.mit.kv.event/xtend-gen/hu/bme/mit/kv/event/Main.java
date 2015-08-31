package hu.bme.mit.kv.event;

import hu.bme.mit.kv.event.CepFactory;
import hu.bme.mit.kv.event.mapping.QueryEngine2ViatraCep;
import hu.bme.mit.kv.model.modelutil.ModelUtil;
import hu.bme.mit.kv.model.railroadmodel.SectionModel;
import hu.bme.mit.kv.model.railroadmodel.Train;
import hu.bme.mit.kv.model.railroadmodel.TrainModel;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.viatra.cep.core.api.engine.CEPEngine;
import org.eclipse.viatra.cep.core.api.engine.ResetTransformations;
import org.eclipse.viatra.cep.core.api.rules.ICepRule;
import org.eclipse.viatra.cep.core.metamodels.automaton.EventContext;
import org.eclipse.viatra.cep.core.metamodels.automaton.InternalModel;
import org.eclipse.viatra.cep.core.streams.EventStream;
import org.eclipse.viatra.cep.core.streams.IStreamManager;
import org.eclipse.viatra.cep.examples.sosym.tests.internal.DefaultRealm;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("all")
public class Main {
  @Extension
  private CepFactory factory = CepFactory.getInstance();
  
  private DefaultRealm realm;
  
  private QueryEngine2ViatraCep mapping;
  
  private Resource resource;
  
  private ResourceSet resourceSet;
  
  private CEPEngine engine;
  
  private SectionModel sectionModel;
  
  private TrainModel trainModel;
  
  @Before
  public void setUp() {
    DefaultRealm _defaultRealm = new DefaultRealm();
    this.realm = _defaultRealm;
    CEPEngine.CEPEngineBuilder _newEngine = CEPEngine.newEngine();
    CEPEngine.CEPEngineBuilder _eventContext = _newEngine.eventContext(EventContext.CHRONICLE);
    List<Class<? extends ICepRule>> _allRules = this.factory.allRules();
    CEPEngine.CEPEngineBuilder _rules = _eventContext.rules(_allRules);
    CEPEngine _prepare = _rules.prepare();
    this.engine = _prepare;
    SectionModel _createReadySectionModel = ModelUtil.createReadySectionModel();
    this.sectionModel = _createReadySectionModel;
    TrainModel _createReadyTrainModel = ModelUtil.createReadyTrainModel(this.sectionModel);
    this.trainModel = _createReadyTrainModel;
    final Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
    final Map<String, Object> m = reg.getExtensionToFactoryMap();
    XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
    m.put("model", _xMIResourceFactoryImpl);
    ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
    this.resourceSet = _resourceSetImpl;
    URI _createURI = URI.createURI("railroad.model");
    Resource _createResource = this.resourceSet.createResource(_createURI);
    this.resource = _createResource;
    EList<EObject> _contents = this.resource.getContents();
    _contents.add(this.sectionModel);
    EList<EObject> _contents_1 = this.resource.getContents();
    _contents_1.add(this.trainModel);
    IStreamManager _streamManager = this.engine.getStreamManager();
    EventStream _newEventStream = _streamManager.newEventStream();
    QueryEngine2ViatraCep _register = QueryEngine2ViatraCep.register(this.resourceSet, _newEventStream);
    this.mapping = _register;
  }
  
  @Test
  public void testFunction() {
    InputOutput.<String>println("=================================");
    InternalModel _internalModel = this.engine.getInternalModel();
    String asd = ResetTransformations.toGraphViz(_internalModel);
    InputOutput.<String>println(asd);
  }
  
  @Test
  public void modelTest() {
    EList<Train> _trains = this.trainModel.getTrains();
    final Train train1 = _trains.get(0);
    EList<Train> _trains_1 = this.trainModel.getTrains();
    final Train train2 = _trains_1.get(1);
  }
}
