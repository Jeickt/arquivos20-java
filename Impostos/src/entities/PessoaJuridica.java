package entities;

public class PessoaJuridica extends Contribuinte {
	
	private Integer funcionarios;

	public PessoaJuridica(String nome, Double renda, Integer funcionarios) {
		super(nome, renda);
		this.funcionarios = funcionarios;
	}

	public Integer getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(Integer funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	@Override
	public Double impostoAPagar () {
		double valor;
		if (funcionarios > 10) {
			valor = renda * 0.14;
		}
		else {
			valor = renda * 0.16;
		}
		return valor;
	}
	
}
