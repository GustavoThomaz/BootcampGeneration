package ProgramaçãoOrientadaObjetos;

public class Cavalo extends Animal {

	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	void emitirSom() {
		System.out.println("O cavalo está relichando.");
	}
	
	void correr () {
		System.out.println("está correndo");
	}
	
	
}
