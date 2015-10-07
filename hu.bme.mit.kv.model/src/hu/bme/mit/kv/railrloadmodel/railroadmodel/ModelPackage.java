/**
 */
package hu.bme.mit.kv.railrloadmodel.railroadmodel;

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
 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.ModelFactory
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
	ModelPackage eINSTANCE = hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.TrackableImpl <em>Trackable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.TrackableImpl
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.ModelPackageImpl#getTrackable()
	 * @generated
	 */
	int TRACKABLE = 0;

	/**
	 * The feature id for the '<em><b>Neighbours</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKABLE__NEIGHBOURS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKABLE__ID = 1;

	/**
	 * The number of structural features of the '<em>Trackable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Trackable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.SectionImpl <em>Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.SectionImpl
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.ModelPackageImpl#getSection()
	 * @generated
	 */
	int SECTION = 1;

	/**
	 * The feature id for the '<em><b>Neighbours</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__NEIGHBOURS = TRACKABLE__NEIGHBOURS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__ID = TRACKABLE__ID;

	/**
	 * The feature id for the '<em><b>Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__LINE = TRACKABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEATURE_COUNT = TRACKABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_OPERATION_COUNT = TRACKABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.SwitchImpl <em>Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.SwitchImpl
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.ModelPackageImpl#getSwitch()
	 * @generated
	 */
	int SWITCH = 2;

	/**
	 * The feature id for the '<em><b>Neighbours</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__NEIGHBOURS = TRACKABLE__NEIGHBOURS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__ID = TRACKABLE__ID;

	/**
	 * The feature id for the '<em><b>Rectangle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__RECTANGLE = TRACKABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_FEATURE_COUNT = TRACKABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_OPERATION_COUNT = TRACKABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.TrainImpl <em>Train</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.TrainImpl
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.ModelPackageImpl#getTrain()
	 * @generated
	 */
	int TRAIN = 3;

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
	 * The number of structural features of the '<em>Train</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Train</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.PowerableImpl <em>Powerable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.PowerableImpl
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.ModelPackageImpl#getPowerable()
	 * @generated
	 */
	int POWERABLE = 4;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWERABLE__SECTIONS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWERABLE__ID = 1;

	/**
	 * The number of structural features of the '<em>Powerable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWERABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Powerable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWERABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.SectionModelImpl <em>Section Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.SectionModelImpl
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.ModelPackageImpl#getSectionModel()
	 * @generated
	 */
	int SECTION_MODEL = 5;

	/**
	 * The feature id for the '<em><b>Powerables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_MODEL__POWERABLES = 0;

	/**
	 * The feature id for the '<em><b>Trackables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_MODEL__TRACKABLES = 1;

	/**
	 * The number of structural features of the '<em>Section Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Section Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.TrainModelImpl <em>Train Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.TrainModelImpl
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.ModelPackageImpl#getTrainModel()
	 * @generated
	 */
	int TRAIN_MODEL = 6;

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
	 * The meta object id for the '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.LineImpl <em>Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.LineImpl
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.ModelPackageImpl#getLine()
	 * @generated
	 */
	int LINE = 7;

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
	 * The meta object id for the '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.RectangleImpl <em>Rectangle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.RectangleImpl
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.ModelPackageImpl#getRectangle()
	 * @generated
	 */
	int RECTANGLE = 8;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__ORIGIN = 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__SIZE = 1;

	/**
	 * The feature id for the '<em><b>Inverse Matrix</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__INVERSE_MATRIX = 2;

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
	 * The meta object id for the '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.PointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.PointImpl
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.ModelPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 9;

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
	 * The meta object id for the '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.DimensionImpl <em>Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.DimensionImpl
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.ModelPackageImpl#getDimension()
	 * @generated
	 */
	int DIMENSION = 10;

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
	 * Returns the meta object for class '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.Trackable <em>Trackable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trackable</em>'.
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.Trackable
	 * @generated
	 */
	EClass getTrackable();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.Trackable#getNeighbours <em>Neighbours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Neighbours</em>'.
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.Trackable#getNeighbours()
	 * @see #getTrackable()
	 * @generated
	 */
	EReference getTrackable_Neighbours();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.Trackable#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.Trackable#getId()
	 * @see #getTrackable()
	 * @generated
	 */
	EAttribute getTrackable_Id();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section</em>'.
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.Section
	 * @generated
	 */
	EClass getSection();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.Section#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Line</em>'.
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.Section#getLine()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Line();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.Switch <em>Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch</em>'.
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.Switch
	 * @generated
	 */
	EClass getSwitch();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.Switch#getRectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rectangle</em>'.
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.Switch#getRectangle()
	 * @see #getSwitch()
	 * @generated
	 */
	EReference getSwitch_Rectangle();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.Train <em>Train</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Train</em>'.
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.Train
	 * @generated
	 */
	EClass getTrain();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.Train#getPreviouslyOn <em>Previously On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previously On</em>'.
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.Train#getPreviouslyOn()
	 * @see #getTrain()
	 * @generated
	 */
	EReference getTrain_PreviouslyOn();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.Train#getCurrentlyOn <em>Currently On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Currently On</em>'.
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.Train#getCurrentlyOn()
	 * @see #getTrain()
	 * @generated
	 */
	EReference getTrain_CurrentlyOn();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.Powerable <em>Powerable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Powerable</em>'.
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.Powerable
	 * @generated
	 */
	EClass getPowerable();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.Powerable#getSections <em>Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sections</em>'.
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.Powerable#getSections()
	 * @see #getPowerable()
	 * @generated
	 */
	EReference getPowerable_Sections();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.Powerable#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.Powerable#getId()
	 * @see #getPowerable()
	 * @generated
	 */
	EAttribute getPowerable_Id();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.SectionModel <em>Section Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section Model</em>'.
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.SectionModel
	 * @generated
	 */
	EClass getSectionModel();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.SectionModel#getPowerables <em>Powerables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Powerables</em>'.
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.SectionModel#getPowerables()
	 * @see #getSectionModel()
	 * @generated
	 */
	EReference getSectionModel_Powerables();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.SectionModel#getTrackables <em>Trackables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trackables</em>'.
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.SectionModel#getTrackables()
	 * @see #getSectionModel()
	 * @generated
	 */
	EReference getSectionModel_Trackables();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.TrainModel <em>Train Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Train Model</em>'.
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.TrainModel
	 * @generated
	 */
	EClass getTrainModel();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.TrainModel#getTrains <em>Trains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trains</em>'.
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.TrainModel#getTrains()
	 * @see #getTrainModel()
	 * @generated
	 */
	EReference getTrainModel_Trains();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line</em>'.
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.Line
	 * @generated
	 */
	EClass getLine();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.Line#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start</em>'.
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.Line#getStart()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_Start();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.Line#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End</em>'.
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.Line#getEnd()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_End();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.Rectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rectangle</em>'.
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.Rectangle
	 * @generated
	 */
	EClass getRectangle();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.Rectangle#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Origin</em>'.
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.Rectangle#getOrigin()
	 * @see #getRectangle()
	 * @generated
	 */
	EReference getRectangle_Origin();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.Rectangle#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size</em>'.
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.Rectangle#getSize()
	 * @see #getRectangle()
	 * @generated
	 */
	EReference getRectangle_Size();

	/**
	 * Returns the meta object for the attribute list '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.Rectangle#getInverseMatrix <em>Inverse Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Inverse Matrix</em>'.
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.Rectangle#getInverseMatrix()
	 * @see #getRectangle()
	 * @generated
	 */
	EAttribute getRectangle_InverseMatrix();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.Rectangle#isPointInside(hu.bme.mit.kv.railrloadmodel.railroadmodel.Point) <em>Is Point Inside</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Point Inside</em>' operation.
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.Rectangle#isPointInside(hu.bme.mit.kv.railrloadmodel.railroadmodel.Point)
	 * @generated
	 */
	EOperation getRectangle__IsPointInside__Point();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point</em>'.
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.Point
	 * @generated
	 */
	EClass getPoint();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.Point#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.Point#getX()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_X();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.Point#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.Point#getY()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_Y();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.Point#distanceFrom(hu.bme.mit.kv.railrloadmodel.railroadmodel.Point) <em>Distance From</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Distance From</em>' operation.
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.Point#distanceFrom(hu.bme.mit.kv.railrloadmodel.railroadmodel.Point)
	 * @generated
	 */
	EOperation getPoint__DistanceFrom__Point();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.Dimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension</em>'.
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.Dimension
	 * @generated
	 */
	EClass getDimension();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.Dimension#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.Dimension#getWidth()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_Width();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.Dimension#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.Dimension#getHeight()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_Height();

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
		 * The meta object literal for the '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.TrackableImpl <em>Trackable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.TrackableImpl
		 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.ModelPackageImpl#getTrackable()
		 * @generated
		 */
		EClass TRACKABLE = eINSTANCE.getTrackable();

		/**
		 * The meta object literal for the '<em><b>Neighbours</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACKABLE__NEIGHBOURS = eINSTANCE.getTrackable_Neighbours();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACKABLE__ID = eINSTANCE.getTrackable_Id();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.SectionImpl <em>Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.SectionImpl
		 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.ModelPackageImpl#getSection()
		 * @generated
		 */
		EClass SECTION = eINSTANCE.getSection();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__LINE = eINSTANCE.getSection_Line();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.SwitchImpl <em>Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.SwitchImpl
		 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.ModelPackageImpl#getSwitch()
		 * @generated
		 */
		EClass SWITCH = eINSTANCE.getSwitch();

		/**
		 * The meta object literal for the '<em><b>Rectangle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH__RECTANGLE = eINSTANCE.getSwitch_Rectangle();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.TrainImpl <em>Train</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.TrainImpl
		 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.ModelPackageImpl#getTrain()
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
		 * The meta object literal for the '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.PowerableImpl <em>Powerable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.PowerableImpl
		 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.ModelPackageImpl#getPowerable()
		 * @generated
		 */
		EClass POWERABLE = eINSTANCE.getPowerable();

		/**
		 * The meta object literal for the '<em><b>Sections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWERABLE__SECTIONS = eINSTANCE.getPowerable_Sections();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POWERABLE__ID = eINSTANCE.getPowerable_Id();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.SectionModelImpl <em>Section Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.SectionModelImpl
		 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.ModelPackageImpl#getSectionModel()
		 * @generated
		 */
		EClass SECTION_MODEL = eINSTANCE.getSectionModel();

		/**
		 * The meta object literal for the '<em><b>Powerables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION_MODEL__POWERABLES = eINSTANCE.getSectionModel_Powerables();

		/**
		 * The meta object literal for the '<em><b>Trackables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION_MODEL__TRACKABLES = eINSTANCE.getSectionModel_Trackables();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.TrainModelImpl <em>Train Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.TrainModelImpl
		 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.ModelPackageImpl#getTrainModel()
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
		 * The meta object literal for the '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.LineImpl <em>Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.LineImpl
		 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.ModelPackageImpl#getLine()
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
		 * The meta object literal for the '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.RectangleImpl <em>Rectangle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.RectangleImpl
		 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.ModelPackageImpl#getRectangle()
		 * @generated
		 */
		EClass RECTANGLE = eINSTANCE.getRectangle();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECTANGLE__ORIGIN = eINSTANCE.getRectangle_Origin();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECTANGLE__SIZE = eINSTANCE.getRectangle_Size();

		/**
		 * The meta object literal for the '<em><b>Inverse Matrix</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGLE__INVERSE_MATRIX = eINSTANCE.getRectangle_InverseMatrix();

		/**
		 * The meta object literal for the '<em><b>Is Point Inside</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RECTANGLE___IS_POINT_INSIDE__POINT = eINSTANCE.getRectangle__IsPointInside__Point();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.PointImpl <em>Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.PointImpl
		 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.ModelPackageImpl#getPoint()
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
		 * The meta object literal for the '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.DimensionImpl <em>Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.DimensionImpl
		 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.ModelPackageImpl#getDimension()
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

	}

} //ModelPackage
