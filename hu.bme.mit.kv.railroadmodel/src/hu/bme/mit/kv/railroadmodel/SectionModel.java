/**
 */
package hu.bme.mit.kv.railroadmodel;

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
 *   <li>{@link hu.bme.mit.kv.railroadmodel.SectionModel#getGroups <em>Groups</em>}</li>
 *   <li>{@link hu.bme.mit.kv.railroadmodel.SectionModel#getTrackables <em>Trackables</em>}</li>
 *   <li>{@link hu.bme.mit.kv.railroadmodel.SectionModel#getSettings <em>Settings</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.kv.railroadmodel.RailroadModelPackage#getSectionModel()
 * @model
 * @generated
 */
public interface SectionModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.kv.railroadmodel.Group}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see hu.bme.mit.kv.railroadmodel.RailroadModelPackage#getSectionModel_Groups()
	 * @model containment="true"
	 * @generated
	 */
	EList<Group> getGroups();

	/**
	 * Returns the value of the '<em><b>Trackables</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.kv.railroadmodel.Region}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trackables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trackables</em>' containment reference list.
	 * @see hu.bme.mit.kv.railroadmodel.RailroadModelPackage#getSectionModel_Trackables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Region> getTrackables();

	/**
	 * Returns the value of the '<em><b>Settings</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.kv.railroadmodel.SwitchSetting}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Settings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Settings</em>' containment reference list.
	 * @see hu.bme.mit.kv.railroadmodel.RailroadModelPackage#getSectionModel_Settings()
	 * @model containment="true"
	 * @generated
	 */
	EList<SwitchSetting> getSettings();

} // SectionModel
