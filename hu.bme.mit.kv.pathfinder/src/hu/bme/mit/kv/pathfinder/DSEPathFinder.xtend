package hu.bme.mit.kv.pathfinder

import hu.bme.mit.kv.pathfinder.query.TrainNeighbourSectionMatch
import hu.bme.mit.kv.pathfinder.query.TrainNeighbourSectionMatcher
import hu.bme.mit.kv.pathfinder.query.util.TrainGoalQuerySpecification
import hu.bme.mit.kv.pathfinder.query.util.TrainNeighbourSectionProcessor
import hu.bme.mit.kv.pathfinder.query.util.TrainNeighbourSectionQuerySpecification
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

class DSEPathFinder {
	
	static extension PathfindermodelFactory = PathfindermodelFactory.eINSTANCE
	
	var RailroadModelProvider provider
	var DesignSpaceExplorer dse

	@Accessors(PROTECTED_SETTER)
	public var PathFinderModel pfm

	new(RailroadModelProvider provider) {
		this.provider = provider

		val transformator = new PathModelTransformator()
		pfm = transformator.transform(provider)
		
		/*
		val t1 = createTrain
		t1.id = 1
		t1.currentlyOn = pfm.sections.filter[it.id == 7].head
		t1.goal = pfm.sections.filter[it.id == 19].head
		pfm.trains += t1
		
		val t2 = createTrain
		t2.id = 2
		t2.currentlyOn = pfm.sections.filter[it.id == 9].head
		t2.goal = pfm.sections.filter[it.id == 17].head
		pfm.trains += t2

		val t3 = createTrain
		t3.id = 3
		t3.currentlyOn = pfm.sections.filter[it.id == 20].head
		t3.goal = pfm.sections.filter[it.id == 9].head
		pfm.trains += t3
		*/
	}
	
	def initDSE() {
		dse = new DesignSpaceExplorer
		
		//Logger.getLogger(ParallelBFSStrategy).level = Level.DEBUG
		//Logger.getLogger(DesignSpaceExplorer).level = Level.DEBUG
		
		dse.addMetaModelPackage(PathfindermodelPackage.eINSTANCE);
		dse.initialModel = pfm
		dse.stateCoderFactory = new SimpleStateCoderFactory(dse.metaModelPackages)
		dse.solutionStore = new SimpleSolutionStore(1)
		setUpRules()
	}

	def setUpRules() {
		dse.addTransformationRule(
			new DSETransformationRule<TrainNeighbourSectionMatch, TrainNeighbourSectionMatcher>(
				TrainNeighbourSectionQuerySpecification.instance, new TrainNeighbourSectionProcessor() {
					
					override process(Train pT, Section pFrom, Section pTo) {
						pT.currentlyOn = pTo
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