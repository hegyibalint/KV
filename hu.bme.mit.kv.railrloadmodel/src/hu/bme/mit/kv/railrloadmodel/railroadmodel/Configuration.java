/**
 */
package hu.bme.mit.kv.railrloadmodel.railroadmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.Configuration#getDisabled <em>Disabled</em>}</li>
 *   <li>{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.Configuration#getEnabled <em>Enabled</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.ModelPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends EObject {
	/**
	 * Returns the value of the '<em><b>Disabled</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disabled</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disabled</em>' reference.
	 * @see #setDisabled(Section)
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.ModelPackage#getConfiguration_Disabled()
	 * @model required="true"
	 * @generated
	 */
	Section getDisabled();

	/**
	 * Sets the value of the '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.Configuration#getDisabled <em>Disabled</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disabled</em>' reference.
	 * @see #getDisabled()
	 * @generated
	 */
	void setDisabled(Section value);

	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabled</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled</em>' reference.
	 * @see #setEnabled(Section)
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.ModelPackage#getConfiguration_Enabled()
	 * @model required="true"
	 * @generated
	 */
	Section getEnabled();

	/**
	 * Sets the value of the '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.Configuration#getEnabled <em>Enabled</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' reference.
	 * @see #getEnabled()
	 * @generated
	 */
	void setEnabled(Section value);

} // Configuration
