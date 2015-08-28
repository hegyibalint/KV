package hu.bme.mit.kv.event;

import com.google.common.collect.Lists;
import hu.bme.mit.kv.event.events.queryresult.OnSame_Event;
import hu.bme.mit.kv.event.events.queryresult.OneBetween_Event;
import hu.bme.mit.kv.event.events.queryresult.Safe_Event;
import hu.bme.mit.kv.event.events.queryresult.ZeroBetween_Event;
import hu.bme.mit.kv.event.patterns.atomic.queryresult.OnSame_Pattern;
import hu.bme.mit.kv.event.patterns.atomic.queryresult.OneBetween_Pattern;
import hu.bme.mit.kv.event.patterns.atomic.queryresult.Safe_Pattern;
import hu.bme.mit.kv.event.patterns.atomic.queryresult.ZeroBetween_Pattern;
import hu.bme.mit.kv.event.rules.DebugRule;
import java.util.List;
import org.eclipse.viatra.cep.core.api.rules.ICepRule;
import org.eclipse.viatra.cep.core.metamodels.events.EventSource;

@SuppressWarnings("all")
public class CepFactory {
  private static CepFactory instance;
  
  public static CepFactory getInstance() {
    if(instance == null){
    	instance = new CepFactory();
    }
    return instance;
  }
  
  /**
   * Factory method for event class {@link Safe_Event}.
   */
  public Safe_Event createSafe_Event(final EventSource eventSource) {
    return new Safe_Event(eventSource);
  }
  
  /**
   * Factory method for event class {@link Safe_Event}.
   */
  public Safe_Event createSafe_Event() {
    return new Safe_Event(null);
  }
  
  /**
   * Factory method for event class {@link OnSame_Event}.
   */
  public OnSame_Event createOnSame_Event(final EventSource eventSource) {
    return new OnSame_Event(eventSource);
  }
  
  /**
   * Factory method for event class {@link OnSame_Event}.
   */
  public OnSame_Event createOnSame_Event() {
    return new OnSame_Event(null);
  }
  
  /**
   * Factory method for event class {@link ZeroBetween_Event}.
   */
  public ZeroBetween_Event createZeroBetween_Event(final EventSource eventSource) {
    return new ZeroBetween_Event(eventSource);
  }
  
  /**
   * Factory method for event class {@link ZeroBetween_Event}.
   */
  public ZeroBetween_Event createZeroBetween_Event() {
    return new ZeroBetween_Event(null);
  }
  
  /**
   * Factory method for event class {@link OneBetween_Event}.
   */
  public OneBetween_Event createOneBetween_Event(final EventSource eventSource) {
    return new OneBetween_Event(eventSource);
  }
  
  /**
   * Factory method for event class {@link OneBetween_Event}.
   */
  public OneBetween_Event createOneBetween_Event() {
    return new OneBetween_Event(null);
  }
  
  /**
   * Factory method for atomic query result event pattern {@link Safe_Pattern}.
   */
  public Safe_Pattern createSafe_Pattern() {
    return new Safe_Pattern();
  }
  
  /**
   * Factory method for atomic query result event pattern {@link OnSame_Pattern}.
   */
  public OnSame_Pattern createOnSame_Pattern() {
    return new OnSame_Pattern();
  }
  
  /**
   * Factory method for atomic query result event pattern {@link ZeroBetween_Pattern}.
   */
  public ZeroBetween_Pattern createZeroBetween_Pattern() {
    return new ZeroBetween_Pattern();
  }
  
  /**
   * Factory method for atomic query result event pattern {@link OneBetween_Pattern}.
   */
  public OneBetween_Pattern createOneBetween_Pattern() {
    return new OneBetween_Pattern();
  }
  
  /**
   * Factory method for rule {@link DebugRule}.
   */
  public Class<? extends ICepRule> rule_DebugRule() {
    return DebugRule.class;
  }
  
  /**
   * Factory method for instantiating every defined rule.
   */
  public List<Class<? extends ICepRule>> allRules() {
    List<Class<? extends ICepRule>> rules = Lists.newArrayList();
    rules.add(DebugRule.class);
    return rules;
  }
}
