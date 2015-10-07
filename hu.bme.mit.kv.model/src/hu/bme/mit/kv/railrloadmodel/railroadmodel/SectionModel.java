/**
 */
package hu.bme.mit.kv.railrloadmodel.railroadmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Section Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.SectionModel#getPowerables <em>Powerables</em>}</li>
 *   <li>{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.SectionModel#getTrackables <em>Trackables</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.ModelPackage#getSectionModel()
 * @model
 * @generated
 */
public interface SectionModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Powerables</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.kv.railrloadmodel.railroadmodel.Powerable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Powerables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Powerables</em>' containment reference list.
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.ModelPackage#getSectionModel_Powerables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Powerable> getPowerables();

	/**
	 * Returns the value of the '<em><b>Trackables</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.kv.railrloadmodel.railroadmodel.Trackable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trackables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trackables</em>' containment reference list.
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.ModelPackage#getSectionModel_Trackables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Trackable> getTrackables();

} // SectionModel
