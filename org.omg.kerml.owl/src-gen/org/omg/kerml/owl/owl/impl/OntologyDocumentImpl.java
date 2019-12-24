/**
 * generated by Xtext 2.18.0.M3
 */
package org.omg.kerml.owl.owl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.kerml.owl.owl.Ontology;
import org.omg.kerml.owl.owl.OntologyDocument;
import org.omg.kerml.owl.owl.OwlPackage;
import org.omg.kerml.owl.owl.PrefixDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ontology Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.kerml.owl.owl.impl.OntologyDocumentImpl#getPrefixDeclarations <em>Prefix Declarations</em>}</li>
 *   <li>{@link org.omg.kerml.owl.owl.impl.OntologyDocumentImpl#getOntology <em>Ontology</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OntologyDocumentImpl extends MinimalEObjectImpl.Container implements OntologyDocument
{
  /**
   * The cached value of the '{@link #getPrefixDeclarations() <em>Prefix Declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrefixDeclarations()
   * @generated
   * @ordered
   */
  protected EList<PrefixDeclaration> prefixDeclarations;

  /**
   * The cached value of the '{@link #getOntology() <em>Ontology</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOntology()
   * @generated
   * @ordered
   */
  protected Ontology ontology;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OntologyDocumentImpl()
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
    return OwlPackage.Literals.ONTOLOGY_DOCUMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<PrefixDeclaration> getPrefixDeclarations()
  {
    if (prefixDeclarations == null)
    {
      prefixDeclarations = new EObjectContainmentEList<PrefixDeclaration>(PrefixDeclaration.class, this, OwlPackage.ONTOLOGY_DOCUMENT__PREFIX_DECLARATIONS);
    }
    return prefixDeclarations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Ontology getOntology()
  {
    return ontology;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOntology(Ontology newOntology, NotificationChain msgs)
  {
    Ontology oldOntology = ontology;
    ontology = newOntology;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OwlPackage.ONTOLOGY_DOCUMENT__ONTOLOGY, oldOntology, newOntology);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOntology(Ontology newOntology)
  {
    if (newOntology != ontology)
    {
      NotificationChain msgs = null;
      if (ontology != null)
        msgs = ((InternalEObject)ontology).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OwlPackage.ONTOLOGY_DOCUMENT__ONTOLOGY, null, msgs);
      if (newOntology != null)
        msgs = ((InternalEObject)newOntology).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OwlPackage.ONTOLOGY_DOCUMENT__ONTOLOGY, null, msgs);
      msgs = basicSetOntology(newOntology, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.ONTOLOGY_DOCUMENT__ONTOLOGY, newOntology, newOntology));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case OwlPackage.ONTOLOGY_DOCUMENT__PREFIX_DECLARATIONS:
        return ((InternalEList<?>)getPrefixDeclarations()).basicRemove(otherEnd, msgs);
      case OwlPackage.ONTOLOGY_DOCUMENT__ONTOLOGY:
        return basicSetOntology(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case OwlPackage.ONTOLOGY_DOCUMENT__PREFIX_DECLARATIONS:
        return getPrefixDeclarations();
      case OwlPackage.ONTOLOGY_DOCUMENT__ONTOLOGY:
        return getOntology();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OwlPackage.ONTOLOGY_DOCUMENT__PREFIX_DECLARATIONS:
        getPrefixDeclarations().clear();
        getPrefixDeclarations().addAll((Collection<? extends PrefixDeclaration>)newValue);
        return;
      case OwlPackage.ONTOLOGY_DOCUMENT__ONTOLOGY:
        setOntology((Ontology)newValue);
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
      case OwlPackage.ONTOLOGY_DOCUMENT__PREFIX_DECLARATIONS:
        getPrefixDeclarations().clear();
        return;
      case OwlPackage.ONTOLOGY_DOCUMENT__ONTOLOGY:
        setOntology((Ontology)null);
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
      case OwlPackage.ONTOLOGY_DOCUMENT__PREFIX_DECLARATIONS:
        return prefixDeclarations != null && !prefixDeclarations.isEmpty();
      case OwlPackage.ONTOLOGY_DOCUMENT__ONTOLOGY:
        return ontology != null;
    }
    return super.eIsSet(featureID);
  }

} //OntologyDocumentImpl