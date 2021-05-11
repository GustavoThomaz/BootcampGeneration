package ProgramaçãoOrientadaObjetos;

public class Avião {
	String modelo;
	String cor;
	String fabricante;
	int velocidade; 
	
	public Avião(String modelo, String cor, String fabricante, int velocidade) {
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.cor = cor;
		this.velocidade = velocidade;
	}
	
	public void decolar () {
		System.out.println("O avião " + modelo + " decolou");
	}
	
	public void pousar () {
		System.out.println("O avião "+ modelo + " pousou em segurança");
	}

	 String getModelo() {
		return modelo;
	}

	 void setModelo(String modelo) {
		this.modelo = modelo;
	}

	 String getCor() {
		return cor;
	}

	 void setCor(String cor) {
		this.cor = cor;
	}

	 String getFabricante() {
		return fabricante;
	}

	 void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	 int getVelocidade() {
		return velocidade;
	}

	 void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	 void imprimeComTempo (int distancia) {
		 System.out.println("A viagem do avião modelo " + modelo + " e cor " + cor + " com duração de " + this.tempoViagem(distancia) + "h foi um sucesso");
	 }
	 
	 int tempoViagem (int distancia) {
		 return distancia/this.velocidade;
	 }
	 
	public void imprime() {
		System.out.println("\nInformações do avião: " + "\nmodelo: " + modelo +
				"\ncor: " + cor + "\nfabricante: " + fabricante +
				"\nvelocidade máxima: " + velocidade);
	}
}
