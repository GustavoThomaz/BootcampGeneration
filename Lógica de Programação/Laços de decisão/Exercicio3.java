package sintaxeJava;

import java.util.Scanner;

public class SelecionaCategoria {
	public static void main (String[] args) {
		int idade; 
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com a idade: ");
		idade = leia.nextInt();
		
		if (idade>=10 || idade<=14) {
			System.out.printf("\nCategoria Infantil");
		}else if (idade > 14 || idade<=17) {
			System.out.printf("\nCategoria Juvenil");
		}else if (idade >= 18) {
			System.out.printf("\nCategoria Adulto");
		}else {
			System.out.printf("\nNão possui categoria");
		}
	}
}
