package entities;

public class PessoaFisica extends Contribuinte {
	
	private Double gastosSaude;

	public PessoaFisica(String nome, Double renda, Double gastosSaude) {
		super(nome, renda);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}
	
	@Override
	public Double impostoAPagar () {
		double valor;
		if (renda >= 20000) {
			valor = renda * 0.25;
		}
		else {
			valor = renda * 0.15;
		}
		if (gastosSaude > 0) {
			valor -= gastosSaude / 2;
		}
		return valor;
	}

}
