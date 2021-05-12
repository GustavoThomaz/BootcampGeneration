package ProgramaçãoOrientadaObjetos;

public class testeAvião {
	public static void main(String[] args) {
		
		Avião aviao1 = new Avião ("Cessna 172 Skyhawk","branco e vermelho","Embraer",300);
		Avião aviao2 = new Avião ("Airbus A320","branco e preto","Airbus",800);
		
		aviao1.imprimeComTempo(300);
		
		aviao2.decolar();
		aviao2.pousar();
		
		aviao1.imprime();
		aviao2.imprime();
		
	}
}
