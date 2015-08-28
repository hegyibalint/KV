package hu.bme.mit.kv.event.rules;

import com.google.common.collect.Lists;
import hu.bme.mit.kv.event.jobs.DebugRule_Job;
import hu.bme.mit.kv.event.patterns.atomic.queryresult.OnSame_Pattern;
import hu.bme.mit.kv.event.patterns.atomic.queryresult.OneBetween_Pattern;
import hu.bme.mit.kv.event.patterns.atomic.queryresult.Safe_Pattern;
import hu.bme.mit.kv.event.patterns.atomic.queryresult.ZeroBetween_Pattern;
import java.util.List;
import org.eclipse.incquery.runtime.evm.api.Job;
import org.eclipse.viatra.cep.core.api.evm.CepActivationStates;
import org.eclipse.viatra.cep.core.api.patterns.IObservableComplexEventPattern;
import org.eclipse.viatra.cep.core.api.rules.ICepRule;
import org.eclipse.viatra.cep.core.metamodels.events.EventPattern;

@SuppressWarnings("all")
public class DebugRule implements ICepRule {
  private List<EventPattern> eventPatterns = Lists.newArrayList();
  
  private Job<IObservableComplexEventPattern> job = new DebugRule_Job(CepActivationStates.ACTIVE);
  
  public DebugRule() {
    eventPatterns.add(new Safe_Pattern());
    eventPatterns.add(new OnSame_Pattern());
    eventPatterns.add(new ZeroBetween_Pattern());
    eventPatterns.add(new OneBetween_Pattern());
  }
  
  @Override
  public List<EventPattern> getEventPatterns() {
    return this.eventPatterns;
  }
  
  @Override
  public Job<IObservableComplexEventPattern> getJob() {
    return this.job;
  }
}
