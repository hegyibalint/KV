/**
 */
package hu.bme.mit.kv.pathfindermodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.kv.pathfindermodel.PathfindermodelPackage
 * @generated
 */
public interface PathfindermodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PathfindermodelFactory eINSTANCE = hu.bme.mit.kv.pathfindermodel.impl.PathfindermodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Path Finder Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Path Finder Model</em>'.
	 * @generated
	 */
	PathFinderModel createPathFinderModel();

	/**
	 * Returns a new object of class '<em>Rail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rail</em>'.
	 * @generated
	 */
	Rail createRail();

	/**
	 * Returns a new object of class '<em>Switch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Switch</em>'.
	 * @generated
	 */
	Switch createSwitch();

	/**
	 * Returns a new object of class '<em>Train</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Train</em>'.
	 * @generated
	 */
	Train createTrain();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PathfindermodelPackage getPathfindermodelPackage();

} //PathfindermodelFactory
