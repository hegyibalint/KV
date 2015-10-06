/**
 */
package hu.bme.mit.kv.model.railroadmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.kv.model.railroadmodel.Section#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.kv.model.railroadmodel.ModelPackage#getSection()
 * @model abstract="true"
 * @generated
 */
public interface Section extends EObject {
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
	 * @see hu.bme.mit.kv.model.railroadmodel.ModelPackage#getSection_Id()
	 * @model default="0" id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link hu.bme.mit.kv.model.railroadmodel.Section#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

} // Section
