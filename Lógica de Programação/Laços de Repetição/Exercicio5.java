package sintaxeJava;

import java.util.Scanner;

public class Exercicio5 {
	public static void main (String[] args) {
		float soma = 0, num = 0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Entre com o número: ");
			num = leia.nextFloat();
			
			soma = soma + num;
		}while (num != 0);
		
		System.out.printf("\nA soma é " + soma);
		
		leia.close();
	}
}
