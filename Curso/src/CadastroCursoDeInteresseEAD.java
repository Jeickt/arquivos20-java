// Cadastra o interesse do futuro estudante por até dois cursos EAD e verifica sua disponibilidade.
public class CadastroCursoDeInteresseEAD {

	private String interessado;
	private String email;
	private String curso1;
	private String curso2 = "-";

	// Cadastro para 2 cursos de interesse.
	public CadastroCursoDeInteresseEAD(String interessado, String email, String curso1, String curso2) {
		this.interessado = interessado;
		this.email = email;
		this.curso1 = curso1;
		this.curso2 = curso2;
	}

	// Cadastro para 1 curso de interesse.
	public CadastroCursoDeInteresseEAD(String interessado, String email, String curso1) {
		this.interessado = interessado;
		this.email = email;
		this.curso1 = curso1;
	}

	public String getInteressado() {
		return interessado;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCurso1() {
		return curso1;
	}

	public void setCurso1(String curso1) {
		this.curso1 = curso1;
	}

	public String getCurso2() {
		return curso2;
	}

	public void setCurso2(String curso2) {
		this.curso2 = curso2;
	}

	// Verifica disponibilidade do curso.
	public boolean cursoDisponivel(String curso, String[] cursos) {
		for (int i=0; i < cursos.length; i++) {
			if (curso == cursos[i]) {
				return true;
			}
		}
		return false;
	}

	// Calcula mensalidade do curso para matrículas realizadas em janeiro, fevereiro, julho ou agosto.
	public double mensalidadeCurso(String modalidade, int mes) {
		double valorSemestre = 0.0;
		if (modalidade == "presencial")
			valorSemestre = 6000.00;
		else if (modalidade == "híbrida")
			valorSemestre = 5000.00;
		else
			valorSemestre = 4000.00;
		int mensalidades = 0;
		switch (mes) {
		case 1: mensalidades = 6; break;
		case 2: mensalidades = 5; break;
		case 7: mensalidades = 6; break;
		case 8: mensalidades = 5; break;
		}
		int copMens = mensalidades; 
		if (mensalidades == 6) {
			while (mensalidades != 0) {
				System.out.printf("%dª mensalidade - valor de %.02f\n", 7-mensalidades, valorSemestre/6);
				mensalidades--;
			}
		}
		else {
			while (mensalidades != 0) {
				System.out.printf("%dª mensalidade - valor de %.02f\n", 6-mensalidades, valorSemestre/5);
				mensalidades--;
			}
		}
		return valorSemestre/copMens;
	}

}