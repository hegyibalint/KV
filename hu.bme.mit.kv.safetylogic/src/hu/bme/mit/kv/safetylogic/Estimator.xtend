package hu.bme.mit.kv.safetylogic

import hu.bme.mit.kv.railroadmodel.RailRegion
import hu.bme.mit.kv.railroadmodel.RailroadModelFactory
import hu.bme.mit.kv.railroadmodel.Region
import hu.bme.mit.kv.railroadmodel.SectionModel
import hu.bme.mit.kv.railroadmodel.SwitchRegion
import hu.bme.mit.kv.railroadmodel.Train
import hu.bme.mit.kv.railroadmodel.TrainModel

import static extension hu.bme.mit.kv.railroadmodel.util.RailroadModelHelper.*

class Estimator {
	static extension RailroadModelFactory = RailroadModelFactory.eINSTANCE
	
	var TrainModel tm
	var SectionModel sm
	
	new (SectionModel sm) {
		this.sm = sm 
	}
	
	def estimateTrainPositions() {
		tm.trains.forEach[train |
			train.previouslyOn = train.currentlyOn
			train.currentlyOn = getClosest(train)
		]
	}
	
	def Region getClosest(Train t) {
		val switches = sm.trackables.filter[it instanceof SwitchRegion];
		val sections = sm.trackables.filter[it instanceof RailRegion];
		
		for (Region tr : switches) {
			val sw = tr as SwitchRegion;
			if (sw.rectangle.isPointInside(t.position, 0.5)) {
				return sw;
			}
		}
		
		var double minDistance = Double.MAX_VALUE;
		var Region minSection = null
		
		for (Region tr : sections) {
			val sec = tr as RailRegion;
			val halfPoint = createPoint
			halfPoint.x = (sec.line.start.x + sec.line.end.x) / 2
			halfPoint.y = (sec.line.start.y + sec.line.end.y) / 2
			
			val dist = halfPoint.distanceFrom(t.position)
			if (dist < minDistance) {
				minDistance = dist
				minSection = sec
			}
		}
		
		return minSection
	}	
}