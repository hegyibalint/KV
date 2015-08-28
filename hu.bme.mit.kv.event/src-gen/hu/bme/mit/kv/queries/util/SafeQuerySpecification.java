package hu.bme.mit.kv.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.kv.queries.SafeMatch;
import hu.bme.mit.kv.queries.SafeMatcher;
import hu.bme.mit.kv.queries.util.OneBetweenQuerySpecification;
import hu.bme.mit.kv.queries.util.SameSectionQuerySpecification;
import hu.bme.mit.kv.queries.util.ZeroBetweenQuerySpecification;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Inequality;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.PatternMatchCounter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate SafeMatcher in a type-safe way.
 * 
 * @see SafeMatcher
 * @see SafeMatch
 * 
 */
@SuppressWarnings("all")
public final class SafeQuerySpecification extends BaseGeneratedEMFQuerySpecification<SafeMatcher> {
  private SafeQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static SafeQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected SafeMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return SafeMatcher.on(engine);
  }
  
  @Override
  public SafeMatch newEmptyMatch() {
    return SafeMatch.newEmptyMatch();
  }
  
  @Override
  public SafeMatch newMatch(final Object... parameters) {
    return SafeMatch.newMatch((hu.bme.mit.kv.model.railroadmodel.Train) parameters[0], (hu.bme.mit.kv.model.railroadmodel.Train) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static SafeQuerySpecification INSTANCE = make();
    
    public static SafeQuerySpecification make() {
      return new SafeQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static SafeQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.kv.queries.safe";
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
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      	PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      	PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      	PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
      	PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_t1, "t1"),
      				
      		new ExportedParameter(body, var_t2, "t2")
      	));
      	new TypeConstraint(body, new FlatTuple(var_t1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.kv.railroadmodel", "Train")));
      	new TypeConstraint(body, new FlatTuple(var_t2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.kv.railroadmodel", "Train")));
      	new Inequality(body, var_t1, var_t2);
      	new ConstantValue(body, var__virtual_0_, 0);
      	new PatternMatchCounter(body, new FlatTuple(var_t1, var_t2), SameSectionQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_1_);
      	new Equality(body, var__virtual_0_, var__virtual_1_);
      	new ConstantValue(body, var__virtual_2_, 0);
      	new PatternMatchCounter(body, new FlatTuple(var_t1, var_t2), ZeroBetweenQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_3_);
      	new Equality(body, var__virtual_2_, var__virtual_3_);
      	new ConstantValue(body, var__virtual_4_, 0);
      	new PatternMatchCounter(body, new FlatTuple(var_t1, var_t2), OneBetweenQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_5_);
      	new Equality(body, var__virtual_4_, var__virtual_5_);
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
