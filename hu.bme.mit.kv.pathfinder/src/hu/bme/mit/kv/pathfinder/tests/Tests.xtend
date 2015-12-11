package hu.bme.mit.kv.pathfinder.tests

import hu.bme.mit.kv.pathfinder.BFSPathFinder
import hu.bme.mit.kv.pathfinder.DSEPathFinder
import hu.bme.mit.kv.pathfinder.PathModelTransformator
import hu.bme.mit.kv.pathfindermodel.PathFinderModel
import hu.bme.mit.kv.pathfindermodel.PathfindermodelFactory
import hu.bme.mit.kv.pathfindermodel.Train
import hu.bme.mit.kv.railroadmodel.util.RailroadModelProvider
import java.util.HashSet
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

		generateTrains(pfm, 3).forEach [
			pfm.trains +=
				it
			println('''Train going from «it.currentlyOn.id»(«Integer.toHexString(it.currentlyOn.id)») - to «it.goal.id»(«Integer.toHexString(it.goal.id)»)''')
		]

		pf.initDSE
		try {
			pf.findPath
		} catch (Exception e) { }
		
		return
	}
	
	@Test
	def void bfsPathFinderTest() {
		val provider = new RailroadModelProvider()
		val pf = new BFSPathFinder(provider)
		val pfm = pf.pfm



		generateTrains(pfm, 3).forEach [
			pfm.trains += it
			println('''Train going from «it.currentlyOn.id»(«Integer.toHexString(it.currentlyOn.id)») - to «it.goal.id»(«Integer.toHexString(it.goal.id)»)''')
		]

		pf.initDSE
		try {
			pf.findPath
		} catch (Exception e) { }
		
		return
	}
	

	def Set<Train> generateTrains(PathFinderModel pfm, int tc) {
		val rnd = new Random
		val randomSet = new HashSet<Integer>(tc*2)
		val trainSet = new HashSet<Train>(tc)

		while (randomSet.size != tc * 2) {
			val rndInt = 1 + rnd.nextInt(pfm.sections.size)
			if( !(rndInt == 7 || rndInt == 18) )
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