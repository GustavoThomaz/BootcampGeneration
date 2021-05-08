package ExerciciosJava;

public class Exercício1 {
	public static void main(String[] args) {
		int [] A = {1,0,5,-2,-5,7};
		int soma = A[0]+ A[1]+ A[5];
		
		System.out.printf("A soma dos valores nas posições 0, 1 e 5 de A é: " + soma);
		
		A[4] = 100;
		
		System.out.printf("\nOs valores no vetor A são:");
		for(int i = 0; i<A.length; i++) {
			System.out.printf("\n" + A[i]);
		}
	}
}
