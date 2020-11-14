public class MEC {
	
	public void imprimeUniversidades(Universidade[] univ) {
		System.out.println("Lista de Universidades:\n");
		for (Universidade unidade : univ) {
			if (unidade instanceof Publica) {
				System.out.println("Universidade PÚBLICA:");
				((Publica)unidade).imprimeInfo();
			}
			else {
				System.out.println("Universidade PRIVADA:");
				((Privada)unidade).imprimeInfo();
			}	
			System.out.println();
		}
	}
	
	public void maisCara(Universidade[] univ) {
		Privada privada = new Privada(null, 0, 0, 0);
		System.out.println("Universidade com mensalidade mais cara:\n");
		for (Universidade unidade : univ) {
			if (unidade instanceof Privada)
				privada = (((Privada)unidade).getValorMensalidade() > privada.getValorMensalidade()) ? (Privada)unidade : privada;
		}
		privada.imprimeInfo();
		System.out.println();
	}

	public void universidadesDoSul(Universidade[] univ) {
		System.out.println("Lista de Universidades Públicas do Sul do Brasil:\n");
		for (Universidade unidade : univ) {
			if (unidade instanceof Publica) {
				if (((Publica)unidade).getEstado().contentEquals("RS") || ((Publica)unidade).getEstado().contentEquals("SC") || 
						((Publica)unidade).getEstado().contentEquals("PR")) {
					((Publica)unidade).imprimeInfo();
					System.out.println();
				}
			}
		}
	}
}
