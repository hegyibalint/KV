/**
 */
package hu.bme.mit.kv.railrloadmodel.railroadmodel.impl;

import hu.bme.mit.kv.railrloadmodel.railroadmodel.ModelPackage;
import hu.bme.mit.kv.railrloadmodel.railroadmodel.Rectangle;
import hu.bme.mit.kv.railrloadmodel.railroadmodel.Switch;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.SwitchImpl#getRectangle <em>Rectangle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwitchImpl extends TrackableImpl implements Switch {
	/**
	 * The cached value of the '{@link #getRectangle() <em>Rectangle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRectangle()
	 * @generated
	 * @ordered
	 */
	protected Rectangle rectangle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwitchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.SWITCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rectangle getRectangle() {
		return rectangle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRectangle(Rectangle newRectangle, NotificationChain msgs) {
		Rectangle oldRectangle = rectangle;
		rectangle = newRectangle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.SWITCH__RECTANGLE, oldRectangle, newRectangle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRectangle(Rectangle newRectangle) {
		if (newRectangle != rectangle) {
			NotificationChain msgs = null;
			if (rectangle != null)
				msgs = ((InternalEObject)rectangle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.SWITCH__RECTANGLE, null, msgs);
			if (newRectangle != null)
				msgs = ((InternalEObject)newRectangle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.SWITCH__RECTANGLE, null, msgs);
			msgs = basicSetRectangle(newRectangle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SWITCH__RECTANGLE, newRectangle, newRectangle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.SWITCH__RECTANGLE:
				return basicSetRectangle(null, msgs);
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
			case ModelPackage.SWITCH__RECTANGLE:
				return getRectangle();
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
			case ModelPackage.SWITCH__RECTANGLE:
				setRectangle((Rectangle)newValue);
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
			case ModelPackage.SWITCH__RECTANGLE:
				setRectangle((Rectangle)null);
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
			case ModelPackage.SWITCH__RECTANGLE:
				return rectangle != null;
		}
		return super.eIsSet(featureID);
	}

} //SwitchImpl
