package hu.bme.mit.kv.event.patterns.complex;

import hu.bme.mit.kv.event.patterns.atomic.A_Pattern;
import hu.bme.mit.kv.event.patterns.complex.anonymous._AnonymousPattern_6;
import org.eclipse.viatra.cep.core.api.patterns.ParameterizableComplexEventPattern;
import org.eclipse.viatra.cep.core.metamodels.events.EventsFactory;

@SuppressWarnings("all")
public class Test2_Pattern extends ParameterizableComplexEventPattern {
  public Test2_Pattern() {
    super();
    setOperator(EventsFactory.eINSTANCE.createFOLLOWS());
    
    // contained event patterns
    addEventPatternRefrence(new A_Pattern(), 1);
    addEventPatternRefrence(new _AnonymousPattern_6(), 1);
    setId("hu.bme.mit.kv.event.patterns.complex.test2_pattern");
  }
}
