package hu.bme.mit.kv.query.util;

import com.google.common.collect.Sets;
import hu.bme.mit.kv.query.ZeroBetweenMatch;
import hu.bme.mit.kv.query.ZeroBetweenMatcher;
import hu.bme.mit.kv.query.util.SectionBeforeTrainQuerySpecification;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate ZeroBetweenMatcher in a type-safe way.
 * 
 * @see ZeroBetweenMatcher
 * @see ZeroBetweenMatch
 * 
 */
@SuppressWarnings("all")
public final class ZeroBetweenQuerySpecification extends BaseGeneratedEMFQuerySpecification<ZeroBetweenMatcher> {
  private ZeroBetweenQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static ZeroBetweenQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected ZeroBetweenMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return ZeroBetweenMatcher.on(engine);
  }
  
  @Override
  public ZeroBetweenMatch newEmptyMatch() {
    return ZeroBetweenMatch.newEmptyMatch();
  }
  
  @Override
  public ZeroBetweenMatch newMatch(final Object... parameters) {
    return ZeroBetweenMatch.newMatch((hu.bme.mit.kv.model.railroadmodel.Train) parameters[0], (hu.bme.mit.kv.model.railroadmodel.Train) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static ZeroBetweenQuerySpecification INSTANCE = make();
    
    public static ZeroBetweenQuerySpecification make() {
      return new ZeroBetweenQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static ZeroBetweenQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.kv.query.zeroBetween";
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
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_t1, "t1"),
      				
      		new ExportedParameter(body, var_t2, "t2")
      	));
      	new TypeConstraint(body, new FlatTuple(var_t1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.kv.railroadmodel", "Train")));
      	new TypeConstraint(body, new FlatTuple(var_t2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.kv.railroadmodel", "Train")));
      	new TypeConstraint(body, new FlatTuple(var_t1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.kv.railroadmodel", "Train")));
      	new TypeConstraint(body, new FlatTuple(var_t1, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hu.bme.mit.kv.railroadmodel", "Train", "currentlyOn")));
      	new Equality(body, var__virtual_0_, var_section);
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
