public class Principal {

	public static void main(String[] args) {
		
		Universidade[] universidades = new Universidade[(Teclado.leInt("Quantas universidades ser�o cadastradas? "))];
		
		for (int i = 0; i < universidades.length; i++) {
			System.out.printf("Informe os dados da %d� Universidade:\n", i+1);
			String nome = Teclado.leString("Nome da Universidade: ");
			int quantAlunos = Teclado.leInt("Quantos alunos h� na Universidade: ");
			int quantProfessores = Teclado.leInt("Quantos professores h� na Universidade: ");
			int tipoUniversidade = Teclado.leInt("A Universidade � P�blica ou Privada? Digite 1=P�blica; 2=Privada: ");
			while (tipoUniversidade != 1 && tipoUniversidade != 2)
				tipoUniversidade = Teclado.leInt("Op��o inv�lida! A Universidade � P�blica ou Privada? Digite 1 se P�blica; 2 se Privada: ");
			if (tipoUniversidade == 1) {
				String localidade = Teclado.leString("Onde se encontra a Universidade? Informe no formato cidade/Estado: ");
				while (!localidade.contains("/"))
					localidade = Teclado.leString("Informa��o incorreta. Onde se encontra a Universidade? Informe no formato cidade/Estado: ");
				String[] local = localidade.split("/");
				universidades[i] = new Publica(nome, quantAlunos, quantProfessores, local[1], local[0]);
			}
			else {
				double valorMensalidade = Teclado.leDouble("Qual o valor da mensalidade dos curso da Universidade? Informe no formato 000.00");
				universidades[i] = new Privada(nome, quantAlunos, quantProfessores, valorMensalidade);
			}
		}
		
		MEC mec = new MEC();
		
		System.out.println();
		
		mec.imprimeUniversidades(universidades);
		
		mec.maisCara(universidades);
		
		mec.universidadesDoSul(universidades);
		
	}

}
