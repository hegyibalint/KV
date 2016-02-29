/**
 */
package hu.bme.mit.kv.railroadmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rectangle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.kv.railroadmodel.Rectangle#getCorners <em>Corners</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.kv.railroadmodel.RailroadModelPackage#getRectangle()
 * @model
 * @generated
 */
public interface Rectangle extends EObject {
	/**
	 * Returns the value of the '<em><b>Corners</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.kv.railroadmodel.Point}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Corners</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corners</em>' containment reference list.
	 * @see hu.bme.mit.kv.railroadmodel.RailroadModelPackage#getRectangle_Corners()
	 * @model containment="true" lower="4" upper="4"
	 * @generated
	 */
	EList<Point> getCorners();

} // Rectangle
