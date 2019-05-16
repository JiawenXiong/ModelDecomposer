package ntesec.juli;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import ntesec.juli.cooperation.DecomposeNtoN;
import ntesec.juli.staticAnalysis.AST;
import ntesec.juli.staticAnalysis.ASTNode;
import ntesec.juli.staticAnalysis.CFG;
import ntesec.juli.staticAnalysis.DFG;
import ntesec.juli.staticAnalysis.PDG;
import ntesec.juli.staticAnalysis.SDG;
import ntesec.juli.staticAnalysis.Statement;
import ntesec.juli.utils.GraphvizUtil;

/**
 * Hello world!
 *
 */
public class App {

	public static void main_AST() throws IOException {
		String fileName = "resources/input.imc";

		Map<String, ASTNode> mapAst = AST.genAST(fileName);

		System.out.println(mapAst.size());
		System.out.println(mapAst.size());

		System.out.println("ast.sixe() : " + mapAst.size());
		for (String key : mapAst.keySet()) {
			System.out.println("\n- - - - - -\n");
			ASTNode node = mapAst.get(key);
			AST.printTree(node);
		}

		System.out.println("\nCopyright by JuLi. © 2016–2019, NTESEC.");
	}

	public static void main_CFG() throws IOException {
		String fileName = "resources/input.imc";

		Map<String, ASTNode> mapAst = AST.genAST(fileName);

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

		System.out.println("\nCopyright by JuLi. © 2016–2019, NTESEC.");
	}

	public static void main_DFG() throws IOException {
		String fileName = "resources/input.imc";

		Map<String, ASTNode> mapAst = AST.genAST(fileName);
		Map<String, Set<String>> mapvars = AST.mapVars;

		CFG cfg = new CFG();
		Map<String, List<Statement>> mapCFGs = new HashMap<>();
		for (String key : mapAst.keySet()) {
			mapCFGs.put(key, cfg.getCFGfromAST(mapAst.get(key)));
		}

		DFG dfg = new DFG();
		Map<String, List<Statement>> mapDFGs = new HashMap<>();
		for (String key : mapAst.keySet()) {
			mapDFGs.put(key, dfg.getDFGbaseCFGandVars(mapCFGs.get(key),
					mapvars.get(key)));
		}

		System.out.println("输出 DFG :" + mapCFGs.size());
		for (String key : mapCFGs.keySet()) {
			System.out.println("\nDFG ----------\n");

			DFG.printDFG(mapDFGs.get(key));
		}

		System.out.println("\nCopyright by JuLi. © 2016–2019, NTESEC.");
	}

	public static void main_PDG() throws IOException {
		String fileName = "resources/input.imc";

		Map<String, ASTNode> mapAst = AST.genAST(fileName);
		Map<String, Set<String>> mapvars = AST.mapVars;

		CFG cfg = new CFG();
		Map<String, List<Statement>> mapCFGs = new HashMap<>();
		for (String key : mapAst.keySet()) {
			mapCFGs.put(key, cfg.getCFGfromAST(mapAst.get(key)));
		}

		DFG dfg = new DFG();
		Map<String, List<Statement>> mapDFGs = new HashMap<>();
		for (String key : mapAst.keySet()) {
			mapDFGs.put(key, dfg.getDFGbaseCFGandVars(mapCFGs.get(key),
					mapvars.get(key)));
		}

		PDG pdg = new PDG();
		Map<String, List<Statement>> mapPDGs = new HashMap<>();
		for (String key : mapAst.keySet()) {
			mapPDGs.put(key, pdg.getPDGformDFG(mapDFGs.get(key)));
		}

		System.out.println("mainProcess: " + AST.mainProgram + "\n");

		System.out.println("输出 PDG :" + mapCFGs.size());
		for (String key : mapPDGs.keySet()) {
			System.out.println("\nPDG ---------- " + key + "\n");

			DFG.printDFG(mapPDGs.get(key));
			GraphvizUtil.transformPDGToDot(mapPDGs.get(key), key);
		}

		System.out.println("\nCopyright by JuLi. © 2016–2019, NTESEC.");
	}

