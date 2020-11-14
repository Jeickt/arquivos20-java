public class Bairro extends Cidade {
	
	private String bairro;
	private String cep;
	
	public Bairro(String cidade, String uf, String bairro, String cep) {
		super(cidade, uf);
		this.bairro = bairro;
		this.cep = cep;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
	// exibe letra inicial do nome do bairro.
	public char qualInicial() {
		return bairro.charAt(0);
	}
	
    public void exibeDados() {
        System.out.println("Bairro: " + bairro);
        System.out.println("CEP: " + cep);
        super.exibeDados();
    }
}
