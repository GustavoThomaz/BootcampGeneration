package sintaxeJava;

import java.util.Scanner;

public class Exercicio3 {
	public static void main (String[] args) {
		int idade, IdMenor21 = 0, IdMaior50 = 0, quant =0;
		
		Scanner leitor = new Scanner (System.in);
		System.out.println("Entre com a idade ");
		idade = leitor.nextInt();
		
		while (idade != -99) {
			if (idade < 21) {
				IdMenor21 = IdMenor21 + 1;
			}
			if (idade > 50) {
				IdMaior50 = IdMaior50 + 1;
			}
			
			quant = quant +1 ;
			System.out.println("Entre com a idade ");
			idade = leitor.nextInt();
		}
		
		System.out.printf("\nA quantidade total de pessoas é " + quant);
		System.out.printf("\nA quantidade total de pessoas com menos de 21 anos é " + IdMenor21);
		System.out.printf("\nA quantidade total de pessoas com mais de 50 anos é " + IdMaior50);
		leitor.close();
		
	}
}
