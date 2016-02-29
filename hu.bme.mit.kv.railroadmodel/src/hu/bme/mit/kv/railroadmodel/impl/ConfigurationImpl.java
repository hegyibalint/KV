/**
 */
package hu.bme.mit.kv.railroadmodel.impl;

import hu.bme.mit.kv.railroadmodel.Configuration;
import hu.bme.mit.kv.railroadmodel.PowerableGroup;
import hu.bme.mit.kv.railroadmodel.RailroadModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.kv.railroadmodel.impl.ConfigurationImpl#getEnabled <em>Enabled</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ConfigurationImpl extends MinimalEObjectImpl.Container implements Configuration {
	/**
	 * The cached value of the '{@link #getEnabled() <em>Enabled</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabled()
	 * @generated
	 * @ordered
	 */
	protected EList<PowerableGroup> enabled;

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
		return RailroadModelPackage.Literals.CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PowerableGroup> getEnabled() {
		if (enabled == null) {
			enabled = new EObjectResolvingEList<PowerableGroup>(PowerableGroup.class, this, RailroadModelPackage.CONFIGURATION__ENABLED);
		}
		return enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RailroadModelPackage.CONFIGURATION__ENABLED:
				return getEnabled();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RailroadModelPackage.CONFIGURATION__ENABLED:
				getEnabled().clear();
				getEnabled().addAll((Collection<? extends PowerableGroup>)newValue);
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
			case RailroadModelPackage.CONFIGURATION__ENABLED:
				getEnabled().clear();
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
			case RailroadModelPackage.CONFIGURATION__ENABLED:
				return enabled != null && !enabled.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConfigurationImpl
