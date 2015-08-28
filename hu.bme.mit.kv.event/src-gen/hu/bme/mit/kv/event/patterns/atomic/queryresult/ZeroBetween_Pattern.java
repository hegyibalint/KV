package hu.bme.mit.kv.event.patterns.atomic.queryresult;

import hu.bme.mit.kv.event.events.queryresult.ZeroBetween_Event;
import org.eclipse.viatra.cep.core.metamodels.events.impl.AtomicEventPatternImpl;

@SuppressWarnings("all")
public class ZeroBetween_Pattern extends AtomicEventPatternImpl {
  public ZeroBetween_Pattern() {
    super();
    setType(ZeroBetween_Event.class.getCanonicalName());
    setId("hu.bme.mit.kv.event.patterns.atomic.queryresult.zerobetween_pattern");
  }
  
  public boolean evaluateCheckExpression() {
    return true;
  }
}
