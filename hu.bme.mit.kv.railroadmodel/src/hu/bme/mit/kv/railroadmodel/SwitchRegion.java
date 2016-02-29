/**
 */
package hu.bme.mit.kv.railroadmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.kv.railroadmodel.SwitchRegion#getRectangle <em>Rectangle</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.kv.railroadmodel.RailroadModelPackage#getSwitchRegion()
 * @model
 * @generated
 */
public interface SwitchRegion extends Region {
	/**
	 * Returns the value of the '<em><b>Rectangle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rectangle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rectangle</em>' containment reference.
	 * @see #setRectangle(Rectangle)
	 * @see hu.bme.mit.kv.railroadmodel.RailroadModelPackage#getSwitchRegion_Rectangle()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Rectangle getRectangle();

	/**
	 * Sets the value of the '{@link hu.bme.mit.kv.railroadmodel.SwitchRegion#getRectangle <em>Rectangle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rectangle</em>' containment reference.
	 * @see #getRectangle()
	 * @generated
	 */
	void setRectangle(Rectangle value);

} // SwitchRegion
