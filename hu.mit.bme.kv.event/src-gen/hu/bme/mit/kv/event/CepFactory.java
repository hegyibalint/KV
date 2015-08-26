package hu.bme.mit.kv.event;

import com.google.common.collect.Lists;
import hu.bme.mit.kv.event.events.A_Event;
import hu.bme.mit.kv.event.events.B_Event;
import hu.bme.mit.kv.event.patterns.atomic.A_Pattern;
import hu.bme.mit.kv.event.patterns.atomic.B_Pattern;
import hu.bme.mit.kv.event.patterns.complex.Test2_Pattern;
import hu.bme.mit.kv.event.patterns.complex.Test_Pattern;
import hu.bme.mit.kv.event.rules.Test2Rule;
import hu.bme.mit.kv.event.rules.TestRule;
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
   * Factory method for event class {@link A_Event}.
   */
  public A_Event createA_Event(final EventSource eventSource) {
    return new A_Event(eventSource);
  }
  
  /**
   * Factory method for event class {@link A_Event}.
   */
  public A_Event createA_Event() {
    return new A_Event(null);
  }
  
  /**
   * Factory method for event class {@link B_Event}.
   */
  public B_Event createB_Event(final EventSource eventSource) {
    return new B_Event(eventSource);
  }
  
  /**
   * Factory method for event class {@link B_Event}.
   */
  public B_Event createB_Event() {
    return new B_Event(null);
  }
  
  /**
   * Factory method for atomic event pattern {@link A_Pattern}.
   */
  public A_Pattern createA_Pattern() {
    return new A_Pattern();
  }
  
  /**
   * Factory method for atomic event pattern {@link B_Pattern}.
   */
  public B_Pattern createB_Pattern() {
    return new B_Pattern();
  }
  
  /**
   * Factory method for complex event pattern {@link Test_Pattern}.
   */
  public Test_Pattern createTest_Pattern() {
    return new Test_Pattern();
  }
  
  /**
   * Factory method for complex event pattern {@link Test2_Pattern}.
   */
  public Test2_Pattern createTest2_Pattern() {
    return new Test2_Pattern();
  }
  
  /**
   * Factory method for rule {@link TestRule}.
   */
  public Class<? extends ICepRule> rule_TestRule() {
    return TestRule.class;
  }
  
  /**
   * Factory method for rule {@link Test2Rule}.
   */
  public Class<? extends ICepRule> rule_Test2Rule() {
    return Test2Rule.class;
  }
  
  /**
   * Factory method for instantiating every defined rule.
   */
  public List<Class<? extends ICepRule>> allRules() {
    List<Class<? extends ICepRule>> rules = Lists.newArrayList();
    rules.add(TestRule.class);
    rules.add(Test2Rule.class);
    return rules;
  }
}
