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
		
		System.out.println("***--------- BEM VINDO AO PROTÓTIPO BTSTEST ---------***");
		
		while (opcao != 8) {
			System.out.println("\nEscolha uma das seguites opções:\n"
					+ "(1) Inserir valor;\n"
					+ "(2) Buscar valor;\n"
					+ "(3) Percurso;\n"
					+ "(4) Número de nodos folha;\n"
					+ "(5) Altura;\n"
					+ "(6) Número total de nodos;\n"
					+ "(7) Verificar se a árvore está cheia;\n"
					+ "(8) Sair.\n");

			try {
				opcao = sc.nextInt();
				if (opcao < 1 || opcao > 8)
					System.out.println("Opção inválida!");
			} catch (InputMismatchException e) {
				System.out.println("Digito Inválido!");
			}
			
			if (opcao == 3) {
				System.out.println("Escolha uma das opções de percurso:\n"
						+ "(a) Em ordem;\n"
						+ "(b) Em Pré-Ordem;\n"
						+ "(c) Em Pós-Ordem;\n");
				try {
					subOpcao = sc.next().charAt(0);
					if (subOpcao != 'a' && subOpcao != 'b' && subOpcao != 'c')
						System.out.println("Opção inválida!");
				} catch (InputMismatchException e) {
					System.out.println("Caracter inválido!");
				}
			}
			
			if (opcao >= 1 && opcao <= 8) {
				try {
					switch (opcao) {
					case 1: System.out.println("Digite o valor:"); a.insert(sc.nextInt()); break;
					case 2: System.out.println("Digite o valor:"); busca = sc.nextInt(); 
							if (a.search(busca) != null) System.out.println("O nodo do valor é: " + a.search(busca)); 
							else System.out.println("O valor não está incluído na árvore."); break;
					case 3: if (subOpcao == 'a') { System.out.print("A ordem é: "); a.inorder(); } 
							else if (subOpcao == 'b') { System.out.print("A ordem é: "); a.preorder(); }
							else if (subOpcao == 'c') { System.out.print("A ordem é: "); a.postorder(); } break;
					case 4: System.out.println("O número de nodos folha da árvore é: " + a.countLeafNodes()); break;
					case 5: System.out.println("A altura da árvore é: " + a.height()); break;
					case 6: System.out.println("O número total de nodos da árvore é: " + a.countNodes()); break;
					case 7: if (a.isFull()) System.out.println("A árvore está cheia."); else System.out.println("A árvore não está cheia."); break;
					default: System.out.println("Execução encerrada. Espero que tenha gostado da experiência.");
					}
				} catch (InputMismatchException e) {
					System.out.println("Erro. Este não é um número.");
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
