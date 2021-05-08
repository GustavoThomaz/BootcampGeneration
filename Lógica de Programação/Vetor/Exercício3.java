package ExerciciosJava;

import java.util.Scanner;

public class Exercício3 {
	public static void main(String[] args) {
		float [][] array = new float[3][3];
		int counter = 0;
		
		Scanner read = new Scanner(System.in);
		
		for(int line = 0; line < 3; line++) {
			for (int column = 0; column < 3; column++) {
				System.out.println("Entre com o número: ");
				array[line][column] = read.nextFloat();
				
				if(array[line][column]>10) {
					counter++;
				}
			}
		}
		System.out.println("\nA matriz possui " + counter + " números maiores que 10");
		read.close();
	}
}
