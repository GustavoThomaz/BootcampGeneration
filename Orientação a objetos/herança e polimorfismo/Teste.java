package ProgramaçãoOrientadaObjetos;

public class Teste {
	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro ("Bolt",5);
		cachorro.imprime();
		cachorro.emitirSom();
		
		Cavalo cavalo = new Cavalo ("Lupa Lupa", 20);
		cavalo.imprime();
		cavalo.emitirSom();
		
		Preguica preguica = new Preguica ("Giullia",35);
		preguica.imprime();
		preguica.emitirSom();
	}
}
