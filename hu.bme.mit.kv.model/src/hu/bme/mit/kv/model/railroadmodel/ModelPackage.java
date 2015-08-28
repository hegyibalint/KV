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
	 * The meta object id for the '{@link hu.bme.mit.kv.model.railroadmodel.impl.RailRoadModelImpl <em>Rail Road Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.kv.model.railroadmodel.impl.RailRoadModelImpl
	 * @see hu.bme.mit.kv.model.railroadmodel.impl.ModelPackageImpl#getRailRoadModel()
	 * @generated
	 */
	int RAIL_ROAD_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Trains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIL_ROAD_MODEL__TRAINS = 0;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIL_ROAD_MODEL__SECTIONS = 1;

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
	 * The number of structural features of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEATURE_COUNT = 3;

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
	 * Returns the meta object for class '{@link hu.bme.mit.kv.model.railroadmodel.RailRoadModel <em>Rail Road Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rail Road Model</em>'.
	 * @see hu.bme.mit.kv.model.railroadmodel.RailRoadModel
	 * @generated
	 */
	EClass getRailRoadModel();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.kv.model.railroadmodel.RailRoadModel#getTrains <em>Trains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trains</em>'.
	 * @see hu.bme.mit.kv.model.railroadmodel.RailRoadModel#getTrains()
	 * @see #getRailRoadModel()
	 * @generated
	 */
	EReference getRailRoadModel_Trains();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.kv.model.railroadmodel.RailRoadModel#getSections <em>Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sections</em>'.
	 * @see hu.bme.mit.kv.model.railroadmodel.RailRoadModel#getSections()
	 * @see #getRailRoadModel()
	 * @generated
	 */
	EReference getRailRoadModel_Sections();

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
		 * The meta object literal for the '{@link hu.bme.mit.kv.model.railroadmodel.impl.RailRoadModelImpl <em>Rail Road Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.kv.model.railroadmodel.impl.RailRoadModelImpl
		 * @see hu.bme.mit.kv.model.railroadmodel.impl.ModelPackageImpl#getRailRoadModel()
		 * @generated
		 */
		EClass RAIL_ROAD_MODEL = eINSTANCE.getRailRoadModel();

		/**
		 * The meta object literal for the '<em><b>Trains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAIL_ROAD_MODEL__TRAINS = eINSTANCE.getRailRoadModel_Trains();

		/**
		 * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAIL_ROAD_MODEL__SECTIONS = eINSTANCE.getRailRoadModel_Sections();

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

	}

} //ModelPackage
