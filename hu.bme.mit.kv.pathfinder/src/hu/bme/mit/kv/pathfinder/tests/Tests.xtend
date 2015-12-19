package hu.bme.mit.kv.pathfinder.tests

import hu.bme.mit.kv.pathfinder.BFSPathFinder
import hu.bme.mit.kv.pathfinder.DSEPathFinder
import hu.bme.mit.kv.pathfinder.PathModelTransformator
import hu.bme.mit.kv.pathfindermodel.PathFinderModel
import hu.bme.mit.kv.pathfindermodel.PathfindermodelFactory
import hu.bme.mit.kv.pathfindermodel.Train
import hu.bme.mit.kv.railroadmodel.util.RailroadModelProvider
import java.util.ArrayList
import java.util.Collections
import java.util.HashMap
import java.util.HashSet
import java.util.List
import java.util.Random
import java.util.Set
import org.junit.Test

class Tests {

	static extension PathfindermodelFactory = PathfindermodelFactory.eINSTANCE

	@Test
	def void pathModelTransformTest() {
		val provider = new RailroadModelProvider()
		val transf = new PathModelTransformator()

		transf.transform(provider);
	}

	@Test
	def void dsePathFinderTest() {
		val provider = new RailroadModelProvider()
		val pf = new DSEPathFinder(provider)
		val pfm = pf.pfm

		val start = System.nanoTime

		generateTrains(pfm, 3).forEach [
			pfm.trains +=
				it
			println('''Train going from «it.currentlyOn.id»(«Integer.toHexString(it.currentlyOn.id)») - to «it.goal.id»(«Integer.toHexString(it.goal.id)»)''')
		]

		pf.initDSE
		try {
			pf.findPath
		} catch (Exception e) {
		}

		val end = System.nanoTime - start
		println("Running time:" + end / 1000000)

		return
	}

	def List<List<Train>> generatePerm(List<Train> original) {
		if (original.size() === 0) {
			var List<List<Train>> result = new ArrayList<List<Train>>()
			result.add(new ArrayList<Train>())
			return result
		}
		var Train firstElement = original.remove(0)
		var List<List<Train>> returnValue = new ArrayList<List<Train>>()
		var List<List<Train>> permutations = generatePerm(original)
		for (List<Train> smallerPermutated : permutations) {
			for (var int index = 0; index <= smallerPermutated.size(); index++) {
				var List<Train> temp = new ArrayList<Train>(smallerPermutated)
				temp.add(index, firstElement)
				returnValue.add(temp)
			}
		}
		return returnValue
	}

	@Test
	def void bfsPathFinderTest() {
		val provider = new RailroadModelProvider()
		val pf = new BFSPathFinder(provider)
		val pfm = pf.pfm
		val start = System.nanoTime

		
		/*generateTrains(pfm,3).forEach [

			it.prior = true
			pfm.trains += it

			println('''Train going from «it.currentlyOn.id»(«Integer.toHexString(it.currentlyOn.id)») - to «it.goal.id»(«Integer.toHexString(it.goal.id)»)''')
		]*/
		val trainList = generateTrains(pfm,3).toList
		pfm.trains.addAll(trainList)
		val cost = new HashMap<List<Train>,Integer>
		generatePerm( pfm.trains ).forEach [
			  
			
			it.forEach[
				pfm.trains.forEach[it.prior = false]
				it.prior = true
				println('''Train going from «it.currentlyOn.id»(«Integer.toHexString(it.currentlyOn.id)») - to «it.goal.id»(«Integer.toHexString(it.goal.id)»)''')
				pf.initDSE
				pf.findPath
				pf.trajectoryLength = pf.executeTrajectory
			]
		cost.put(it, pf.trajectoryLength)
		]
		
		
		println("Best priority: "+ cost.entrySet.sortBy[value].head )
		
		val end = System.nanoTime - start
		println("Running time:" + end / 1000000)

		return
	}

	def Set<Train> generateTrains(PathFinderModel pfm, int tc) {
		val rnd = new Random
		val randomSet = new HashSet<Integer>(tc * 2)
		val trainSet = new HashSet<Train>(tc)

		while (randomSet.size != tc * 2) {
			val rndInt = 1 + rnd.nextInt(pfm.sections.size)
			if (!(rndInt == 7 || rndInt == 18))
				randomSet += (rndInt)
		}

		val randomList = randomSet.toList

		for (var i = 1; i <= tc; i++) {
			val train = createTrain
			train.id = i
			train.currentlyOn = pfm.sections.filter[it.id == randomList.head].head
			randomList.remove(0);
			train.goal = pfm.sections.filter[it.id == randomList.head].head
			randomList.remove(0);

			trainSet += train
		}

		return trainSet
	}
}