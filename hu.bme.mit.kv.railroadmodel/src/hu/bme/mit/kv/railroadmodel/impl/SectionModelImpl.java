/**
 */
package hu.bme.mit.kv.railroadmodel.impl;

import hu.bme.mit.kv.railroadmodel.Group;
import hu.bme.mit.kv.railroadmodel.RailroadModelPackage;
import hu.bme.mit.kv.railroadmodel.Region;
import hu.bme.mit.kv.railroadmodel.SectionModel;
import hu.bme.mit.kv.railroadmodel.SwitchSetting;

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
 * An implementation of the model object '<em><b>Section Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.kv.railroadmodel.impl.SectionModelImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link hu.bme.mit.kv.railroadmodel.impl.SectionModelImpl#getTrackables <em>Trackables</em>}</li>
 *   <li>{@link hu.bme.mit.kv.railroadmodel.impl.SectionModelImpl#getSettings <em>Settings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SectionModelImpl extends MinimalEObjectImpl.Container implements SectionModel {
	/**
	 * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<Group> groups;

	/**
	 * The cached value of the '{@link #getTrackables() <em>Trackables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrackables()
	 * @generated
	 * @ordered
	 */
	protected EList<Region> trackables;

	/**
	 * The cached value of the '{@link #getSettings() <em>Settings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettings()
	 * @generated
	 * @ordered
	 */
	protected EList<SwitchSetting> settings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SectionModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RailroadModelPackage.Literals.SECTION_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Group> getGroups() {
		if (groups == null) {
			groups = new EObjectContainmentEList<Group>(Group.class, this, RailroadModelPackage.SECTION_MODEL__GROUPS);
		}
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Region> getTrackables() {
		if (trackables == null) {
			trackables = new EObjectContainmentEList<Region>(Region.class, this, RailroadModelPackage.SECTION_MODEL__TRACKABLES);
		}
		return trackables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SwitchSetting> getSettings() {
		if (settings == null) {
			settings = new EObjectContainmentEList<SwitchSetting>(SwitchSetting.class, this, RailroadModelPackage.SECTION_MODEL__SETTINGS);
		}
		return settings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RailroadModelPackage.SECTION_MODEL__GROUPS:
				return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
			case RailroadModelPackage.SECTION_MODEL__TRACKABLES:
				return ((InternalEList<?>)getTrackables()).basicRemove(otherEnd, msgs);
			case RailroadModelPackage.SECTION_MODEL__SETTINGS:
				return ((InternalEList<?>)getSettings()).basicRemove(otherEnd, msgs);
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
			case RailroadModelPackage.SECTION_MODEL__GROUPS:
				return getGroups();
			case RailroadModelPackage.SECTION_MODEL__TRACKABLES:
				return getTrackables();
			case RailroadModelPackage.SECTION_MODEL__SETTINGS:
				return getSettings();
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
			case RailroadModelPackage.SECTION_MODEL__GROUPS:
				getGroups().clear();
				getGroups().addAll((Collection<? extends Group>)newValue);
				return;
			case RailroadModelPackage.SECTION_MODEL__TRACKABLES:
				getTrackables().clear();
				getTrackables().addAll((Collection<? extends Region>)newValue);
				return;
			case RailroadModelPackage.SECTION_MODEL__SETTINGS:
				getSettings().clear();
				getSettings().addAll((Collection<? extends SwitchSetting>)newValue);
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
			case RailroadModelPackage.SECTION_MODEL__GROUPS:
				getGroups().clear();
				return;
			case RailroadModelPackage.SECTION_MODEL__TRACKABLES:
				getTrackables().clear();
				return;
			case RailroadModelPackage.SECTION_MODEL__SETTINGS:
				getSettings().clear();
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
			case RailroadModelPackage.SECTION_MODEL__GROUPS:
				return groups != null && !groups.isEmpty();
			case RailroadModelPackage.SECTION_MODEL__TRACKABLES:
				return trackables != null && !trackables.isEmpty();
			case RailroadModelPackage.SECTION_MODEL__SETTINGS:
				return settings != null && !settings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SectionModelImpl
