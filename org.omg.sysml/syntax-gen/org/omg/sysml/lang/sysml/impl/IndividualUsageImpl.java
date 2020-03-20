/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.IndividualDefinition;
import org.omg.sysml.lang.sysml.IndividualUsage;
import org.omg.sysml.lang.sysml.SnapshotFeature;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.TimeSliceFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Individual Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.IndividualUsageImpl#getIndividualDefinition <em>Individual Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.IndividualUsageImpl#isTimeSlice <em>Is Time Slice</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.IndividualUsageImpl#isSnapshot <em>Is Snapshot</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.IndividualUsageImpl#getTimeSliceFeature <em>Time Slice Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.IndividualUsageImpl#getSnapshotFeature <em>Snapshot Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IndividualUsageImpl extends BlockPropertyImpl implements IndividualUsage {
	/**
	 * The default value of the '{@link #isTimeSlice() <em>Is Time Slice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTimeSlice()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_TIME_SLICE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isSnapshot() <em>Is Snapshot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSnapshot()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SNAPSHOT_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndividualUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.INDIVIDUAL_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IndividualDefinition getIndividualDefinition() {
		IndividualDefinition individualDefinition = basicGetIndividualDefinition();
		return individualDefinition != null && individualDefinition.eIsProxy() ? (IndividualDefinition)eResolveProxy((InternalEObject)individualDefinition) : individualDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public IndividualDefinition basicGetIndividualDefinition() {
		EList<org.omg.sysml.lang.sysml.Class> blocks = super.getBlock();
		return (IndividualDefinition)blocks.stream().
				filter(type->type instanceof IndividualDefinition).
				findFirst().orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setIndividualDefinition(IndividualDefinition newIndividualDefinition) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isTimeSlice() {
		return basicGetTimeSliceFeature() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setIsTimeSlice(boolean newIsTimeSlice) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isSnapshot() {
		return basicGetSnapshotFeature() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setIsSnapshot(boolean newIsSnapshot) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getTimeSliceFeature() {
		Feature timeSliceFeature = basicGetTimeSliceFeature();
		return timeSliceFeature != null && timeSliceFeature.eIsProxy() ? (Feature)eResolveProxy((InternalEObject)timeSliceFeature) : timeSliceFeature;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Feature basicGetTimeSliceFeature() {
		return getOwnedFeature().stream().
				filter(feature->feature instanceof TimeSliceFeature).
				findAny().orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setTimeSliceFeature(Feature newTimeSliceFeature) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getSnapshotFeature() {
		Feature snapshotFeature = basicGetSnapshotFeature();
		return snapshotFeature != null && snapshotFeature.eIsProxy() ? (Feature)eResolveProxy((InternalEObject)snapshotFeature) : snapshotFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Feature basicGetSnapshotFeature() {
		return getOwnedFeature().stream().
				filter(feature->feature instanceof SnapshotFeature).
				findAny().orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setSnapshotFeature(Feature newSnapshotFeature) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.INDIVIDUAL_USAGE__INDIVIDUAL_DEFINITION:
				if (resolve) return getIndividualDefinition();
				return basicGetIndividualDefinition();
			case SysMLPackage.INDIVIDUAL_USAGE__IS_TIME_SLICE:
				return isTimeSlice();
			case SysMLPackage.INDIVIDUAL_USAGE__IS_SNAPSHOT:
				return isSnapshot();
			case SysMLPackage.INDIVIDUAL_USAGE__TIME_SLICE_FEATURE:
				if (resolve) return getTimeSliceFeature();
				return basicGetTimeSliceFeature();
			case SysMLPackage.INDIVIDUAL_USAGE__SNAPSHOT_FEATURE:
				if (resolve) return getSnapshotFeature();
				return basicGetSnapshotFeature();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SysMLPackage.INDIVIDUAL_USAGE__INDIVIDUAL_DEFINITION:
				setIndividualDefinition((IndividualDefinition)newValue);
				return;
			case SysMLPackage.INDIVIDUAL_USAGE__IS_TIME_SLICE:
				setIsTimeSlice((Boolean)newValue);
				return;
			case SysMLPackage.INDIVIDUAL_USAGE__IS_SNAPSHOT:
				setIsSnapshot((Boolean)newValue);
				return;
			case SysMLPackage.INDIVIDUAL_USAGE__TIME_SLICE_FEATURE:
				setTimeSliceFeature((Feature)newValue);
				return;
			case SysMLPackage.INDIVIDUAL_USAGE__SNAPSHOT_FEATURE:
				setSnapshotFeature((Feature)newValue);
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
			case SysMLPackage.INDIVIDUAL_USAGE__INDIVIDUAL_DEFINITION:
				setIndividualDefinition((IndividualDefinition)null);
				return;
			case SysMLPackage.INDIVIDUAL_USAGE__IS_TIME_SLICE:
				setIsTimeSlice(IS_TIME_SLICE_EDEFAULT);
				return;
			case SysMLPackage.INDIVIDUAL_USAGE__IS_SNAPSHOT:
				setIsSnapshot(IS_SNAPSHOT_EDEFAULT);
				return;
			case SysMLPackage.INDIVIDUAL_USAGE__TIME_SLICE_FEATURE:
				setTimeSliceFeature((Feature)null);
				return;
			case SysMLPackage.INDIVIDUAL_USAGE__SNAPSHOT_FEATURE:
				setSnapshotFeature((Feature)null);
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
			case SysMLPackage.INDIVIDUAL_USAGE__INDIVIDUAL_DEFINITION:
				return basicGetIndividualDefinition() != null;
			case SysMLPackage.INDIVIDUAL_USAGE__IS_TIME_SLICE:
				return isTimeSlice() != IS_TIME_SLICE_EDEFAULT;
			case SysMLPackage.INDIVIDUAL_USAGE__IS_SNAPSHOT:
				return isSnapshot() != IS_SNAPSHOT_EDEFAULT;
			case SysMLPackage.INDIVIDUAL_USAGE__TIME_SLICE_FEATURE:
				return basicGetTimeSliceFeature() != null;
			case SysMLPackage.INDIVIDUAL_USAGE__SNAPSHOT_FEATURE:
				return basicGetSnapshotFeature() != null;
		}
		return super.eIsSet(featureID);
	}

} //IndividualUsageImpl