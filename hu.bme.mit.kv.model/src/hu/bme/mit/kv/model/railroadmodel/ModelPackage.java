/**
 */
package hu.bme.mit.kv.model.railroadmodel;

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
	 * The feature id for the '<em><b>Currently On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__CURRENTLY_ON = 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__X = 1;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__Y = 2;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__Z = 3;

	/**
	 * The feature id for the '<em><b>Going Clockwise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__GOING_CLOCKWISE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__ID = 5;

	/**
	 * The number of structural features of the '<em>Train</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Train</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.kv.model.railroadmodel.impl.SectionImpl <em>Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.kv.model.railroadmodel.impl.SectionImpl
	 * @see hu.bme.mit.kv.model.railroadmodel.impl.ModelPackageImpl#getSection()
	 * @generated
	 */
	int SECTION = 2;

	/**
	 * The feature id for the '<em><b>Clockwise</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__CLOCKWISE = 0;

	/**
	 * The feature id for the '<em><b>Counter Clockwise</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__COUNTER_CLOCKWISE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__ID = 2;

	/**
	 * The feature id for the '<em><b>Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__POINTS = 3;

	/**
	 * The number of structural features of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.kv.model.railroadmodel.impl.TurnoutImpl <em>Turnout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.kv.model.railroadmodel.impl.TurnoutImpl
	 * @see hu.bme.mit.kv.model.railroadmodel.impl.ModelPackageImpl#getTurnout()
	 * @generated
	 */
	int TURNOUT = 3;

	/**
	 * The feature id for the '<em><b>Clockwise</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT__CLOCKWISE = SECTION__CLOCKWISE;

	/**
	 * The feature id for the '<em><b>Counter Clockwise</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT__COUNTER_CLOCKWISE = SECTION__COUNTER_CLOCKWISE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT__ID = SECTION__ID;

	/**
	 * The feature id for the '<em><b>Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT__POINTS = SECTION__POINTS;

	/**
	 * The feature id for the '<em><b>Not Connected Section</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT__NOT_CONNECTED_SECTION = SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Two Sections In Clockwise Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT__TWO_SECTIONS_IN_CLOCKWISE_DIRECTION = SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Turnout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT_FEATURE_COUNT = SECTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Turnout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT_OPERATION_COUNT = SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.kv.model.railroadmodel.impl.TurnImpl <em>Turn</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.kv.model.railroadmodel.impl.TurnImpl
	 * @see hu.bme.mit.kv.model.railroadmodel.impl.ModelPackageImpl#getTurn()
	 * @generated
	 */
	int TURN = 4;

	/**
	 * The feature id for the '<em><b>Clockwise</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN__CLOCKWISE = SECTION__CLOCKWISE;

	/**
	 * The feature id for the '<em><b>Counter Clockwise</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN__COUNTER_CLOCKWISE = SECTION__COUNTER_CLOCKWISE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN__ID = SECTION__ID;

	/**
	 * The feature id for the '<em><b>Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN__POINTS = SECTION__POINTS;

	/**
	 * The number of structural features of the '<em>Turn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_FEATURE_COUNT = SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Turn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_OPERATION_COUNT = SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.kv.model.railroadmodel.impl.PointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.kv.model.railroadmodel.impl.PointImpl
	 * @see hu.bme.mit.kv.model.railroadmodel.impl.ModelPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 5;

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
	 * The meta object id for the '{@link hu.bme.mit.kv.model.railroadmodel.impl.SectionModelImpl <em>Section Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.kv.model.railroadmodel.impl.SectionModelImpl
	 * @see hu.bme.mit.kv.model.railroadmodel.impl.ModelPackageImpl#getSectionModel()
	 * @generated
	 */
	int SECTION_MODEL = 6;

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
	 * Returns the meta object for the attribute '{@link hu.bme.mit.kv.model.railroadmodel.Train#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see hu.bme.mit.kv.model.railroadmodel.Train#getZ()
	 * @see #getTrain()
	 * @generated
	 */
	EAttribute getTrain_Z();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.kv.model.railroadmodel.Train#isGoingClockwise <em>Going Clockwise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Going Clockwise</em>'.
	 * @see hu.bme.mit.kv.model.railroadmodel.Train#isGoingClockwise()
	 * @see #getTrain()
	 * @generated
	 */
	EAttribute getTrain_GoingClockwise();

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
	 * Returns the meta object for class '{@link hu.bme.mit.kv.model.railroadmodel.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section</em>'.
	 * @see hu.bme.mit.kv.model.railroadmodel.Section
	 * @generated
	 */
	EClass getSection();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.kv.model.railroadmodel.Section#getClockwise <em>Clockwise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clockwise</em>'.
	 * @see hu.bme.mit.kv.model.railroadmodel.Section#getClockwise()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Clockwise();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.kv.model.railroadmodel.Section#getCounterClockwise <em>Counter Clockwise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Counter Clockwise</em>'.
	 * @see hu.bme.mit.kv.model.railroadmodel.Section#getCounterClockwise()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_CounterClockwise();

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
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.kv.model.railroadmodel.Section#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Points</em>'.
	 * @see hu.bme.mit.kv.model.railroadmodel.Section#getPoints()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Points();

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
	 * Returns the meta object for the reference '{@link hu.bme.mit.kv.model.railroadmodel.Turnout#getNotConnectedSection <em>Not Connected Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Not Connected Section</em>'.
	 * @see hu.bme.mit.kv.model.railroadmodel.Turnout#getNotConnectedSection()
	 * @see #getTurnout()
	 * @generated
	 */
	EReference getTurnout_NotConnectedSection();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.kv.model.railroadmodel.Turnout#isTwoSectionsInClockwiseDirection <em>Two Sections In Clockwise Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Two Sections In Clockwise Direction</em>'.
	 * @see hu.bme.mit.kv.model.railroadmodel.Turnout#isTwoSectionsInClockwiseDirection()
	 * @see #getTurnout()
	 * @generated
	 */
	EAttribute getTurnout_TwoSectionsInClockwiseDirection();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.kv.model.railroadmodel.Turn <em>Turn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn</em>'.
	 * @see hu.bme.mit.kv.model.railroadmodel.Turn
	 * @generated
	 */
	EClass getTurn();

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
		 * The meta object literal for the '<em><b>Currently On</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN__CURRENTLY_ON = eINSTANCE.getTrain_CurrentlyOn();

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
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN__Z = eINSTANCE.getTrain_Z();

		/**
		 * The meta object literal for the '<em><b>Going Clockwise</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN__GOING_CLOCKWISE = eINSTANCE.getTrain_GoingClockwise();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN__ID = eINSTANCE.getTrain_Id();

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
		 * The meta object literal for the '<em><b>Clockwise</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__CLOCKWISE = eINSTANCE.getSection_Clockwise();

		/**
		 * The meta object literal for the '<em><b>Counter Clockwise</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__COUNTER_CLOCKWISE = eINSTANCE.getSection_CounterClockwise();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION__ID = eINSTANCE.getSection_Id();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__POINTS = eINSTANCE.getSection_Points();

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
		 * The meta object literal for the '<em><b>Not Connected Section</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURNOUT__NOT_CONNECTED_SECTION = eINSTANCE.getTurnout_NotConnectedSection();

		/**
		 * The meta object literal for the '<em><b>Two Sections In Clockwise Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURNOUT__TWO_SECTIONS_IN_CLOCKWISE_DIRECTION = eINSTANCE.getTurnout_TwoSectionsInClockwiseDirection();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.kv.model.railroadmodel.impl.TurnImpl <em>Turn</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.kv.model.railroadmodel.impl.TurnImpl
		 * @see hu.bme.mit.kv.model.railroadmodel.impl.ModelPackageImpl#getTurn()
		 * @generated
		 */
		EClass TURN = eINSTANCE.getTurn();

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

	}

} //ModelPackage
