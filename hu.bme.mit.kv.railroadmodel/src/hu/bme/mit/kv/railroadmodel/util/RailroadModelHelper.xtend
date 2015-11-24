package hu.bme.mit.kv.railroadmodel.util

import hu.bme.mit.kv.railroadmodel.Point
import hu.bme.mit.kv.railroadmodel.Rectangle
import hu.bme.mit.kv.railroadmodel.RailroadModelFactory

class RailroadModelHelper {	
	
	static extension RailroadModelFactory = RailroadModelFactory.eINSTANCE
	
	static def double distanceFrom(Point p1, Point p2) {
		return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2))
	}
	
	static def boolean isProximity(Point p1, Point p2, double error) {
		val dist = p1.distanceFrom(p2);
		return if (dist < error) true else false
	}
	
	private static def Point operator_minus(Point p1, Point p2) {
		val res = createPoint
		res.x = p2.x - p1.x
		res.y = p2.y - p1.y
		return res
	} 
	
	private static def double cross(Point p1, Point p2) {
		return p1.x * p2.y - p1.y * p2.x;
	}
	
	private static def double side(Point p1, Point p2, Point p, double error) {
		val z = cross((p2-p1), (p-p1));	
		if (Math.abs(z) < error)
			return 0
		else
			return z
	}
	
	static def boolean isPointInside(Rectangle r, Point p, double error) {
		//println(r.corners.get(0))
		//println(r.corners.get(1))
		//println(r.corners.get(2))
		//println(r.corners.get(3))
		//println(p)
		
		val side1 = side(r.corners.get(0), r.corners.get(1), p, error)
		val side2 = side(r.corners.get(1), r.corners.get(2), p, error)
		val side3 = side(r.corners.get(2), r.corners.get(3), p, error)
		val side4 = side(r.corners.get(3), r.corners.get(0), p, error)
		if (side1 <= 0 && side2 <= 0 && side3 <= 0 && side4 <= 0 || side1 >= 0 && side2 >= 0 && side3 >= 0 && side4 >= 0)
			return true
		return false
	}
}