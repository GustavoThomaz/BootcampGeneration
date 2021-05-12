package ProgramaçãoOrientadaObjetos;

public class Paciente {
	String nome;
	String numeroCarterinha;
	String sintomas;
	int idade;
	
	public Paciente(String nome, String numeroCarterinha,String sintomas, int idade ) {
		this.nome = nome;
		this.numeroCarterinha = numeroCarterinha;
		this.sintomas = sintomas;
		this.idade = idade;
	}

	String getNome() {
		return nome;
	}

	void setNome(String nome) {
		this.nome = nome;
	}

	String getNumeroCarterinha() {
		return numeroCarterinha;
	}

	 void setNumeroCarterinha(String numeroCarterinha) {
		this.numeroCarterinha = numeroCarterinha;
	}

	String getSintomas() {
		return sintomas;
	}

	void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}

	 int getIdade() {
		return idade;
	}

	void setIdade(int idade) {
		this.idade = idade;
	}
	
	void imprime() {
		System.out.println("O paciente " + nome + " com o número de carterinha " + numeroCarterinha + " e idade " + idade + " anos está sentindo " + sintomas + " e deverá passar com o " + this.classifica(this));
	}
	String classifica (Paciente paciente) {
		if (paciente.idade>15) {
			return "Pediatra";
		}else {
			return "Clínico";
		}
		
	}
	 
	
}
