package hu.bme.mit.kv.model.modelutil

import hu.bme.mit.kv.model.railroadmodel.ModelFactory
import hu.bme.mit.kv.model.railroadmodel.RailRoadModel
import hu.bme.mit.kv.model.railroadmodel.Turnout

class ModelUtil {
	static extension ModelFactory factory = ModelFactory.eINSTANCE

	def static createReadyModel() {
		var root = createRailRoadModel
		for (var i = 1; i != 8; i++) {
			var turnout = createTurnout
			turnout.id = i
			root.sections.add(turnout)
		}

		for (var i = 8; i != 24; i++) {
			if (i != 0x12 && i != 0xF && i != 0x11) {
				var section = createSection
				section.id = i
				root.sections.add(section)
			}
		}
		
		var turnerF = createTurn
		turnerF.id = 0xF
		var turner11 = createTurn
		turner11.id = 0x11
		root.sections.add(turnerF)
		root.sections.add(turner11)
		
		
		// English turnout
		var turnout4 = getTurnoutByID(root, 0x4)
		var turnout7 = getTurnoutByID(root, 0x7)
		var section15 = getSectionByID(root, 0x15)
		var section10 = getSectionByID(root, 0x10)
		var sectionE = getSectionByID(root, 0xE)
		var section16 = getSectionByID(root, 0x16)

		turnout4.clockwise = turnout7
		turnout7.counterClockwise = turnout4
		turnout4.counterClockwise = section15
		turnout4.notConnectedSection = section10
		turnout7.clockwise = sectionE
		turnout7.notConnectedSection = section16

		section15.clockwise = turnout4
		section10.clockwise = turnout4
		sectionE.counterClockwise = turnout7
		section16.counterClockwise = turnout7

		// Standard turnouts
		connectSectionToTurnout(root, 0x1, 0xE, 0xD, 0x9, true)
		connectSectionToTurnout(root, 0x2, 0xC, 0x16, 0xF, false)
		connectSectionToTurnout(root, 0x3, 0x8, 0x17, 0xB, true)
		connectSectionToTurnout(root, 0x5, 0x10, 0x11, 0xA, false)
		connectSectionToTurnout(root, 0x6, 0x15, 0x13, 0x14, false)

		// Other sections
		connectSectionToSection(root, 0xC, 0xA)
		connectSectionToSection(root, 0xD, 0x8)
		connectSectionToSection(root, 0x17, 0x14)
		connectSectionToSection(root, 0xB, 0x13)

		//Turner part
		var sec11 = getSectionByID(root,0x11)
		var secF = getSectionByID(root,0xF)
		
		sec11.counterClockwise = secF
		secF.counterClockwise = sec11

		// Check for model consistency
		root.sections.filter[sec|sec.clockwise == null].forEach[sec|println("Clockwise is missing: " + sec.id.toHexa)]
		root.sections.filter[sec|sec.counterClockwise == null].forEach [ sec |	println("Counterclockwise is missing: " + sec.id.toHexa)]

		println(root.toGraphViz)

		root
	}
	
	def static String toGraphViz(RailRoadModel root){
		'''
		digraph{
			«FOR sec : root.sections»
			«sec.id.toHexa» -> «sec.clockwise?.id.toHexa»[label="clockwise"];
			«sec.id.toHexa» -> «sec.counterClockwise?.id.toHexa»[label="counterClockwise"];
			«IF sec instanceof Turnout»
				«IF sec.isTwoSectionsInClockwiseDirection»
					«sec.id.toHexa» -> «sec.notConnectedSection.id.toHexa»[label="currentlyNotConnectedClockwise"]
				«ELSE»
					«sec.id.toHexa» -> «sec.notConnectedSection.id.toHexa»[label="currentlyNotConnectedCounterclockwise"]
				«ENDIF»
			«ENDIF»
			«ENDFOR»
		}
		'''
	}

	def static String toHexa(int a) {
		String.format("%X", a)
	}

	def static connectSectionToTurnout(RailRoadModel model, int turnoutID, int onlySection, int oneOfTwoSections,
		int secondOfTwoSections, boolean twoSectionsInClockwiseDirection) {
		var turnout = getTurnoutByID(model, turnoutID)
		var onlyConnection = getSectionByID(model, onlySection)
		var first = getSectionByID(model, oneOfTwoSections);
		var second = getSectionByID(model, secondOfTwoSections)

		turnout.twoSectionsInClockwiseDirection = twoSectionsInClockwiseDirection

		if (twoSectionsInClockwiseDirection) {
			turnout.counterClockwise = onlyConnection
			onlyConnection.clockwise = turnout
			turnout.clockwise = first
			first.counterClockwise = turnout
			turnout.notConnectedSection = second
			second.counterClockwise = turnout
		} else {
			turnout.clockwise = onlyConnection
			onlyConnection.counterClockwise = turnout
			turnout.counterClockwise = first
			first.clockwise = turnout
			turnout.notConnectedSection = second
			second.clockwise = turnout
		}

	}

	def static getSectionByID(RailRoadModel model, int id) {
		model.sections.filter[sec|sec.id == id].head
	}

	def static getTurnoutByID(RailRoadModel model, int id) {
		model.sections.filter[sec|sec.id == id].head as Turnout
	}

	def static connectSectionToSection(RailRoadModel model, int clockwise, int counterClockwise) {
		var a = getSectionByID(model, clockwise)
		var b = getSectionByID(model, counterClockwise)
		a.clockwise = b
		b.counterClockwise = a
	}

	def static switchTurnout(Turnout t) {
		if (t.twoSectionsInClockwiseDirection) {
			var cw = t.clockwise
			t.clockwise = t.notConnectedSection
			t.notConnectedSection = cw
		} else {
			var ccw = t.counterClockwise
			t.counterClockwise = t.notConnectedSection
			t.notConnectedSection = ccw
		}
	}

}