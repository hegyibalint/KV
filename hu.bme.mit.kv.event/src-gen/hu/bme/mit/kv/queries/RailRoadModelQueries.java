package hu.bme.mit.kv.queries;

import hu.bme.mit.kv.queries.OneBetweenMatcher;
import hu.bme.mit.kv.queries.SafeMatcher;
import hu.bme.mit.kv.queries.SameSectionMatcher;
import hu.bme.mit.kv.queries.SectionBeforeClockwiseTrainMatcher;
import hu.bme.mit.kv.queries.SectionBeforeCounterClockwiseTrainMatcher;
import hu.bme.mit.kv.queries.SectionBeforeTrainMatcher;
import hu.bme.mit.kv.queries.ZeroBetweenMatcher;
import hu.bme.mit.kv.queries.util.OneBetweenQuerySpecification;
import hu.bme.mit.kv.queries.util.SafeQuerySpecification;
import hu.bme.mit.kv.queries.util.SameSectionQuerySpecification;
import hu.bme.mit.kv.queries.util.SectionBeforeClockwiseTrainQuerySpecification;
import hu.bme.mit.kv.queries.util.SectionBeforeCounterClockwiseTrainQuerySpecification;
import hu.bme.mit.kv.queries.util.SectionBeforeTrainQuerySpecification;
import hu.bme.mit.kv.queries.util.ZeroBetweenQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * A pattern group formed of all patterns defined in RailRoadModelQueries.eiq.
 * 
 * <p>Use the static instance as any {@link org.eclipse.incquery.runtime.api.IPatternGroup}, to conveniently prepare
 * an EMF-IncQuery engine for matching all patterns originally defined in file RailRoadModelQueries.eiq,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package hu.bme.mit.kv.queries, the group contains the definition of the following patterns: <ul>
 * <li>sectionBeforeClockwiseTrain</li>
 * <li>sectionBeforeCounterClockwiseTrain</li>
 * <li>sectionBeforeTrain</li>
 * <li>sameSection</li>
 * <li>zeroBetween</li>
 * <li>oneBetween</li>
 * <li>safe</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class RailRoadModelQueries extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws IncQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static RailRoadModelQueries instance() throws IncQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new RailRoadModelQueries();
    }
    return INSTANCE;
  }
  
  private static RailRoadModelQueries INSTANCE;
  
  private RailRoadModelQueries() throws IncQueryException {
    querySpecifications.add(SectionBeforeClockwiseTrainQuerySpecification.instance());
    querySpecifications.add(SectionBeforeCounterClockwiseTrainQuerySpecification.instance());
    querySpecifications.add(SectionBeforeTrainQuerySpecification.instance());
    querySpecifications.add(SameSectionQuerySpecification.instance());
    querySpecifications.add(ZeroBetweenQuerySpecification.instance());
    querySpecifications.add(OneBetweenQuerySpecification.instance());
    querySpecifications.add(SafeQuerySpecification.instance());
  }
  
  public SectionBeforeClockwiseTrainQuerySpecification getSectionBeforeClockwiseTrain() throws IncQueryException {
    return SectionBeforeClockwiseTrainQuerySpecification.instance();
  }
  
  public SectionBeforeClockwiseTrainMatcher getSectionBeforeClockwiseTrain(final IncQueryEngine engine) throws IncQueryException {
    return SectionBeforeClockwiseTrainMatcher.on(engine);
  }
  
  public SectionBeforeCounterClockwiseTrainQuerySpecification getSectionBeforeCounterClockwiseTrain() throws IncQueryException {
    return SectionBeforeCounterClockwiseTrainQuerySpecification.instance();
  }
  
  public SectionBeforeCounterClockwiseTrainMatcher getSectionBeforeCounterClockwiseTrain(final IncQueryEngine engine) throws IncQueryException {
    return SectionBeforeCounterClockwiseTrainMatcher.on(engine);
  }
  
  public SectionBeforeTrainQuerySpecification getSectionBeforeTrain() throws IncQueryException {
    return SectionBeforeTrainQuerySpecification.instance();
  }
  
  public SectionBeforeTrainMatcher getSectionBeforeTrain(final IncQueryEngine engine) throws IncQueryException {
    return SectionBeforeTrainMatcher.on(engine);
  }
  
  public SameSectionQuerySpecification getSameSection() throws IncQueryException {
    return SameSectionQuerySpecification.instance();
  }
  
  public SameSectionMatcher getSameSection(final IncQueryEngine engine) throws IncQueryException {
    return SameSectionMatcher.on(engine);
  }
  
  public ZeroBetweenQuerySpecification getZeroBetween() throws IncQueryException {
    return ZeroBetweenQuerySpecification.instance();
  }
  
  public ZeroBetweenMatcher getZeroBetween(final IncQueryEngine engine) throws IncQueryException {
    return ZeroBetweenMatcher.on(engine);
  }
  
  public OneBetweenQuerySpecification getOneBetween() throws IncQueryException {
    return OneBetweenQuerySpecification.instance();
  }
  
  public OneBetweenMatcher getOneBetween(final IncQueryEngine engine) throws IncQueryException {
    return OneBetweenMatcher.on(engine);
  }
  
  public SafeQuerySpecification getSafe() throws IncQueryException {
    return SafeQuerySpecification.instance();
  }
  
  public SafeMatcher getSafe(final IncQueryEngine engine) throws IncQueryException {
    return SafeMatcher.on(engine);
  }
}
