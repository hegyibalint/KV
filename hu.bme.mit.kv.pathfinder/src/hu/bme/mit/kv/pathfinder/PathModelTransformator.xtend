package hu.bme.mit.kv.pathfinder

import hu.bme.mit.kv.pathfinder.query.GroupNeighbourMatcher
import hu.bme.mit.kv.pathfinder.query.RailsMatcher
import hu.bme.mit.kv.pathfinder.query.SwitchesMatcher
import hu.bme.mit.kv.pathfindermodel.PathFinderModel
import hu.bme.mit.kv.pathfindermodel.PathfindermodelFactory
import hu.bme.mit.kv.railroadmodel.util.RailroadModelProvider
import org.eclipse.incquery.runtime.api.IPatternMatch
import org.eclipse.incquery.runtime.api.IncQueryEngine
import org.eclipse.incquery.runtime.api.IncQueryMatcher
import org.eclipse.incquery.runtime.emf.EMFScope
import org.eclipse.viatra.emf.runtime.rules.batch.BatchTransformationRule
import org.eclipse.viatra.emf.runtime.rules.batch.BatchTransformationRuleFactory
import org.eclipse.viatra.emf.runtime.rules.batch.BatchTransformationStatements
import org.eclipse.viatra.emf.runtime.transformation.batch.BatchTransformation

class PathModelTransformator {
	extension PathfindermodelFactory modelFactory = PathfindermodelFactory.eINSTANCE
	extension BatchTransformationRuleFactory ruleFactory = new BatchTransformationRuleFactory
	extension BatchTransformation transformation
	extension BatchTransformationStatements statements

	BatchTransformationRule<? extends IPatternMatch, ? extends IncQueryMatcher<?>> railRule
	BatchTransformationRule<? extends IPatternMatch, ? extends IncQueryMatcher<?>> switchRule
	BatchTransformationRule<? extends IPatternMatch, ? extends IncQueryMatcher<?>> neighbourRule

	var PathFinderModel pfm
	var IncQueryEngine engine
	var IncQueryEngine pfengine

	def PathFinderModel transform(RailroadModelProvider provider) {
		pfm = createPathFinderModel
		
		engine = IncQueryEngine.on(new EMFScope(provider.rrm))
		transformation = BatchTransformation::forEngine(engine)
		statements = new BatchTransformationStatements(transformation)
		
		getRailRule.fireAllCurrent
		getSwitchRule.fireAllCurrent
		
		pfengine = IncQueryEngine.on(new EMFScope(pfm))
		getNeighbourRule.fireAllCurrent
		
		return pfm
	}

	def getRailRule() {
		if (railRule == null) {
			railRule = createRule(RailsMatcher.querySpecification) [
				val rail = createRail
				rail.id = it.g.id
				pfm.sections += rail
			]
		}
		return railRule
	}
	
	def getSwitchRule() {
		if (switchRule == null) {
			switchRule = createRule(SwitchesMatcher.querySpecification)[
				var _switch = createSwitch
				_switch.id = it.g.id
				pfm.sections += _switch
			]
		}	
		return switchRule
	}
	
	def getNeighbourRule() {
		if (neighbourRule == null) {
			neighbourRule = createRule(GroupNeighbourMatcher.querySpecification)[
				val s1 = pfm.sections.filter[s | s.id == it.g1.id].head
				val s2 = pfm.sections.filter[s | s.id == it.g2.id].head
				
				//val s1 = SectionByIDMatcher.on(pfengine).getAllValuesOfs(it.g1.id).head
				//val s2 = SectionByIDMatcher.on(pfengine).getAllValuesOfs(it.g2.id).head
				
				s1.neighbours += s2
				s2.neighbours += s1
			]
		}
		return neighbourRule
	}
}