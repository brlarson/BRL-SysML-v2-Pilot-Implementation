/**
 * generated by Xtext 2.12.0
 */
package org.omg.sysml.usage.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.SimpleScope;
import org.omg.sysml.usage.scoping.AbstractSysMLScopeProvider;
import org.omg.sysml.usage.sysML.Definition;
import org.omg.sysml.usage.sysML.Member;
import org.omg.sysml.usage.sysML.Part;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
@SuppressWarnings("all")
public class SysMLScopeProvider extends AbstractSysMLScopeProvider {
  @Override
  public IScope getScope(final EObject context, final EReference reference) {
    IScope scope = super.getScope(context, reference);
    if ((context instanceof Member)) {
      final EObject owner = ((Member) context).eContainer();
      if ((owner instanceof Part)) {
        final Definition definition = ((Part) owner).getDefinition();
        if (((definition != null) && (!definition.eIsProxy()))) {
          Iterable<IEObjectDescription> _allElements = this.getScope(definition, reference).getAllElements();
          SimpleScope _simpleScope = new SimpleScope(scope, _allElements);
          scope = _simpleScope;
        }
        final Part base = ((Part) owner).getBase();
        if (((base != null) && (!base.eIsProxy()))) {
          Iterable<IEObjectDescription> _allElements_1 = this.getScope(base, reference).getAllElements();
          SimpleScope _simpleScope_1 = new SimpleScope(scope, _allElements_1);
          scope = _simpleScope_1;
        }
      }
    }
    return scope;
  }
}