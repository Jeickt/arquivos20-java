

public class Test {
	 public static void main (String args []) throws UnderflowException {
	    	GeneralTree raiz = new GeneralTree ("Documentos");
	    	GeneralTree sA1 = new GeneralTree ("Exercícios");
			GeneralTree sA2 = new GeneralTree ("Faculdade");
			GeneralTree sA3 = new GeneralTree ("ControleGasos.xls");
			raiz.attachSubtree(sA1);
			raiz.attachSubtree(sA2);
			raiz.attachSubtree(sA3);
			sA1.attachSubtree(new GeneralTree ("Arvore.java")); 
			sA1.attachSubtree(new GeneralTree ("Nodo.java")); 

			System.out.println(raiz.contaFilhosNodo(raiz));
			
			List impressaoArvore = raiz.imprimirParaLista(raiz);
			
			for (int i=0; i<=raiz.contaFilhosNodo(raiz); i++) {
				System.out.println(((String) ((GeneralTree) impressaoArvore.removeFromFront()).getKey()));
			}
	}

}