	public static void main_SDG() throws IOException {
		String fileName = "resources/input.imc";

		Map<String, ASTNode> mapAst = AST.genAST(fileName);
		Map<String, Set<String>> mapvars = AST.mapVars;

		CFG cfg = new CFG();
		Map<String, List<Statement>> mapCFGs = new HashMap<>();
		for (String key : mapAst.keySet()) {
			mapCFGs.put(key, cfg.getCFGfromAST(mapAst.get(key)));
		}

		DFG dfg = new DFG();
		Map<String, List<Statement>> mapDFGs = new HashMap<>();
		for (String key : mapAst.keySet()) {
			mapDFGs.put(key, dfg.getDFGbaseCFGandVars(mapCFGs.get(key),
					mapvars.get(key)));
		}

		PDG pdg = new PDG();
		Map<String, List<Statement>> mapPDGs = new HashMap<>();
		for (String key : mapAst.keySet()) {
			mapPDGs.put(key, pdg.getPDGformDFG(mapDFGs.get(key)));
		}

		SDG.combinedPDGs(mapPDGs);

		Map<String, List<Statement>> mapSDG = mapDFGs;

		System.out.println("mainProcess: " + AST.mainProgram + "\n");

		System.out.println("输出 SDG :" + mapSDG.size());
		for (String key : mapSDG.keySet()) {
			System.out.println("\nSDG ---------- " + key + "\n");

			SDG.printSDG(mapSDG.get(key));

		}

		System.out.println("\nCopyright by JuLi. © 2016–2019, NTESEC.");
	}

	public static void main_Decompose() throws IOException {
		String intputFileName = "resources/input.imc";
		// String fileName = "resources/stm32_powerpc.imc";

		AST ast = new AST();
		Map<String, ASTNode> mapAst = AST.genAST(intputFileName);
		Map<String, Set<String>> mapvars = AST.mapVars;

		CFG cfg = new CFG();
		Map<String, List<Statement>> mapCFGs = new HashMap<>();
		for (String key : mapAst.keySet()) {
			mapCFGs.put(key, cfg.getCFGfromAST(mapAst.get(key)));
		}

		DFG dfg = new DFG();
		Map<String, List<Statement>> mapDFGs = new HashMap<>();
		for (String key : mapAst.keySet()) {
			mapDFGs.put(key, dfg.getDFGbaseCFGandVars(mapCFGs.get(key),
					mapvars.get(key)));
		}

		PDG pdg = new PDG();
		Map<String, List<Statement>> mapPDGs = new HashMap<>();
		for (String key : mapAst.keySet()) {
			mapPDGs.put(key, pdg.getPDGformDFG(mapDFGs.get(key)));
		}

		SDG.combinedPDGs(mapPDGs);

		Map<String, List<Statement>> mapSDG = mapDFGs;

		System.out.println("mainProcess: " + AST.mainProgram + "\n");

		System.out.println("输出 SDG :" + mapSDG.size());
		for (String key : mapSDG.keySet()) {
			System.out.println("\nSDG ---------- " + key + "\n");
			SDG.printSDG(mapSDG.get(key));
		}

		DecomposeNtoN decomposeNtoN = new DecomposeNtoN();
		decomposeNtoN.decomposeModelNtoN(ast, mapPDGs);
		// decomposeNtoN.print(DecomposeNtoN.mapDecompose);

		System.out.println("\nCopyright by JuLi. © 2016–2019, NTESEC.");

	}

	public static void main(String[] args) throws IOException {
//        main_AST();
//        main_CFG();
//        main_DFG();
//        main_PDG();
//        main_SDG();
		if (args.length < 1) {
			System.out.println("Usage: java -jar ModelDecomposer.jar <path of original model>");
			System.out.println("Example: java -jar ModelDecomposer.jar resources/input.imc");
		}else {
			main_Decompose();
		}
	}

	public static void example_cars() throws IOException {
		String fileName = "resources/input.imc";

		AST ast = new AST();
		Map<String, ASTNode> mapAst = AST.genAST(fileName);
		Map<String, Set<String>> mapvars = AST.mapVars;

		CFG cfg = new CFG();
		Map<String, List<Statement>> mapCFGs = new HashMap<>();
		for (String key : mapAst.keySet()) {
			mapCFGs.put(key, cfg.getCFGfromAST(mapAst.get(key)));
		}

		DFG dfg = new DFG();
		Map<String, List<Statement>> mapDFGs = new HashMap<>();
		for (String key : mapAst.keySet()) {
			mapDFGs.put(key, dfg.getDFGbaseCFGandVars(mapCFGs.get(key),
					mapvars.get(key)));
		}

		PDG pdg = new PDG();
		Map<String, List<Statement>> mapPDGs = new HashMap<>();
		for (String key : mapAst.keySet()) {
			mapPDGs.put(key, pdg.getPDGformDFG(mapDFGs.get(key)));
		}

		SDG.combinedPDGs(mapPDGs);

		Map<String, List<Statement>> mapSDG = mapDFGs;

		System.out.println("mainProcess: " + AST.mainProgram + "\n");

		System.out.println("输出 SDG :" + mapSDG.size());
		for (String key : mapSDG.keySet()) {
			System.out.println("\nSDG ---------- " + key + "\n");

			SDG.printSDG(mapSDG.get(key));
		}

		DecomposeNtoN decomposeNtoN = new DecomposeNtoN();
		decomposeNtoN.decomposeModelNtoN(ast, mapPDGs);

		System.out.println("\nCopyright by JuLi. © 2016–2019.  NTESEC, Org.");
	}
}
