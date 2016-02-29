/**
 */
package hu.bme.mit.kv.railroadmodel.impl;

import hu.bme.mit.kv.railroadmodel.Configuration;
import hu.bme.mit.kv.railroadmodel.DivergentConfiguration;
import hu.bme.mit.kv.railroadmodel.Group;
import hu.bme.mit.kv.railroadmodel.Line;
import hu.bme.mit.kv.railroadmodel.Point;
import hu.bme.mit.kv.railroadmodel.PowerableGroup;
import hu.bme.mit.kv.railroadmodel.RailRegion;
import hu.bme.mit.kv.railroadmodel.RailRoadModel;
import hu.bme.mit.kv.railroadmodel.RailroadModelFactory;
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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RailroadModelPackageImpl extends EPackageImpl implements RailroadModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass railRegionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchRegionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerableGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sectionModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rectangleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchSettingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass divergentConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass straightConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trainModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass railRoadModelEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see hu.bme.mit.kv.railroadmodel.RailroadModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RailroadModelPackageImpl() {
		super(eNS_URI, RailroadModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RailroadModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RailroadModelPackage init() {
		if (isInited) return (RailroadModelPackage)EPackage.Registry.INSTANCE.getEPackage(RailroadModelPackage.eNS_URI);

		// Obtain or create and register package
		RailroadModelPackageImpl theRailroadModelPackage = (RailroadModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RailroadModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RailroadModelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theRailroadModelPackage.createPackageContents();

		// Initialize created meta-data
		theRailroadModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRailroadModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RailroadModelPackage.eNS_URI, theRailroadModelPackage);
		return theRailroadModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegion() {
		return regionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegion_Neighbours() {
		return (EReference)regionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegion_Id() {
		return (EAttribute)regionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRailRegion() {
		return railRegionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRailRegion_Line() {
		return (EReference)railRegionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwitchRegion() {
		return switchRegionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchRegion_Rectangle() {
		return (EReference)switchRegionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPowerableGroup() {
		return powerableGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPowerableGroup_Powered() {
		return (EAttribute)powerableGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSectionModel() {
		return sectionModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionModel_Groups() {
		return (EReference)sectionModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionModel_Trackables() {
		return (EReference)sectionModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionModel_Settings() {
		return (EReference)sectionModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLine() {
		return lineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLine_Start() {
		return (EReference)lineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLine_End() {
		return (EReference)lineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRectangle() {
		return rectangleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectangle_Corners() {
		return (EReference)rectangleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPoint() {
		return pointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoint_X() {
		return (EAttribute)pointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoint_Y() {
		return (EAttribute)pointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroup() {
		return groupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroup_Id() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_Regions() {
		return (EReference)groupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroup_Safe() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwitchGroup() {
		return switchGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchGroup_Configuration() {
		return (EReference)switchGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwitchSetting() {
		return switchSettingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchSetting_Straightconfiguration() {
		return (EReference)switchSettingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchSetting_Divergentconfiguration() {
		return (EReference)switchSettingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitchSetting_PhysicalID() {
		return (EAttribute)switchSettingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDivergentConfiguration() {
		return divergentConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStraightConfiguration() {
		return straightConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfiguration() {
		return configurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_Enabled() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrain() {
		return trainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrain_PreviouslyOn() {
		return (EReference)trainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrain_CurrentlyOn() {
		return (EReference)trainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrain_Id() {
		return (EAttribute)trainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrain_Position() {
		return (EReference)trainEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrain_NextGroup() {
		return (EReference)trainEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrainModel() {
		return trainModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainModel_Trains() {
		return (EReference)trainModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRailRoadModel() {
		return railRoadModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRailRoadModel_SectionModel() {
		return (EReference)railRoadModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRailRoadModel_TrainModel() {
		return (EReference)railRoadModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailroadModelFactory getRailroadModelFactory() {
		return (RailroadModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		regionEClass = createEClass(REGION);
		createEReference(regionEClass, REGION__NEIGHBOURS);
		createEAttribute(regionEClass, REGION__ID);

		railRegionEClass = createEClass(RAIL_REGION);
		createEReference(railRegionEClass, RAIL_REGION__LINE);

		switchRegionEClass = createEClass(SWITCH_REGION);
		createEReference(switchRegionEClass, SWITCH_REGION__RECTANGLE);

		powerableGroupEClass = createEClass(POWERABLE_GROUP);
		createEAttribute(powerableGroupEClass, POWERABLE_GROUP__POWERED);

		sectionModelEClass = createEClass(SECTION_MODEL);
		createEReference(sectionModelEClass, SECTION_MODEL__GROUPS);
		createEReference(sectionModelEClass, SECTION_MODEL__TRACKABLES);
		createEReference(sectionModelEClass, SECTION_MODEL__SETTINGS);

		lineEClass = createEClass(LINE);
		createEReference(lineEClass, LINE__START);
		createEReference(lineEClass, LINE__END);

		rectangleEClass = createEClass(RECTANGLE);
		createEReference(rectangleEClass, RECTANGLE__CORNERS);

		pointEClass = createEClass(POINT);
		createEAttribute(pointEClass, POINT__X);
		createEAttribute(pointEClass, POINT__Y);

		groupEClass = createEClass(GROUP);
		createEAttribute(groupEClass, GROUP__ID);
		createEReference(groupEClass, GROUP__REGIONS);
		createEAttribute(groupEClass, GROUP__SAFE);

		switchGroupEClass = createEClass(SWITCH_GROUP);
		createEReference(switchGroupEClass, SWITCH_GROUP__CONFIGURATION);

		switchSettingEClass = createEClass(SWITCH_SETTING);
		createEReference(switchSettingEClass, SWITCH_SETTING__STRAIGHTCONFIGURATION);
		createEReference(switchSettingEClass, SWITCH_SETTING__DIVERGENTCONFIGURATION);
		createEAttribute(switchSettingEClass, SWITCH_SETTING__PHYSICAL_ID);

		divergentConfigurationEClass = createEClass(DIVERGENT_CONFIGURATION);

		straightConfigurationEClass = createEClass(STRAIGHT_CONFIGURATION);

		configurationEClass = createEClass(CONFIGURATION);
		createEReference(configurationEClass, CONFIGURATION__ENABLED);

		trainEClass = createEClass(TRAIN);
		createEReference(trainEClass, TRAIN__PREVIOUSLY_ON);
		createEReference(trainEClass, TRAIN__CURRENTLY_ON);
		createEAttribute(trainEClass, TRAIN__ID);
		createEReference(trainEClass, TRAIN__POSITION);
		createEReference(trainEClass, TRAIN__NEXT_GROUP);

		trainModelEClass = createEClass(TRAIN_MODEL);
		createEReference(trainModelEClass, TRAIN_MODEL__TRAINS);

		railRoadModelEClass = createEClass(RAIL_ROAD_MODEL);
		createEReference(railRoadModelEClass, RAIL_ROAD_MODEL__SECTION_MODEL);
		createEReference(railRoadModelEClass, RAIL_ROAD_MODEL__TRAIN_MODEL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		railRegionEClass.getESuperTypes().add(this.getRegion());
		switchRegionEClass.getESuperTypes().add(this.getRegion());
		powerableGroupEClass.getESuperTypes().add(this.getGroup());
		switchGroupEClass.getESuperTypes().add(this.getGroup());
		divergentConfigurationEClass.getESuperTypes().add(this.getConfiguration());
		straightConfigurationEClass.getESuperTypes().add(this.getConfiguration());

		// Initialize classes, features, and operations; add parameters
		initEClass(regionEClass, Region.class, "Region", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegion_Neighbours(), this.getRegion(), null, "neighbours", null, 0, 2, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegion_Id(), ecorePackage.getEString(), "id", "", 1, 1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(railRegionEClass, RailRegion.class, "RailRegion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRailRegion_Line(), this.getLine(), null, "line", null, 1, 1, RailRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(switchRegionEClass, SwitchRegion.class, "SwitchRegion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSwitchRegion_Rectangle(), this.getRectangle(), null, "rectangle", null, 1, 1, SwitchRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(powerableGroupEClass, PowerableGroup.class, "PowerableGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPowerableGroup_Powered(), ecorePackage.getEBoolean(), "powered", "true", 1, 1, PowerableGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sectionModelEClass, SectionModel.class, "SectionModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSectionModel_Groups(), this.getGroup(), null, "groups", null, 0, -1, SectionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSectionModel_Trackables(), this.getRegion(), null, "trackables", null, 0, -1, SectionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSectionModel_Settings(), this.getSwitchSetting(), null, "settings", null, 0, -1, SectionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lineEClass, Line.class, "Line", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLine_Start(), this.getPoint(), null, "start", null, 1, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLine_End(), this.getPoint(), null, "end", null, 1, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rectangleEClass, Rectangle.class, "Rectangle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRectangle_Corners(), this.getPoint(), null, "corners", null, 4, 4, Rectangle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pointEClass, Point.class, "Point", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPoint_X(), ecorePackage.getEDouble(), "x", "0.0", 1, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoint_Y(), ecorePackage.getEDouble(), "y", "0.0", 1, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupEClass, Group.class, "Group", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGroup_Id(), ecorePackage.getEInt(), "id", "0", 1, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroup_Regions(), this.getRegion(), null, "regions", null, 1, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_Safe(), ecorePackage.getEBoolean(), "safe", "false", 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(switchGroupEClass, SwitchGroup.class, "SwitchGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSwitchGroup_Configuration(), this.getConfiguration(), null, "configuration", null, 1, 1, SwitchGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(switchSettingEClass, SwitchSetting.class, "SwitchSetting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSwitchSetting_Straightconfiguration(), this.getStraightConfiguration(), null, "straightconfiguration", null, 1, 1, SwitchSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwitchSetting_Divergentconfiguration(), this.getDivergentConfiguration(), null, "divergentconfiguration", null, 1, 1, SwitchSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSwitchSetting_PhysicalID(), ecorePackage.getEInt(), "physicalID", "0", 0, 1, SwitchSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(divergentConfigurationEClass, DivergentConfiguration.class, "DivergentConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(straightConfigurationEClass, StraightConfiguration.class, "StraightConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(configurationEClass, Configuration.class, "Configuration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfiguration_Enabled(), this.getPowerableGroup(), null, "enabled", null, 2, 2, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trainEClass, Train.class, "Train", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrain_PreviouslyOn(), this.getRegion(), null, "previouslyOn", null, 0, 1, Train.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrain_CurrentlyOn(), this.getRegion(), null, "currentlyOn", null, 0, 1, Train.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrain_Id(), ecorePackage.getEInt(), "id", "0", 0, 1, Train.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrain_Position(), this.getPoint(), null, "position", null, 1, 1, Train.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrain_NextGroup(), this.getGroup(), null, "nextGroup", null, 1, 2, Train.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trainModelEClass, TrainModel.class, "TrainModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrainModel_Trains(), this.getTrain(), null, "trains", null, 0, -1, TrainModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(railRoadModelEClass, RailRoadModel.class, "RailRoadModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRailRoadModel_SectionModel(), this.getSectionModel(), null, "sectionModel", null, 1, 1, RailRoadModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRailRoadModel_TrainModel(), this.getTrainModel(), null, "trainModel", null, 1, 1, RailRoadModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //RailroadModelPackageImpl
