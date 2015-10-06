/**
 */
package hu.bme.mit.kv.model.railroadmodel.impl;

import hu.bme.mit.kv.model.railroadmodel.ModelPackage;
import hu.bme.mit.kv.model.railroadmodel.Point;
import hu.bme.mit.kv.model.railroadmodel.RailPoint;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rail Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.kv.model.railroadmodel.impl.RailPointImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link hu.bme.mit.kv.model.railroadmodel.impl.RailPointImpl#getNeighbours <em>Neighbours</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RailPointImpl extends MinimalEObjectImpl.Container implements RailPoint {
	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected Point position;

	/**
	 * The cached value of the '{@link #getNeighbours() <em>Neighbours</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeighbours()
	 * @generated
	 * @ordered
	 */
	protected EList<RailPoint> neighbours;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RailPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.RAIL_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point getPosition() {
		if (position != null && position.eIsProxy()) {
			InternalEObject oldPosition = (InternalEObject)position;
			position = (Point)eResolveProxy(oldPosition);
			if (position != oldPosition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.RAIL_POINT__POSITION, oldPosition, position));
			}
		}
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point basicGetPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(Point newPosition) {
		Point oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RAIL_POINT__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RailPoint> getNeighbours() {
		if (neighbours == null) {
			neighbours = new EObjectResolvingEList<RailPoint>(RailPoint.class, this, ModelPackage.RAIL_POINT__NEIGHBOURS);
		}
		return neighbours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.RAIL_POINT__POSITION:
				if (resolve) return getPosition();
				return basicGetPosition();
			case ModelPackage.RAIL_POINT__NEIGHBOURS:
				return getNeighbours();
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
			case ModelPackage.RAIL_POINT__POSITION:
				setPosition((Point)newValue);
				return;
			case ModelPackage.RAIL_POINT__NEIGHBOURS:
				getNeighbours().clear();
				getNeighbours().addAll((Collection<? extends RailPoint>)newValue);
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
			case ModelPackage.RAIL_POINT__POSITION:
				setPosition((Point)null);
				return;
			case ModelPackage.RAIL_POINT__NEIGHBOURS:
				getNeighbours().clear();
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
			case ModelPackage.RAIL_POINT__POSITION:
				return position != null;
			case ModelPackage.RAIL_POINT__NEIGHBOURS:
				return neighbours != null && !neighbours.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RailPointImpl
