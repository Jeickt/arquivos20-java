
public class TesteFun4Study {

	public static void main(String args[])
	{
		/* A classe de teste deve criar 2 cidades e 2 alunos para cada cidade criada.  
		 * Utilize a classe: Teclado para solicitar os dados do teclado
		 */
		int contCidade = 1, contEstudante = 1, contEstudanteTotal = 1;

		do {

			System.out.printf("\nCadastre a Cidade %d:\n\n", contCidade);                      
			Cidade c = new Cidade(Teclado.leInt("Informe o código: "),
					Teclado.leString("Informe a descrição: "),
					Teclado.leString("Informe a UF: "));
			c.exibeDados();
			contCidade++;

			while (contEstudante != 0) {                               
				System.out.printf("\nCadastre o Estudante %d:\n\n", contEstudanteTotal);                      
				Estudante e = new Estudante(Teclado.leInt("Informe o código: "),
						Teclado.leString("Informe o nome: "),
						Teclado.leString("Informe a data de nascimento: "),
						Teclado.leString("Informe o email: "),
						Teclado.leString("Informe a senha: "),
						c);
				e.exibeDados();
				contEstudante++;
				contEstudanteTotal++;

				char opcao1 = Teclado.leChar("Há algum dado a atualizar? S=sim/N=não: ");
				opcao1 = Character.toUpperCase(opcao1);
				while (opcao1 != 'S' && opcao1 != 'N') {
					opcao1 = Teclado.leChar("Opção inválida! Há algum dado a atualizar? S=sim/N=não: ");
					opcao1 = Character.toUpperCase(opcao1);
				}
				while (opcao1 == 'S') {
					int menu = Teclado.leInt("Qual atributo se deseja alterar? 1-Nome; 2-Data de nascimento; 3-Email; 4-Senha: ");
					switch (menu) {
					case 1: e.setNome(Teclado.leString("Informe o nome: ")); break;
					case 2: e.setDtNascimento(Teclado.leString("Informe a data de nascimento: ")); break;
					case 3: e.setEmail(Teclado.leString("Informe o email: ")); break;
					case 4: e.setSenha(alterarSenha(e.getSenha())); break;
					default: System.out.println("Opção Inválida.");
					}

					e.exibeDados();
					opcao1 = Teclado.leChar("Algum outro dado a atualizar? S=sim/N=não: ");
					opcao1 = Character.toUpperCase(opcao1);

				}

				if (contEstudante > 4) {
					char opcao2 = Teclado.leChar("\nHá novo estudante a cadastrar? S=sim/N=não: ");
					opcao2 = Character.toUpperCase(opcao2);
					while (opcao2 != 'S' && opcao2 != 'N') {
						opcao2 = Teclado.leChar("Opção inválida! Há novo estudante a cadastrar? S=sim/N=não: ");
						opcao2 = Character.toUpperCase(opcao2);
					}
					if (opcao2 == 'N')
						contEstudante = 0;
				}
			}
			contEstudante++;

			char opcao3 = Teclado.leChar("Há nova cidade a cadastrar? S=sim/N=não: ");
			opcao3 = Character.toUpperCase(opcao3);
			while (opcao3 != 'S' && opcao3 != 'N') {
				opcao3 = Teclado.leChar("Opção inválida! Há nova cidade a cadastrar? S=sim/N=não: ");
				opcao3 = Character.toUpperCase(opcao3);
			}
			if (opcao3 == 'N')
				contCidade = 0;
		} while (contCidade != 0);
		
		System.out.println("\nCadastros finalizados com sucesso!");

	}

	public static String alterarSenha(String senhaAtual) {
		String nS1 = "O", nS2 = "X";
		String verif = Teclado.leString("Para atualização da senha, digite a atual: ");
		while (!verif.contentEquals(senhaAtual)) {
			verif = Teclado .leString("Senha incorreta! Para atualização da senha, digite a atual: ");
		}

		while (!nS1.equals(nS2) || nS1.length() < 8) {
			nS1 = Teclado.leString("Informe sua nova senha com no mínimo 8 dígitos: ");
			nS2 = Teclado.leString("Repita sua nova senha: ");
			if (!nS1.equals(nS2) || nS1.length() < 8)
				System.out.println("Dados não validados. Tente novamente:");
		}
		System.out.println("Senha recadastrada com sucesso!");
		return nS2;
	}

}
