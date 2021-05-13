/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021 Model Driven Solutions, Inc.
 *    
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *  
 * You should have received a copy of theGNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *  
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 *  
 *******************************************************************************/

package org.omg.sysml.adapter;

import java.util.stream.Stream;

import org.eclipse.emf.common.util.EList;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.OperatorExpression;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.util.TypeUtil;

public class OperatorExpressionAdapter extends InvocationExpressionAdapter {

	// TODO: Replace with single library package when global scope supports public re-export.
	public static final String[] LIBRARY_PACKAGE_NAMES = { "BaseFunctions", "DataFunctions", "ControlFunctions" };
	
	public static final String CAST_OPERATOR = "as";

	public OperatorExpressionAdapter(OperatorExpression element) {
		super(element);
	}
	
	@Override
	public OperatorExpression getTarget() {
		return (OperatorExpression)super.getTarget();
	}

	public static String[] getOperatorQualifiedNames(String op) {
		return Stream.of(LIBRARY_PACKAGE_NAMES).map(pack -> pack + "::'" + op + "'").toArray(String[]::new);
	}

	protected void addCastResultSubsetting() {
		OperatorExpression target = getTarget();
		if (CAST_OPERATOR.equals(target.getOperator())) {
			EList<Feature> ownedFeatures = target.getOwnedFeature();
			if (ownedFeatures.size() > 1) {
				TypeUtil.addImplicitGeneralTypeTo(target.getResult(),
						SysMLPackage.eINSTANCE.getSubsetting(), ownedFeatures.get(1));
			}
		}
	}
	
	@Override
	public void computeImplicitGeneralTypes() {
		OperatorExpression target = getTarget();
		String operator = target.getOperator();
		if (operator != null) {
			addDefaultGeneralType(SysMLPackage.eINSTANCE.getFeatureTyping(), getOperatorQualifiedNames(operator));
		}
		super.computeImplicitGeneralTypes();
	}
	
	@Override
	public void doTransform() {
		super.doTransform();
		addCastResultSubsetting();
	}
	
}