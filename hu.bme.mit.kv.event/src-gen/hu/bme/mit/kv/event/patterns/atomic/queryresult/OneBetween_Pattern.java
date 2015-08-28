package hu.bme.mit.kv.event.patterns.atomic.queryresult;

import hu.bme.mit.kv.event.events.queryresult.OneBetween_Event;
import org.eclipse.viatra.cep.core.metamodels.events.impl.AtomicEventPatternImpl;

@SuppressWarnings("all")
public class OneBetween_Pattern extends AtomicEventPatternImpl {
  public OneBetween_Pattern() {
    super();
    setType(OneBetween_Event.class.getCanonicalName());
    setId("hu.bme.mit.kv.event.patterns.atomic.queryresult.onebetween_pattern");
  }
  
  public boolean evaluateCheckExpression() {
    return true;
  }
}
