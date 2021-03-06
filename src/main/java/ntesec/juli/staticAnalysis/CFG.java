package ntesec.juli.staticAnalysis;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import ntesec.juli.utils.FileUtil;

/**
 * Created by juli on 2017/3/6.
 */
public class CFG {
	public static List<Statement> CFGraphList = new ArrayList<>();

	public CFG() {
		CFG.CFGraphList = new ArrayList<>();
	}

//	public CFG(CFG cfg) {
//		CFG.CFGraphList = new ArrayList<>();
//		for (Statement statement : CFG.CFGraphList) {
//			CFG.CFGraphList.add(new Statement(statement));
//		}
//	}

	public static void printCFG(List<Statement> graphList) {
		for (Statement statement : graphList) {
			String out = "";

			out += "line: " + Integer.toString(statement.lineNumber)
					+ "\tlevel: " + Integer.toString(statement.level) + "\t";

			out += "\t\t\t";
			for (int i = 0; i < statement.level; ++i) {
				out += "\t";
			}
			out += statement.sliceCode;
			out += "\t-->\t";
			out += statement.label;
			out += "\n";

			out += "DEF / REF :\t";
			out += statement.DEF.toString();
			out += statement.REF.toString();
			out += "\n";

			out += "CFGNexts :\t";
			out += statement.CFGNexts.toString();
			out += "\n";
			System.out.println(out);
		}
	}

	// 深度遍历方式，转换为CFGraph
	public static void visitAST(ASTNode astNode) // level 是表示代码的层级
	{
		Statement statement = new Statement();

		statement.sliceCode = new String(astNode.sliceCode);
		statement.label = new String(astNode.label);
		statement.lineNumber = astNode.lineNumber;
		statement.level = astNode.level;

		statement.REF = new HashSet<>(astNode.REF);
		statement.DEF = new HashSet<>(astNode.DEF);

		CFGraphList.add(statement);
		for (ASTNode node : astNode.Nexts) {
			statement.CFGNexts.add(node.lineNumber);
			visitAST(node);
		}

	}

	// 从 AST 转换到 CFG
	public List<Statement> getCFGfromAST(ASTNode astNode) {
		CFGraphList = new ArrayList<>();

		visitAST(astNode);

		return CFGraphList;
	}

	public static void main(String[] Args) throws IOException {
		String code = FileUtil.readFile("resources/sortingExample.imc");

		Map<String, ASTNode> mapAst = AST.genAST(code);

		CFG cfg = new CFG();
		Map<String, List<Statement>> mapCFGs = new HashMap<>();
		for (String key : mapAst.keySet()) {
			mapCFGs.put(key, cfg.getCFGfromAST(mapAst.get(key)));
		}

		System.out.println("输出 CFG :" + mapCFGs.size());
		for (String key : mapCFGs.keySet()) {
			System.out.println("\nCFG ----------\n");

			CFG.printCFG(mapCFGs.get(key));
		}

		System.out.println("\nCopyright by JuLi. © 2016–2017 @ NTESEC.");
	}
}
