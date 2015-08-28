package hu.bme.mit.kv.queries.util;

import hu.bme.mit.kv.model.railroadmodel.Train;
import hu.bme.mit.kv.queries.SameSectionMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.kv.queries.sameSection pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class SameSectionProcessor implements IMatchProcessor<SameSectionMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pT1 the value of pattern parameter t1 in the currently processed match
   * @param pT2 the value of pattern parameter t2 in the currently processed match
   * 
   */
  public abstract void process(final Train pT1, final Train pT2);
  
  @Override
  public void process(final SameSectionMatch match) {
    process(match.getT1(), match.getT2());
  }
}