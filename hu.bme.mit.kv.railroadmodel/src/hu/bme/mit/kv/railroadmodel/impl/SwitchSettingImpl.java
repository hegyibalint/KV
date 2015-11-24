/**
 */
package hu.bme.mit.kv.railroadmodel.impl;

import hu.bme.mit.kv.railroadmodel.DivergentConfiguration;
import hu.bme.mit.kv.railroadmodel.RailroadModelPackage;
import hu.bme.mit.kv.railroadmodel.StraightConfiguration;
import hu.bme.mit.kv.railroadmodel.SwitchSetting;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch Setting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.kv.railroadmodel.impl.SwitchSettingImpl#getStraightconfiguration <em>Straightconfiguration</em>}</li>
 *   <li>{@link hu.bme.mit.kv.railroadmodel.impl.SwitchSettingImpl#getDivergentconfiguration <em>Divergentconfiguration</em>}</li>
 *   <li>{@link hu.bme.mit.kv.railroadmodel.impl.SwitchSettingImpl#getPhysicalID <em>Physical ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwitchSettingImpl extends MinimalEObjectImpl.Container implements SwitchSetting {
	/**
	 * The cached value of the '{@link #getStraightconfiguration() <em>Straightconfiguration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStraightconfiguration()
	 * @generated
	 * @ordered
	 */
	protected StraightConfiguration straightconfiguration;

	/**
	 * The cached value of the '{@link #getDivergentconfiguration() <em>Divergentconfiguration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDivergentconfiguration()
	 * @generated
	 * @ordered
	 */
	protected DivergentConfiguration divergentconfiguration;

	/**
	 * The default value of the '{@link #getPhysicalID() <em>Physical ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalID()
	 * @generated
	 * @ordered
	 */
	protected static final int PHYSICAL_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPhysicalID() <em>Physical ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalID()
	 * @generated
	 * @ordered
	 */
	protected int physicalID = PHYSICAL_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwitchSettingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RailroadModelPackage.Literals.SWITCH_SETTING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StraightConfiguration getStraightconfiguration() {
		return straightconfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStraightconfiguration(StraightConfiguration newStraightconfiguration, NotificationChain msgs) {
		StraightConfiguration oldStraightconfiguration = straightconfiguration;
		straightconfiguration = newStraightconfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RailroadModelPackage.SWITCH_SETTING__STRAIGHTCONFIGURATION, oldStraightconfiguration, newStraightconfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStraightconfiguration(StraightConfiguration newStraightconfiguration) {
		if (newStraightconfiguration != straightconfiguration) {
			NotificationChain msgs = null;
			if (straightconfiguration != null)
				msgs = ((InternalEObject)straightconfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RailroadModelPackage.SWITCH_SETTING__STRAIGHTCONFIGURATION, null, msgs);
			if (newStraightconfiguration != null)
				msgs = ((InternalEObject)newStraightconfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RailroadModelPackage.SWITCH_SETTING__STRAIGHTCONFIGURATION, null, msgs);
			msgs = basicSetStraightconfiguration(newStraightconfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RailroadModelPackage.SWITCH_SETTING__STRAIGHTCONFIGURATION, newStraightconfiguration, newStraightconfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DivergentConfiguration getDivergentconfiguration() {
		return divergentconfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDivergentconfiguration(DivergentConfiguration newDivergentconfiguration, NotificationChain msgs) {
		DivergentConfiguration oldDivergentconfiguration = divergentconfiguration;
		divergentconfiguration = newDivergentconfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RailroadModelPackage.SWITCH_SETTING__DIVERGENTCONFIGURATION, oldDivergentconfiguration, newDivergentconfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDivergentconfiguration(DivergentConfiguration newDivergentconfiguration) {
		if (newDivergentconfiguration != divergentconfiguration) {
			NotificationChain msgs = null;
			if (divergentconfiguration != null)
				msgs = ((InternalEObject)divergentconfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RailroadModelPackage.SWITCH_SETTING__DIVERGENTCONFIGURATION, null, msgs);
			if (newDivergentconfiguration != null)
				msgs = ((InternalEObject)newDivergentconfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RailroadModelPackage.SWITCH_SETTING__DIVERGENTCONFIGURATION, null, msgs);
			msgs = basicSetDivergentconfiguration(newDivergentconfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RailroadModelPackage.SWITCH_SETTING__DIVERGENTCONFIGURATION, newDivergentconfiguration, newDivergentconfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPhysicalID() {
		return physicalID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysicalID(int newPhysicalID) {
		int oldPhysicalID = physicalID;
		physicalID = newPhysicalID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RailroadModelPackage.SWITCH_SETTING__PHYSICAL_ID, oldPhysicalID, physicalID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RailroadModelPackage.SWITCH_SETTING__STRAIGHTCONFIGURATION:
				return basicSetStraightconfiguration(null, msgs);
			case RailroadModelPackage.SWITCH_SETTING__DIVERGENTCONFIGURATION:
				return basicSetDivergentconfiguration(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RailroadModelPackage.SWITCH_SETTING__STRAIGHTCONFIGURATION:
				return getStraightconfiguration();
			case RailroadModelPackage.SWITCH_SETTING__DIVERGENTCONFIGURATION:
				return getDivergentconfiguration();
			case RailroadModelPackage.SWITCH_SETTING__PHYSICAL_ID:
				return getPhysicalID();
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
			case RailroadModelPackage.SWITCH_SETTING__STRAIGHTCONFIGURATION:
				setStraightconfiguration((StraightConfiguration)newValue);
				return;
			case RailroadModelPackage.SWITCH_SETTING__DIVERGENTCONFIGURATION:
				setDivergentconfiguration((DivergentConfiguration)newValue);
				return;
			case RailroadModelPackage.SWITCH_SETTING__PHYSICAL_ID:
				setPhysicalID((Integer)newValue);
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
			case RailroadModelPackage.SWITCH_SETTING__STRAIGHTCONFIGURATION:
				setStraightconfiguration((StraightConfiguration)null);
				return;
			case RailroadModelPackage.SWITCH_SETTING__DIVERGENTCONFIGURATION:
				setDivergentconfiguration((DivergentConfiguration)null);
				return;
			case RailroadModelPackage.SWITCH_SETTING__PHYSICAL_ID:
				setPhysicalID(PHYSICAL_ID_EDEFAULT);
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
			case RailroadModelPackage.SWITCH_SETTING__STRAIGHTCONFIGURATION:
				return straightconfiguration != null;
			case RailroadModelPackage.SWITCH_SETTING__DIVERGENTCONFIGURATION:
				return divergentconfiguration != null;
			case RailroadModelPackage.SWITCH_SETTING__PHYSICAL_ID:
				return physicalID != PHYSICAL_ID_EDEFAULT;
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
		result.append(" (physicalID: ");
		result.append(physicalID);
		result.append(')');
		return result.toString();
	}

} //SwitchSettingImpl
