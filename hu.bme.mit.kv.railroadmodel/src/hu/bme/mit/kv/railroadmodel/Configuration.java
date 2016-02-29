/**
 */
package hu.bme.mit.kv.railroadmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.kv.railroadmodel.Configuration#getEnabled <em>Enabled</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.kv.railroadmodel.RailroadModelPackage#getConfiguration()
 * @model abstract="true"
 * @generated
 */
public interface Configuration extends EObject {
	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.kv.railroadmodel.PowerableGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabled</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled</em>' reference list.
	 * @see hu.bme.mit.kv.railroadmodel.RailroadModelPackage#getConfiguration_Enabled()
	 * @model lower="2" upper="2"
	 * @generated
	 */
	EList<PowerableGroup> getEnabled();

} // Configuration
