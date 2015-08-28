package hu.bme.mit.kv.query.util;

import com.google.common.collect.Sets;
import hu.bme.mit.kv.query.OneBetweenMatch;
import hu.bme.mit.kv.query.OneBetweenMatcher;
import hu.bme.mit.kv.query.util.SectionBeforeTrainQuerySpecification;
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
 * A pattern-specific query specification that can instantiate OneBetweenMatcher in a type-safe way.
 * 
 * @see OneBetweenMatcher
 * @see OneBetweenMatch
 * 
 */
@SuppressWarnings("all")
public final class OneBetweenQuerySpecification extends BaseGeneratedEMFQuerySpecification<OneBetweenMatcher> {
  private OneBetweenQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static OneBetweenQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected OneBetweenMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return OneBetweenMatcher.on(engine);
  }
  
  @Override
  public OneBetweenMatch newEmptyMatch() {
    return OneBetweenMatch.newEmptyMatch();
  }
  
  @Override
  public OneBetweenMatch newMatch(final Object... parameters) {
    return OneBetweenMatch.newMatch((hu.bme.mit.kv.model.railroadmodel.Train) parameters[0], (hu.bme.mit.kv.model.railroadmodel.Train) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static OneBetweenQuerySpecification INSTANCE = make();
    
    public static OneBetweenQuerySpecification make() {
      return new OneBetweenQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static OneBetweenQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.kv.query.oneBetween";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("t1","t2");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("t1", "hu.bme.mit.kv.model.railroadmodel.Train"),new PParameter("t2", "hu.bme.mit.kv.model.railroadmodel.Train"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_t1 = body.getOrCreateVariableByName("t1");
      	PVariable var_t2 = body.getOrCreateVariableByName("t2");
      	PVariable var_section = body.getOrCreateVariableByName("section");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_t1, "t1"),
      				
      		new ExportedParameter(body, var_t2, "t2")
      	));
      	new TypeConstraint(body, new FlatTuple(var_t1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.kv.railroadmodel", "Train")));
      	new TypeConstraint(body, new FlatTuple(var_t2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.kv.railroadmodel", "Train")));
      	new PositivePatternCall(body, new FlatTuple(var_t1, var_section), SectionBeforeTrainQuerySpecification.instance().getInternalQueryRepresentation());
      	new PositivePatternCall(body, new FlatTuple(var_t2, var_section), SectionBeforeTrainQuerySpecification.instance().getInternalQueryRepresentation());
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
