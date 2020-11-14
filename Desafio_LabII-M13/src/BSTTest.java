import java.util.InputMismatchException;
import java.util.Scanner;

public class BSTTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BST a = new BST();
		int opcao = 0, busca;
		char subOpcao = 'z';
		
		a.insert(75);
		a.insert(70);
		a.insert(79);
		a.insert(64);
		a.insert(72);
		a.insert(78);
		a.insert(84);
		a.insert(63);
		a.insert(66);
		a.insert(83);
		a.insert(86);
		
		System.out.println("***--------- BEM VINDO AO PROT�TIPO BTSTEST ---------***");
		
		while (opcao != 8) {
			System.out.println("\nEscolha uma das seguites op��es:\n"
					+ "(1) Inserir valor;\n"
					+ "(2) Buscar valor;\n"
					+ "(3) Percurso;\n"
					+ "(4) N�mero de nodos folha;\n"
					+ "(5) Altura;\n"
					+ "(6) N�mero total de nodos;\n"
					+ "(7) Verificar se a �rvore est� cheia;\n"
					+ "(8) Sair.\n");

			try {
				opcao = sc.nextInt();
				if (opcao < 1 || opcao > 8)
					System.out.println("Op��o inv�lida!");
			} catch (InputMismatchException e) {
				System.out.println("Digito Inv�lido!");
			}
			
			if (opcao == 3) {
				System.out.println("Escolha uma das op��es de percurso:\n"
						+ "(a) Em ordem;\n"
						+ "(b) Em Pr�-Ordem;\n"
						+ "(c) Em P�s-Ordem;\n");
				try {
					subOpcao = sc.next().charAt(0);
					if (subOpcao != 'a' && subOpcao != 'b' && subOpcao != 'c')
						System.out.println("Op��o inv�lida!");
				} catch (InputMismatchException e) {
					System.out.println("Caracter inv�lido!");
				}
			}
			
			if (opcao >= 1 && opcao <= 8) {
				try {
					switch (opcao) {
					case 1: System.out.println("Digite o valor:"); a.insert(sc.nextInt()); break;
					case 2: System.out.println("Digite o valor:"); busca = sc.nextInt(); 
							if (a.search(busca) != null) System.out.println("O nodo do valor �: " + a.search(busca)); 
							else System.out.println("O valor n�o est� inclu�do na �rvore."); break;
					case 3: if (subOpcao == 'a') { System.out.print("A ordem �: "); a.inorder(); } 
							else if (subOpcao == 'b') { System.out.print("A ordem �: "); a.preorder(); }
							else if (subOpcao == 'c') { System.out.print("A ordem �: "); a.postorder(); } break;
					case 4: System.out.println("O n�mero de nodos folha da �rvore �: " + a.countLeafNodes()); break;
					case 5: System.out.println("A altura da �rvore �: " + a.height()); break;
					case 6: System.out.println("O n�mero total de nodos da �rvore �: " + a.countNodes()); break;
					case 7: if (a.isFull()) System.out.println("A �rvore est� cheia."); else System.out.println("A �rvore n�o est� cheia."); break;
					default: System.out.println("Execu��o encerrada. Espero que tenha gostado da experi�ncia.");
					}
				} catch (InputMismatchException e) {
					System.out.println("Erro. Este n�o � um n�mero.");
				}
			}
			
			System.out.println();
			if (opcao == 8) {
				sc.close();
				break;
			} else {
				opcao = 0;
				subOpcao = 'z';
				sc.nextLine();
			}
		}
	}
}
