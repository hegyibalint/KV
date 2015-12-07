/**
 */
package hu.bme.mit.kv.pathfindermodel;

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
 * @see hu.bme.mit.kv.pathfindermodel.PathfindermodelFactory
 * @model kind="package"
 * @generated
 */
public interface PathfindermodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pathfindermodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://hu.bme.mit.kv.pathfindermodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pathfindermodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PathfindermodelPackage eINSTANCE = hu.bme.mit.kv.pathfindermodel.impl.PathfindermodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.bme.mit.kv.pathfindermodel.impl.PathFinderModelImpl <em>Path Finder Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.kv.pathfindermodel.impl.PathFinderModelImpl
	 * @see hu.bme.mit.kv.pathfindermodel.impl.PathfindermodelPackageImpl#getPathFinderModel()
	 * @generated
	 */
	int PATH_FINDER_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_FINDER_MODEL__SECTIONS = 0;

	/**
	 * The feature id for the '<em><b>Trains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_FINDER_MODEL__TRAINS = 1;

	/**
	 * The number of structural features of the '<em>Path Finder Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_FINDER_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Path Finder Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_FINDER_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.kv.pathfindermodel.impl.SectionImpl <em>Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.kv.pathfindermodel.impl.SectionImpl
	 * @see hu.bme.mit.kv.pathfindermodel.impl.PathfindermodelPackageImpl#getSection()
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
	int SECTION__NEIGHBOURS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__ID = 1;

	/**
	 * The number of structural features of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.kv.pathfindermodel.impl.RailImpl <em>Rail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.kv.pathfindermodel.impl.RailImpl
	 * @see hu.bme.mit.kv.pathfindermodel.impl.PathfindermodelPackageImpl#getRail()
	 * @generated
	 */
	int RAIL = 2;

	/**
	 * The feature id for the '<em><b>Neighbours</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIL__NEIGHBOURS = SECTION__NEIGHBOURS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIL__ID = SECTION__ID;

	/**
	 * The number of structural features of the '<em>Rail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIL_FEATURE_COUNT = SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIL_OPERATION_COUNT = SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.kv.pathfindermodel.impl.SwitchImpl <em>Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.kv.pathfindermodel.impl.SwitchImpl
	 * @see hu.bme.mit.kv.pathfindermodel.impl.PathfindermodelPackageImpl#getSwitch()
	 * @generated
	 */
	int SWITCH = 3;

	/**
	 * The feature id for the '<em><b>Neighbours</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__NEIGHBOURS = SECTION__NEIGHBOURS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__ID = SECTION__ID;

	/**
	 * The number of structural features of the '<em>Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_FEATURE_COUNT = SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_OPERATION_COUNT = SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.kv.pathfindermodel.impl.TrainImpl <em>Train</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.kv.pathfindermodel.impl.TrainImpl
	 * @see hu.bme.mit.kv.pathfindermodel.impl.PathfindermodelPackageImpl#getTrain()
	 * @generated
	 */
	int TRAIN = 4;

	/**
	 * The feature id for the '<em><b>Currently On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__CURRENTLY_ON = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__ID = 1;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__GOAL = 2;

	/**
	 * The number of structural features of the '<em>Train</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Train</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link hu.bme.mit.kv.pathfindermodel.PathFinderModel <em>Path Finder Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Finder Model</em>'.
	 * @see hu.bme.mit.kv.pathfindermodel.PathFinderModel
	 * @generated
	 */
	EClass getPathFinderModel();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.kv.pathfindermodel.PathFinderModel#getSections <em>Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sections</em>'.
	 * @see hu.bme.mit.kv.pathfindermodel.PathFinderModel#getSections()
	 * @see #getPathFinderModel()
	 * @generated
	 */
	EReference getPathFinderModel_Sections();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.kv.pathfindermodel.PathFinderModel#getTrains <em>Trains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trains</em>'.
	 * @see hu.bme.mit.kv.pathfindermodel.PathFinderModel#getTrains()
	 * @see #getPathFinderModel()
	 * @generated
	 */
	EReference getPathFinderModel_Trains();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.kv.pathfindermodel.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section</em>'.
	 * @see hu.bme.mit.kv.pathfindermodel.Section
	 * @generated
	 */
	EClass getSection();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.kv.pathfindermodel.Section#getNeighbours <em>Neighbours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Neighbours</em>'.
	 * @see hu.bme.mit.kv.pathfindermodel.Section#getNeighbours()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Neighbours();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.kv.pathfindermodel.Section#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see hu.bme.mit.kv.pathfindermodel.Section#getId()
	 * @see #getSection()
	 * @generated
	 */
	EAttribute getSection_Id();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.kv.pathfindermodel.Rail <em>Rail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rail</em>'.
	 * @see hu.bme.mit.kv.pathfindermodel.Rail
	 * @generated
	 */
	EClass getRail();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.kv.pathfindermodel.Switch <em>Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch</em>'.
	 * @see hu.bme.mit.kv.pathfindermodel.Switch
	 * @generated
	 */
	EClass getSwitch();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.kv.pathfindermodel.Train <em>Train</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Train</em>'.
	 * @see hu.bme.mit.kv.pathfindermodel.Train
	 * @generated
	 */
	EClass getTrain();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.kv.pathfindermodel.Train#getCurrentlyOn <em>Currently On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Currently On</em>'.
	 * @see hu.bme.mit.kv.pathfindermodel.Train#getCurrentlyOn()
	 * @see #getTrain()
	 * @generated
	 */
	EReference getTrain_CurrentlyOn();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.kv.pathfindermodel.Train#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see hu.bme.mit.kv.pathfindermodel.Train#getId()
	 * @see #getTrain()
	 * @generated
	 */
	EAttribute getTrain_Id();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.kv.pathfindermodel.Train#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Goal</em>'.
	 * @see hu.bme.mit.kv.pathfindermodel.Train#getGoal()
	 * @see #getTrain()
	 * @generated
	 */
	EReference getTrain_Goal();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PathfindermodelFactory getPathfindermodelFactory();

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
		 * The meta object literal for the '{@link hu.bme.mit.kv.pathfindermodel.impl.PathFinderModelImpl <em>Path Finder Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.kv.pathfindermodel.impl.PathFinderModelImpl
		 * @see hu.bme.mit.kv.pathfindermodel.impl.PathfindermodelPackageImpl#getPathFinderModel()
		 * @generated
		 */
		EClass PATH_FINDER_MODEL = eINSTANCE.getPathFinderModel();

		/**
		 * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_FINDER_MODEL__SECTIONS = eINSTANCE.getPathFinderModel_Sections();

		/**
		 * The meta object literal for the '<em><b>Trains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_FINDER_MODEL__TRAINS = eINSTANCE.getPathFinderModel_Trains();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.kv.pathfindermodel.impl.SectionImpl <em>Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.kv.pathfindermodel.impl.SectionImpl
		 * @see hu.bme.mit.kv.pathfindermodel.impl.PathfindermodelPackageImpl#getSection()
		 * @generated
		 */
		EClass SECTION = eINSTANCE.getSection();

		/**
		 * The meta object literal for the '<em><b>Neighbours</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__NEIGHBOURS = eINSTANCE.getSection_Neighbours();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION__ID = eINSTANCE.getSection_Id();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.kv.pathfindermodel.impl.RailImpl <em>Rail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.kv.pathfindermodel.impl.RailImpl
		 * @see hu.bme.mit.kv.pathfindermodel.impl.PathfindermodelPackageImpl#getRail()
		 * @generated
		 */
		EClass RAIL = eINSTANCE.getRail();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.kv.pathfindermodel.impl.SwitchImpl <em>Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.kv.pathfindermodel.impl.SwitchImpl
		 * @see hu.bme.mit.kv.pathfindermodel.impl.PathfindermodelPackageImpl#getSwitch()
		 * @generated
		 */
		EClass SWITCH = eINSTANCE.getSwitch();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.kv.pathfindermodel.impl.TrainImpl <em>Train</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.kv.pathfindermodel.impl.TrainImpl
		 * @see hu.bme.mit.kv.pathfindermodel.impl.PathfindermodelPackageImpl#getTrain()
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
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN__ID = eINSTANCE.getTrain_Id();

		/**
		 * The meta object literal for the '<em><b>Goal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN__GOAL = eINSTANCE.getTrain_Goal();

	}

} //PathfindermodelPackage
