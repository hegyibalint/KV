/**
 */
package hu.bme.mit.kv.railrloadmodel.railroadmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.Section#getLine <em>Line</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.ModelPackage#getSection()
 * @model
 * @generated
 */
public interface Section extends Trackable {
	/**
	 * Returns the value of the '<em><b>Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' containment reference.
	 * @see #setLine(Line)
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.ModelPackage#getSection_Line()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Line getLine();

	/**
	 * Sets the value of the '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.Section#getLine <em>Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line</em>' containment reference.
	 * @see #getLine()
	 * @generated
	 */
	void setLine(Line value);

} // Section
