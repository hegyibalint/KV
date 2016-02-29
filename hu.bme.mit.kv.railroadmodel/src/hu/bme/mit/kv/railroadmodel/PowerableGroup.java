/**
 */
package hu.bme.mit.kv.railroadmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Powerable Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.kv.railroadmodel.PowerableGroup#isPowered <em>Powered</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.kv.railroadmodel.RailroadModelPackage#getPowerableGroup()
 * @model
 * @generated
 */
public interface PowerableGroup extends Group {
	/**
	 * Returns the value of the '<em><b>Powered</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Powered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Powered</em>' attribute.
	 * @see #setPowered(boolean)
	 * @see hu.bme.mit.kv.railroadmodel.RailroadModelPackage#getPowerableGroup_Powered()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isPowered();

	/**
	 * Sets the value of the '{@link hu.bme.mit.kv.railroadmodel.PowerableGroup#isPowered <em>Powered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Powered</em>' attribute.
	 * @see #isPowered()
	 * @generated
	 */
	void setPowered(boolean value);

} // PowerableGroup
