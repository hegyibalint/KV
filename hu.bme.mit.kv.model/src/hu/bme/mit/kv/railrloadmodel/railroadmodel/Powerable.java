/**
 */
package hu.bme.mit.kv.railrloadmodel.railroadmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Powerable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.Powerable#getSections <em>Sections</em>}</li>
 *   <li>{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.Powerable#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.ModelPackage#getPowerable()
 * @model
 * @generated
 */
public interface Powerable extends EObject {
	/**
	 * Returns the value of the '<em><b>Sections</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.kv.railrloadmodel.railroadmodel.Section}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sections</em>' reference list.
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.ModelPackage#getPowerable_Sections()
	 * @model required="true"
	 * @generated
	 */
	EList<Section> getSections();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.ModelPackage#getPowerable_Id()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.Powerable#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

} // Powerable
