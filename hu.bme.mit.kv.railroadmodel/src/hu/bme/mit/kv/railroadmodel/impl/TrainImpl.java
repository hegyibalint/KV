/**
 */
package hu.bme.mit.kv.railroadmodel.impl;

import hu.bme.mit.kv.railroadmodel.Group;
import hu.bme.mit.kv.railroadmodel.Point;
import hu.bme.mit.kv.railroadmodel.RailroadModelPackage;
import hu.bme.mit.kv.railroadmodel.Region;
import hu.bme.mit.kv.railroadmodel.Train;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Train</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.kv.railroadmodel.impl.TrainImpl#getPreviouslyOn <em>Previously On</em>}</li>
 *   <li>{@link hu.bme.mit.kv.railroadmodel.impl.TrainImpl#getCurrentlyOn <em>Currently On</em>}</li>
 *   <li>{@link hu.bme.mit.kv.railroadmodel.impl.TrainImpl#getId <em>Id</em>}</li>
 *   <li>{@link hu.bme.mit.kv.railroadmodel.impl.TrainImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link hu.bme.mit.kv.railroadmodel.impl.TrainImpl#getNextGroup <em>Next Group</em>}</li>
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
	protected Region previouslyOn;

	/**
	 * The cached value of the '{@link #getCurrentlyOn() <em>Currently On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentlyOn()
	 * @generated
	 * @ordered
	 */
	protected Region currentlyOn;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected Point position;

	/**
	 * The cached value of the '{@link #getNextGroup() <em>Next Group</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<Group> nextGroup;

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
		return RailroadModelPackage.Literals.TRAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region getPreviouslyOn() {
		if (previouslyOn != null && previouslyOn.eIsProxy()) {
			InternalEObject oldPreviouslyOn = (InternalEObject)previouslyOn;
			previouslyOn = (Region)eResolveProxy(oldPreviouslyOn);
			if (previouslyOn != oldPreviouslyOn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RailroadModelPackage.TRAIN__PREVIOUSLY_ON, oldPreviouslyOn, previouslyOn));
			}
		}
		return previouslyOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region basicGetPreviouslyOn() {
		return previouslyOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreviouslyOn(Region newPreviouslyOn) {
		Region oldPreviouslyOn = previouslyOn;
		previouslyOn = newPreviouslyOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RailroadModelPackage.TRAIN__PREVIOUSLY_ON, oldPreviouslyOn, previouslyOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region getCurrentlyOn() {
		if (currentlyOn != null && currentlyOn.eIsProxy()) {
			InternalEObject oldCurrentlyOn = (InternalEObject)currentlyOn;
			currentlyOn = (Region)eResolveProxy(oldCurrentlyOn);
			if (currentlyOn != oldCurrentlyOn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RailroadModelPackage.TRAIN__CURRENTLY_ON, oldCurrentlyOn, currentlyOn));
			}
		}
		return currentlyOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region basicGetCurrentlyOn() {
		return currentlyOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentlyOn(Region newCurrentlyOn) {
		Region oldCurrentlyOn = currentlyOn;
		currentlyOn = newCurrentlyOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RailroadModelPackage.TRAIN__CURRENTLY_ON, oldCurrentlyOn, currentlyOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RailroadModelPackage.TRAIN__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPosition(Point newPosition, NotificationChain msgs) {
		Point oldPosition = position;
		position = newPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RailroadModelPackage.TRAIN__POSITION, oldPosition, newPosition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(Point newPosition) {
		if (newPosition != position) {
			NotificationChain msgs = null;
			if (position != null)
				msgs = ((InternalEObject)position).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RailroadModelPackage.TRAIN__POSITION, null, msgs);
			if (newPosition != null)
				msgs = ((InternalEObject)newPosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RailroadModelPackage.TRAIN__POSITION, null, msgs);
			msgs = basicSetPosition(newPosition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RailroadModelPackage.TRAIN__POSITION, newPosition, newPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Group> getNextGroup() {
		if (nextGroup == null) {
			nextGroup = new EObjectResolvingEList<Group>(Group.class, this, RailroadModelPackage.TRAIN__NEXT_GROUP);
		}
		return nextGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RailroadModelPackage.TRAIN__POSITION:
				return basicSetPosition(null, msgs);
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
			case RailroadModelPackage.TRAIN__PREVIOUSLY_ON:
				if (resolve) return getPreviouslyOn();
				return basicGetPreviouslyOn();
			case RailroadModelPackage.TRAIN__CURRENTLY_ON:
				if (resolve) return getCurrentlyOn();
				return basicGetCurrentlyOn();
			case RailroadModelPackage.TRAIN__ID:
				return getId();
			case RailroadModelPackage.TRAIN__POSITION:
				return getPosition();
			case RailroadModelPackage.TRAIN__NEXT_GROUP:
				return getNextGroup();
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
			case RailroadModelPackage.TRAIN__PREVIOUSLY_ON:
				setPreviouslyOn((Region)newValue);
				return;
			case RailroadModelPackage.TRAIN__CURRENTLY_ON:
				setCurrentlyOn((Region)newValue);
				return;
			case RailroadModelPackage.TRAIN__ID:
				setId((Integer)newValue);
				return;
			case RailroadModelPackage.TRAIN__POSITION:
				setPosition((Point)newValue);
				return;
			case RailroadModelPackage.TRAIN__NEXT_GROUP:
				getNextGroup().clear();
				getNextGroup().addAll((Collection<? extends Group>)newValue);
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
			case RailroadModelPackage.TRAIN__PREVIOUSLY_ON:
				setPreviouslyOn((Region)null);
				return;
			case RailroadModelPackage.TRAIN__CURRENTLY_ON:
				setCurrentlyOn((Region)null);
				return;
			case RailroadModelPackage.TRAIN__ID:
				setId(ID_EDEFAULT);
				return;
			case RailroadModelPackage.TRAIN__POSITION:
				setPosition((Point)null);
				return;
			case RailroadModelPackage.TRAIN__NEXT_GROUP:
				getNextGroup().clear();
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
			case RailroadModelPackage.TRAIN__PREVIOUSLY_ON:
				return previouslyOn != null;
			case RailroadModelPackage.TRAIN__CURRENTLY_ON:
				return currentlyOn != null;
			case RailroadModelPackage.TRAIN__ID:
				return id != ID_EDEFAULT;
			case RailroadModelPackage.TRAIN__POSITION:
				return position != null;
			case RailroadModelPackage.TRAIN__NEXT_GROUP:
				return nextGroup != null && !nextGroup.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //TrainImpl
