package hu.bme.mit.kv.event.patterns.complex.anonymous;

import hu.bme.mit.kv.event.patterns.complex.anonymous._AnonymousPattern_3;
import org.eclipse.viatra.cep.core.api.patterns.ParameterizableComplexEventPattern;
import org.eclipse.viatra.cep.core.metamodels.events.EventsFactory;

@SuppressWarnings("all")
public class _AnonymousPattern_4 extends ParameterizableComplexEventPattern {
  public _AnonymousPattern_4() {
    super();
    setOperator(EventsFactory.eINSTANCE.createNEG());
    
    // contained event patterns
    addEventPatternRefrence(new _AnonymousPattern_3(), 1);
    setId("hu.bme.mit.kv.event.patterns.complex.anonymous._anonymouspattern_4");
  }
}
