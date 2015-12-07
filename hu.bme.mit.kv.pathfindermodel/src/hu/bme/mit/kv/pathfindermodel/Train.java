/**
 */
package hu.bme.mit.kv.pathfindermodel;

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
 *   <li>{@link hu.bme.mit.kv.pathfindermodel.Train#getCurrentlyOn <em>Currently On</em>}</li>
 *   <li>{@link hu.bme.mit.kv.pathfindermodel.Train#getId <em>Id</em>}</li>
 *   <li>{@link hu.bme.mit.kv.pathfindermodel.Train#getGoal <em>Goal</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.kv.pathfindermodel.PathfindermodelPackage#getTrain()
 * @model
 * @generated
 */
public interface Train extends EObject {
	/**
	 * Returns the value of the '<em><b>Currently On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currently On</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currently On</em>' reference.
	 * @see #setCurrentlyOn(Section)
	 * @see hu.bme.mit.kv.pathfindermodel.PathfindermodelPackage#getTrain_CurrentlyOn()
	 * @model required="true"
	 * @generated
	 */
	Section getCurrentlyOn();

	/**
	 * Sets the value of the '{@link hu.bme.mit.kv.pathfindermodel.Train#getCurrentlyOn <em>Currently On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currently On</em>' reference.
	 * @see #getCurrentlyOn()
	 * @generated
	 */
	void setCurrentlyOn(Section value);

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
	 * @see hu.bme.mit.kv.pathfindermodel.PathfindermodelPackage#getTrain_Id()
	 * @model default="0" id="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link hu.bme.mit.kv.pathfindermodel.Train#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Goal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal</em>' reference.
	 * @see #setGoal(Section)
	 * @see hu.bme.mit.kv.pathfindermodel.PathfindermodelPackage#getTrain_Goal()
	 * @model required="true"
	 * @generated
	 */
	Section getGoal();

	/**
	 * Sets the value of the '{@link hu.bme.mit.kv.pathfindermodel.Train#getGoal <em>Goal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal</em>' reference.
	 * @see #getGoal()
	 * @generated
	 */
	void setGoal(Section value);

} // Train
