package hu.bme.mit.kv.safetylogic

import hu.bme.mit.kv.json.JsonObject
import hu.bme.mit.kv.railroadmodel.RailroadModelFactory
import hu.bme.mit.kv.railroadmodel.Train
import hu.bme.mit.kv.railroadmodel.TrainModel
import java.net.DatagramPacket
import java.net.DatagramSocket

class JSONReceiver {
	static extension RailroadModelFactory = RailroadModelFactory.eINSTANCE
	
	val TrainModel tm
	val buffer = newByteArrayOfSize(1024)
	val socket = new DatagramSocket(24000)
	
	new (TrainModel tm) {
		this.tm = tm
	}
	
	def receiveMessage() {
		for (var i = 0; i < buffer.size; i++) {
			buffer.set(i, 0 as byte);
		}
		
		val packet = new DatagramPacket(buffer, buffer.length)
		socket.receive(packet);
		
		val message = new String(buffer).trim
		return message
	}
	
	def postTrainPositions() {
		val obj = JsonObject.readFrom(receiveMessage())
		val arr = obj.get("trains").asArray
		
		arr.forEach[trainVal |
			val trainObj = trainVal.asObject
			
			val filtered = tm.trains.filter[train | train.id == trainObj.get("id").asInt]
			var Train train
			if (filtered.empty) {
				train = createTrain
				train.id = trainObj.get("id").asInt
				tm.trains += train
			} else {
				train = filtered.head
			}
			
			val position = createPoint
			position.x = trainVal.asObject.get("x").asDouble
			position.y = trainVal.asObject.get("y").asDouble
			train.position = position
			
			println('''Train: «train.id», Position:«position»''')
		]
	}
}