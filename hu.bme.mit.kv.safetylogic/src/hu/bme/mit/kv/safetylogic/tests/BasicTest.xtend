package hu.bme.mit.kv.safetylogic.tests

import hu.bme.mit.kv.json.JsonArray
import hu.bme.mit.kv.json.JsonObject
import hu.bme.mit.kv.railroadmodel.RailroadModelFactory
import hu.bme.mit.kv.railroadmodel.SwitchRegion
import hu.bme.mit.kv.safetylogic.SafetyLogic
import hu.bme.mit.kv.safetylogic.queries.RegionGroupMatcher
import java.io.BufferedReader
import java.io.FileOutputStream
import java.io.InputStreamReader
import java.net.URL
import org.junit.Test

class BasicTest {
	static extension RailroadModelFactory factory = RailroadModelFactory.eINSTANCE
	
	@Test
	def void test() {
		val sl = new SafetyLogic
		
		val url = new URL("platform:/plugin/hu.bme.mit.kv.safetylogic/res/data.json")
		val arr = JsonArray.readFrom(new BufferedReader(new InputStreamReader(url.openConnection().getInputStream())))
		
		val goal = new JsonArray
		
		arr.forEach[e1 |
			val obj = e1 as JsonObject
			
			val estimatedTrains = new JsonArray()
			(obj.get("trains") as JsonArray).forEach[e2 |
				val fromTrain = e2 as JsonObject
				val toTrain = new JsonObject
				
				val point = createPoint
				point.x = fromTrain.getDouble("x", 0.0)
				point.y = fromTrain.getDouble("y", 0.0)
				
				toTrain.add("id", fromTrain.getInt("id", 0))
				val closest = sl.estimator.getClosest(point);
				if (closest instanceof SwitchRegion) {
					toTrain.add("region", Integer.toHexString(Integer.parseInt(closest.id)))
				} else {
					toTrain.add("region", Integer.toHexString(RegionGroupMatcher.on(sl.queryEngine).getAllValuesOfg(closest).head.id))	
				}
				estimatedTrains.add(toTrain)
			]
			
			goal.add(estimatedTrains);
		]
		
		val out = new FileOutputStream("/Users/Baprof/Desktop/parsed.json")
		out.write(goal.toString.bytes);
		out.close
		
		return
	}
}