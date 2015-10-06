/**
 */
package hu.bme.mit.kv.model.railroadmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see hu.bme.mit.kv.model.railroadmodel.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
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
	ModelPackage eINSTANCE = hu.bme.mit.kv.model.railroadmodel.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.bme.mit.kv.model.railroadmodel.impl.TrainModelImpl <em>Train Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.kv.model.railroadmodel.impl.TrainModelImpl
	 * @see hu.bme.mit.kv.model.railroadmodel.impl.ModelPackageImpl#getTrainModel()
	 * @generated
	 */
	int TRAIN_MODEL = 0;

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
	 * The meta object id for the '{@link hu.bme.mit.kv.model.railroadmodel.impl.TrainImpl <em>Train</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.kv.model.railroadmodel.impl.TrainImpl
	 * @see hu.bme.mit.kv.model.railroadmodel.impl.ModelPackageImpl#getTrain()
	 * @generated
	 */
	int TRAIN = 1;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__Y = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__ID = 2;

	/**
	 * The feature id for the '<em><b>Currently On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__CURRENTLY_ON = 3;

	/**
	 * The number of structural features of the '<em>Train</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Train</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.kv.model.railroadmodel.impl.PointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.kv.model.railroadmodel.impl.PointImpl
	 * @see hu.bme.mit.kv.model.railroadmodel.impl.ModelPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 2;

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
	 * The operation id for the '<em>Distance From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT___DISTANCE_FROM__POINT = 0;

	/**
	 * The number of operations of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link hu.bme.mit.kv.model.railroadmodel.impl.SectionModelImpl <em>Section Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.kv.model.railroadmodel.impl.SectionModelImpl
	 * @see hu.bme.mit.kv.model.railroadmodel.impl.ModelPackageImpl#getSectionModel()
	 * @generated
	 */
	int SECTION_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_MODEL__SECTIONS = 0;

	/**
	 * The number of structural features of the '<em>Section Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Section Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.kv.model.railroadmodel.impl.RectangleImpl <em>Rectangle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.kv.model.railroadmodel.impl.RectangleImpl
	 * @see hu.bme.mit.kv.model.railroadmodel.impl.ModelPackageImpl#getRectangle()
	 * @generated
	 */
	int RECTANGLE = 4;

	/**
	 * The feature id for the '<em><b>Inverse Matrix</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__INVERSE_MATRIX = 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__SIZE = 1;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__ORIGIN = 2;

	/**
	 * The number of structural features of the '<em>Rectangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Is Point Inside</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE___IS_POINT_INSIDE__POINT = 0;

	/**
	 * The number of operations of the '<em>Rectangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link hu.bme.mit.kv.model.railroadmodel.impl.SectionImpl <em>Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.kv.model.railroadmodel.impl.SectionImpl
	 * @see hu.bme.mit.kv.model.railroadmodel.impl.ModelPackageImpl#getSection()
	 * @generated
	 */
	int SECTION = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__ID = 0;

	/**
	 * The number of structural features of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.kv.model.railroadmodel.impl.RailImpl <em>Rail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.kv.model.railroadmodel.impl.RailImpl
	 * @see hu.bme.mit.kv.model.railroadmodel.impl.ModelPackageImpl#getRail()
	 * @generated
	 */
	int RAIL = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIL__ID = SECTION__ID;

	/**
	 * The feature id for the '<em><b>Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIL__POINTS = SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Endpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIL__ENDPOINTS = SECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>New Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIL__NEW_ATTRIBUTE = SECTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Rail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIL_FEATURE_COUNT = SECTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Rail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIL_OPERATION_COUNT = SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.kv.model.railroadmodel.impl.TurnoutImpl <em>Turnout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.kv.model.railroadmodel.impl.TurnoutImpl
	 * @see hu.bme.mit.kv.model.railroadmodel.impl.ModelPackageImpl#getTurnout()
	 * @generated
	 */
	int TURNOUT = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT__ID = SECTION__ID;

	/**
	 * The feature id for the '<em><b>Connected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT__CONNECTED = SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Not Connected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT__NOT_CONNECTED = SECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rectangle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT__RECTANGLE = SECTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Turnout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT_FEATURE_COUNT = SECTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Turnout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT_OPERATION_COUNT = SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.kv.model.railroadmodel.impl.DimensionImpl <em>Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.kv.model.railroadmodel.impl.DimensionImpl
	 * @see hu.bme.mit.kv.model.railroadmodel.impl.ModelPackageImpl#getDimension()
	 * @generated
	 */
	int DIMENSION = 8;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__WIDTH = 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__HEIGHT = 1;

	/**
	 * The number of structural features of the '<em>Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.kv.model.railroadmodel.impl.RailPointImpl <em>Rail Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.kv.model.railroadmodel.impl.RailPointImpl
	 * @see hu.bme.mit.kv.model.railroadmodel.impl.ModelPackageImpl#getRailPoint()
	 * @generated
	 */
	int RAIL_POINT = 10;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIL_POINT__POSITION = 0;

	/**
	 * The feature id for the '<em><b>Neighbours</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIL_POINT__NEIGHBOURS = 1;

	/**
	 * The number of structural features of the '<em>Rail Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIL_POINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Rail Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIL_POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.kv.model.railroadmodel.impl.RailEndPointImpl <em>Rail End Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.kv.model.railroadmodel.impl.RailEndPointImpl
	 * @see hu.bme.mit.kv.model.railroadmodel.impl.ModelPackageImpl#getRailEndPoint()
	 * @generated
	 */
	int RAIL_END_POINT = 9;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIL_END_POINT__POSITION = RAIL_POINT__POSITION;

	/**
	 * The feature id for the '<em><b>Neighbours</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIL_END_POINT__NEIGHBOURS = RAIL_POINT__NEIGHBOURS;

	/**
	 * The feature id for the '<em><b>Next Section</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIL_END_POINT__NEXT_SECTION = RAIL_POINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rail End Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIL_END_POINT_FEATURE_COUNT = RAIL_POINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rail End Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIL_END_POINT_OPERATION_COUNT = RAIL_POINT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link hu.bme.mit.kv.model.railroadmodel.TrainModel <em>Train Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Train Model</em>'.
	 * @see hu.bme.mit.kv.model.railroadmodel.TrainModel
	 * @generated
	 */
	EClass getTrainModel();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.kv.model.railroadmodel.TrainModel#getTrains <em>Trains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trains</em>'.
	 * @see hu.bme.mit.kv.model.railroadmodel.TrainModel#getTrains()
	 * @see #getTrainModel()
	 * @generated
	 */
	EReference getTrainModel_Trains();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.kv.model.railroadmodel.Train <em>Train</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Train</em>'.
	 * @see hu.bme.mit.kv.model.railroadmodel.Train
	 * @generated
	 */
	EClass getTrain();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.kv.model.railroadmodel.Train#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see hu.bme.mit.kv.model.railroadmodel.Train#getX()
	 * @see #getTrain()
	 * @generated
	 */
	EAttribute getTrain_X();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.kv.model.railroadmodel.Train#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see hu.bme.mit.kv.model.railroadmodel.Train#getY()
	 * @see #getTrain()
	 * @generated
	 */
	EAttribute getTrain_Y();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.kv.model.railroadmodel.Train#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see hu.bme.mit.kv.model.railroadmodel.Train#getId()
	 * @see #getTrain()
	 * @generated
	 */
	EAttribute getTrain_Id();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.kv.model.railroadmodel.Train#getCurrentlyOn <em>Currently On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Currently On</em>'.
	 * @see hu.bme.mit.kv.model.railroadmodel.Train#getCurrentlyOn()
	 * @see #getTrain()
	 * @generated
	 */
	EReference getTrain_CurrentlyOn();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.kv.model.railroadmodel.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point</em>'.
	 * @see hu.bme.mit.kv.model.railroadmodel.Point
	 * @generated
	 */
	EClass getPoint();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.kv.model.railroadmodel.Point#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see hu.bme.mit.kv.model.railroadmodel.Point#getX()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_X();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.kv.model.railroadmodel.Point#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see hu.bme.mit.kv.model.railroadmodel.Point#getY()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_Y();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.kv.model.railroadmodel.Point#distanceFrom(hu.bme.mit.kv.model.railroadmodel.Point) <em>Distance From</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Distance From</em>' operation.
	 * @see hu.bme.mit.kv.model.railroadmodel.Point#distanceFrom(hu.bme.mit.kv.model.railroadmodel.Point)
	 * @generated
	 */
	EOperation getPoint__DistanceFrom__Point();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.kv.model.railroadmodel.SectionModel <em>Section Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section Model</em>'.
	 * @see hu.bme.mit.kv.model.railroadmodel.SectionModel
	 * @generated
	 */
	EClass getSectionModel();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.kv.model.railroadmodel.SectionModel#getSections <em>Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sections</em>'.
	 * @see hu.bme.mit.kv.model.railroadmodel.SectionModel#getSections()
	 * @see #getSectionModel()
	 * @generated
	 */
	EReference getSectionModel_Sections();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.kv.model.railroadmodel.Rectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rectangle</em>'.
	 * @see hu.bme.mit.kv.model.railroadmodel.Rectangle
	 * @generated
	 */
	EClass getRectangle();

	/**
	 * Returns the meta object for the attribute list '{@link hu.bme.mit.kv.model.railroadmodel.Rectangle#getInverseMatrix <em>Inverse Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Inverse Matrix</em>'.
	 * @see hu.bme.mit.kv.model.railroadmodel.Rectangle#getInverseMatrix()
	 * @see #getRectangle()
	 * @generated
	 */
	EAttribute getRectangle_InverseMatrix();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.kv.model.railroadmodel.Rectangle#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size</em>'.
	 * @see hu.bme.mit.kv.model.railroadmodel.Rectangle#getSize()
	 * @see #getRectangle()
	 * @generated
	 */
	EReference getRectangle_Size();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.kv.model.railroadmodel.Rectangle#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Origin</em>'.
	 * @see hu.bme.mit.kv.model.railroadmodel.Rectangle#getOrigin()
	 * @see #getRectangle()
	 * @generated
	 */
	EReference getRectangle_Origin();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.kv.model.railroadmodel.Rectangle#isPointInside(hu.bme.mit.kv.model.railroadmodel.Point) <em>Is Point Inside</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Point Inside</em>' operation.
	 * @see hu.bme.mit.kv.model.railroadmodel.Rectangle#isPointInside(hu.bme.mit.kv.model.railroadmodel.Point)
	 * @generated
	 */
	EOperation getRectangle__IsPointInside__Point();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.kv.model.railroadmodel.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section</em>'.
	 * @see hu.bme.mit.kv.model.railroadmodel.Section
	 * @generated
	 */
	EClass getSection();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.kv.model.railroadmodel.Section#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see hu.bme.mit.kv.model.railroadmodel.Section#getId()
	 * @see #getSection()
	 * @generated
	 */
	EAttribute getSection_Id();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.kv.model.railroadmodel.Rail <em>Rail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rail</em>'.
	 * @see hu.bme.mit.kv.model.railroadmodel.Rail
	 * @generated
	 */
	EClass getRail();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.kv.model.railroadmodel.Rail#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Points</em>'.
	 * @see hu.bme.mit.kv.model.railroadmodel.Rail#getPoints()
	 * @see #getRail()
	 * @generated
	 */
	EReference getRail_Points();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.kv.model.railroadmodel.Rail#getEndpoints <em>Endpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Endpoints</em>'.
	 * @see hu.bme.mit.kv.model.railroadmodel.Rail#getEndpoints()
	 * @see #getRail()
	 * @generated
	 */
	EReference getRail_Endpoints();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.kv.model.railroadmodel.Rail#getNewAttribute <em>New Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Attribute</em>'.
	 * @see hu.bme.mit.kv.model.railroadmodel.Rail#getNewAttribute()
	 * @see #getRail()
	 * @generated
	 */
	EAttribute getRail_NewAttribute();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.kv.model.railroadmodel.Turnout <em>Turnout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turnout</em>'.
	 * @see hu.bme.mit.kv.model.railroadmodel.Turnout
	 * @generated
	 */
	EClass getTurnout();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.kv.model.railroadmodel.Turnout#getConnected <em>Connected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected</em>'.
	 * @see hu.bme.mit.kv.model.railroadmodel.Turnout#getConnected()
	 * @see #getTurnout()
	 * @generated
	 */
	EReference getTurnout_Connected();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.kv.model.railroadmodel.Turnout#getNotConnected <em>Not Connected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Not Connected</em>'.
	 * @see hu.bme.mit.kv.model.railroadmodel.Turnout#getNotConnected()
	 * @see #getTurnout()
	 * @generated
	 */
	EReference getTurnout_NotConnected();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.kv.model.railroadmodel.Turnout#getRectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rectangle</em>'.
	 * @see hu.bme.mit.kv.model.railroadmodel.Turnout#getRectangle()
	 * @see #getTurnout()
	 * @generated
	 */
	EReference getTurnout_Rectangle();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.kv.model.railroadmodel.Dimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension</em>'.
	 * @see hu.bme.mit.kv.model.railroadmodel.Dimension
	 * @generated
	 */
	EClass getDimension();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.kv.model.railroadmodel.Dimension#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see hu.bme.mit.kv.model.railroadmodel.Dimension#getWidth()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_Width();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.kv.model.railroadmodel.Dimension#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see hu.bme.mit.kv.model.railroadmodel.Dimension#getHeight()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_Height();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.kv.model.railroadmodel.RailEndPoint <em>Rail End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rail End Point</em>'.
	 * @see hu.bme.mit.kv.model.railroadmodel.RailEndPoint
	 * @generated
	 */
	EClass getRailEndPoint();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.kv.model.railroadmodel.RailEndPoint#getNextSection <em>Next Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Section</em>'.
	 * @see hu.bme.mit.kv.model.railroadmodel.RailEndPoint#getNextSection()
	 * @see #getRailEndPoint()
	 * @generated
	 */
	EReference getRailEndPoint_NextSection();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.kv.model.railroadmodel.RailPoint <em>Rail Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rail Point</em>'.
	 * @see hu.bme.mit.kv.model.railroadmodel.RailPoint
	 * @generated
	 */
	EClass getRailPoint();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.kv.model.railroadmodel.RailPoint#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Position</em>'.
	 * @see hu.bme.mit.kv.model.railroadmodel.RailPoint#getPosition()
	 * @see #getRailPoint()
	 * @generated
	 */
	EReference getRailPoint_Position();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.kv.model.railroadmodel.RailPoint#getNeighbours <em>Neighbours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Neighbours</em>'.
	 * @see hu.bme.mit.kv.model.railroadmodel.RailPoint#getNeighbours()
	 * @see #getRailPoint()
	 * @generated
	 */
	EReference getRailPoint_Neighbours();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

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
		 * The meta object literal for the '{@link hu.bme.mit.kv.model.railroadmodel.impl.TrainModelImpl <em>Train Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.kv.model.railroadmodel.impl.TrainModelImpl
		 * @see hu.bme.mit.kv.model.railroadmodel.impl.ModelPackageImpl#getTrainModel()
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
		 * The meta object literal for the '{@link hu.bme.mit.kv.model.railroadmodel.impl.TrainImpl <em>Train</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.kv.model.railroadmodel.impl.TrainImpl
		 * @see hu.bme.mit.kv.model.railroadmodel.impl.ModelPackageImpl#getTrain()
		 * @generated
		 */
		EClass TRAIN = eINSTANCE.getTrain();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN__X = eINSTANCE.getTrain_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN__Y = eINSTANCE.getTrain_Y();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN__ID = eINSTANCE.getTrain_Id();

		/**
		 * The meta object literal for the '<em><b>Currently On</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN__CURRENTLY_ON = eINSTANCE.getTrain_CurrentlyOn();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.kv.model.railroadmodel.impl.PointImpl <em>Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.kv.model.railroadmodel.impl.PointImpl
		 * @see hu.bme.mit.kv.model.railroadmodel.impl.ModelPackageImpl#getPoint()
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
		 * The meta object literal for the '<em><b>Distance From</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POINT___DISTANCE_FROM__POINT = eINSTANCE.getPoint__DistanceFrom__Point();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.kv.model.railroadmodel.impl.SectionModelImpl <em>Section Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.kv.model.railroadmodel.impl.SectionModelImpl
		 * @see hu.bme.mit.kv.model.railroadmodel.impl.ModelPackageImpl#getSectionModel()
		 * @generated
		 */
		EClass SECTION_MODEL = eINSTANCE.getSectionModel();

		/**
		 * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION_MODEL__SECTIONS = eINSTANCE.getSectionModel_Sections();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.kv.model.railroadmodel.impl.RectangleImpl <em>Rectangle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.kv.model.railroadmodel.impl.RectangleImpl
		 * @see hu.bme.mit.kv.model.railroadmodel.impl.ModelPackageImpl#getRectangle()
		 * @generated
		 */
		EClass RECTANGLE = eINSTANCE.getRectangle();

		/**
		 * The meta object literal for the '<em><b>Inverse Matrix</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGLE__INVERSE_MATRIX = eINSTANCE.getRectangle_InverseMatrix();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECTANGLE__SIZE = eINSTANCE.getRectangle_Size();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECTANGLE__ORIGIN = eINSTANCE.getRectangle_Origin();

		/**
		 * The meta object literal for the '<em><b>Is Point Inside</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RECTANGLE___IS_POINT_INSIDE__POINT = eINSTANCE.getRectangle__IsPointInside__Point();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.kv.model.railroadmodel.impl.SectionImpl <em>Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.kv.model.railroadmodel.impl.SectionImpl
		 * @see hu.bme.mit.kv.model.railroadmodel.impl.ModelPackageImpl#getSection()
		 * @generated
		 */
		EClass SECTION = eINSTANCE.getSection();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION__ID = eINSTANCE.getSection_Id();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.kv.model.railroadmodel.impl.RailImpl <em>Rail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.kv.model.railroadmodel.impl.RailImpl
		 * @see hu.bme.mit.kv.model.railroadmodel.impl.ModelPackageImpl#getRail()
		 * @generated
		 */
		EClass RAIL = eINSTANCE.getRail();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAIL__POINTS = eINSTANCE.getRail_Points();

		/**
		 * The meta object literal for the '<em><b>Endpoints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAIL__ENDPOINTS = eINSTANCE.getRail_Endpoints();

		/**
		 * The meta object literal for the '<em><b>New Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAIL__NEW_ATTRIBUTE = eINSTANCE.getRail_NewAttribute();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.kv.model.railroadmodel.impl.TurnoutImpl <em>Turnout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.kv.model.railroadmodel.impl.TurnoutImpl
		 * @see hu.bme.mit.kv.model.railroadmodel.impl.ModelPackageImpl#getTurnout()
		 * @generated
		 */
		EClass TURNOUT = eINSTANCE.getTurnout();

		/**
		 * The meta object literal for the '<em><b>Connected</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURNOUT__CONNECTED = eINSTANCE.getTurnout_Connected();

		/**
		 * The meta object literal for the '<em><b>Not Connected</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURNOUT__NOT_CONNECTED = eINSTANCE.getTurnout_NotConnected();

		/**
		 * The meta object literal for the '<em><b>Rectangle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURNOUT__RECTANGLE = eINSTANCE.getTurnout_Rectangle();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.kv.model.railroadmodel.impl.DimensionImpl <em>Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.kv.model.railroadmodel.impl.DimensionImpl
		 * @see hu.bme.mit.kv.model.railroadmodel.impl.ModelPackageImpl#getDimension()
		 * @generated
		 */
		EClass DIMENSION = eINSTANCE.getDimension();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION__WIDTH = eINSTANCE.getDimension_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION__HEIGHT = eINSTANCE.getDimension_Height();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.kv.model.railroadmodel.impl.RailEndPointImpl <em>Rail End Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.kv.model.railroadmodel.impl.RailEndPointImpl
		 * @see hu.bme.mit.kv.model.railroadmodel.impl.ModelPackageImpl#getRailEndPoint()
		 * @generated
		 */
		EClass RAIL_END_POINT = eINSTANCE.getRailEndPoint();

		/**
		 * The meta object literal for the '<em><b>Next Section</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAIL_END_POINT__NEXT_SECTION = eINSTANCE.getRailEndPoint_NextSection();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.kv.model.railroadmodel.impl.RailPointImpl <em>Rail Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.kv.model.railroadmodel.impl.RailPointImpl
		 * @see hu.bme.mit.kv.model.railroadmodel.impl.ModelPackageImpl#getRailPoint()
		 * @generated
		 */
		EClass RAIL_POINT = eINSTANCE.getRailPoint();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAIL_POINT__POSITION = eINSTANCE.getRailPoint_Position();

		/**
		 * The meta object literal for the '<em><b>Neighbours</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAIL_POINT__NEIGHBOURS = eINSTANCE.getRailPoint_Neighbours();

	}

} //ModelPackage
