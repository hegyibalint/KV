package hu.bme.mit.kv.receiver

import hu.bme.mit.kv.json.JsonObject
import hu.bme.mit.kv.railroadmodel.RailRoadModel
import hu.bme.mit.kv.railroadmodel.RailroadModelFactory
import hu.bme.mit.kv.railroadmodel.Train
import java.net.DatagramPacket
import java.net.DatagramSocket
import hu.bme.mit.kv.railroadmodel.util.RailroadModelProvider

class Receiver {
	static extension RailroadModelFactory = RailroadModelFactory.eINSTANCE
	
	var RailroadModelProvider provider
	val buffer = newByteArrayOfSize(1024)
	val socket = new DatagramSocket(24000)
	
	new (RailroadModelProvider provider) {
		this.provider = provider
	}
	
	private def receiveMessage() {
		for (var i = 0; i < buffer.size; i++) {
			buffer.set(i, 0 as byte);
		}
		
		val packet = new DatagramPacket(buffer, buffer.length)
		socket.receive(packet);
		
		val message = new String(buffer).trim
		return message
	}
	
	def startReceiving() {
		while (true) {
			val message = receiveMessage()
			postTrainPositions(message)
		}
	}
	
	def postTrainPositions(String message) {
		val obj = JsonObject.readFrom(message)
		val arr = obj.get("trains").asArray
		
		arr.forEach[trainVal |
			val trainObj = trainVal.asObject
			
			val filtered = provider.tm.trains.filter[train | train.id == trainObj.get("id").asInt]
			var Train train
			if (filtered.empty) {
				train = createTrain
				train.id = trainObj.get("id").asInt
				provider.tm.trains += train
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