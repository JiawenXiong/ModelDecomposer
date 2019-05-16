package ntesec.juli;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import ntesec.juli.codegeneration.PowePC;
import ntesec.juli.cooperation.DecomposeNtoN;
import ntesec.juli.staticAnalysis.AST;
import ntesec.juli.staticAnalysis.ASTNode;
import ntesec.juli.staticAnalysis.CFG;
import ntesec.juli.staticAnalysis.DFG;
import ntesec.juli.staticAnalysis.PDG;
import ntesec.juli.staticAnalysis.SDG;
import ntesec.juli.staticAnalysis.Statement;

public class GenApp {
	public static void main_Decompose() throws IOException {
		// String fileName = "resources/input.imc";
		String fileName = "resources/stm32_powerpc.imc";

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

		SDG sdg = new SDG();
		SDG.combinedPDGs(mapPDGs);

		Map<String, List<Statement>> mapSDG = mapDFGs;
		Map<String, Set<Integer>> mapInterSDG = SDG.combinedPDGs(mapPDGs);

		System.out.println("mainProcess: " + AST.mainProgram + "\n");

		System.out.println("output SDG :" + mapSDG.size());
		for (String key : mapSDG.keySet()) {
			System.out.println("\nSDG ---------- " + key + "\n");

			SDG.printSDG(mapSDG.get(key));
		}

		DecomposeNtoN decomposeNtoN = new DecomposeNtoN();
		decomposeNtoN.decomposeModelNtoN(ast, mapPDGs);
		List<String> outCode2GenList = DecomposeNtoN
				.outCode2Gen(DecomposeNtoN.mapDecompose);

		for (String modelcode : outCode2GenList) {
			List<String> modelGenedCode = PowePC
					.genCodePowerPCFromString(modelcode);
		}

		System.out.println("\nCopyright by JuLi. © 2016–2019.  NTESEC, Org.");

	}

	public static void main(String[] args) throws IOException {
		main_Decompose();
	}
}
