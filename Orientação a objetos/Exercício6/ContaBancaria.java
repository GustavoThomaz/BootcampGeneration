package ProgramaçãoOrientadaObjetos;

public class ContaBancaria {
	String proprietario;
	String tipoConta;
	int saldo;
	
	public ContaBancaria (String proprietario, String tipoConta, int saldo) {
		this.proprietario = proprietario;
		this.tipoConta = tipoConta;
		this.saldo = saldo;
	}

	 String getProprietario() {
		return proprietario;
	}

	 void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	 String getTipoConta() {
		return tipoConta;
	}

	 void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	 int getSaldo() {
		return saldo;
	}

	void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	public void imprime () {
		System.out.println("O " + proprietario + " possui uma conta " + tipoConta + "com um saldo " + saldo);
	}
	
	int saca (int valor) {
		return this.saldo - valor;
	}
	
	int deposita (int valor) {
		this.saldo = this.saldo + valor ;
		return this.saldo;
	}
	
}
