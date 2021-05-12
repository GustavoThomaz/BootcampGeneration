package ProgramaçãoOrientadaObjetos;

public class Preguica extends Animal{

	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	@Override
	void emitirSom() {
		System.out.println("A preguiça está grunhindo.");
	}
	
	void subirArvore () {
		System.out.println("Sobe árvore");
	}
	

}
