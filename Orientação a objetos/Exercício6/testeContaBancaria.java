package ProgramaçãoOrientadaObjetos;

public class testeContaBancaria {
	public static void main(String[] args) {
		ContaBancaria conta1 = new ContaBancaria("Ester","corrente", 850);
		ContaBancaria conta2 = new ContaBancaria("Giullia", "Poupança", 750);
		
		conta1.imprime();
		conta2.imprime();
		
		conta1.deposita(1000);
		conta2.deposita(150);
		
		conta1.imprime();
		conta2.imprime();
		
	}
}
