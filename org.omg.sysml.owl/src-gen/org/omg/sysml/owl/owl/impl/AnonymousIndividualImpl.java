/**
 * generated by Xtext 2.12.0
 */
package org.omg.sysml.owl.owl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.sysml.owl.owl.AnonymousIndividual;
import org.omg.sysml.owl.owl.OwlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Anonymous Individual</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.owl.owl.impl.AnonymousIndividualImpl#getNodeId <em>Node Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnonymousIndividualImpl extends IndividualImpl implements AnonymousIndividual
{
  /**
   * The default value of the '{@link #getNodeId() <em>Node Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodeId()
   * @generated
   * @ordered
   */
  protected static final String NODE_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNodeId() <em>Node Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodeId()
   * @generated
   * @ordered
   */
  protected String nodeId = NODE_ID_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AnonymousIndividualImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return OwlPackage.Literals.ANONYMOUS_INDIVIDUAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNodeId()
  {
    return nodeId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNodeId(String newNodeId)
  {
    String oldNodeId = nodeId;
    nodeId = newNodeId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.ANONYMOUS_INDIVIDUAL__NODE_ID, oldNodeId, nodeId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case OwlPackage.ANONYMOUS_INDIVIDUAL__NODE_ID:
        return getNodeId();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OwlPackage.ANONYMOUS_INDIVIDUAL__NODE_ID:
        setNodeId((String)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case OwlPackage.ANONYMOUS_INDIVIDUAL__NODE_ID:
        setNodeId(NODE_ID_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case OwlPackage.ANONYMOUS_INDIVIDUAL__NODE_ID:
        return NODE_ID_EDEFAULT == null ? nodeId != null : !NODE_ID_EDEFAULT.equals(nodeId);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (nodeId: ");
    result.append(nodeId);
    result.append(')');
    return result.toString();
  }

} //AnonymousIndividualImpl