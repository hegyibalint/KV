package hu.bme.mit.kv.pathfinder

import hu.bme.mit.kv.pathfinder.query.TrainNeighbourSectionPrioMatch
import hu.bme.mit.kv.pathfinder.query.TrainNeighbourSectionPrioMatcher
import hu.bme.mit.kv.pathfinder.query.util.TrainGoalQuerySpecification
import hu.bme.mit.kv.pathfinder.query.util.TrainNeighbourSectionPrioProcessor
import hu.bme.mit.kv.pathfinder.query.util.TrainNeighbourSectionPrioQuerySpecification
import hu.bme.mit.kv.pathfindermodel.PathFinderModel
import hu.bme.mit.kv.pathfindermodel.PathfindermodelFactory
import hu.bme.mit.kv.pathfindermodel.PathfindermodelPackage
import hu.bme.mit.kv.pathfindermodel.Section
import hu.bme.mit.kv.pathfindermodel.Train
import hu.bme.mit.kv.railroadmodel.util.RailroadModelProvider
import org.eclipse.viatra.dse.api.DSETransformationRule
import org.eclipse.viatra.dse.api.DesignSpaceExplorer
import org.eclipse.viatra.dse.api.Strategies
import org.eclipse.viatra.dse.objectives.impl.ModelQueriesHardObjective
import org.eclipse.viatra.dse.solutionstore.SimpleSolutionStore
import org.eclipse.viatra.dse.statecoding.simple.SimpleStateCoderFactory
import org.eclipse.xtend.lib.annotations.Accessors

class BFSPathFinder {
	static extension PathfindermodelFactory = PathfindermodelFactory.eINSTANCE
		
		
	var DesignSpaceExplorer dse
		
	@Accessors(PROTECTED_SETTER)
	public var PathFinderModel pfm
	new(RailroadModelProvider prov){
		val transformator = new PathModelTransformator()
		pfm = transformator.transform(prov)
	}
	
	
	def initDSE() {
		dse = new DesignSpaceExplorer
		
		dse.addMetaModelPackage(PathfindermodelPackage.eINSTANCE);
		dse.initialModel = pfm
		dse.stateCoderFactory = new SimpleStateCoderFactory(dse.metaModelPackages)
		dse.solutionStore = new SimpleSolutionStore(1)
		setUpRules()
	}

	def setUpRules() {
		dse.addTransformationRule(
			new DSETransformationRule<TrainNeighbourSectionPrioMatch, TrainNeighbourSectionPrioMatcher>(
				TrainNeighbourSectionPrioQuerySpecification.instance, new TrainNeighbourSectionPrioProcessor() {
					
					override process(Train pT, Section pFrom, Section pTo) {
						if(!pTo.isHunted ){
							pT.currentlyOn = pTo
							pFrom.hunted = true
						}
					}
					 
				}))

		dse.addObjective(
			new ModelQueriesHardObjective("TrainGoalObjective")
				.withConstraint(TrainGoalQuerySpecification.instance))
	}

	def findPath() {		
		
		dse.startExploration(Strategies.createBFSStrategy());
		print(dse.toStringSolutions)
		return
	}
	
	
}