package hu.bme.mit.kv.event.patterns.atomic;

import hu.bme.mit.kv.event.events.A_Event;
import org.eclipse.viatra.cep.core.metamodels.events.impl.AtomicEventPatternImpl;

@SuppressWarnings("all")
public class A_Pattern extends AtomicEventPatternImpl {
  public A_Pattern() {
    super();
    setType(A_Event.class.getCanonicalName());
    setId("hu.bme.mit.kv.event.patterns.atomic.a_pattern");
  }
  
  public boolean evaluateCheckExpression() {
    return true;
  }
}
