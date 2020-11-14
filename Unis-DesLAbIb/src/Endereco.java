public class Endereco extends Bairro {
	
	private String rua;
	private int numero;
	private String complemento;
	
	public Endereco(String cidade, String uf, String bairro, String cep, String rua, int numero) {
		super(cidade, uf, bairro, cep);
		this.rua = rua;
		this.numero = numero;
	}
	
	public Endereco(String cidade, String uf, String bairro, String cep, String rua, int numero, String complemento) {
		super(cidade, uf, bairro, cep);
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	// exibe letra inicial do nome da rua.
	public char qualInicial() {
		return rua.charAt(0);
	}
	
	public void exibeDados() {
	    System.out.println("Rua: " + rua);
	    System.out.println("Número: " + numero);
	    super.exibeDados();
	    }
	
}
