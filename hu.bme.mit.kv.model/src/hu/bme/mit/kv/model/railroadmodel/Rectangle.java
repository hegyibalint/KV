/**
 */
package hu.bme.mit.kv.model.railroadmodel;

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
 *   <li>{@link hu.bme.mit.kv.model.railroadmodel.Rectangle#getOrigin <em>Origin</em>}</li>
 *   <li>{@link hu.bme.mit.kv.model.railroadmodel.Rectangle#getSize <em>Size</em>}</li>
 *   <li>{@link hu.bme.mit.kv.model.railroadmodel.Rectangle#getTransformation <em>Transformation</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.kv.model.railroadmodel.ModelPackage#getRectangle()
 * @model
 * @generated
 */
public interface Rectangle extends EObject {
	/**
	 * Returns the value of the '<em><b>Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' containment reference.
	 * @see #setOrigin(Point)
	 * @see hu.bme.mit.kv.model.railroadmodel.ModelPackage#getRectangle_Origin()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Point getOrigin();

	/**
	 * Sets the value of the '{@link hu.bme.mit.kv.model.railroadmodel.Rectangle#getOrigin <em>Origin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' containment reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(Point value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' containment reference.
	 * @see #setSize(Dimension)
	 * @see hu.bme.mit.kv.model.railroadmodel.ModelPackage#getRectangle_Size()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Dimension getSize();

	/**
	 * Sets the value of the '{@link hu.bme.mit.kv.model.railroadmodel.Rectangle#getSize <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' containment reference.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Dimension value);

	/**
	 * Returns the value of the '<em><b>Transformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation</em>' containment reference.
	 * @see #setTransformation(Matrix)
	 * @see hu.bme.mit.kv.model.railroadmodel.ModelPackage#getRectangle_Transformation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Matrix getTransformation();

	/**
	 * Sets the value of the '{@link hu.bme.mit.kv.model.railroadmodel.Rectangle#getTransformation <em>Transformation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation</em>' containment reference.
	 * @see #getTransformation()
	 * @generated
	 */
	void setTransformation(Matrix value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean isPointInside(Point point);

} // Rectangle
