package hu.bme.mit.kv.pathfinder.tests

import hu.bme.mit.kv.pathfinder.PathFinder
import hu.bme.mit.kv.pathfinder.PathModelTransformator
import hu.bme.mit.kv.pathfindermodel.PathFinderModel
import hu.bme.mit.kv.pathfindermodel.PathfindermodelFactory
import hu.bme.mit.kv.pathfindermodel.Train
import hu.bme.mit.kv.railroadmodel.util.RailroadModelProvider
import java.util.HashSet
import java.util.Random
import java.util.Set
import org.junit.Test
import java.util.LinkedHashSet

class Tests {

	static extension PathfindermodelFactory = PathfindermodelFactory.eINSTANCE

	@Test
	def void pathModelTransformTest() {
		val provider = new RailroadModelProvider()
		val transf = new PathModelTransformator()

		transf.transform(provider);
	}

	@Test
	def void pathFinderTest() {
		val provider = new RailroadModelProvider()
		val pf = new PathFinder(provider)
		val pfm = pf.pfm

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

		pfm.trains.clear
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
		
		pfm.trains.clear
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
		
		pfm.trains.clear
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
		
		return
	}

	def Set<Train> generateTrains(PathFinderModel pfm, int tc) {
		val rnd = new Random
		val randomSet = new HashSet<Integer>(pfm.sections.size)
		val trainSet = new HashSet<Train>(tc)

		while (randomSet.size != tc * 2) {
			randomSet += (1 + rnd.nextInt(pfm.sections.size))
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