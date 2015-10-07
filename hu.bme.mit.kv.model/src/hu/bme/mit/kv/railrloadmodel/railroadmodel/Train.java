/**
 */
package hu.bme.mit.kv.railrloadmodel.railroadmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Train</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.Train#getPreviouslyOn <em>Previously On</em>}</li>
 *   <li>{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.Train#getCurrentlyOn <em>Currently On</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.ModelPackage#getTrain()
 * @model
 * @generated
 */
public interface Train extends EObject {
	/**
	 * Returns the value of the '<em><b>Previously On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previously On</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previously On</em>' reference.
	 * @see #setPreviouslyOn(Trackable)
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.ModelPackage#getTrain_PreviouslyOn()
	 * @model
	 * @generated
	 */
	Trackable getPreviouslyOn();

	/**
	 * Sets the value of the '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.Train#getPreviouslyOn <em>Previously On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previously On</em>' reference.
	 * @see #getPreviouslyOn()
	 * @generated
	 */
	void setPreviouslyOn(Trackable value);

	/**
	 * Returns the value of the '<em><b>Currently On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currently On</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currently On</em>' reference.
	 * @see #setCurrentlyOn(Trackable)
	 * @see hu.bme.mit.kv.railrloadmodel.railroadmodel.ModelPackage#getTrain_CurrentlyOn()
	 * @model
	 * @generated
	 */
	Trackable getCurrentlyOn();

	/**
	 * Sets the value of the '{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.Train#getCurrentlyOn <em>Currently On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currently On</em>' reference.
	 * @see #getCurrentlyOn()
	 * @generated
	 */
	void setCurrentlyOn(Trackable value);

} // Train
