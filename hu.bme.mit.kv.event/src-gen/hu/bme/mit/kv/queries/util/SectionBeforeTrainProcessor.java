package hu.bme.mit.kv.queries.util;

import hu.bme.mit.kv.model.railroadmodel.Section;
import hu.bme.mit.kv.model.railroadmodel.Train;
import hu.bme.mit.kv.queries.SectionBeforeTrainMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.kv.queries.sectionBeforeTrain pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class SectionBeforeTrainProcessor implements IMatchProcessor<SectionBeforeTrainMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pT the value of pattern parameter t in the currently processed match
   * @param pS the value of pattern parameter s in the currently processed match
   * 
   */
  public abstract void process(final Train pT, final Section pS);
  
  @Override
  public void process(final SectionBeforeTrainMatch match) {
    process(match.getT(), match.getS());
  }
}
