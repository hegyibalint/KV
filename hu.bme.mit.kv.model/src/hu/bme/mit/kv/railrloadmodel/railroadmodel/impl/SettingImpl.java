/**
 */
package hu.bme.mit.kv.railrloadmodel.railroadmodel.impl;

import hu.bme.mit.kv.railrloadmodel.railroadmodel.DivergentConfiguration;
import hu.bme.mit.kv.railrloadmodel.railroadmodel.ModelPackage;
import hu.bme.mit.kv.railrloadmodel.railroadmodel.Setting;
import hu.bme.mit.kv.railrloadmodel.railroadmodel.StraightConfiguration;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Setting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.SettingImpl#getStraightconfiguration <em>Straightconfiguration</em>}</li>
 *   <li>{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.SettingImpl#getDivergentconfiguration <em>Divergentconfiguration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SettingImpl extends MinimalEObjectImpl.Container implements Setting {
	/**
	 * The cached value of the '{@link #getStraightconfiguration() <em>Straightconfiguration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStraightconfiguration()
	 * @generated
	 * @ordered
	 */
	protected EList<StraightConfiguration> straightconfiguration;

	/**
	 * The cached value of the '{@link #getDivergentconfiguration() <em>Divergentconfiguration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDivergentconfiguration()
	 * @generated
	 * @ordered
	 */
	protected EList<DivergentConfiguration> divergentconfiguration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SettingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.SETTING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StraightConfiguration> getStraightconfiguration() {
		if (straightconfiguration == null) {
			straightconfiguration = new EObjectContainmentEList<StraightConfiguration>(StraightConfiguration.class, this, ModelPackage.SETTING__STRAIGHTCONFIGURATION);
		}
		return straightconfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DivergentConfiguration> getDivergentconfiguration() {
		if (divergentconfiguration == null) {
			divergentconfiguration = new EObjectContainmentEList<DivergentConfiguration>(DivergentConfiguration.class, this, ModelPackage.SETTING__DIVERGENTCONFIGURATION);
		}
		return divergentconfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.SETTING__STRAIGHTCONFIGURATION:
				return ((InternalEList<?>)getStraightconfiguration()).basicRemove(otherEnd, msgs);
			case ModelPackage.SETTING__DIVERGENTCONFIGURATION:
				return ((InternalEList<?>)getDivergentconfiguration()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.SETTING__STRAIGHTCONFIGURATION:
				return getStraightconfiguration();
			case ModelPackage.SETTING__DIVERGENTCONFIGURATION:
				return getDivergentconfiguration();
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
			case ModelPackage.SETTING__STRAIGHTCONFIGURATION:
				getStraightconfiguration().clear();
				getStraightconfiguration().addAll((Collection<? extends StraightConfiguration>)newValue);
				return;
			case ModelPackage.SETTING__DIVERGENTCONFIGURATION:
				getDivergentconfiguration().clear();
				getDivergentconfiguration().addAll((Collection<? extends DivergentConfiguration>)newValue);
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
			case ModelPackage.SETTING__STRAIGHTCONFIGURATION:
				getStraightconfiguration().clear();
				return;
			case ModelPackage.SETTING__DIVERGENTCONFIGURATION:
				getDivergentconfiguration().clear();
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
			case ModelPackage.SETTING__STRAIGHTCONFIGURATION:
				return straightconfiguration != null && !straightconfiguration.isEmpty();
			case ModelPackage.SETTING__DIVERGENTCONFIGURATION:
				return divergentconfiguration != null && !divergentconfiguration.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SettingImpl
