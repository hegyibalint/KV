package hu.bme.mit.kv.queries;

import hu.bme.mit.kv.model.railroadmodel.Train;
import hu.bme.mit.kv.queries.SafeMatch;
import hu.bme.mit.kv.queries.util.SafeQuerySpecification;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;
import org.eclipse.incquery.runtime.util.IncQueryLoggingUtil;

/**
 * Generated pattern matcher API of the hu.bme.mit.kv.queries.safe pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link SafeMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern safe(t1: Train, t2: Train){
 * 	t1 != t2;
 * 	0 == count find sameSection(t1, t2);
 * 	0 == count find zeroBetween(t1,t2);
 * 	0 == count find oneBetween(t1,t2);
 * 
 * }
 * </pre></code>
 * 
 * @see SafeMatch
 * @see SafeProcessor
 * @see SafeQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class SafeMatcher extends BaseMatcher<SafeMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static SafeMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    SafeMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new SafeMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_T1 = 0;
  
  private final static int POSITION_T2 = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(SafeMatcher.class);
  
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet).
   * If a pattern matcher is already constructed with the same root, only a light-weight reference is returned.
   * The scope of pattern matching will be the given EMF model root and below (see FAQ for more precise definition).
   * The match set will be incrementally refreshed upon updates from this scope.
   * <p>The matcher will be created within the managed {@link IncQueryEngine} belonging to the EMF model root, so
   * multiple matchers will reuse the same engine and benefit from increased performance and reduced memory footprint.
   * @param emfRoot the root of the EMF containment hierarchy where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead, e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}
   * 
   */
  @Deprecated
  public SafeMatcher(final Notifier emfRoot) throws IncQueryException {
    this(IncQueryEngine.on(emfRoot));
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead
   * 
   */
  @Deprecated
  public SafeMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pT1 the fixed value of pattern parameter t1, or null if not bound.
   * @param pT2 the fixed value of pattern parameter t2, or null if not bound.
   * @return matches represented as a SafeMatch object.
   * 
   */
  public Collection<SafeMatch> getAllMatches(final Train pT1, final Train pT2) {
    return rawGetAllMatches(new Object[]{pT1, pT2});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pT1 the fixed value of pattern parameter t1, or null if not bound.
   * @param pT2 the fixed value of pattern parameter t2, or null if not bound.
   * @return a match represented as a SafeMatch object, or null if no match is found.
   * 
   */
  public SafeMatch getOneArbitraryMatch(final Train pT1, final Train pT2) {
    return rawGetOneArbitraryMatch(new Object[]{pT1, pT2});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pT1 the fixed value of pattern parameter t1, or null if not bound.
   * @param pT2 the fixed value of pattern parameter t2, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Train pT1, final Train pT2) {
    return rawHasMatch(new Object[]{pT1, pT2});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pT1 the fixed value of pattern parameter t1, or null if not bound.
   * @param pT2 the fixed value of pattern parameter t2, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Train pT1, final Train pT2) {
    return rawCountMatches(new Object[]{pT1, pT2});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pT1 the fixed value of pattern parameter t1, or null if not bound.
   * @param pT2 the fixed value of pattern parameter t2, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Train pT1, final Train pT2, final IMatchProcessor<? super SafeMatch> processor) {
    rawForEachMatch(new Object[]{pT1, pT2}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pT1 the fixed value of pattern parameter t1, or null if not bound.
   * @param pT2 the fixed value of pattern parameter t2, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Train pT1, final Train pT2, final IMatchProcessor<? super SafeMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pT1, pT2}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pT1 the fixed value of pattern parameter t1, or null if not bound.
   * @param pT2 the fixed value of pattern parameter t2, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public SafeMatch newMatch(final Train pT1, final Train pT2) {
    return SafeMatch.newMatch(pT1, pT2);
  }
  
  /**
   * Retrieve the set of values that occur in matches for t1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Train> rawAccumulateAllValuesOft1(final Object[] parameters) {
    Set<Train> results = new HashSet<Train>();
    rawAccumulateAllValues(POSITION_T1, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for t1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Train> getAllValuesOft1() {
    return rawAccumulateAllValuesOft1(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for t1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Train> getAllValuesOft1(final SafeMatch partialMatch) {
    return rawAccumulateAllValuesOft1(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for t1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Train> getAllValuesOft1(final Train pT2) {
    return rawAccumulateAllValuesOft1(new Object[]{
    null, 
    pT2
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for t2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Train> rawAccumulateAllValuesOft2(final Object[] parameters) {
    Set<Train> results = new HashSet<Train>();
    rawAccumulateAllValues(POSITION_T2, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for t2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Train> getAllValuesOft2() {
    return rawAccumulateAllValuesOft2(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for t2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Train> getAllValuesOft2(final SafeMatch partialMatch) {
    return rawAccumulateAllValuesOft2(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for t2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Train> getAllValuesOft2(final Train pT1) {
    return rawAccumulateAllValuesOft2(new Object[]{
    pT1, 
    null
    });
  }
  
  @Override
  protected SafeMatch tupleToMatch(final Tuple t) {
    try {
    	return SafeMatch.newMatch((hu.bme.mit.kv.model.railroadmodel.Train) t.get(POSITION_T1), (hu.bme.mit.kv.model.railroadmodel.Train) t.get(POSITION_T2));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected SafeMatch arrayToMatch(final Object[] match) {
    try {
    	return SafeMatch.newMatch((hu.bme.mit.kv.model.railroadmodel.Train) match[POSITION_T1], (hu.bme.mit.kv.model.railroadmodel.Train) match[POSITION_T2]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected SafeMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return SafeMatch.newMutableMatch((hu.bme.mit.kv.model.railroadmodel.Train) match[POSITION_T1], (hu.bme.mit.kv.model.railroadmodel.Train) match[POSITION_T2]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<SafeMatcher> querySpecification() throws IncQueryException {
    return SafeQuerySpecification.instance();
  }
}
