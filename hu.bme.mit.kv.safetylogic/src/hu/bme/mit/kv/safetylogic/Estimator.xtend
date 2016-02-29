package hu.bme.mit.kv.safetylogic

import hu.bme.mit.kv.railroadmodel.Point
import hu.bme.mit.kv.railroadmodel.RailRegion
import hu.bme.mit.kv.railroadmodel.RailroadModelFactory
import hu.bme.mit.kv.railroadmodel.Region
import hu.bme.mit.kv.railroadmodel.SectionModel
import hu.bme.mit.kv.railroadmodel.SwitchRegion
import hu.bme.mit.kv.railroadmodel.Train
import hu.bme.mit.kv.railroadmodel.TrainModel

import static extension hu.bme.mit.kv.railroadmodel.util.RailroadModelHelper.*
import hu.bme.mit.kv.railroadmodel.util.RailroadModelProvider

class Estimator {
	static extension RailroadModelFactory = RailroadModelFactory.eINSTANCE
	
	var RailroadModelProvider provider
	
	new (RailroadModelProvider provider) {
		this.provider = provider
	}
	
	def estimateTrainPositions() {
		provider.tm.trains.forEach[train |
			train.previouslyOn = train.currentlyOn
			train.currentlyOn = getClosest(train)
		]
	}
	
	def Region getClosest(Point p) {
		val switches = provider.sm.trackables.filter[it instanceof SwitchRegion];
		val sections = provider.sm.trackables.filter[it instanceof RailRegion];
		
		for (Region tr : switches) {
			val sw = tr as SwitchRegion;
			if (sw.rectangle.isPointInside(p, 0.5)) {
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
			
			val dist = halfPoint.distanceFrom(p)
			if (dist < minDistance) {
				minDistance = dist
				minSection = sec
			}
		}
		
		return minSection
	}	
	
	def Region getClosest(Train t) {
		val switches = provider.sm.trackables.filter[it instanceof SwitchRegion];
		val sections = provider.sm.trackables.filter[it instanceof RailRegion];
		
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