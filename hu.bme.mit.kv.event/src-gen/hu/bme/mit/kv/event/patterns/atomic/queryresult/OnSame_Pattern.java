package hu.bme.mit.kv.event.patterns.atomic.queryresult;

import hu.bme.mit.kv.event.events.queryresult.OnSame_Event;
import org.eclipse.viatra.cep.core.metamodels.events.impl.AtomicEventPatternImpl;

@SuppressWarnings("all")
public class OnSame_Pattern extends AtomicEventPatternImpl {
  public OnSame_Pattern() {
    super();
    setType(OnSame_Event.class.getCanonicalName());
    setId("hu.bme.mit.kv.event.patterns.atomic.queryresult.onsame_pattern");
  }
  
  public boolean evaluateCheckExpression() {
    return true;
  }
}
