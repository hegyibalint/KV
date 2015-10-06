/**
 */
package hu.bme.mit.kv.model.railroadmodel.impl;

import hu.bme.mit.kv.model.railroadmodel.ModelPackage;
import hu.bme.mit.kv.model.railroadmodel.Rail;
import hu.bme.mit.kv.model.railroadmodel.RailEndPoint;
import hu.bme.mit.kv.model.railroadmodel.RailPoint;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.kv.model.railroadmodel.impl.RailImpl#getPoints <em>Points</em>}</li>
 *   <li>{@link hu.bme.mit.kv.model.railroadmodel.impl.RailImpl#getEndpoints <em>Endpoints</em>}</li>
 *   <li>{@link hu.bme.mit.kv.model.railroadmodel.impl.RailImpl#getNewAttribute <em>New Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RailImpl extends SectionImpl implements Rail {
	/**
	 * The cached value of the '{@link #getPoints() <em>Points</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<RailPoint> points;

	/**
	 * The cached value of the '{@link #getEndpoints() <em>Endpoints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoints()
	 * @generated
	 * @ordered
	 */
	protected EList<RailEndPoint> endpoints;

	/**
	 * The default value of the '{@link #getNewAttribute() <em>New Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final double NEW_ATTRIBUTE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getNewAttribute() <em>New Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewAttribute()
	 * @generated
	 * @ordered
	 */
	protected double newAttribute = NEW_ATTRIBUTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RailImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.RAIL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RailPoint> getPoints() {
		if (points == null) {
			points = new EObjectContainmentEList<RailPoint>(RailPoint.class, this, ModelPackage.RAIL__POINTS);
		}
		return points;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RailEndPoint> getEndpoints() {
		if (endpoints == null) {
			endpoints = new EObjectContainmentEList<RailEndPoint>(RailEndPoint.class, this, ModelPackage.RAIL__ENDPOINTS);
		}
		return endpoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getNewAttribute() {
		return newAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewAttribute(double newNewAttribute) {
		double oldNewAttribute = newAttribute;
		newAttribute = newNewAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RAIL__NEW_ATTRIBUTE, oldNewAttribute, newAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.RAIL__POINTS:
				return ((InternalEList<?>)getPoints()).basicRemove(otherEnd, msgs);
			case ModelPackage.RAIL__ENDPOINTS:
				return ((InternalEList<?>)getEndpoints()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.RAIL__POINTS:
				return getPoints();
			case ModelPackage.RAIL__ENDPOINTS:
				return getEndpoints();
			case ModelPackage.RAIL__NEW_ATTRIBUTE:
				return getNewAttribute();
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
			case ModelPackage.RAIL__POINTS:
				getPoints().clear();
				getPoints().addAll((Collection<? extends RailPoint>)newValue);
				return;
			case ModelPackage.RAIL__ENDPOINTS:
				getEndpoints().clear();
				getEndpoints().addAll((Collection<? extends RailEndPoint>)newValue);
				return;
			case ModelPackage.RAIL__NEW_ATTRIBUTE:
				setNewAttribute((Double)newValue);
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
			case ModelPackage.RAIL__POINTS:
				getPoints().clear();
				return;
			case ModelPackage.RAIL__ENDPOINTS:
				getEndpoints().clear();
				return;
			case ModelPackage.RAIL__NEW_ATTRIBUTE:
				setNewAttribute(NEW_ATTRIBUTE_EDEFAULT);
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
			case ModelPackage.RAIL__POINTS:
				return points != null && !points.isEmpty();
			case ModelPackage.RAIL__ENDPOINTS:
				return endpoints != null && !endpoints.isEmpty();
			case ModelPackage.RAIL__NEW_ATTRIBUTE:
				return newAttribute != NEW_ATTRIBUTE_EDEFAULT;
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
		result.append(" (newAttribute: ");
		result.append(newAttribute);
		result.append(')');
		return result.toString();
	}

} //RailImpl
