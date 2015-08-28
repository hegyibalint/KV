package hu.bme.mit.kv.event.events.queryresult;

import org.eclipse.viatra.cep.core.api.events.ParameterizableIncQueryPatternEventInstance;
import org.eclipse.viatra.cep.core.metamodels.events.EventSource;

@SuppressWarnings("all")
public class Safe_Event extends ParameterizableIncQueryPatternEventInstance {
  public Safe_Event(final EventSource eventSource) {
    super(eventSource);
  }
}
