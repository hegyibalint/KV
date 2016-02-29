/**
 */
package hu.bme.mit.kv.railroadmodel.impl;

import hu.bme.mit.kv.railroadmodel.Point;
import hu.bme.mit.kv.railroadmodel.RailroadModelPackage;
import hu.bme.mit.kv.railroadmodel.Rectangle;

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
 * An implementation of the model object '<em><b>Rectangle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.kv.railroadmodel.impl.RectangleImpl#getCorners <em>Corners</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RectangleImpl extends MinimalEObjectImpl.Container implements Rectangle {
	/**
	 * The cached value of the '{@link #getCorners() <em>Corners</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorners()
	 * @generated
	 * @ordered
	 */
	protected EList<Point> corners;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RectangleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RailroadModelPackage.Literals.RECTANGLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Point> getCorners() {
		if (corners == null) {
			corners = new EObjectContainmentEList<Point>(Point.class, this, RailroadModelPackage.RECTANGLE__CORNERS);
		}
		return corners;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RailroadModelPackage.RECTANGLE__CORNERS:
				return ((InternalEList<?>)getCorners()).basicRemove(otherEnd, msgs);
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
			case RailroadModelPackage.RECTANGLE__CORNERS:
				return getCorners();
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
			case RailroadModelPackage.RECTANGLE__CORNERS:
				getCorners().clear();
				getCorners().addAll((Collection<? extends Point>)newValue);
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
			case RailroadModelPackage.RECTANGLE__CORNERS:
				getCorners().clear();
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
			case RailroadModelPackage.RECTANGLE__CORNERS:
				return corners != null && !corners.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RectangleImpl
