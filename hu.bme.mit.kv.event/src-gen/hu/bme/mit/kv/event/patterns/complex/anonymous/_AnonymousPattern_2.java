package hu.bme.mit.kv.event.patterns.complex.anonymous;

import hu.bme.mit.kv.event.patterns.atomic.B_Pattern;
import hu.bme.mit.kv.event.patterns.complex.anonymous._AnonymousPattern_1;
import org.eclipse.viatra.cep.core.api.patterns.ParameterizableComplexEventPattern;
import org.eclipse.viatra.cep.core.metamodels.events.EventsFactory;

@SuppressWarnings("all")
public class _AnonymousPattern_2 extends ParameterizableComplexEventPattern {
  public _AnonymousPattern_2() {
    super();
    setOperator(EventsFactory.eINSTANCE.createFOLLOWS());
    
    // contained event patterns
    addEventPatternRefrence(new B_Pattern(), 1);
    addEventPatternRefrence(new _AnonymousPattern_1(), 1);
    setId("hu.bme.mit.kv.event.patterns.complex.anonymous._anonymouspattern_2");
  }
}
