/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Import#getImportingPackage <em>Importing Package</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Import#getImportedPackage <em>Imported Package</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Import#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Import#getSelecter <em>Selecter</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getImport()
 * @model
 * @generated
 */
public interface Import extends Relationship {
	/**
	 * Returns the value of the '<em><b>Importing Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Package#getOwnedImport <em>Owned Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Importing Package</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Importing Package</em>' container reference.
	 * @see #setImportingPackage(org.omg.sysml.lang.sysml.Package)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getImport_ImportingPackage()
	 * @see org.omg.sysml.lang.sysml.Package#getOwnedImport
	 * @model opposite="ownedImport" required="true" transient="false" ordered="false"
	 * @generated
	 */
	org.omg.sysml.lang.sysml.Package getImportingPackage();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Import#getImportingPackage <em>Importing Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Importing Package</em>' container reference.
	 * @see #getImportingPackage()
	 * @generated
	 */
	void setImportingPackage(org.omg.sysml.lang.sysml.Package value);

	/**
	 * Returns the value of the '<em><b>Imported Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Package</em>' reference.
	 * @see #setImportedPackage(org.omg.sysml.lang.sysml.Package)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getImport_ImportedPackage()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.omg.sysml.lang.sysml.Package getImportedPackage();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Import#getImportedPackage <em>Imported Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Package</em>' reference.
	 * @see #getImportedPackage()
	 * @generated
	 */
	void setImportedPackage(org.omg.sysml.lang.sysml.Package value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link org.omg.sysml.lang.sysml.VisibilityKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see org.omg.sysml.lang.sysml.VisibilityKind
	 * @see #setVisibility(VisibilityKind)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getImport_Visibility()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	VisibilityKind getVisibility();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Import#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see org.omg.sysml.lang.sysml.VisibilityKind
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(VisibilityKind value);

	/**
	 * Returns the value of the '<em><b>Selecter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selecter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selecter</em>' containment reference.
	 * @see #setSelecter(Predicate)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getImport_Selecter()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Predicate getSelecter();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Import#getSelecter <em>Selecter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selecter</em>' containment reference.
	 * @see #getSelecter()
	 * @generated
	 */
	void setSelecter(Predicate value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	EList<Membership> importedMembership();

} // Import