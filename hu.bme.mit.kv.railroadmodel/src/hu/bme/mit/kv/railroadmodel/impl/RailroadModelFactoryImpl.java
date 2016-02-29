/**
 */
package hu.bme.mit.kv.railroadmodel.impl;

import hu.bme.mit.kv.railroadmodel.*;

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
public class RailroadModelFactoryImpl extends EFactoryImpl implements RailroadModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RailroadModelFactory init() {
		try {
			RailroadModelFactory theRailroadModelFactory = (RailroadModelFactory)EPackage.Registry.INSTANCE.getEFactory(RailroadModelPackage.eNS_URI);
			if (theRailroadModelFactory != null) {
				return theRailroadModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RailroadModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailroadModelFactoryImpl() {
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
			case RailroadModelPackage.RAIL_REGION: return createRailRegion();
			case RailroadModelPackage.SWITCH_REGION: return createSwitchRegion();
			case RailroadModelPackage.POWERABLE_GROUP: return createPowerableGroup();
			case RailroadModelPackage.SECTION_MODEL: return createSectionModel();
			case RailroadModelPackage.LINE: return createLine();
			case RailroadModelPackage.RECTANGLE: return createRectangle();
			case RailroadModelPackage.POINT: return createPoint();
			case RailroadModelPackage.SWITCH_GROUP: return createSwitchGroup();
			case RailroadModelPackage.SWITCH_SETTING: return createSwitchSetting();
			case RailroadModelPackage.DIVERGENT_CONFIGURATION: return createDivergentConfiguration();
			case RailroadModelPackage.STRAIGHT_CONFIGURATION: return createStraightConfiguration();
			case RailroadModelPackage.TRAIN: return createTrain();
			case RailroadModelPackage.TRAIN_MODEL: return createTrainModel();
			case RailroadModelPackage.RAIL_ROAD_MODEL: return createRailRoadModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailRegion createRailRegion() {
		RailRegionImpl railRegion = new RailRegionImpl();
		return railRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchRegion createSwitchRegion() {
		SwitchRegionImpl switchRegion = new SwitchRegionImpl();
		return switchRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerableGroup createPowerableGroup() {
		PowerableGroupImpl powerableGroup = new PowerableGroupImpl();
		return powerableGroup;
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
	public Line createLine() {
		LineImpl line = new LineImpl();
		return line;
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
	public Point createPoint() {
		PointImpl point = new PointImpl();
		return point;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchGroup createSwitchGroup() {
		SwitchGroupImpl switchGroup = new SwitchGroupImpl();
		return switchGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchSetting createSwitchSetting() {
		SwitchSettingImpl switchSetting = new SwitchSettingImpl();
		return switchSetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DivergentConfiguration createDivergentConfiguration() {
		DivergentConfigurationImpl divergentConfiguration = new DivergentConfigurationImpl();
		return divergentConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StraightConfiguration createStraightConfiguration() {
		StraightConfigurationImpl straightConfiguration = new StraightConfigurationImpl();
		return straightConfiguration;
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
	public TrainModel createTrainModel() {
		TrainModelImpl trainModel = new TrainModelImpl();
		return trainModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailRoadModel createRailRoadModel() {
		RailRoadModelImpl railRoadModel = new RailRoadModelImpl();
		return railRoadModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailroadModelPackage getRailroadModelPackage() {
		return (RailroadModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RailroadModelPackage getPackage() {
		return RailroadModelPackage.eINSTANCE;
	}

} //RailroadModelFactoryImpl
