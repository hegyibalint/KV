package hu.bme.mit.kv.event.patterns.atomic.queryresult;

import hu.bme.mit.kv.event.events.queryresult.Safe_Event;
import org.eclipse.viatra.cep.core.metamodels.events.impl.AtomicEventPatternImpl;

@SuppressWarnings("all")
public class Safe_Pattern extends AtomicEventPatternImpl {
  public Safe_Pattern() {
    super();
    setType(Safe_Event.class.getCanonicalName());
    setId("hu.bme.mit.kv.event.patterns.atomic.queryresult.safe_pattern");
  }
  
  public boolean evaluateCheckExpression() {
    return true;
  }
}
