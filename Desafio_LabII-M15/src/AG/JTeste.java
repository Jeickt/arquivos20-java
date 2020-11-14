package AG;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class JTeste {

	GeneralTree createTree () {
		//================
	    //  IMPLEMENTAR
	    //================
	    
    	return null;
	}
	
	@Test
	void test() {
		GeneralTree myTree = createTree();
		myTree.print(myTree);
		
		assertTrue((myTree.contaFilhosNodo(myTree)) == 6);
		assertTrue((myTree.imprimirParaLista(myTree)).getFirst().getData() == "Array.java");
	}

}
