/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.omg.sysml.lang.sysml.ForkNode;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fork Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ForkNodeImpl extends ControlNodeImpl implements ForkNode {

	public static final String FORK_NODE_SUBSETTING_BASE_DEFAULT = "Activities::Action::forks";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForkNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.FORK_NODE;
	}
	
	@Override
	public EList<Subsetting> getOwnedSubsetting() {
		return getOwnedSubsettingWithComputedRedefinitions(FORK_NODE_SUBSETTING_BASE_DEFAULT);
	}
	
} //ForkNodeImpl