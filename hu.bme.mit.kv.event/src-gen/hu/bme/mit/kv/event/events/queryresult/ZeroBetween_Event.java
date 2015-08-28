package hu.bme.mit.kv.event.events.queryresult;

import org.eclipse.viatra.cep.core.api.events.ParameterizableIncQueryPatternEventInstance;
import org.eclipse.viatra.cep.core.metamodels.events.EventSource;

@SuppressWarnings("all")
public class ZeroBetween_Event extends ParameterizableIncQueryPatternEventInstance {
  public ZeroBetween_Event(final EventSource eventSource) {
    super(eventSource);
  }
}
