/**
 */
package hu.bme.mit.kv.model.railroadmodel.impl;

import hu.bme.mit.kv.model.railroadmodel.ModelPackage;
import hu.bme.mit.kv.model.railroadmodel.Section;
import hu.bme.mit.kv.model.railroadmodel.Train;

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
 *   <li>{@link hu.bme.mit.kv.model.railroadmodel.impl.TrainImpl#getCurrentlyOn <em>Currently On</em>}</li>
 *   <li>{@link hu.bme.mit.kv.model.railroadmodel.impl.TrainImpl#getNextSection <em>Next Section</em>}</li>
 *   <li>{@link hu.bme.mit.kv.model.railroadmodel.impl.TrainImpl#getX <em>X</em>}</li>
 *   <li>{@link hu.bme.mit.kv.model.railroadmodel.impl.TrainImpl#getY <em>Y</em>}</li>
 *   <li>{@link hu.bme.mit.kv.model.railroadmodel.impl.TrainImpl#getZ <em>Z</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrainImpl extends MinimalEObjectImpl.Container implements Train {
	/**
	 * The cached value of the '{@link #getCurrentlyOn() <em>Currently On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentlyOn()
	 * @generated
	 * @ordered
	 */
	protected Section currentlyOn;

	/**
	 * The cached value of the '{@link #getNextSection() <em>Next Section</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextSection()
	 * @generated
	 * @ordered
	 */
	protected Section nextSection;

	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final double X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected double x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final double Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected double y = Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getZ() <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ()
	 * @generated
	 * @ordered
	 */
	protected static final double Z_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getZ() <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ()
	 * @generated
	 * @ordered
	 */
	protected double z = Z_EDEFAULT;

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
	public Section getCurrentlyOn() {
		if (currentlyOn != null && currentlyOn.eIsProxy()) {
			InternalEObject oldCurrentlyOn = (InternalEObject)currentlyOn;
			currentlyOn = (Section)eResolveProxy(oldCurrentlyOn);
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
	public Section basicGetCurrentlyOn() {
		return currentlyOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentlyOn(Section newCurrentlyOn) {
		Section oldCurrentlyOn = currentlyOn;
		currentlyOn = newCurrentlyOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TRAIN__CURRENTLY_ON, oldCurrentlyOn, currentlyOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Section getNextSection() {
		if (nextSection != null && nextSection.eIsProxy()) {
			InternalEObject oldNextSection = (InternalEObject)nextSection;
			nextSection = (Section)eResolveProxy(oldNextSection);
			if (nextSection != oldNextSection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.TRAIN__NEXT_SECTION, oldNextSection, nextSection));
			}
		}
		return nextSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Section basicGetNextSection() {
		return nextSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextSection(Section newNextSection) {
		Section oldNextSection = nextSection;
		nextSection = newNextSection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TRAIN__NEXT_SECTION, oldNextSection, nextSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(double newX) {
		double oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TRAIN__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(double newY) {
		double oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TRAIN__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getZ() {
		return z;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZ(double newZ) {
		double oldZ = z;
		z = newZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TRAIN__Z, oldZ, z));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.TRAIN__CURRENTLY_ON:
				if (resolve) return getCurrentlyOn();
				return basicGetCurrentlyOn();
			case ModelPackage.TRAIN__NEXT_SECTION:
				if (resolve) return getNextSection();
				return basicGetNextSection();
			case ModelPackage.TRAIN__X:
				return getX();
			case ModelPackage.TRAIN__Y:
				return getY();
			case ModelPackage.TRAIN__Z:
				return getZ();
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
			case ModelPackage.TRAIN__CURRENTLY_ON:
				setCurrentlyOn((Section)newValue);
				return;
			case ModelPackage.TRAIN__NEXT_SECTION:
				setNextSection((Section)newValue);
				return;
			case ModelPackage.TRAIN__X:
				setX((Double)newValue);
				return;
			case ModelPackage.TRAIN__Y:
				setY((Double)newValue);
				return;
			case ModelPackage.TRAIN__Z:
				setZ((Double)newValue);
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
			case ModelPackage.TRAIN__CURRENTLY_ON:
				setCurrentlyOn((Section)null);
				return;
			case ModelPackage.TRAIN__NEXT_SECTION:
				setNextSection((Section)null);
				return;
			case ModelPackage.TRAIN__X:
				setX(X_EDEFAULT);
				return;
			case ModelPackage.TRAIN__Y:
				setY(Y_EDEFAULT);
				return;
			case ModelPackage.TRAIN__Z:
				setZ(Z_EDEFAULT);
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
			case ModelPackage.TRAIN__CURRENTLY_ON:
				return currentlyOn != null;
			case ModelPackage.TRAIN__NEXT_SECTION:
				return nextSection != null;
			case ModelPackage.TRAIN__X:
				return x != X_EDEFAULT;
			case ModelPackage.TRAIN__Y:
				return y != Y_EDEFAULT;
			case ModelPackage.TRAIN__Z:
				return z != Z_EDEFAULT;
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
		result.append(" (x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(", z: ");
		result.append(z);
		result.append(')');
		return result.toString();
	}

} //TrainImpl
