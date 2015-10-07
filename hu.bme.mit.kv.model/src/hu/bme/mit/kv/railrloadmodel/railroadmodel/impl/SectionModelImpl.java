/**
 */
package hu.bme.mit.kv.railrloadmodel.railroadmodel.impl;

import hu.bme.mit.kv.railrloadmodel.railroadmodel.ModelPackage;
import hu.bme.mit.kv.railrloadmodel.railroadmodel.Powerable;
import hu.bme.mit.kv.railrloadmodel.railroadmodel.SectionModel;
import hu.bme.mit.kv.railrloadmodel.railroadmodel.Trackable;

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
 *   <li>{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.SectionModelImpl#getPowerables <em>Powerables</em>}</li>
 *   <li>{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.SectionModelImpl#getTrackables <em>Trackables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SectionModelImpl extends MinimalEObjectImpl.Container implements SectionModel {
	/**
	 * The cached value of the '{@link #getPowerables() <em>Powerables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerables()
	 * @generated
	 * @ordered
	 */
	protected EList<Powerable> powerables;

	/**
	 * The cached value of the '{@link #getTrackables() <em>Trackables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrackables()
	 * @generated
	 * @ordered
	 */
	protected EList<Trackable> trackables;

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
		return ModelPackage.Literals.SECTION_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Powerable> getPowerables() {
		if (powerables == null) {
			powerables = new EObjectContainmentEList<Powerable>(Powerable.class, this, ModelPackage.SECTION_MODEL__POWERABLES);
		}
		return powerables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trackable> getTrackables() {
		if (trackables == null) {
			trackables = new EObjectContainmentEList<Trackable>(Trackable.class, this, ModelPackage.SECTION_MODEL__TRACKABLES);
		}
		return trackables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.SECTION_MODEL__POWERABLES:
				return ((InternalEList<?>)getPowerables()).basicRemove(otherEnd, msgs);
			case ModelPackage.SECTION_MODEL__TRACKABLES:
				return ((InternalEList<?>)getTrackables()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.SECTION_MODEL__POWERABLES:
				return getPowerables();
			case ModelPackage.SECTION_MODEL__TRACKABLES:
				return getTrackables();
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
			case ModelPackage.SECTION_MODEL__POWERABLES:
				getPowerables().clear();
				getPowerables().addAll((Collection<? extends Powerable>)newValue);
				return;
			case ModelPackage.SECTION_MODEL__TRACKABLES:
				getTrackables().clear();
				getTrackables().addAll((Collection<? extends Trackable>)newValue);
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
			case ModelPackage.SECTION_MODEL__POWERABLES:
				getPowerables().clear();
				return;
			case ModelPackage.SECTION_MODEL__TRACKABLES:
				getTrackables().clear();
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
			case ModelPackage.SECTION_MODEL__POWERABLES:
				return powerables != null && !powerables.isEmpty();
			case ModelPackage.SECTION_MODEL__TRACKABLES:
				return trackables != null && !trackables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SectionModelImpl
