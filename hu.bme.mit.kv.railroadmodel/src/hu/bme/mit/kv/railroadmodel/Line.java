/**
 */
package hu.bme.mit.kv.railroadmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.kv.railroadmodel.Line#getStart <em>Start</em>}</li>
 *   <li>{@link hu.bme.mit.kv.railroadmodel.Line#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.kv.railroadmodel.RailroadModelPackage#getLine()
 * @model
 * @generated
 */
public interface Line extends EObject {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(Point)
	 * @see hu.bme.mit.kv.railroadmodel.RailroadModelPackage#getLine_Start()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Point getStart();

	/**
	 * Sets the value of the '{@link hu.bme.mit.kv.railroadmodel.Line#getStart <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Point value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(Point)
	 * @see hu.bme.mit.kv.railroadmodel.RailroadModelPackage#getLine_End()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Point getEnd();

	/**
	 * Sets the value of the '{@link hu.bme.mit.kv.railroadmodel.Line#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Point value);

} // Line
