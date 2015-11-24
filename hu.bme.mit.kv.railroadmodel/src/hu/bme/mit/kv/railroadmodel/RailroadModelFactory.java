/**
 */
package hu.bme.mit.kv.railroadmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.kv.railroadmodel.RailroadModelPackage
 * @generated
 */
public interface RailroadModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RailroadModelFactory eINSTANCE = hu.bme.mit.kv.railroadmodel.impl.RailroadModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Rail Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rail Region</em>'.
	 * @generated
	 */
	RailRegion createRailRegion();

	/**
	 * Returns a new object of class '<em>Switch Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Switch Region</em>'.
	 * @generated
	 */
	SwitchRegion createSwitchRegion();

	/**
	 * Returns a new object of class '<em>Powerable Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Powerable Group</em>'.
	 * @generated
	 */
	PowerableGroup createPowerableGroup();

	/**
	 * Returns a new object of class '<em>Section Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Section Model</em>'.
	 * @generated
	 */
	SectionModel createSectionModel();

	/**
	 * Returns a new object of class '<em>Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Line</em>'.
	 * @generated
	 */
	Line createLine();

	/**
	 * Returns a new object of class '<em>Rectangle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rectangle</em>'.
	 * @generated
	 */
	Rectangle createRectangle();

	/**
	 * Returns a new object of class '<em>Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Point</em>'.
	 * @generated
	 */
	Point createPoint();

	/**
	 * Returns a new object of class '<em>Switch Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Switch Group</em>'.
	 * @generated
	 */
	SwitchGroup createSwitchGroup();

	/**
	 * Returns a new object of class '<em>Switch Setting</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Switch Setting</em>'.
	 * @generated
	 */
	SwitchSetting createSwitchSetting();

	/**
	 * Returns a new object of class '<em>Divergent Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Divergent Configuration</em>'.
	 * @generated
	 */
	DivergentConfiguration createDivergentConfiguration();

	/**
	 * Returns a new object of class '<em>Straight Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Straight Configuration</em>'.
	 * @generated
	 */
	StraightConfiguration createStraightConfiguration();

	/**
	 * Returns a new object of class '<em>Train</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Train</em>'.
	 * @generated
	 */
	Train createTrain();

	/**
	 * Returns a new object of class '<em>Train Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Train Model</em>'.
	 * @generated
	 */
	TrainModel createTrainModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RailroadModelPackage getRailroadModelPackage();

} //RailroadModelFactory
