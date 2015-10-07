/**
 */
package hu.bme.mit.kv.railrloadmodel.railroadmodel.impl;

import hu.bme.mit.kv.railrloadmodel.railroadmodel.Configuration;
import hu.bme.mit.kv.railrloadmodel.railroadmodel.ModelPackage;
import hu.bme.mit.kv.railrloadmodel.railroadmodel.Section;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.ConfigurationImpl#getDisabled <em>Disabled</em>}</li>
 *   <li>{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.ConfigurationImpl#getEnabled <em>Enabled</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationImpl extends MinimalEObjectImpl.Container implements Configuration {
	/**
	 * The cached value of the '{@link #getDisabled() <em>Disabled</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisabled()
	 * @generated
	 * @ordered
	 */
	protected Section disabled;

	/**
	 * The cached value of the '{@link #getEnabled() <em>Enabled</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabled()
	 * @generated
	 * @ordered
	 */
	protected Section enabled;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Section getDisabled() {
		if (disabled != null && disabled.eIsProxy()) {
			InternalEObject oldDisabled = (InternalEObject)disabled;
			disabled = (Section)eResolveProxy(oldDisabled);
			if (disabled != oldDisabled) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.CONFIGURATION__DISABLED, oldDisabled, disabled));
			}
		}
		return disabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Section basicGetDisabled() {
		return disabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisabled(Section newDisabled) {
		Section oldDisabled = disabled;
		disabled = newDisabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CONFIGURATION__DISABLED, oldDisabled, disabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Section getEnabled() {
		if (enabled != null && enabled.eIsProxy()) {
			InternalEObject oldEnabled = (InternalEObject)enabled;
			enabled = (Section)eResolveProxy(oldEnabled);
			if (enabled != oldEnabled) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.CONFIGURATION__ENABLED, oldEnabled, enabled));
			}
		}
		return enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Section basicGetEnabled() {
		return enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabled(Section newEnabled) {
		Section oldEnabled = enabled;
		enabled = newEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CONFIGURATION__ENABLED, oldEnabled, enabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.CONFIGURATION__DISABLED:
				if (resolve) return getDisabled();
				return basicGetDisabled();
			case ModelPackage.CONFIGURATION__ENABLED:
				if (resolve) return getEnabled();
				return basicGetEnabled();
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
			case ModelPackage.CONFIGURATION__DISABLED:
				setDisabled((Section)newValue);
				return;
			case ModelPackage.CONFIGURATION__ENABLED:
				setEnabled((Section)newValue);
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
			case ModelPackage.CONFIGURATION__DISABLED:
				setDisabled((Section)null);
				return;
			case ModelPackage.CONFIGURATION__ENABLED:
				setEnabled((Section)null);
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
			case ModelPackage.CONFIGURATION__DISABLED:
				return disabled != null;
			case ModelPackage.CONFIGURATION__ENABLED:
				return enabled != null;
		}
		return super.eIsSet(featureID);
	}

} //ConfigurationImpl
