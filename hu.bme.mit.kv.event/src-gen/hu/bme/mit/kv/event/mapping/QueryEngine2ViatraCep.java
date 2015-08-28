package hu.bme.mit.kv.event.mapping;

import hu.bme.mit.kv.event.events.queryresult.OnSame_Event;
import hu.bme.mit.kv.event.events.queryresult.OneBetween_Event;
import hu.bme.mit.kv.event.events.queryresult.Safe_Event;
import hu.bme.mit.kv.event.events.queryresult.ZeroBetween_Event;
import hu.bme.mit.kv.queries.OneBetweenMatch;
import hu.bme.mit.kv.queries.OneBetweenMatcher;
import hu.bme.mit.kv.queries.SafeMatch;
import hu.bme.mit.kv.queries.SafeMatcher;
import hu.bme.mit.kv.queries.SameSectionMatch;
import hu.bme.mit.kv.queries.SameSectionMatcher;
import hu.bme.mit.kv.queries.ZeroBetweenMatch;
import hu.bme.mit.kv.queries.ZeroBetweenMatcher;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.emf.EMFScope;
import org.eclipse.incquery.runtime.evm.specific.Lifecycles;
import org.eclipse.incquery.runtime.evm.specific.event.IncQueryActivationStateEnum;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra.cep.core.streams.EventStream;
import org.eclipse.viatra.emf.runtime.rules.EventDrivenTransformationRuleGroup;
import org.eclipse.viatra.emf.runtime.rules.eventdriven.EventDrivenTransformationRule;
import org.eclipse.viatra.emf.runtime.rules.eventdriven.EventDrivenTransformationRuleFactory;
import org.eclipse.viatra.emf.runtime.transformation.eventdriven.EventDrivenTransformation;
import org.eclipse.viatra.emf.runtime.transformation.eventdriven.InconsistentEventSemanticsException;

@SuppressWarnings("all")
public class QueryEngine2ViatraCep {
  private EventStream eventStream;
  
  private ResourceSet resourceSet;
  
  private EventDrivenTransformation transformation;
  
  private QueryEngine2ViatraCep(final ResourceSet resourceSet, final EventStream eventStream) {
    this.resourceSet = resourceSet;
    this.eventStream = eventStream;
    registerRules();
  }
  
  public static QueryEngine2ViatraCep register(final ResourceSet resourceSet, final EventStream eventStream) {
    return new QueryEngine2ViatraCep(resourceSet, eventStream);
  }
  
  public EventDrivenTransformationRuleGroup getRules() {
    EventDrivenTransformationRuleGroup ruleGroup = new EventDrivenTransformationRuleGroup(
    	createsafe_MappingRule(), 
    	createoneBetween_MappingRule(), 
    	createsameSection_MappingRule(), 
    	createzeroBetween_MappingRule()
    );
    return ruleGroup;
  }
  
  private void registerRules() {
    try {
    	transformation = EventDrivenTransformation.forScope(new EMFScope(resourceSet)).addRules(getRules()).create();
    } catch (IncQueryException e) {
    	e.printStackTrace();
    }
  }
  
  public EventDrivenTransformationRule<SafeMatch, SafeMatcher> createsafe_MappingRule() {
    try{
      EventDrivenTransformationRuleFactory.EventDrivenTransformationBuilder<SafeMatch, SafeMatcher> builder = new EventDrivenTransformationRuleFactory().createRule();
      builder.addLifeCycle(Lifecycles.getDefault(false, true));
      builder.precondition(SafeMatcher.querySpecification());
      
      IMatchProcessor<SafeMatch> actionOnAppear_0 = new IMatchProcessor<SafeMatch>() {
        public void process(final SafeMatch matchedPattern) {
          Safe_Event event = new Safe_Event(null);
          event.setIncQueryPattern(matchedPattern);
          eventStream.push(event);
        }
      };
      builder.action(IncQueryActivationStateEnum.APPEARED, actionOnAppear_0);
      
      IMatchProcessor<SafeMatch> actionOnDisappear_0 = new IMatchProcessor<SafeMatch>() {
        public void process(final SafeMatch matchedPattern) {
        }
      };
      builder.action(IncQueryActivationStateEnum.DISAPPEARED, actionOnDisappear_0);
      
      return builder.build();
    } catch (IncQueryException e) {
      e.printStackTrace();
    } catch (InconsistentEventSemanticsException e) {
      e.printStackTrace();
    }
    return null;
  }
  
