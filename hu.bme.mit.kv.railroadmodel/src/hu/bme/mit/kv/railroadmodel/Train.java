/**
 */
package hu.bme.mit.kv.railroadmodel;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link hu.bme.mit.kv.railroadmodel.Train#getPreviouslyOn <em>Previously On</em>}</li>
 *   <li>{@link hu.bme.mit.kv.railroadmodel.Train#getCurrentlyOn <em>Currently On</em>}</li>
 *   <li>{@link hu.bme.mit.kv.railroadmodel.Train#getId <em>Id</em>}</li>
 *   <li>{@link hu.bme.mit.kv.railroadmodel.Train#getPosition <em>Position</em>}</li>
 *   <li>{@link hu.bme.mit.kv.railroadmodel.Train#getNextGroup <em>Next Group</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.kv.railroadmodel.RailroadModelPackage#getTrain()
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
	 * @see #setPreviouslyOn(Region)
	 * @see hu.bme.mit.kv.railroadmodel.RailroadModelPackage#getTrain_PreviouslyOn()
	 * @model
	 * @generated
	 */
	Region getPreviouslyOn();

	/**
	 * Sets the value of the '{@link hu.bme.mit.kv.railroadmodel.Train#getPreviouslyOn <em>Previously On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previously On</em>' reference.
	 * @see #getPreviouslyOn()
	 * @generated
	 */
	void setPreviouslyOn(Region value);

	/**
	 * Returns the value of the '<em><b>Currently On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currently On</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currently On</em>' reference.
	 * @see #setCurrentlyOn(Region)
	 * @see hu.bme.mit.kv.railroadmodel.RailroadModelPackage#getTrain_CurrentlyOn()
	 * @model
	 * @generated
	 */
	Region getCurrentlyOn();

	/**
	 * Sets the value of the '{@link hu.bme.mit.kv.railroadmodel.Train#getCurrentlyOn <em>Currently On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currently On</em>' reference.
	 * @see #getCurrentlyOn()
	 * @generated
	 */
	void setCurrentlyOn(Region value);

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
	 * @see hu.bme.mit.kv.railroadmodel.RailroadModelPackage#getTrain_Id()
	 * @model default="0"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link hu.bme.mit.kv.railroadmodel.Train#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(Point)
	 * @see hu.bme.mit.kv.railroadmodel.RailroadModelPackage#getTrain_Position()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Point getPosition();

	/**
	 * Sets the value of the '{@link hu.bme.mit.kv.railroadmodel.Train#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Point value);

	/**
	 * Returns the value of the '<em><b>Next Group</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.kv.railroadmodel.Group}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Group</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Group</em>' reference list.
	 * @see hu.bme.mit.kv.railroadmodel.RailroadModelPackage#getTrain_NextGroup()
	 * @model required="true" upper="2"
	 * @generated
	 */
	EList<Group> getNextGroup();

} // Train
