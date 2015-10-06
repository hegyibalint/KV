/**
 */
package hu.bme.mit.kv.model.railroadmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Turnout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.kv.model.railroadmodel.Turnout#getConnected <em>Connected</em>}</li>
 *   <li>{@link hu.bme.mit.kv.model.railroadmodel.Turnout#getNotConnected <em>Not Connected</em>}</li>
 *   <li>{@link hu.bme.mit.kv.model.railroadmodel.Turnout#getRectangle <em>Rectangle</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.kv.model.railroadmodel.ModelPackage#getTurnout()
 * @model
 * @generated
 */
public interface Turnout extends Section {
	/**
	 * Returns the value of the '<em><b>Connected</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.kv.model.railroadmodel.Section}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected</em>' reference list.
	 * @see hu.bme.mit.kv.model.railroadmodel.ModelPackage#getTurnout_Connected()
	 * @model lower="2" upper="2"
	 * @generated
	 */
	EList<Section> getConnected();

	/**
	 * Returns the value of the '<em><b>Not Connected</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.kv.model.railroadmodel.Section}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Not Connected</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Connected</em>' reference list.
	 * @see hu.bme.mit.kv.model.railroadmodel.ModelPackage#getTurnout_NotConnected()
	 * @model required="true"
	 * @generated
	 */
	EList<Section> getNotConnected();

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
	 * @see hu.bme.mit.kv.model.railroadmodel.ModelPackage#getTurnout_Rectangle()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Rectangle getRectangle();

	/**
	 * Sets the value of the '{@link hu.bme.mit.kv.model.railroadmodel.Turnout#getRectangle <em>Rectangle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rectangle</em>' containment reference.
	 * @see #getRectangle()
	 * @generated
	 */
	void setRectangle(Rectangle value);

} // Turnout
