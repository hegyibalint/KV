/**
 */
package hu.bme.mit.kv.railroadmodel.impl;

import hu.bme.mit.kv.railroadmodel.RailRoadModel;
import hu.bme.mit.kv.railroadmodel.RailroadModelPackage;
import hu.bme.mit.kv.railroadmodel.SectionModel;
import hu.bme.mit.kv.railroadmodel.TrainModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rail Road Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.kv.railroadmodel.impl.RailRoadModelImpl#getSectionModel <em>Section Model</em>}</li>
 *   <li>{@link hu.bme.mit.kv.railroadmodel.impl.RailRoadModelImpl#getTrainModel <em>Train Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RailRoadModelImpl extends MinimalEObjectImpl.Container implements RailRoadModel {
	/**
	 * The cached value of the '{@link #getSectionModel() <em>Section Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectionModel()
	 * @generated
	 * @ordered
	 */
	protected SectionModel sectionModel;

	/**
	 * The cached value of the '{@link #getTrainModel() <em>Train Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainModel()
	 * @generated
	 * @ordered
	 */
	protected TrainModel trainModel;

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
		return RailroadModelPackage.Literals.RAIL_ROAD_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SectionModel getSectionModel() {
		return sectionModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSectionModel(SectionModel newSectionModel, NotificationChain msgs) {
		SectionModel oldSectionModel = sectionModel;
		sectionModel = newSectionModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RailroadModelPackage.RAIL_ROAD_MODEL__SECTION_MODEL, oldSectionModel, newSectionModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSectionModel(SectionModel newSectionModel) {
		if (newSectionModel != sectionModel) {
			NotificationChain msgs = null;
			if (sectionModel != null)
				msgs = ((InternalEObject)sectionModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RailroadModelPackage.RAIL_ROAD_MODEL__SECTION_MODEL, null, msgs);
			if (newSectionModel != null)
				msgs = ((InternalEObject)newSectionModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RailroadModelPackage.RAIL_ROAD_MODEL__SECTION_MODEL, null, msgs);
			msgs = basicSetSectionModel(newSectionModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RailroadModelPackage.RAIL_ROAD_MODEL__SECTION_MODEL, newSectionModel, newSectionModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainModel getTrainModel() {
		return trainModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrainModel(TrainModel newTrainModel, NotificationChain msgs) {
		TrainModel oldTrainModel = trainModel;
		trainModel = newTrainModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RailroadModelPackage.RAIL_ROAD_MODEL__TRAIN_MODEL, oldTrainModel, newTrainModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrainModel(TrainModel newTrainModel) {
		if (newTrainModel != trainModel) {
			NotificationChain msgs = null;
			if (trainModel != null)
				msgs = ((InternalEObject)trainModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RailroadModelPackage.RAIL_ROAD_MODEL__TRAIN_MODEL, null, msgs);
			if (newTrainModel != null)
				msgs = ((InternalEObject)newTrainModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RailroadModelPackage.RAIL_ROAD_MODEL__TRAIN_MODEL, null, msgs);
			msgs = basicSetTrainModel(newTrainModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RailroadModelPackage.RAIL_ROAD_MODEL__TRAIN_MODEL, newTrainModel, newTrainModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RailroadModelPackage.RAIL_ROAD_MODEL__SECTION_MODEL:
				return basicSetSectionModel(null, msgs);
			case RailroadModelPackage.RAIL_ROAD_MODEL__TRAIN_MODEL:
				return basicSetTrainModel(null, msgs);
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
			case RailroadModelPackage.RAIL_ROAD_MODEL__SECTION_MODEL:
				return getSectionModel();
			case RailroadModelPackage.RAIL_ROAD_MODEL__TRAIN_MODEL:
				return getTrainModel();
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
			case RailroadModelPackage.RAIL_ROAD_MODEL__SECTION_MODEL:
				setSectionModel((SectionModel)newValue);
				return;
			case RailroadModelPackage.RAIL_ROAD_MODEL__TRAIN_MODEL:
				setTrainModel((TrainModel)newValue);
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
			case RailroadModelPackage.RAIL_ROAD_MODEL__SECTION_MODEL:
				setSectionModel((SectionModel)null);
				return;
			case RailroadModelPackage.RAIL_ROAD_MODEL__TRAIN_MODEL:
				setTrainModel((TrainModel)null);
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
			case RailroadModelPackage.RAIL_ROAD_MODEL__SECTION_MODEL:
				return sectionModel != null;
			case RailroadModelPackage.RAIL_ROAD_MODEL__TRAIN_MODEL:
				return trainModel != null;
		}
		return super.eIsSet(featureID);
	}

} //RailRoadModelImpl
