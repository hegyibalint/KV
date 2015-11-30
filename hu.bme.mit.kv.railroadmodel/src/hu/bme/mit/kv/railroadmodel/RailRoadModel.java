/**
 */
package hu.bme.mit.kv.railroadmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rail Road Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.kv.railroadmodel.RailRoadModel#getSectionModel <em>Section Model</em>}</li>
 *   <li>{@link hu.bme.mit.kv.railroadmodel.RailRoadModel#getTrainModel <em>Train Model</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.kv.railroadmodel.RailroadModelPackage#getRailRoadModel()
 * @model
 * @generated
 */
public interface RailRoadModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Section Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Section Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section Model</em>' containment reference.
	 * @see #setSectionModel(SectionModel)
	 * @see hu.bme.mit.kv.railroadmodel.RailroadModelPackage#getRailRoadModel_SectionModel()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SectionModel getSectionModel();

	/**
	 * Sets the value of the '{@link hu.bme.mit.kv.railroadmodel.RailRoadModel#getSectionModel <em>Section Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Section Model</em>' containment reference.
	 * @see #getSectionModel()
	 * @generated
	 */
	void setSectionModel(SectionModel value);

	/**
	 * Returns the value of the '<em><b>Train Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Train Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Train Model</em>' containment reference.
	 * @see #setTrainModel(TrainModel)
	 * @see hu.bme.mit.kv.railroadmodel.RailroadModelPackage#getRailRoadModel_TrainModel()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TrainModel getTrainModel();

	/**
	 * Sets the value of the '{@link hu.bme.mit.kv.railroadmodel.RailRoadModel#getTrainModel <em>Train Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Train Model</em>' containment reference.
	 * @see #getTrainModel()
	 * @generated
	 */
	void setTrainModel(TrainModel value);

} // RailRoadModel
