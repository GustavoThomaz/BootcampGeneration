package ProgramaçãoOrientadaObjetos;

public abstract class Animal {
	private String nome;
	private int idade;
	
	public Animal(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	abstract void emitirSom();
	
	String mostraNome () {
		return this.nome;
	}
	
	int mostraIdade () {
		return this.idade;
	}
	void imprime () {
		System.out.println("O " + this.mostraNome() + " tem " + this.mostraIdade() + " anos");
	}
	
}
