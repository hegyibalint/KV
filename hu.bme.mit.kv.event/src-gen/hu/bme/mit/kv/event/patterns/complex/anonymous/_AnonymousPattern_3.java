package hu.bme.mit.kv.event.patterns.complex.anonymous;

import hu.bme.mit.kv.event.patterns.atomic.B_Pattern;
import org.eclipse.viatra.cep.core.api.patterns.ParameterizableComplexEventPattern;
import org.eclipse.viatra.cep.core.metamodels.events.EventsFactory;

@SuppressWarnings("all")
public class _AnonymousPattern_3 extends ParameterizableComplexEventPattern {
  public _AnonymousPattern_3() {
    super();
    setOperator(EventsFactory.eINSTANCE.createFOLLOWS());
    
    // contained event patterns
    addEventPatternRefrence(new B_Pattern(), 1);
    setId("hu.bme.mit.kv.event.patterns.complex.anonymous._anonymouspattern_3");
  }
}
