package hu.bme.mit.kv.query.util;

import com.google.common.collect.Sets;
import hu.bme.mit.kv.query.SectionBeforeCounterClockwiseTrainMatch;
import hu.bme.mit.kv.query.SectionBeforeCounterClockwiseTrainMatcher;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.incquery.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate SectionBeforeCounterClockwiseTrainMatcher in a type-safe way.
 * 
 * @see SectionBeforeCounterClockwiseTrainMatcher
 * @see SectionBeforeCounterClockwiseTrainMatch
 * 
 */
@SuppressWarnings("all")
public final class SectionBeforeCounterClockwiseTrainQuerySpecification extends BaseGeneratedEMFQuerySpecification<SectionBeforeCounterClockwiseTrainMatcher> {
  private SectionBeforeCounterClockwiseTrainQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static SectionBeforeCounterClockwiseTrainQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected SectionBeforeCounterClockwiseTrainMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return SectionBeforeCounterClockwiseTrainMatcher.on(engine);
  }
  
  @Override
  public SectionBeforeCounterClockwiseTrainMatch newEmptyMatch() {
    return SectionBeforeCounterClockwiseTrainMatch.newEmptyMatch();
  }
  
  @Override
  public SectionBeforeCounterClockwiseTrainMatch newMatch(final Object... parameters) {
    return SectionBeforeCounterClockwiseTrainMatch.newMatch((hu.bme.mit.kv.model.railroadmodel.Train) parameters[0], (hu.bme.mit.kv.model.railroadmodel.Section) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static SectionBeforeCounterClockwiseTrainQuerySpecification INSTANCE = make();
    
    public static SectionBeforeCounterClockwiseTrainQuerySpecification make() {
      return new SectionBeforeCounterClockwiseTrainQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static SectionBeforeCounterClockwiseTrainQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.kv.query.sectionBeforeCounterClockwiseTrain";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("t","s");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("t", "hu.bme.mit.kv.model.railroadmodel.Train"),new PParameter("s", "hu.bme.mit.kv.model.railroadmodel.Section"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_t = body.getOrCreateVariableByName("t");
      	PVariable var_s = body.getOrCreateVariableByName("s");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      	PVariable var_currentSection = body.getOrCreateVariableByName("currentSection");
      	PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      	PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_t, "t"),
      				
      		new ExportedParameter(body, var_s, "s")
      	));
      	new TypeConstraint(body, new FlatTuple(var_t), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.kv.railroadmodel", "Train")));
      	new TypeConstraint(body, new FlatTuple(var_s), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.kv.railroadmodel", "Section")));
      	new ConstantValue(body, var__virtual_0_, false);
      	new TypeConstraint(body, new FlatTuple(var_t), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.kv.railroadmodel", "Train")));
      	new TypeConstraint(body, new FlatTuple(var_t, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hu.bme.mit.kv.railroadmodel", "Train", "goingClockwise")));
      	new Equality(body, var__virtual_1_, var__virtual_0_);
      	new TypeConstraint(body, new FlatTuple(var_t), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.kv.railroadmodel", "Train")));
      	new TypeConstraint(body, new FlatTuple(var_t, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hu.bme.mit.kv.railroadmodel", "Train", "currentlyOn")));
      	new Equality(body, var__virtual_2_, var_currentSection);
      	new TypeConstraint(body, new FlatTuple(var_currentSection), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.kv.railroadmodel", "Section")));
      	new TypeConstraint(body, new FlatTuple(var_currentSection, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hu.bme.mit.kv.railroadmodel", "Section", "counterClockwise")));
      	new Equality(body, var__virtual_3_, var_s);
      	bodies.add(body);
      }
      	// to silence compiler error
      	if (false) throw new IncQueryException("Never", "happens");
      } catch (IncQueryException ex) {
      	throw processDependencyException(ex);
      }
      return bodies;
    }
  }
}
