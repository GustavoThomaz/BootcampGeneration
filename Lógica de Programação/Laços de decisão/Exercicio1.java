package sintaxeJava;

import java.util.Scanner;

public class VerificaMaiorNum {
	public static void main (String[]args) {
		int num1,num2,num3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro número: ");
		num1 = leia.nextInt();
		
		System.out.println("Entre com o segundo número: ");
		num2 = leia.nextInt();
		
		System.out.println("Entre com o terceiro número: ");
		num3 = leia.nextInt();
		
		if (num1>num2 && num1>num3) {
			System.out.printf("\n" + num1);
		}else if (num2>num1 && num2>num3) {
			System.out.printf("\n" + num2);
		}else {
			System.out.printf("\n" + num3);
		}
		
	}
}
