package hu.bme.mit.kv.event;

import hu.bme.mit.kv.event.CepFactory;
import hu.bme.mit.kv.event.mapping.QueryEngine2ViatraCep;
import hu.bme.mit.kv.model.modelutil.ModelUtil;
import hu.bme.mit.kv.model.railroadmodel.RailRoadModel;
import hu.bme.mit.kv.model.railroadmodel.Section;
import hu.bme.mit.kv.model.railroadmodel.Train;
import java.util.List;
import java.util.Map;
import java.util.Random;
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
  
  private RailRoadModel ref;
  
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
    RailRoadModel _createReadyModel = ModelUtil.createReadyModel();
    this.ref = _createReadyModel;
    final Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
    final Map<String, Object> m = reg.getExtensionToFactoryMap();
    XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
    m.put("model", _xMIResourceFactoryImpl);
    ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
    this.resourceSet = _resourceSetImpl;
    URI _createURI = URI.createURI("teqball.model");
    Resource _createResource = this.resourceSet.createResource(_createURI);
    this.resource = _createResource;
    EList<EObject> _contents = this.resource.getContents();
    _contents.add(this.ref);
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
    Random rand = new Random();
    while (true) {
      EList<Train> _trains = this.ref.getTrains();
      Train _get = _trains.get(0);
      EList<Section> _sections = this.ref.getSections();
      int _nextInt = rand.nextInt();
      int _modulo = (_nextInt % 20);
      int _abs = Math.abs(_modulo);
      Section _get_1 = _sections.get(_abs);
      _get.setCurrentlyOn(_get_1);
    }
  }
}
