/**
 */
package hu.bme.mit.kv.railrloadmodel.railroadmodel.impl;

import hu.bme.mit.kv.railrloadmodel.railroadmodel.ModelPackage;
import hu.bme.mit.kv.railrloadmodel.railroadmodel.Rectangle;
import hu.bme.mit.kv.railrloadmodel.railroadmodel.Section;
import hu.bme.mit.kv.railrloadmodel.railroadmodel.Setting;
import hu.bme.mit.kv.railrloadmodel.railroadmodel.Turnout;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Turnout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.TurnoutImpl#getConnected <em>Connected</em>}</li>
 *   <li>{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.TurnoutImpl#getNotConnected <em>Not Connected</em>}</li>
 *   <li>{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.TurnoutImpl#getRectangle <em>Rectangle</em>}</li>
 *   <li>{@link hu.bme.mit.kv.railrloadmodel.railroadmodel.impl.TurnoutImpl#getSettings <em>Settings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TurnoutImpl extends SectionImpl implements Turnout {
	/**
	 * The cached value of the '{@link #getConnected() <em>Connected</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnected()
	 * @generated
	 * @ordered
	 */
	protected EList<Section> connected;

	/**
	 * The cached value of the '{@link #getNotConnected() <em>Not Connected</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotConnected()
	 * @generated
	 * @ordered
	 */
	protected EList<Section> notConnected;

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
	 * The cached value of the '{@link #getSettings() <em>Settings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettings()
	 * @generated
	 * @ordered
	 */
	protected EList<Setting> settings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TurnoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.TURNOUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Section> getConnected() {
		if (connected == null) {
			connected = new EObjectResolvingEList<Section>(Section.class, this, ModelPackage.TURNOUT__CONNECTED);
		}
		return connected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Section> getNotConnected() {
		if (notConnected == null) {
			notConnected = new EObjectResolvingEList<Section>(Section.class, this, ModelPackage.TURNOUT__NOT_CONNECTED);
		}
		return notConnected;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.TURNOUT__RECTANGLE, oldRectangle, newRectangle);
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
				msgs = ((InternalEObject)rectangle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.TURNOUT__RECTANGLE, null, msgs);
			if (newRectangle != null)
				msgs = ((InternalEObject)newRectangle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.TURNOUT__RECTANGLE, null, msgs);
			msgs = basicSetRectangle(newRectangle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TURNOUT__RECTANGLE, newRectangle, newRectangle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Setting> getSettings() {
		if (settings == null) {
			settings = new EObjectContainmentEList<Setting>(Setting.class, this, ModelPackage.TURNOUT__SETTINGS);
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
			case ModelPackage.TURNOUT__RECTANGLE:
				return basicSetRectangle(null, msgs);
			case ModelPackage.TURNOUT__SETTINGS:
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
			case ModelPackage.TURNOUT__CONNECTED:
				return getConnected();
			case ModelPackage.TURNOUT__NOT_CONNECTED:
				return getNotConnected();
			case ModelPackage.TURNOUT__RECTANGLE:
				return getRectangle();
			case ModelPackage.TURNOUT__SETTINGS:
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
			case ModelPackage.TURNOUT__CONNECTED:
				getConnected().clear();
				getConnected().addAll((Collection<? extends Section>)newValue);
				return;
			case ModelPackage.TURNOUT__NOT_CONNECTED:
				getNotConnected().clear();
				getNotConnected().addAll((Collection<? extends Section>)newValue);
				return;
			case ModelPackage.TURNOUT__RECTANGLE:
				setRectangle((Rectangle)newValue);
				return;
			case ModelPackage.TURNOUT__SETTINGS:
				getSettings().clear();
				getSettings().addAll((Collection<? extends Setting>)newValue);
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
			case ModelPackage.TURNOUT__CONNECTED:
				getConnected().clear();
				return;
			case ModelPackage.TURNOUT__NOT_CONNECTED:
				getNotConnected().clear();
				return;
			case ModelPackage.TURNOUT__RECTANGLE:
				setRectangle((Rectangle)null);
				return;
			case ModelPackage.TURNOUT__SETTINGS:
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
			case ModelPackage.TURNOUT__CONNECTED:
				return connected != null && !connected.isEmpty();
			case ModelPackage.TURNOUT__NOT_CONNECTED:
				return notConnected != null && !notConnected.isEmpty();
			case ModelPackage.TURNOUT__RECTANGLE:
				return rectangle != null;
			case ModelPackage.TURNOUT__SETTINGS:
				return settings != null && !settings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TurnoutImpl
