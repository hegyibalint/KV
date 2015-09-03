package hu.bme.mit.kv.event

import java.lang.Runnable
import kvcontrol.requests.AbstractRequest
import kvcontrol.senders.TurnoutDirectionRequestSender
import hu.bme.mit.kv.model.railroadmodel.SectionModel
import hu.bme.mit.kv.model.modelutil.ModelUtil
import java.util.ArrayList

class TurnoutReader implements Runnable {

	var Object lock;
	var SectionModel sectionmodel;

	new(SectionModel model, Object l) {
		sectionmodel = model
		lock = l;
	}

	override run() {
		var turnoutIds = #[1, 2, 4, 3, 5, 6, 7]; // TODO add the turnouts list to the model 

		AbstractRequest.defaultPort = 8080
		val sender = new TurnoutDirectionRequestSender
		val turnoutStates = new ArrayList<Boolean>
		for (var int i = 0; i != 10; i++) {
			turnoutStates.add(true);
		}
		while (true) {
//			println("Polling the turnouts")
			synchronized (lock) {
				for (id : turnoutIds) {
					var isTrue = sender.isTurnoutStraight(id.toPhysicalID);
					if (isTrue != turnoutStates.get(id)) {

						println("Switch" + id + "changed") // TODO remove this println
						if(id == 7){
							var englishTurnout = ModelUtil.getEnglishTurnout(sectionmodel)
							var temp = englishTurnout.clockwise
							englishTurnout.clockwise = englishTurnout.notConnectedClockwiseSection
							englishTurnout.notConnectedClockwiseSection = temp
						}else{
							ModelUtil.switchTurnout(ModelUtil.getTurnoutByID(sectionmodel, id));
							
						}
						
						turnoutStates.set(id, isTrue);
					}
				}
			}
			Thread.sleep(500)
		}
	}

	def toPhysicalID(Integer integer) {
		switch integer {
			case 1: 0x81
			case 2: 0x82
			case 3: 0x83
			case 4: 0x86
			case 5: 0x84
			case 6: 0x85
			case 7: 0x87
		}

	}

}