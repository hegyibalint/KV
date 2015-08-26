package hu.bme.mit.kv.event.patterns.complex.anonymous;

import hu.bme.mit.kv.event.patterns.complex.anonymous._AnonymousPattern_4;
import org.eclipse.viatra.cep.core.api.patterns.ParameterizableComplexEventPattern;
import org.eclipse.viatra.cep.core.metamodels.events.EventsFactory;

@SuppressWarnings("all")
public class _AnonymousPattern_5 extends ParameterizableComplexEventPattern {
  public _AnonymousPattern_5() {
    super();
    setOperator(EventsFactory.eINSTANCE.createFOLLOWS());
    
    // contained event patterns
    addEventPatternRefrence(new _AnonymousPattern_4(), EventsFactory.eINSTANCE.createInfinite());
    setId("hu.bme.mit.kv.event.patterns.complex.anonymous._anonymouspattern_5");
  }
}
