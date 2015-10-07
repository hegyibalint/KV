/**
 */
package hu.bme.mit.kv.railrloadmodel.railroadmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trackable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.Trackable#getNeighbours <em>Neighbours</em>}</li>
 *   <li>{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.Trackable#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.ModelPackage#getTrackable()
 * @model abstract="true"
 * @generated
 */
public interface Trackable extends EObject {
	/**
	 * Returns the value of the '<em><b>Neighbours</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.kv.railrloadmodel.railroadmodel.Trackable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Neighbours</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neighbours</em>' reference list.
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.ModelPackage#getTrackable_Neighbours()
	 * @model upper="2"
	 * @generated
	 */
	EList<Trackable> getNeighbours();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.ModelPackage#getTrackable_Id()
	 * @model default="" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.Trackable#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Trackable
