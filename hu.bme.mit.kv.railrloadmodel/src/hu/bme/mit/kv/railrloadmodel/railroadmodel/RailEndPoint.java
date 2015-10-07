/**
 */
package hu.bme.mit.kv.railrloadmodel.railroadmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rail End Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.RailEndPoint#getNextSection <em>Next Section</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.ModelPackage#getRailEndPoint()
 * @model
 * @generated
 */
public interface RailEndPoint extends RailPoint {
	/**
	 * Returns the value of the '<em><b>Next Section</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Section</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Section</em>' reference.
	 * @see #setNextSection(Section)
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.ModelPackage#getRailEndPoint_NextSection()
	 * @model
	 * @generated
	 */
	Section getNextSection();

	/**
	 * Sets the value of the '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.RailEndPoint#getNextSection <em>Next Section</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Section</em>' reference.
	 * @see #getNextSection()
	 * @generated
	 */
	void setNextSection(Section value);

} // RailEndPoint
