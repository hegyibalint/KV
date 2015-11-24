/**
 */
package hu.bme.mit.kv.railroadmodel.impl;

import hu.bme.mit.kv.railroadmodel.PowerableGroup;
import hu.bme.mit.kv.railroadmodel.RailroadModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Powerable Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.kv.railroadmodel.impl.PowerableGroupImpl#isPowered <em>Powered</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PowerableGroupImpl extends GroupImpl implements PowerableGroup {
	/**
	 * The default value of the '{@link #isPowered() <em>Powered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPowered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean POWERED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isPowered() <em>Powered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPowered()
	 * @generated
	 * @ordered
	 */
	protected boolean powered = POWERED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PowerableGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RailroadModelPackage.Literals.POWERABLE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPowered() {
		return powered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPowered(boolean newPowered) {
		boolean oldPowered = powered;
		powered = newPowered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RailroadModelPackage.POWERABLE_GROUP__POWERED, oldPowered, powered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RailroadModelPackage.POWERABLE_GROUP__POWERED:
				return isPowered();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RailroadModelPackage.POWERABLE_GROUP__POWERED:
				setPowered((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RailroadModelPackage.POWERABLE_GROUP__POWERED:
				setPowered(POWERED_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RailroadModelPackage.POWERABLE_GROUP__POWERED:
				return powered != POWERED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (powered: ");
		result.append(powered);
		result.append(')');
		return result.toString();
	}

} //PowerableGroupImpl
