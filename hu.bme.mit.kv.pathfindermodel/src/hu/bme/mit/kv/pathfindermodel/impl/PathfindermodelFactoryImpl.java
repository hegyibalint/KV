/**
 */
package hu.bme.mit.kv.pathfindermodel.impl;

import hu.bme.mit.kv.pathfindermodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PathfindermodelFactoryImpl extends EFactoryImpl implements PathfindermodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PathfindermodelFactory init() {
		try {
			PathfindermodelFactory thePathfindermodelFactory = (PathfindermodelFactory)EPackage.Registry.INSTANCE.getEFactory(PathfindermodelPackage.eNS_URI);
			if (thePathfindermodelFactory != null) {
				return thePathfindermodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PathfindermodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathfindermodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PathfindermodelPackage.PATH_FINDER_MODEL: return createPathFinderModel();
			case PathfindermodelPackage.RAIL: return createRail();
			case PathfindermodelPackage.SWITCH: return createSwitch();
			case PathfindermodelPackage.TRAIN: return createTrain();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathFinderModel createPathFinderModel() {
		PathFinderModelImpl pathFinderModel = new PathFinderModelImpl();
		return pathFinderModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rail createRail() {
		RailImpl rail = new RailImpl();
		return rail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Switch createSwitch() {
		SwitchImpl switch_ = new SwitchImpl();
		return switch_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Train createTrain() {
		TrainImpl train = new TrainImpl();
		return train;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathfindermodelPackage getPathfindermodelPackage() {
		return (PathfindermodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PathfindermodelPackage getPackage() {
		return PathfindermodelPackage.eINSTANCE;
	}

} //PathfindermodelFactoryImpl
