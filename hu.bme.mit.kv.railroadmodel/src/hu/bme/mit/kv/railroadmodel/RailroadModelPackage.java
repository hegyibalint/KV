/**
 */
package hu.bme.mit.kv.railroadmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hu.bme.mit.kv.railroadmodel.RailroadModelFactory
 * @model kind="package"
 * @generated
 */
public interface RailroadModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "railroadmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://hu.bme.mit.kv.railroadmodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "railroadmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RailroadModelPackage eINSTANCE = hu.bme.mit.kv.railroadmodel.impl.RailroadModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.bme.mit.kv.railroadmodel.impl.RegionImpl <em>Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.kv.railroadmodel.impl.RegionImpl
	 * @see hu.bme.mit.kv.railroadmodel.impl.RailroadModelPackageImpl#getRegion()
	 * @generated
	 */
	int REGION = 0;

	/**
	 * The feature id for the '<em><b>Neighbours</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__NEIGHBOURS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__ID = 1;

	/**
	 * The number of structural features of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.kv.railroadmodel.impl.RailRegionImpl <em>Rail Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.kv.railroadmodel.impl.RailRegionImpl
	 * @see hu.bme.mit.kv.railroadmodel.impl.RailroadModelPackageImpl#getRailRegion()
	 * @generated
	 */
	int RAIL_REGION = 1;

	/**
	 * The feature id for the '<em><b>Neighbours</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIL_REGION__NEIGHBOURS = REGION__NEIGHBOURS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIL_REGION__ID = REGION__ID;

	/**
	 * The feature id for the '<em><b>Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIL_REGION__LINE = REGION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rail Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIL_REGION_FEATURE_COUNT = REGION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rail Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIL_REGION_OPERATION_COUNT = REGION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.kv.railroadmodel.impl.SwitchRegionImpl <em>Switch Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.kv.railroadmodel.impl.SwitchRegionImpl
	 * @see hu.bme.mit.kv.railroadmodel.impl.RailroadModelPackageImpl#getSwitchRegion()
	 * @generated
	 */
	int SWITCH_REGION = 2;

	/**
	 * The feature id for the '<em><b>Neighbours</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_REGION__NEIGHBOURS = REGION__NEIGHBOURS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_REGION__ID = REGION__ID;

	/**
	 * The feature id for the '<em><b>Rectangle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_REGION__RECTANGLE = REGION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Switch Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_REGION_FEATURE_COUNT = REGION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Switch Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_REGION_OPERATION_COUNT = REGION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.kv.railroadmodel.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.kv.railroadmodel.impl.GroupImpl
	 * @see hu.bme.mit.kv.railroadmodel.impl.RailroadModelPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ID = 0;

	/**
	 * The feature id for the '<em><b>Regions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__REGIONS = 1;

	/**
	 * The feature id for the '<em><b>Safe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__SAFE = 2;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.kv.railroadmodel.impl.PowerableGroupImpl <em>Powerable Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.kv.railroadmodel.impl.PowerableGroupImpl
	 * @see hu.bme.mit.kv.railroadmodel.impl.RailroadModelPackageImpl#getPowerableGroup()
	 * @generated
	 */
	int POWERABLE_GROUP = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWERABLE_GROUP__ID = GROUP__ID;

	/**
	 * The feature id for the '<em><b>Regions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWERABLE_GROUP__REGIONS = GROUP__REGIONS;

	/**
	 * The feature id for the '<em><b>Safe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWERABLE_GROUP__SAFE = GROUP__SAFE;

	/**
	 * The feature id for the '<em><b>Powered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWERABLE_GROUP__POWERED = GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Powerable Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWERABLE_GROUP_FEATURE_COUNT = GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Powerable Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWERABLE_GROUP_OPERATION_COUNT = GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.kv.railroadmodel.impl.SectionModelImpl <em>Section Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.kv.railroadmodel.impl.SectionModelImpl
	 * @see hu.bme.mit.kv.railroadmodel.impl.RailroadModelPackageImpl#getSectionModel()
	 * @generated
	 */
	int SECTION_MODEL = 4;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_MODEL__GROUPS = 0;

	/**
	 * The feature id for the '<em><b>Trackables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_MODEL__TRACKABLES = 1;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_MODEL__SETTINGS = 2;

	/**
	 * The number of structural features of the '<em>Section Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Section Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.kv.railroadmodel.impl.LineImpl <em>Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.kv.railroadmodel.impl.LineImpl
	 * @see hu.bme.mit.kv.railroadmodel.impl.RailroadModelPackageImpl#getLine()
	 * @generated
	 */
	int LINE = 5;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__START = 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__END = 1;

	/**
	 * The number of structural features of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.kv.railroadmodel.impl.RectangleImpl <em>Rectangle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.kv.railroadmodel.impl.RectangleImpl
	 * @see hu.bme.mit.kv.railroadmodel.impl.RailroadModelPackageImpl#getRectangle()
	 * @generated
	 */
	int RECTANGLE = 6;

	/**
	 * The feature id for the '<em><b>Corners</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__CORNERS = 0;

	/**
	 * The number of structural features of the '<em>Rectangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Rectangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.kv.railroadmodel.impl.PointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.kv.railroadmodel.impl.PointImpl
	 * @see hu.bme.mit.kv.railroadmodel.impl.RailroadModelPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 7;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__Y = 1;

	/**
	 * The number of structural features of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.kv.railroadmodel.impl.SwitchGroupImpl <em>Switch Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.kv.railroadmodel.impl.SwitchGroupImpl
	 * @see hu.bme.mit.kv.railroadmodel.impl.RailroadModelPackageImpl#getSwitchGroup()
	 * @generated
	 */
	int SWITCH_GROUP = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_GROUP__ID = GROUP__ID;

	/**
	 * The feature id for the '<em><b>Regions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_GROUP__REGIONS = GROUP__REGIONS;

	/**
	 * The feature id for the '<em><b>Safe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_GROUP__SAFE = GROUP__SAFE;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_GROUP__CONFIGURATION = GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Switch Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_GROUP_FEATURE_COUNT = GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Switch Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_GROUP_OPERATION_COUNT = GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.kv.railroadmodel.impl.SwitchSettingImpl <em>Switch Setting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.kv.railroadmodel.impl.SwitchSettingImpl
	 * @see hu.bme.mit.kv.railroadmodel.impl.RailroadModelPackageImpl#getSwitchSetting()
	 * @generated
	 */
	int SWITCH_SETTING = 10;

	/**
	 * The feature id for the '<em><b>Straightconfiguration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_SETTING__STRAIGHTCONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Divergentconfiguration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_SETTING__DIVERGENTCONFIGURATION = 1;

	/**
	 * The feature id for the '<em><b>Physical ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_SETTING__PHYSICAL_ID = 2;

	/**
	 * The number of structural features of the '<em>Switch Setting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_SETTING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Switch Setting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_SETTING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.kv.railroadmodel.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.kv.railroadmodel.impl.ConfigurationImpl
	 * @see hu.bme.mit.kv.railroadmodel.impl.RailroadModelPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 13;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__ENABLED = 0;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.kv.railroadmodel.impl.DivergentConfigurationImpl <em>Divergent Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.kv.railroadmodel.impl.DivergentConfigurationImpl
	 * @see hu.bme.mit.kv.railroadmodel.impl.RailroadModelPackageImpl#getDivergentConfiguration()
	 * @generated
	 */
	int DIVERGENT_CONFIGURATION = 11;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVERGENT_CONFIGURATION__ENABLED = CONFIGURATION__ENABLED;

	/**
	 * The number of structural features of the '<em>Divergent Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVERGENT_CONFIGURATION_FEATURE_COUNT = CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Divergent Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVERGENT_CONFIGURATION_OPERATION_COUNT = CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.kv.railroadmodel.impl.StraightConfigurationImpl <em>Straight Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.kv.railroadmodel.impl.StraightConfigurationImpl
	 * @see hu.bme.mit.kv.railroadmodel.impl.RailroadModelPackageImpl#getStraightConfiguration()
	 * @generated
	 */
	int STRAIGHT_CONFIGURATION = 12;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRAIGHT_CONFIGURATION__ENABLED = CONFIGURATION__ENABLED;

	/**
	 * The number of structural features of the '<em>Straight Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRAIGHT_CONFIGURATION_FEATURE_COUNT = CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Straight Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRAIGHT_CONFIGURATION_OPERATION_COUNT = CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.kv.railroadmodel.impl.TrainImpl <em>Train</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.kv.railroadmodel.impl.TrainImpl
	 * @see hu.bme.mit.kv.railroadmodel.impl.RailroadModelPackageImpl#getTrain()
	 * @generated
	 */
	int TRAIN = 14;

	/**
	 * The feature id for the '<em><b>Previously On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__PREVIOUSLY_ON = 0;

	/**
	 * The feature id for the '<em><b>Currently On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__CURRENTLY_ON = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__ID = 2;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__POSITION = 3;

	/**
	 * The feature id for the '<em><b>Next Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__NEXT_GROUP = 4;

	/**
	 * The number of structural features of the '<em>Train</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Train</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.kv.railroadmodel.impl.TrainModelImpl <em>Train Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.kv.railroadmodel.impl.TrainModelImpl
	 * @see hu.bme.mit.kv.railroadmodel.impl.RailroadModelPackageImpl#getTrainModel()
	 * @generated
	 */
	int TRAIN_MODEL = 15;

	/**
	 * The feature id for the '<em><b>Trains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_MODEL__TRAINS = 0;

	/**
	 * The number of structural features of the '<em>Train Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Train Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.kv.railroadmodel.impl.RailRoadModelImpl <em>Rail Road Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.kv.railroadmodel.impl.RailRoadModelImpl
	 * @see hu.bme.mit.kv.railroadmodel.impl.RailroadModelPackageImpl#getRailRoadModel()
	 * @generated
	 */
	int RAIL_ROAD_MODEL = 16;

	/**
	 * The feature id for the '<em><b>Section Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIL_ROAD_MODEL__SECTION_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Train Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIL_ROAD_MODEL__TRAIN_MODEL = 1;

	/**
	 * The number of structural features of the '<em>Rail Road Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIL_ROAD_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Rail Road Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIL_ROAD_MODEL_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link hu.bme.mit.kv.railroadmodel.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region</em>'.
	 * @see hu.bme.mit.kv.railroadmodel.Region
	 * @generated
	 */
	EClass getRegion();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.kv.railroadmodel.Region#getNeighbours <em>Neighbours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Neighbours</em>'.
	 * @see hu.bme.mit.kv.railroadmodel.Region#getNeighbours()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_Neighbours();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.kv.railroadmodel.Region#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see hu.bme.mit.kv.railroadmodel.Region#getId()
	 * @see #getRegion()
	 * @generated
	 */
	EAttribute getRegion_Id();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.kv.railroadmodel.RailRegion <em>Rail Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rail Region</em>'.
	 * @see hu.bme.mit.kv.railroadmodel.RailRegion
	 * @generated
	 */
	EClass getRailRegion();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.kv.railroadmodel.RailRegion#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Line</em>'.
	 * @see hu.bme.mit.kv.railroadmodel.RailRegion#getLine()
	 * @see #getRailRegion()
	 * @generated
	 */
	EReference getRailRegion_Line();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.kv.railroadmodel.SwitchRegion <em>Switch Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Region</em>'.
	 * @see hu.bme.mit.kv.railroadmodel.SwitchRegion
	 * @generated
	 */
	EClass getSwitchRegion();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.kv.railroadmodel.SwitchRegion#getRectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rectangle</em>'.
	 * @see hu.bme.mit.kv.railroadmodel.SwitchRegion#getRectangle()
	 * @see #getSwitchRegion()
	 * @generated
	 */
	EReference getSwitchRegion_Rectangle();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.kv.railroadmodel.PowerableGroup <em>Powerable Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Powerable Group</em>'.
	 * @see hu.bme.mit.kv.railroadmodel.PowerableGroup
	 * @generated
	 */
	EClass getPowerableGroup();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.kv.railroadmodel.PowerableGroup#isPowered <em>Powered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Powered</em>'.
	 * @see hu.bme.mit.kv.railroadmodel.PowerableGroup#isPowered()
	 * @see #getPowerableGroup()
	 * @generated
	 */
	EAttribute getPowerableGroup_Powered();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.kv.railroadmodel.SectionModel <em>Section Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section Model</em>'.
	 * @see hu.bme.mit.kv.railroadmodel.SectionModel
	 * @generated
	 */
	EClass getSectionModel();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.kv.railroadmodel.SectionModel#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see hu.bme.mit.kv.railroadmodel.SectionModel#getGroups()
	 * @see #getSectionModel()
	 * @generated
	 */
	EReference getSectionModel_Groups();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.kv.railroadmodel.SectionModel#getTrackables <em>Trackables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trackables</em>'.
	 * @see hu.bme.mit.kv.railroadmodel.SectionModel#getTrackables()
	 * @see #getSectionModel()
	 * @generated
	 */
	EReference getSectionModel_Trackables();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.kv.railroadmodel.SectionModel#getSettings <em>Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Settings</em>'.
	 * @see hu.bme.mit.kv.railroadmodel.SectionModel#getSettings()
	 * @see #getSectionModel()
	 * @generated
	 */
	EReference getSectionModel_Settings();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.kv.railroadmodel.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line</em>'.
	 * @see hu.bme.mit.kv.railroadmodel.Line
	 * @generated
	 */
	EClass getLine();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.kv.railroadmodel.Line#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start</em>'.
	 * @see hu.bme.mit.kv.railroadmodel.Line#getStart()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_Start();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.kv.railroadmodel.Line#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End</em>'.
	 * @see hu.bme.mit.kv.railroadmodel.Line#getEnd()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_End();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.kv.railroadmodel.Rectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rectangle</em>'.
	 * @see hu.bme.mit.kv.railroadmodel.Rectangle
	 * @generated
	 */
	EClass getRectangle();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.kv.railroadmodel.Rectangle#getCorners <em>Corners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Corners</em>'.
	 * @see hu.bme.mit.kv.railroadmodel.Rectangle#getCorners()
	 * @see #getRectangle()
	 * @generated
	 */
	EReference getRectangle_Corners();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.kv.railroadmodel.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point</em>'.
	 * @see hu.bme.mit.kv.railroadmodel.Point
	 * @generated
	 */
	EClass getPoint();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.kv.railroadmodel.Point#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see hu.bme.mit.kv.railroadmodel.Point#getX()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_X();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.kv.railroadmodel.Point#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see hu.bme.mit.kv.railroadmodel.Point#getY()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_Y();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.kv.railroadmodel.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see hu.bme.mit.kv.railroadmodel.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.kv.railroadmodel.Group#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see hu.bme.mit.kv.railroadmodel.Group#getId()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Id();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.kv.railroadmodel.Group#getRegions <em>Regions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Regions</em>'.
	 * @see hu.bme.mit.kv.railroadmodel.Group#getRegions()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Regions();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.kv.railroadmodel.Group#isSafe <em>Safe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Safe</em>'.
	 * @see hu.bme.mit.kv.railroadmodel.Group#isSafe()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Safe();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.kv.railroadmodel.SwitchGroup <em>Switch Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Group</em>'.
	 * @see hu.bme.mit.kv.railroadmodel.SwitchGroup
	 * @generated
	 */
	EClass getSwitchGroup();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.kv.railroadmodel.SwitchGroup#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Configuration</em>'.
	 * @see hu.bme.mit.kv.railroadmodel.SwitchGroup#getConfiguration()
	 * @see #getSwitchGroup()
	 * @generated
	 */
	EReference getSwitchGroup_Configuration();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.kv.railroadmodel.SwitchSetting <em>Switch Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Setting</em>'.
	 * @see hu.bme.mit.kv.railroadmodel.SwitchSetting
	 * @generated
	 */
	EClass getSwitchSetting();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.kv.railroadmodel.SwitchSetting#getStraightconfiguration <em>Straightconfiguration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Straightconfiguration</em>'.
	 * @see hu.bme.mit.kv.railroadmodel.SwitchSetting#getStraightconfiguration()
	 * @see #getSwitchSetting()
	 * @generated
	 */
	EReference getSwitchSetting_Straightconfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.kv.railroadmodel.SwitchSetting#getDivergentconfiguration <em>Divergentconfiguration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Divergentconfiguration</em>'.
	 * @see hu.bme.mit.kv.railroadmodel.SwitchSetting#getDivergentconfiguration()
	 * @see #getSwitchSetting()
	 * @generated
	 */
	EReference getSwitchSetting_Divergentconfiguration();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.kv.railroadmodel.SwitchSetting#getPhysicalID <em>Physical ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Physical ID</em>'.
	 * @see hu.bme.mit.kv.railroadmodel.SwitchSetting#getPhysicalID()
	 * @see #getSwitchSetting()
	 * @generated
	 */
	EAttribute getSwitchSetting_PhysicalID();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.kv.railroadmodel.DivergentConfiguration <em>Divergent Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Divergent Configuration</em>'.
	 * @see hu.bme.mit.kv.railroadmodel.DivergentConfiguration
	 * @generated
	 */
	EClass getDivergentConfiguration();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.kv.railroadmodel.StraightConfiguration <em>Straight Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Straight Configuration</em>'.
	 * @see hu.bme.mit.kv.railroadmodel.StraightConfiguration
	 * @generated
	 */
	EClass getStraightConfiguration();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.kv.railroadmodel.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see hu.bme.mit.kv.railroadmodel.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.kv.railroadmodel.Configuration#getEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Enabled</em>'.
	 * @see hu.bme.mit.kv.railroadmodel.Configuration#getEnabled()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Enabled();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.kv.railroadmodel.Train <em>Train</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Train</em>'.
	 * @see hu.bme.mit.kv.railroadmodel.Train
	 * @generated
	 */
	EClass getTrain();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.kv.railroadmodel.Train#getPreviouslyOn <em>Previously On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previously On</em>'.
	 * @see hu.bme.mit.kv.railroadmodel.Train#getPreviouslyOn()
	 * @see #getTrain()
	 * @generated
	 */
	EReference getTrain_PreviouslyOn();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.kv.railroadmodel.Train#getCurrentlyOn <em>Currently On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Currently On</em>'.
	 * @see hu.bme.mit.kv.railroadmodel.Train#getCurrentlyOn()
	 * @see #getTrain()
	 * @generated
	 */
	EReference getTrain_CurrentlyOn();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.kv.railroadmodel.Train#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see hu.bme.mit.kv.railroadmodel.Train#getId()
	 * @see #getTrain()
	 * @generated
	 */
	EAttribute getTrain_Id();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.kv.railroadmodel.Train#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see hu.bme.mit.kv.railroadmodel.Train#getPosition()
	 * @see #getTrain()
	 * @generated
	 */
	EReference getTrain_Position();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.kv.railroadmodel.Train#getNextGroup <em>Next Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Next Group</em>'.
	 * @see hu.bme.mit.kv.railroadmodel.Train#getNextGroup()
	 * @see #getTrain()
	 * @generated
	 */
	EReference getTrain_NextGroup();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.kv.railroadmodel.TrainModel <em>Train Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Train Model</em>'.
	 * @see hu.bme.mit.kv.railroadmodel.TrainModel
	 * @generated
	 */
	EClass getTrainModel();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.kv.railroadmodel.TrainModel#getTrains <em>Trains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trains</em>'.
	 * @see hu.bme.mit.kv.railroadmodel.TrainModel#getTrains()
	 * @see #getTrainModel()
	 * @generated
	 */
	EReference getTrainModel_Trains();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.kv.railroadmodel.RailRoadModel <em>Rail Road Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rail Road Model</em>'.
	 * @see hu.bme.mit.kv.railroadmodel.RailRoadModel
	 * @generated
	 */
	EClass getRailRoadModel();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.kv.railroadmodel.RailRoadModel#getSectionModel <em>Section Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Section Model</em>'.
	 * @see hu.bme.mit.kv.railroadmodel.RailRoadModel#getSectionModel()
	 * @see #getRailRoadModel()
	 * @generated
	 */
	EReference getRailRoadModel_SectionModel();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.kv.railroadmodel.RailRoadModel#getTrainModel <em>Train Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Train Model</em>'.
	 * @see hu.bme.mit.kv.railroadmodel.RailRoadModel#getTrainModel()
	 * @see #getRailRoadModel()
	 * @generated
	 */
	EReference getRailRoadModel_TrainModel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RailroadModelFactory getRailroadModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hu.bme.mit.kv.railroadmodel.impl.RegionImpl <em>Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.kv.railroadmodel.impl.RegionImpl
		 * @see hu.bme.mit.kv.railroadmodel.impl.RailroadModelPackageImpl#getRegion()
		 * @generated
		 */
		EClass REGION = eINSTANCE.getRegion();

		/**
		 * The meta object literal for the '<em><b>Neighbours</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__NEIGHBOURS = eINSTANCE.getRegion_Neighbours();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGION__ID = eINSTANCE.getRegion_Id();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.kv.railroadmodel.impl.RailRegionImpl <em>Rail Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.kv.railroadmodel.impl.RailRegionImpl
		 * @see hu.bme.mit.kv.railroadmodel.impl.RailroadModelPackageImpl#getRailRegion()
		 * @generated
		 */
		EClass RAIL_REGION = eINSTANCE.getRailRegion();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAIL_REGION__LINE = eINSTANCE.getRailRegion_Line();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.kv.railroadmodel.impl.SwitchRegionImpl <em>Switch Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.kv.railroadmodel.impl.SwitchRegionImpl
		 * @see hu.bme.mit.kv.railroadmodel.impl.RailroadModelPackageImpl#getSwitchRegion()
		 * @generated
		 */
		EClass SWITCH_REGION = eINSTANCE.getSwitchRegion();

		/**
		 * The meta object literal for the '<em><b>Rectangle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_REGION__RECTANGLE = eINSTANCE.getSwitchRegion_Rectangle();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.kv.railroadmodel.impl.PowerableGroupImpl <em>Powerable Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.kv.railroadmodel.impl.PowerableGroupImpl
		 * @see hu.bme.mit.kv.railroadmodel.impl.RailroadModelPackageImpl#getPowerableGroup()
		 * @generated
		 */
		EClass POWERABLE_GROUP = eINSTANCE.getPowerableGroup();

		/**
		 * The meta object literal for the '<em><b>Powered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POWERABLE_GROUP__POWERED = eINSTANCE.getPowerableGroup_Powered();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.kv.railroadmodel.impl.SectionModelImpl <em>Section Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.kv.railroadmodel.impl.SectionModelImpl
		 * @see hu.bme.mit.kv.railroadmodel.impl.RailroadModelPackageImpl#getSectionModel()
		 * @generated
		 */
		EClass SECTION_MODEL = eINSTANCE.getSectionModel();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION_MODEL__GROUPS = eINSTANCE.getSectionModel_Groups();

		/**
		 * The meta object literal for the '<em><b>Trackables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION_MODEL__TRACKABLES = eINSTANCE.getSectionModel_Trackables();

		/**
		 * The meta object literal for the '<em><b>Settings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION_MODEL__SETTINGS = eINSTANCE.getSectionModel_Settings();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.kv.railroadmodel.impl.LineImpl <em>Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.kv.railroadmodel.impl.LineImpl
		 * @see hu.bme.mit.kv.railroadmodel.impl.RailroadModelPackageImpl#getLine()
		 * @generated
		 */
		EClass LINE = eINSTANCE.getLine();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__START = eINSTANCE.getLine_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__END = eINSTANCE.getLine_End();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.kv.railroadmodel.impl.RectangleImpl <em>Rectangle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.kv.railroadmodel.impl.RectangleImpl
		 * @see hu.bme.mit.kv.railroadmodel.impl.RailroadModelPackageImpl#getRectangle()
		 * @generated
		 */
		EClass RECTANGLE = eINSTANCE.getRectangle();

		/**
		 * The meta object literal for the '<em><b>Corners</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECTANGLE__CORNERS = eINSTANCE.getRectangle_Corners();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.kv.railroadmodel.impl.PointImpl <em>Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.kv.railroadmodel.impl.PointImpl
		 * @see hu.bme.mit.kv.railroadmodel.impl.RailroadModelPackageImpl#getPoint()
		 * @generated
		 */
		EClass POINT = eINSTANCE.getPoint();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__X = eINSTANCE.getPoint_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__Y = eINSTANCE.getPoint_Y();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.kv.railroadmodel.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.kv.railroadmodel.impl.GroupImpl
		 * @see hu.bme.mit.kv.railroadmodel.impl.RailroadModelPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__ID = eINSTANCE.getGroup_Id();

		/**
		 * The meta object literal for the '<em><b>Regions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__REGIONS = eINSTANCE.getGroup_Regions();

		/**
		 * The meta object literal for the '<em><b>Safe</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__SAFE = eINSTANCE.getGroup_Safe();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.kv.railroadmodel.impl.SwitchGroupImpl <em>Switch Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.kv.railroadmodel.impl.SwitchGroupImpl
		 * @see hu.bme.mit.kv.railroadmodel.impl.RailroadModelPackageImpl#getSwitchGroup()
		 * @generated
		 */
		EClass SWITCH_GROUP = eINSTANCE.getSwitchGroup();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_GROUP__CONFIGURATION = eINSTANCE.getSwitchGroup_Configuration();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.kv.railroadmodel.impl.SwitchSettingImpl <em>Switch Setting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.kv.railroadmodel.impl.SwitchSettingImpl
		 * @see hu.bme.mit.kv.railroadmodel.impl.RailroadModelPackageImpl#getSwitchSetting()
		 * @generated
		 */
		EClass SWITCH_SETTING = eINSTANCE.getSwitchSetting();

		/**
		 * The meta object literal for the '<em><b>Straightconfiguration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_SETTING__STRAIGHTCONFIGURATION = eINSTANCE.getSwitchSetting_Straightconfiguration();

		/**
		 * The meta object literal for the '<em><b>Divergentconfiguration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_SETTING__DIVERGENTCONFIGURATION = eINSTANCE.getSwitchSetting_Divergentconfiguration();

		/**
		 * The meta object literal for the '<em><b>Physical ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCH_SETTING__PHYSICAL_ID = eINSTANCE.getSwitchSetting_PhysicalID();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.kv.railroadmodel.impl.DivergentConfigurationImpl <em>Divergent Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.kv.railroadmodel.impl.DivergentConfigurationImpl
		 * @see hu.bme.mit.kv.railroadmodel.impl.RailroadModelPackageImpl#getDivergentConfiguration()
		 * @generated
		 */
		EClass DIVERGENT_CONFIGURATION = eINSTANCE.getDivergentConfiguration();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.kv.railroadmodel.impl.StraightConfigurationImpl <em>Straight Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.kv.railroadmodel.impl.StraightConfigurationImpl
		 * @see hu.bme.mit.kv.railroadmodel.impl.RailroadModelPackageImpl#getStraightConfiguration()
		 * @generated
		 */
		EClass STRAIGHT_CONFIGURATION = eINSTANCE.getStraightConfiguration();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.kv.railroadmodel.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.kv.railroadmodel.impl.ConfigurationImpl
		 * @see hu.bme.mit.kv.railroadmodel.impl.RailroadModelPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__ENABLED = eINSTANCE.getConfiguration_Enabled();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.kv.railroadmodel.impl.TrainImpl <em>Train</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.kv.railroadmodel.impl.TrainImpl
		 * @see hu.bme.mit.kv.railroadmodel.impl.RailroadModelPackageImpl#getTrain()
		 * @generated
		 */
		EClass TRAIN = eINSTANCE.getTrain();

		/**
		 * The meta object literal for the '<em><b>Previously On</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN__PREVIOUSLY_ON = eINSTANCE.getTrain_PreviouslyOn();

		/**
		 * The meta object literal for the '<em><b>Currently On</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN__CURRENTLY_ON = eINSTANCE.getTrain_CurrentlyOn();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN__ID = eINSTANCE.getTrain_Id();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN__POSITION = eINSTANCE.getTrain_Position();

		/**
		 * The meta object literal for the '<em><b>Next Group</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN__NEXT_GROUP = eINSTANCE.getTrain_NextGroup();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.kv.railroadmodel.impl.TrainModelImpl <em>Train Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.kv.railroadmodel.impl.TrainModelImpl
		 * @see hu.bme.mit.kv.railroadmodel.impl.RailroadModelPackageImpl#getTrainModel()
		 * @generated
		 */
		EClass TRAIN_MODEL = eINSTANCE.getTrainModel();

		/**
		 * The meta object literal for the '<em><b>Trains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN_MODEL__TRAINS = eINSTANCE.getTrainModel_Trains();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.kv.railroadmodel.impl.RailRoadModelImpl <em>Rail Road Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.kv.railroadmodel.impl.RailRoadModelImpl
		 * @see hu.bme.mit.kv.railroadmodel.impl.RailroadModelPackageImpl#getRailRoadModel()
		 * @generated
		 */
		EClass RAIL_ROAD_MODEL = eINSTANCE.getRailRoadModel();

		/**
		 * The meta object literal for the '<em><b>Section Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAIL_ROAD_MODEL__SECTION_MODEL = eINSTANCE.getRailRoadModel_SectionModel();

		/**
		 * The meta object literal for the '<em><b>Train Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAIL_ROAD_MODEL__TRAIN_MODEL = eINSTANCE.getRailRoadModel_TrainModel();

	}

} //RailroadModelPackage
