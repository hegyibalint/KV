/**
 */
package hu.bme.mit.kv.model.railroadmodel.impl;

import hu.bme.mit.kv.model.railroadmodel.*;

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
public class ModelFactoryImpl extends EFactoryImpl implements ModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelFactory init() {
		try {
			ModelFactory theModelFactory = (ModelFactory)EPackage.Registry.INSTANCE.getEFactory(ModelPackage.eNS_URI);
			if (theModelFactory != null) {
				return theModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryImpl() {
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
			case ModelPackage.TRAIN_MODEL: return createTrainModel();
			case ModelPackage.TRAIN: return createTrain();
			case ModelPackage.POINT: return createPoint();
			case ModelPackage.SECTION_MODEL: return createSectionModel();
			case ModelPackage.RECTANGLE: return createRectangle();
			case ModelPackage.RAIL: return createRail();
			case ModelPackage.TURNOUT: return createTurnout();
			case ModelPackage.DIMENSION: return createDimension();
			case ModelPackage.RAIL_END_POINT: return createRailEndPoint();
			case ModelPackage.RAIL_POINT: return createRailPoint();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainModel createTrainModel() {
		TrainModelImpl trainModel = new TrainModelImpl();
		return trainModel;
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
	public Point createPoint() {
		PointImpl point = new PointImpl();
		return point;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SectionModel createSectionModel() {
		SectionModelImpl sectionModel = new SectionModelImpl();
		return sectionModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rectangle createRectangle() {
		RectangleImpl rectangle = new RectangleImpl();
		return rectangle;
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
	public Turnout createTurnout() {
		TurnoutImpl turnout = new TurnoutImpl();
		return turnout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dimension createDimension() {
		DimensionImpl dimension = new DimensionImpl();
		return dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailEndPoint createRailEndPoint() {
		RailEndPointImpl railEndPoint = new RailEndPointImpl();
		return railEndPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailPoint createRailPoint() {
		RailPointImpl railPoint = new RailPointImpl();
		return railPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelPackage getModelPackage() {
		return (ModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModelPackage getPackage() {
		return ModelPackage.eINSTANCE;
	}

} //ModelFactoryImpl
