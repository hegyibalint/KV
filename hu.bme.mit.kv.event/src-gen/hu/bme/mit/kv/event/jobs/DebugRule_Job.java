package hu.bme.mit.kv.event.jobs;

import org.eclipse.incquery.runtime.evm.api.Activation;
import org.eclipse.incquery.runtime.evm.api.Context;
import org.eclipse.incquery.runtime.evm.api.Job;
import org.eclipse.incquery.runtime.evm.api.event.ActivationState;
import org.eclipse.viatra.cep.core.api.patterns.IObservableComplexEventPattern;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class DebugRule_Job extends Job<IObservableComplexEventPattern> {
  public DebugRule_Job(final ActivationState activationState) {
    super(activationState);
  }
  
  @Override
  public void execute(final Activation<? extends IObservableComplexEventPattern> ruleInstance, final Context context) {
    IObservableComplexEventPattern _atom = ruleInstance.getAtom();
    String _observedEventPatternId = _atom.getObservedEventPatternId();
    String[] _split = _observedEventPatternId.split("\\.");
    String _last = IterableExtensions.<String>last(((Iterable<String>)Conversions.doWrapArray(_split)));
    String[] _split_1 = _last.split("_pattern");
    String _head = IterableExtensions.<String>head(((Iterable<String>)Conversions.doWrapArray(_split_1)));
    InputOutput.<String>println(_head);
  }
  
  @Override
  public void handleError(final Activation<? extends IObservableComplexEventPattern> ruleInstance, final Exception exception, final Context context) {
    //not gonna happen
  }
}
