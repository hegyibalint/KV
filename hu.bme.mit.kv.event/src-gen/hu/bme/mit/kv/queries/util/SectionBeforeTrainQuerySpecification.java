package hu.bme.mit.kv.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.kv.queries.SectionBeforeTrainMatch;
import hu.bme.mit.kv.queries.SectionBeforeTrainMatcher;
import hu.bme.mit.kv.queries.util.SectionBeforeClockwiseTrainQuerySpecification;
import hu.bme.mit.kv.queries.util.SectionBeforeCounterClockwiseTrainQuerySpecification;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate SectionBeforeTrainMatcher in a type-safe way.
 * 
 * @see SectionBeforeTrainMatcher
 * @see SectionBeforeTrainMatch
 * 
 */
@SuppressWarnings("all")
public final class SectionBeforeTrainQuerySpecification extends BaseGeneratedEMFQuerySpecification<SectionBeforeTrainMatcher> {
  private SectionBeforeTrainQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static SectionBeforeTrainQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected SectionBeforeTrainMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return SectionBeforeTrainMatcher.on(engine);
  }
  
  @Override
  public SectionBeforeTrainMatch newEmptyMatch() {
    return SectionBeforeTrainMatch.newEmptyMatch();
  }
  
  @Override
  public SectionBeforeTrainMatch newMatch(final Object... parameters) {
    return SectionBeforeTrainMatch.newMatch((hu.bme.mit.kv.model.railroadmodel.Train) parameters[0], (hu.bme.mit.kv.model.railroadmodel.Section) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static SectionBeforeTrainQuerySpecification INSTANCE = make();
    
    public static SectionBeforeTrainQuerySpecification make() {
      return new SectionBeforeTrainQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static SectionBeforeTrainQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.kv.queries.sectionBeforeTrain";
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
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_t, "t"),
      				
      		new ExportedParameter(body, var_s, "s")
      	));
      	new TypeConstraint(body, new FlatTuple(var_t), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.kv.railroadmodel", "Train")));
      	new TypeConstraint(body, new FlatTuple(var_s), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.kv.railroadmodel", "Section")));
      	new PositivePatternCall(body, new FlatTuple(var_t, var_s), SectionBeforeCounterClockwiseTrainQuerySpecification.instance().getInternalQueryRepresentation());
      	bodies.add(body);
      }
      {
      	PBody body = new PBody(this);
      	PVariable var_t = body.getOrCreateVariableByName("t");
      	PVariable var_s = body.getOrCreateVariableByName("s");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_t, "t"),
      				
      		new ExportedParameter(body, var_s, "s")
      	));
      	new TypeConstraint(body, new FlatTuple(var_t), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.kv.railroadmodel", "Train")));
      	new TypeConstraint(body, new FlatTuple(var_s), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.kv.railroadmodel", "Section")));
      	new PositivePatternCall(body, new FlatTuple(var_t, var_s), SectionBeforeClockwiseTrainQuerySpecification.instance().getInternalQueryRepresentation());
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
