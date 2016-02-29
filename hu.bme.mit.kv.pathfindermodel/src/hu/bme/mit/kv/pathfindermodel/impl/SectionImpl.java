/**
 */
package hu.bme.mit.kv.pathfindermodel.impl;

import hu.bme.mit.kv.pathfindermodel.PathfindermodelPackage;
import hu.bme.mit.kv.pathfindermodel.Section;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.kv.pathfindermodel.impl.SectionImpl#getNeighbours <em>Neighbours</em>}</li>
 *   <li>{@link hu.bme.mit.kv.pathfindermodel.impl.SectionImpl#getId <em>Id</em>}</li>
 *   <li>{@link hu.bme.mit.kv.pathfindermodel.impl.SectionImpl#isHunted <em>Hunted</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SectionImpl extends MinimalEObjectImpl.Container implements Section {
	/**
	 * The cached value of the '{@link #getNeighbours() <em>Neighbours</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeighbours()
	 * @generated
	 * @ordered
	 */
	protected EList<Section> neighbours;

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
	 * The default value of the '{@link #isHunted() <em>Hunted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHunted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HUNTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHunted() <em>Hunted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHunted()
	 * @generated
	 * @ordered
	 */
	protected boolean hunted = HUNTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PathfindermodelPackage.Literals.SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Section> getNeighbours() {
		if (neighbours == null) {
			neighbours = new EObjectResolvingEList<Section>(Section.class, this, PathfindermodelPackage.SECTION__NEIGHBOURS);
		}
		return neighbours;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PathfindermodelPackage.SECTION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHunted() {
		return hunted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHunted(boolean newHunted) {
		boolean oldHunted = hunted;
		hunted = newHunted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PathfindermodelPackage.SECTION__HUNTED, oldHunted, hunted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PathfindermodelPackage.SECTION__NEIGHBOURS:
				return getNeighbours();
			case PathfindermodelPackage.SECTION__ID:
				return getId();
			case PathfindermodelPackage.SECTION__HUNTED:
				return isHunted();
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
			case PathfindermodelPackage.SECTION__NEIGHBOURS:
				getNeighbours().clear();
				getNeighbours().addAll((Collection<? extends Section>)newValue);
				return;
			case PathfindermodelPackage.SECTION__ID:
				setId((Integer)newValue);
				return;
			case PathfindermodelPackage.SECTION__HUNTED:
				setHunted((Boolean)newValue);
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
			case PathfindermodelPackage.SECTION__NEIGHBOURS:
				getNeighbours().clear();
				return;
			case PathfindermodelPackage.SECTION__ID:
				setId(ID_EDEFAULT);
				return;
			case PathfindermodelPackage.SECTION__HUNTED:
				setHunted(HUNTED_EDEFAULT);
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
			case PathfindermodelPackage.SECTION__NEIGHBOURS:
				return neighbours != null && !neighbours.isEmpty();
			case PathfindermodelPackage.SECTION__ID:
				return id != ID_EDEFAULT;
			case PathfindermodelPackage.SECTION__HUNTED:
				return hunted != HUNTED_EDEFAULT;
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
		result.append(", hunted: ");
		result.append(hunted);
		result.append(')');
		return result.toString();
	}

} //SectionImpl
