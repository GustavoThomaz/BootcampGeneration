package sintaxeJava;

import java.util.Scanner;

public class Exercicio2 {
	public static void main (String[] args) {
		int quantPares = 0, quantImpar = 0 ;
		
		Scanner leitor = new Scanner(System.in);
		
		for ( int i = 0 ; i<10 ; i++) {
					
			System.out.println("Entre com um número");
			int num = leitor.nextInt();
			
			if( num%2 == 0) {
				quantPares++ ;
			}else {
				quantImpar++ ;
			}
		}
		
		System.out.printf("\nA quantidade de números pares é " + quantPares);
		System.out.printf("\nA quantidade de números ímpares é " + quantImpar);
		leitor.close();
	}
	
}
