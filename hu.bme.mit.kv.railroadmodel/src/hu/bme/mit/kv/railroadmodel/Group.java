/**
 */
package hu.bme.mit.kv.railroadmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.kv.railroadmodel.Group#getId <em>Id</em>}</li>
 *   <li>{@link hu.bme.mit.kv.railroadmodel.Group#getRegions <em>Regions</em>}</li>
 *   <li>{@link hu.bme.mit.kv.railroadmodel.Group#isSafe <em>Safe</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.kv.railroadmodel.RailroadModelPackage#getGroup()
 * @model abstract="true"
 * @generated
 */
public interface Group extends EObject {
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
	 * @see hu.bme.mit.kv.railroadmodel.RailroadModelPackage#getGroup_Id()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link hu.bme.mit.kv.railroadmodel.Group#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Regions</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.kv.railroadmodel.Region}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regions</em>' reference list.
	 * @see hu.bme.mit.kv.railroadmodel.RailroadModelPackage#getGroup_Regions()
	 * @model required="true"
	 * @generated
	 */
	EList<Region> getRegions();

	/**
	 * Returns the value of the '<em><b>Safe</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Safe</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Safe</em>' attribute.
	 * @see #setSafe(boolean)
	 * @see hu.bme.mit.kv.railroadmodel.RailroadModelPackage#getGroup_Safe()
	 * @model default="false"
	 * @generated
	 */
	boolean isSafe();

	/**
	 * Sets the value of the '{@link hu.bme.mit.kv.railroadmodel.Group#isSafe <em>Safe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Safe</em>' attribute.
	 * @see #isSafe()
	 * @generated
	 */
	void setSafe(boolean value);

} // Group
