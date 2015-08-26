package hu.bme.mit.kv.event.patterns.atomic;

import hu.bme.mit.kv.event.events.B_Event;
import org.eclipse.viatra.cep.core.metamodels.events.impl.AtomicEventPatternImpl;

@SuppressWarnings("all")
public class B_Pattern extends AtomicEventPatternImpl {
  public B_Pattern() {
    super();
    setType(B_Event.class.getCanonicalName());
    setId("hu.bme.mit.kv.event.patterns.atomic.b_pattern");
  }
  
  public boolean evaluateCheckExpression() {
    return true;
  }
}