  public EventDrivenTransformationRule<OneBetweenMatch, OneBetweenMatcher> createoneBetween_MappingRule() {
    try{
      EventDrivenTransformationRuleFactory.EventDrivenTransformationBuilder<OneBetweenMatch, OneBetweenMatcher> builder = new EventDrivenTransformationRuleFactory().createRule();
      builder.addLifeCycle(Lifecycles.getDefault(false, true));
      builder.precondition(OneBetweenMatcher.querySpecification());
      
      IMatchProcessor<OneBetweenMatch> actionOnAppear_0 = new IMatchProcessor<OneBetweenMatch>() {
        public void process(final OneBetweenMatch matchedPattern) {
          OneBetween_Event event = new OneBetween_Event(null);
          event.setIncQueryPattern(matchedPattern);
          eventStream.push(event);
        }
      };
      builder.action(IncQueryActivationStateEnum.APPEARED, actionOnAppear_0);
      
      IMatchProcessor<OneBetweenMatch> actionOnDisappear_0 = new IMatchProcessor<OneBetweenMatch>() {
        public void process(final OneBetweenMatch matchedPattern) {
        }
      };
      builder.action(IncQueryActivationStateEnum.DISAPPEARED, actionOnDisappear_0);
      
      return builder.build();
    } catch (IncQueryException e) {
      e.printStackTrace();
    } catch (InconsistentEventSemanticsException e) {
      e.printStackTrace();
    }
    return null;
  }
  
  public EventDrivenTransformationRule<SameSectionMatch, SameSectionMatcher> createsameSection_MappingRule() {
    try{
      EventDrivenTransformationRuleFactory.EventDrivenTransformationBuilder<SameSectionMatch, SameSectionMatcher> builder = new EventDrivenTransformationRuleFactory().createRule();
      builder.addLifeCycle(Lifecycles.getDefault(false, true));
      builder.precondition(SameSectionMatcher.querySpecification());
      
      IMatchProcessor<SameSectionMatch> actionOnAppear_0 = new IMatchProcessor<SameSectionMatch>() {
        public void process(final SameSectionMatch matchedPattern) {
          OnSame_Event event = new OnSame_Event(null);
          event.setIncQueryPattern(matchedPattern);
          eventStream.push(event);
        }
      };
      builder.action(IncQueryActivationStateEnum.APPEARED, actionOnAppear_0);
      
      IMatchProcessor<SameSectionMatch> actionOnDisappear_0 = new IMatchProcessor<SameSectionMatch>() {
        public void process(final SameSectionMatch matchedPattern) {
        }
      };
      builder.action(IncQueryActivationStateEnum.DISAPPEARED, actionOnDisappear_0);
      
      return builder.build();
    } catch (IncQueryException e) {
      e.printStackTrace();
    } catch (InconsistentEventSemanticsException e) {
      e.printStackTrace();
    }
    return null;
  }
  
  public EventDrivenTransformationRule<ZeroBetweenMatch, ZeroBetweenMatcher> createzeroBetween_MappingRule() {
    try{
      EventDrivenTransformationRuleFactory.EventDrivenTransformationBuilder<ZeroBetweenMatch, ZeroBetweenMatcher> builder = new EventDrivenTransformationRuleFactory().createRule();
      builder.addLifeCycle(Lifecycles.getDefault(false, true));
      builder.precondition(ZeroBetweenMatcher.querySpecification());
      
      IMatchProcessor<ZeroBetweenMatch> actionOnAppear_0 = new IMatchProcessor<ZeroBetweenMatch>() {
        public void process(final ZeroBetweenMatch matchedPattern) {
          ZeroBetween_Event event = new ZeroBetween_Event(null);
          event.setIncQueryPattern(matchedPattern);
          eventStream.push(event);
        }
      };
      builder.action(IncQueryActivationStateEnum.APPEARED, actionOnAppear_0);
      
      IMatchProcessor<ZeroBetweenMatch> actionOnDisappear_0 = new IMatchProcessor<ZeroBetweenMatch>() {
        public void process(final ZeroBetweenMatch matchedPattern) {
        }
      };
      builder.action(IncQueryActivationStateEnum.DISAPPEARED, actionOnDisappear_0);
      
      return builder.build();
    } catch (IncQueryException e) {
      e.printStackTrace();
    } catch (InconsistentEventSemanticsException e) {
      e.printStackTrace();
    }
    return null;
  }
  
  public void dispose() {
    this.transformation = null;
  }
}
