/*
 * generated by Xtext 2.12.0
 */
package org.omg.sysml.usage.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.omg.sysml.usage.services.SysMLGrammarAccess;

@SuppressWarnings("all")
public class SysMLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected SysMLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_BlockDefinition_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_Part_SemicolonKeyword_3_0_or___LeftCurlyBracketKeyword_3_1_0_RightCurlyBracketKeyword_3_1_2__;
	protected AbstractElementAlias match_ValueTypeDefinition_SemicolonKeyword_2_0_1_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SysMLGrammarAccess) access;
		match_BlockDefinition_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getBlockDefinitionAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getBlockDefinitionAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getBlockDefinitionAccess().getSemicolonKeyword_2_0()));
		match_Part_SemicolonKeyword_3_0_or___LeftCurlyBracketKeyword_3_1_0_RightCurlyBracketKeyword_3_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getPartAccess().getLeftCurlyBracketKeyword_3_1_0()), new TokenAlias(false, false, grammarAccess.getPartAccess().getRightCurlyBracketKeyword_3_1_2())), new TokenAlias(false, false, grammarAccess.getPartAccess().getSemicolonKeyword_3_0()));
		match_ValueTypeDefinition_SemicolonKeyword_2_0_1_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getValueTypeDefinitionAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getValueTypeDefinitionAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getValueTypeDefinitionAccess().getSemicolonKeyword_2_0_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_BlockDefinition_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_BlockDefinition_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Part_SemicolonKeyword_3_0_or___LeftCurlyBracketKeyword_3_1_0_RightCurlyBracketKeyword_3_1_2__.equals(syntax))
				emit_Part_SemicolonKeyword_3_0_or___LeftCurlyBracketKeyword_3_1_0_RightCurlyBracketKeyword_3_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ValueTypeDefinition_SemicolonKeyword_2_0_1_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_ValueTypeDefinition_SemicolonKeyword_2_0_1_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ';' | ('{' '}')
	 *
	 * This ambiguous syntax occurs at:
	 *     name=Name (ambiguity) (rule end)
	 */
	protected void emit_BlockDefinition_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';' | ('{' '}')
	 *
	 * This ambiguous syntax occurs at:
	 *     base=[Part|QualifiedName] (ambiguity) (rule end)
	 *     definition=[Definition|QualifiedName] (ambiguity) (rule end)
	 *     multiplicity=Multiplicity ']' (ambiguity) (rule end)
	 *     name=Name (ambiguity) (rule end)
	 */
	protected void emit_Part_SemicolonKeyword_3_0_or___LeftCurlyBracketKeyword_3_1_0_RightCurlyBracketKeyword_3_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';' | ('{' '}')
	 *
	 * This ambiguous syntax occurs at:
	 *     name=Name (ambiguity) (rule end)
	 */
	protected void emit_ValueTypeDefinition_SemicolonKeyword_2_0_1_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}