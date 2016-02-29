/**
 */
package hu.bme.mit.kv.railroadmodel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import hu.bme.mit.kv.railroadmodel.Configuration;
import hu.bme.mit.kv.railroadmodel.DivergentConfiguration;
import hu.bme.mit.kv.railroadmodel.Group;
import hu.bme.mit.kv.railroadmodel.Line;
import hu.bme.mit.kv.railroadmodel.Point;
import hu.bme.mit.kv.railroadmodel.PowerableGroup;
import hu.bme.mit.kv.railroadmodel.RailRegion;
import hu.bme.mit.kv.railroadmodel.RailRoadModel;
import hu.bme.mit.kv.railroadmodel.RailroadModelPackage;
import hu.bme.mit.kv.railroadmodel.Rectangle;
import hu.bme.mit.kv.railroadmodel.Region;
import hu.bme.mit.kv.railroadmodel.SectionModel;
import hu.bme.mit.kv.railroadmodel.StraightConfiguration;
import hu.bme.mit.kv.railroadmodel.SwitchGroup;
import hu.bme.mit.kv.railroadmodel.SwitchRegion;
import hu.bme.mit.kv.railroadmodel.SwitchSetting;
import hu.bme.mit.kv.railroadmodel.Train;
import hu.bme.mit.kv.railroadmodel.TrainModel;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.kv.railroadmodel.RailroadModelPackage
 * @generated
 */
public class RailroadModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RailroadModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailroadModelSwitch() {
		if (modelPackage == null) {
			modelPackage = RailroadModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case RailroadModelPackage.REGION: {
				Region region = (Region)theEObject;
				T result = caseRegion(region);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RailroadModelPackage.RAIL_REGION: {
				RailRegion railRegion = (RailRegion)theEObject;
				T result = caseRailRegion(railRegion);
				if (result == null) result = caseRegion(railRegion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RailroadModelPackage.SWITCH_REGION: {
				SwitchRegion switchRegion = (SwitchRegion)theEObject;
				T result = caseSwitchRegion(switchRegion);
				if (result == null) result = caseRegion(switchRegion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RailroadModelPackage.POWERABLE_GROUP: {
				PowerableGroup powerableGroup = (PowerableGroup)theEObject;
				T result = casePowerableGroup(powerableGroup);
				if (result == null) result = caseGroup(powerableGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RailroadModelPackage.SECTION_MODEL: {
				SectionModel sectionModel = (SectionModel)theEObject;
				T result = caseSectionModel(sectionModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RailroadModelPackage.LINE: {
				Line line = (Line)theEObject;
				T result = caseLine(line);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RailroadModelPackage.RECTANGLE: {
				Rectangle rectangle = (Rectangle)theEObject;
				T result = caseRectangle(rectangle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RailroadModelPackage.POINT: {
				Point point = (Point)theEObject;
				T result = casePoint(point);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RailroadModelPackage.GROUP: {
				Group group = (Group)theEObject;
				T result = caseGroup(group);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RailroadModelPackage.SWITCH_GROUP: {
				SwitchGroup switchGroup = (SwitchGroup)theEObject;
				T result = caseSwitchGroup(switchGroup);
				if (result == null) result = caseGroup(switchGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RailroadModelPackage.SWITCH_SETTING: {
				SwitchSetting switchSetting = (SwitchSetting)theEObject;
				T result = caseSwitchSetting(switchSetting);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RailroadModelPackage.DIVERGENT_CONFIGURATION: {
				DivergentConfiguration divergentConfiguration = (DivergentConfiguration)theEObject;
				T result = caseDivergentConfiguration(divergentConfiguration);
				if (result == null) result = caseConfiguration(divergentConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RailroadModelPackage.STRAIGHT_CONFIGURATION: {
				StraightConfiguration straightConfiguration = (StraightConfiguration)theEObject;
				T result = caseStraightConfiguration(straightConfiguration);
				if (result == null) result = caseConfiguration(straightConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RailroadModelPackage.CONFIGURATION: {
				Configuration configuration = (Configuration)theEObject;
				T result = caseConfiguration(configuration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RailroadModelPackage.TRAIN: {
				Train train = (Train)theEObject;
				T result = caseTrain(train);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RailroadModelPackage.TRAIN_MODEL: {
				TrainModel trainModel = (TrainModel)theEObject;
				T result = caseTrainModel(trainModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RailroadModelPackage.RAIL_ROAD_MODEL: {
				RailRoadModel railRoadModel = (RailRoadModel)theEObject;
				T result = caseRailRoadModel(railRoadModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Region</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Region</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegion(Region object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rail Region</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rail Region</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRailRegion(RailRegion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch Region</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch Region</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitchRegion(SwitchRegion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Powerable Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Powerable Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerableGroup(PowerableGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSectionModel(SectionModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLine(Line object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rectangle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rectangle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRectangle(Rectangle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePoint(Point object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroup(Group object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitchGroup(SwitchGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch Setting</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch Setting</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitchSetting(SwitchSetting object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Divergent Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Divergent Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDivergentConfiguration(DivergentConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Straight Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Straight Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStraightConfiguration(StraightConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfiguration(Configuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Train</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Train</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrain(Train object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Train Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Train Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrainModel(TrainModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rail Road Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rail Road Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRailRoadModel(RailRoadModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RailroadModelSwitch
