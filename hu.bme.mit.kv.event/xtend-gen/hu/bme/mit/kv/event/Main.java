package hu.bme.mit.kv.event;

import hu.bme.mit.kv.event.CepFactory;
import hu.bme.mit.kv.model.modelutil.ModelUtil;
import hu.bme.mit.kv.model.railroadmodel.RailRoadModel;
import java.util.List;
import org.eclipse.viatra.cep.core.api.engine.CEPEngine;
import org.eclipse.viatra.cep.core.api.engine.ResetTransformations;
import org.eclipse.viatra.cep.core.api.rules.ICepRule;
import org.eclipse.viatra.cep.core.metamodels.automaton.EventContext;
import org.eclipse.viatra.cep.core.metamodels.automaton.InternalModel;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.junit.Test;

@SuppressWarnings("all")
public class Main {
  @Extension
  private CepFactory factory = CepFactory.getInstance();
  
  @Test
  public void testFunction() {
    CEPEngine.CEPEngineBuilder _newEngine = CEPEngine.newEngine();
    CEPEngine.CEPEngineBuilder _eventContext = _newEngine.eventContext(EventContext.CHRONICLE);
    List<Class<? extends ICepRule>> _allRules = this.factory.allRules();
    CEPEngine.CEPEngineBuilder _rules = _eventContext.rules(_allRules);
    CEPEngine engine = _rules.prepare();
    InputOutput.<String>println("=================================");
    InternalModel _internalModel = engine.getInternalModel();
    String asd = ResetTransformations.toGraphViz(_internalModel);
    InputOutput.<String>println(asd);
  }
  
  @Test
  public void modelTest() {
    RailRoadModel asd = ModelUtil.createReadyModel();
  }
}
