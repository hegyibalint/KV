/**
 */
package hu.bme.mit.kv.railroadmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.kv.railroadmodel.SwitchGroup#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.kv.railroadmodel.RailroadModelPackage#getSwitchGroup()
 * @model
 * @generated
 */
public interface SwitchGroup extends Group {
	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' reference.
	 * @see #setConfiguration(Configuration)
	 * @see hu.bme.mit.kv.railroadmodel.RailroadModelPackage#getSwitchGroup_Configuration()
	 * @model required="true"
	 * @generated
	 */
	Configuration getConfiguration();

	/**
	 * Sets the value of the '{@link hu.bme.mit.kv.railroadmodel.SwitchGroup#getConfiguration <em>Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(Configuration value);

} // SwitchGroup
