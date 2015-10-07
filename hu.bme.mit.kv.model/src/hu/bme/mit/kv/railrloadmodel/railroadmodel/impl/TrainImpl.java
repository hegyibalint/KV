/**
 */
package hu.bme.mit.kv.railrloadmodel.railroadmodel.impl;

import hu.bme.mit.kv.railrloadmodel.railroadmodel.ModelPackage;
import hu.bme.mit.kv.railrloadmodel.railroadmodel.Trackable;
import hu.bme.mit.kv.railrloadmodel.railroadmodel.Train;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Train</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.TrainImpl#getPreviouslyOn <em>Previously On</em>}</li>
 *   <li>{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.TrainImpl#getCurrentlyOn <em>Currently On</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrainImpl extends MinimalEObjectImpl.Container implements Train {
	/**
	 * The cached value of the '{@link #getPreviouslyOn() <em>Previously On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviouslyOn()
	 * @generated
	 * @ordered
	 */
	protected Trackable previouslyOn;

	/**
	 * The cached value of the '{@link #getCurrentlyOn() <em>Currently On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentlyOn()
	 * @generated
	 * @ordered
	 */
	protected Trackable currentlyOn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.TRAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trackable getPreviouslyOn() {
		if (previouslyOn != null && previouslyOn.eIsProxy()) {
			InternalEObject oldPreviouslyOn = (InternalEObject)previouslyOn;
			previouslyOn = (Trackable)eResolveProxy(oldPreviouslyOn);
			if (previouslyOn != oldPreviouslyOn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.TRAIN__PREVIOUSLY_ON, oldPreviouslyOn, previouslyOn));
			}
		}
		return previouslyOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trackable basicGetPreviouslyOn() {
		return previouslyOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreviouslyOn(Trackable newPreviouslyOn) {
		Trackable oldPreviouslyOn = previouslyOn;
		previouslyOn = newPreviouslyOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TRAIN__PREVIOUSLY_ON, oldPreviouslyOn, previouslyOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trackable getCurrentlyOn() {
		if (currentlyOn != null && currentlyOn.eIsProxy()) {
			InternalEObject oldCurrentlyOn = (InternalEObject)currentlyOn;
			currentlyOn = (Trackable)eResolveProxy(oldCurrentlyOn);
			if (currentlyOn != oldCurrentlyOn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.TRAIN__CURRENTLY_ON, oldCurrentlyOn, currentlyOn));
			}
		}
		return currentlyOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trackable basicGetCurrentlyOn() {
		return currentlyOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentlyOn(Trackable newCurrentlyOn) {
		Trackable oldCurrentlyOn = currentlyOn;
		currentlyOn = newCurrentlyOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TRAIN__CURRENTLY_ON, oldCurrentlyOn, currentlyOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.TRAIN__PREVIOUSLY_ON:
				if (resolve) return getPreviouslyOn();
				return basicGetPreviouslyOn();
			case ModelPackage.TRAIN__CURRENTLY_ON:
				if (resolve) return getCurrentlyOn();
				return basicGetCurrentlyOn();
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
			case ModelPackage.TRAIN__PREVIOUSLY_ON:
				setPreviouslyOn((Trackable)newValue);
				return;
			case ModelPackage.TRAIN__CURRENTLY_ON:
				setCurrentlyOn((Trackable)newValue);
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
			case ModelPackage.TRAIN__PREVIOUSLY_ON:
				setPreviouslyOn((Trackable)null);
				return;
			case ModelPackage.TRAIN__CURRENTLY_ON:
				setCurrentlyOn((Trackable)null);
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
			case ModelPackage.TRAIN__PREVIOUSLY_ON:
				return previouslyOn != null;
			case ModelPackage.TRAIN__CURRENTLY_ON:
				return currentlyOn != null;
		}
		return super.eIsSet(featureID);
	}

} //TrainImpl
