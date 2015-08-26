package hu.bme.mit.kv.event.rules;

import com.google.common.collect.Lists;
import hu.bme.mit.kv.event.jobs.Test2Rule_Job;
import hu.bme.mit.kv.event.patterns.complex.Test2_Pattern;
import java.util.List;
import org.eclipse.incquery.runtime.evm.api.Job;
import org.eclipse.viatra.cep.core.api.evm.CepActivationStates;
import org.eclipse.viatra.cep.core.api.patterns.IObservableComplexEventPattern;
import org.eclipse.viatra.cep.core.api.rules.ICepRule;
import org.eclipse.viatra.cep.core.metamodels.events.EventPattern;

@SuppressWarnings("all")
public class Test2Rule implements ICepRule {
  private List<EventPattern> eventPatterns = Lists.newArrayList();
  
  private Job<IObservableComplexEventPattern> job = new Test2Rule_Job(CepActivationStates.ACTIVE);
  
  public Test2Rule() {
    eventPatterns.add(new Test2_Pattern());
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
