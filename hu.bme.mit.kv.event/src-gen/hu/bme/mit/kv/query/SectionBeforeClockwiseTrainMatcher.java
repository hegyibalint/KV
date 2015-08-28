package hu.bme.mit.kv.query;

import hu.bme.mit.kv.model.railroadmodel.Section;
import hu.bme.mit.kv.model.railroadmodel.Train;
import hu.bme.mit.kv.query.SectionBeforeClockwiseTrainMatch;
import hu.bme.mit.kv.query.util.SectionBeforeClockwiseTrainQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.kv.query.sectionBeforeClockwiseTrain pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link SectionBeforeClockwiseTrainMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern sectionBeforeClockwiseTrain(t: Train, s: Section) = {
 * 	Train.goingClockwise(t, true);
 * 	Train.currentlyOn(t, currentSection);
 * 	Section.clockwise(currentSection, s);
 * }
 * </pre></code>
 * 
 * @see SectionBeforeClockwiseTrainMatch
 * @see SectionBeforeClockwiseTrainProcessor
 * @see SectionBeforeClockwiseTrainQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class SectionBeforeClockwiseTrainMatcher extends BaseMatcher<SectionBeforeClockwiseTrainMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static SectionBeforeClockwiseTrainMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    SectionBeforeClockwiseTrainMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new SectionBeforeClockwiseTrainMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_T = 0;
  
  private final static int POSITION_S = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(SectionBeforeClockwiseTrainMatcher.class);
  
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
  public SectionBeforeClockwiseTrainMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public SectionBeforeClockwiseTrainMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pT the fixed value of pattern parameter t, or null if not bound.
   * @param pS the fixed value of pattern parameter s, or null if not bound.
   * @return matches represented as a SectionBeforeClockwiseTrainMatch object.
   * 
   */
  public Collection<SectionBeforeClockwiseTrainMatch> getAllMatches(final Train pT, final Section pS) {
    return rawGetAllMatches(new Object[]{pT, pS});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pT the fixed value of pattern parameter t, or null if not bound.
   * @param pS the fixed value of pattern parameter s, or null if not bound.
   * @return a match represented as a SectionBeforeClockwiseTrainMatch object, or null if no match is found.
   * 
   */
  public SectionBeforeClockwiseTrainMatch getOneArbitraryMatch(final Train pT, final Section pS) {
    return rawGetOneArbitraryMatch(new Object[]{pT, pS});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pT the fixed value of pattern parameter t, or null if not bound.
   * @param pS the fixed value of pattern parameter s, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Train pT, final Section pS) {
    return rawHasMatch(new Object[]{pT, pS});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pT the fixed value of pattern parameter t, or null if not bound.
   * @param pS the fixed value of pattern parameter s, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Train pT, final Section pS) {
    return rawCountMatches(new Object[]{pT, pS});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pT the fixed value of pattern parameter t, or null if not bound.
   * @param pS the fixed value of pattern parameter s, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Train pT, final Section pS, final IMatchProcessor<? super SectionBeforeClockwiseTrainMatch> processor) {
    rawForEachMatch(new Object[]{pT, pS}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pT the fixed value of pattern parameter t, or null if not bound.
   * @param pS the fixed value of pattern parameter s, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Train pT, final Section pS, final IMatchProcessor<? super SectionBeforeClockwiseTrainMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pT, pS}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pT the fixed value of pattern parameter t, or null if not bound.
   * @param pS the fixed value of pattern parameter s, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public SectionBeforeClockwiseTrainMatch newMatch(final Train pT, final Section pS) {
    return SectionBeforeClockwiseTrainMatch.newMatch(pT, pS);
  }
  
  /**
   * Retrieve the set of values that occur in matches for t.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Train> rawAccumulateAllValuesOft(final Object[] parameters) {
    Set<Train> results = new HashSet<Train>();
    rawAccumulateAllValues(POSITION_T, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for t.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Train> getAllValuesOft() {
    return rawAccumulateAllValuesOft(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for t.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Train> getAllValuesOft(final SectionBeforeClockwiseTrainMatch partialMatch) {
    return rawAccumulateAllValuesOft(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for t.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Train> getAllValuesOft(final Section pS) {
    return rawAccumulateAllValuesOft(new Object[]{
    null, 
    pS
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for s.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Section> rawAccumulateAllValuesOfs(final Object[] parameters) {
    Set<Section> results = new HashSet<Section>();
    rawAccumulateAllValues(POSITION_S, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for s.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Section> getAllValuesOfs() {
    return rawAccumulateAllValuesOfs(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for s.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Section> getAllValuesOfs(final SectionBeforeClockwiseTrainMatch partialMatch) {
    return rawAccumulateAllValuesOfs(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for s.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Section> getAllValuesOfs(final Train pT) {
    return rawAccumulateAllValuesOfs(new Object[]{
    pT, 
    null
    });
  }
  
  @Override
  protected SectionBeforeClockwiseTrainMatch tupleToMatch(final Tuple t) {
    try {
    	return SectionBeforeClockwiseTrainMatch.newMatch((hu.bme.mit.kv.model.railroadmodel.Train) t.get(POSITION_T), (hu.bme.mit.kv.model.railroadmodel.Section) t.get(POSITION_S));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected SectionBeforeClockwiseTrainMatch arrayToMatch(final Object[] match) {
    try {
    	return SectionBeforeClockwiseTrainMatch.newMatch((hu.bme.mit.kv.model.railroadmodel.Train) match[POSITION_T], (hu.bme.mit.kv.model.railroadmodel.Section) match[POSITION_S]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected SectionBeforeClockwiseTrainMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return SectionBeforeClockwiseTrainMatch.newMutableMatch((hu.bme.mit.kv.model.railroadmodel.Train) match[POSITION_T], (hu.bme.mit.kv.model.railroadmodel.Section) match[POSITION_S]);
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
  public static IQuerySpecification<SectionBeforeClockwiseTrainMatcher> querySpecification() throws IncQueryException {
    return SectionBeforeClockwiseTrainQuerySpecification.instance();
  }
}
