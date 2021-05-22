package ProgramaçãoOrientadaObjetos;

public class Cachorro extends Animal {

	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	void emitirSom() {
		System.out.println("O cachorro está latindo.");
	}
	
	void correr () {
		System.out.println("está correndo");
	}
	

}
