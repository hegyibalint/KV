/**
 */
package hu.bme.mit.kv.model.railroadmodel.impl;

import hu.bme.mit.kv.model.railroadmodel.ModelPackage;
import hu.bme.mit.kv.model.railroadmodel.RailRoadModel;
import hu.bme.mit.kv.model.railroadmodel.Section;
import hu.bme.mit.kv.model.railroadmodel.Train;

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
 * An implementation of the model object '<em><b>Rail Road Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.kv.model.railroadmodel.impl.RailRoadModelImpl#getTrains <em>Trains</em>}</li>
 *   <li>{@link hu.bme.mit.kv.model.railroadmodel.impl.RailRoadModelImpl#getSections <em>Sections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RailRoadModelImpl extends MinimalEObjectImpl.Container implements RailRoadModel {
	/**
	 * The cached value of the '{@link #getTrains() <em>Trains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrains()
	 * @generated
	 * @ordered
	 */
	protected EList<Train> trains;

	/**
	 * The cached value of the '{@link #getSections() <em>Sections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSections()
	 * @generated
	 * @ordered
	 */
	protected EList<Section> sections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RailRoadModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.RAIL_ROAD_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Train> getTrains() {
		if (trains == null) {
			trains = new EObjectContainmentEList<Train>(Train.class, this, ModelPackage.RAIL_ROAD_MODEL__TRAINS);
		}
		return trains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Section> getSections() {
		if (sections == null) {
			sections = new EObjectContainmentEList<Section>(Section.class, this, ModelPackage.RAIL_ROAD_MODEL__SECTIONS);
		}
		return sections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.RAIL_ROAD_MODEL__TRAINS:
				return ((InternalEList<?>)getTrains()).basicRemove(otherEnd, msgs);
			case ModelPackage.RAIL_ROAD_MODEL__SECTIONS:
				return ((InternalEList<?>)getSections()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.RAIL_ROAD_MODEL__TRAINS:
				return getTrains();
			case ModelPackage.RAIL_ROAD_MODEL__SECTIONS:
				return getSections();
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
			case ModelPackage.RAIL_ROAD_MODEL__TRAINS:
				getTrains().clear();
				getTrains().addAll((Collection<? extends Train>)newValue);
				return;
			case ModelPackage.RAIL_ROAD_MODEL__SECTIONS:
				getSections().clear();
				getSections().addAll((Collection<? extends Section>)newValue);
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
			case ModelPackage.RAIL_ROAD_MODEL__TRAINS:
				getTrains().clear();
				return;
			case ModelPackage.RAIL_ROAD_MODEL__SECTIONS:
				getSections().clear();
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
			case ModelPackage.RAIL_ROAD_MODEL__TRAINS:
				return trains != null && !trains.isEmpty();
			case ModelPackage.RAIL_ROAD_MODEL__SECTIONS:
				return sections != null && !sections.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RailRoadModelImpl
