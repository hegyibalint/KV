/**
 */
package hu.bme.mit.kv.railroadmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Setting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.kv.railroadmodel.SwitchSetting#getStraightconfiguration <em>Straightconfiguration</em>}</li>
 *   <li>{@link hu.bme.mit.kv.railroadmodel.SwitchSetting#getDivergentconfiguration <em>Divergentconfiguration</em>}</li>
 *   <li>{@link hu.bme.mit.kv.railroadmodel.SwitchSetting#getPhysicalID <em>Physical ID</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.kv.railroadmodel.RailroadModelPackage#getSwitchSetting()
 * @model
 * @generated
 */
public interface SwitchSetting extends EObject {
	/**
	 * Returns the value of the '<em><b>Straightconfiguration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Straightconfiguration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Straightconfiguration</em>' containment reference.
	 * @see #setStraightconfiguration(StraightConfiguration)
	 * @see hu.bme.mit.kv.railroadmodel.RailroadModelPackage#getSwitchSetting_Straightconfiguration()
	 * @model containment="true" required="true"
	 * @generated
	 */
	StraightConfiguration getStraightconfiguration();

	/**
	 * Sets the value of the '{@link hu.bme.mit.kv.railroadmodel.SwitchSetting#getStraightconfiguration <em>Straightconfiguration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Straightconfiguration</em>' containment reference.
	 * @see #getStraightconfiguration()
	 * @generated
	 */
	void setStraightconfiguration(StraightConfiguration value);

	/**
	 * Returns the value of the '<em><b>Divergentconfiguration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Divergentconfiguration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Divergentconfiguration</em>' containment reference.
	 * @see #setDivergentconfiguration(DivergentConfiguration)
	 * @see hu.bme.mit.kv.railroadmodel.RailroadModelPackage#getSwitchSetting_Divergentconfiguration()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DivergentConfiguration getDivergentconfiguration();

	/**
	 * Sets the value of the '{@link hu.bme.mit.kv.railroadmodel.SwitchSetting#getDivergentconfiguration <em>Divergentconfiguration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Divergentconfiguration</em>' containment reference.
	 * @see #getDivergentconfiguration()
	 * @generated
	 */
	void setDivergentconfiguration(DivergentConfiguration value);

	/**
	 * Returns the value of the '<em><b>Physical ID</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physical ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical ID</em>' attribute.
	 * @see #setPhysicalID(int)
	 * @see hu.bme.mit.kv.railroadmodel.RailroadModelPackage#getSwitchSetting_PhysicalID()
	 * @model default="0"
	 * @generated
	 */
	int getPhysicalID();

	/**
	 * Sets the value of the '{@link hu.bme.mit.kv.railroadmodel.SwitchSetting#getPhysicalID <em>Physical ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical ID</em>' attribute.
	 * @see #getPhysicalID()
	 * @generated
	 */
	void setPhysicalID(int value);

} // SwitchSetting
