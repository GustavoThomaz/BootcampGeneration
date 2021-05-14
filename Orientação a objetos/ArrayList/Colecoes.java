package ProgramaçãoOrientadaObjetos;

	import java.util.ArrayList;
	import java.util.Scanner;

	public class Colecoes{
	    public static void main(String[] args) {
	        int opcao;

	        Scanner ler = new Scanner(System.in);

	        ArrayList <String> estoque = new ArrayList();

	        do {
	            System.out.println("\tDigite de acordo com o que deseja fazer");
	            System.out.println("\n0-Finalizar o programa\n1-Adicionar produtos ao estoque"
	                    + "\n2-Remover produtos do estoque\n3-Atualizar produtos do estoque"
	                    + "\n4-Exibir todos os produtos do estoque");
	            opcao = ler.nextInt();
	switch(opcao) {
	                case 1:
	                    ler.nextLine();
	                    System.out.println("\nDigite o nome do produto que você quer adicionar ao estoque");
	                    String produto = ler.nextLine();
	                    estoque.add(produto);
	                    break;
	                case 2:
	                    ler.nextLine();
	                    System.out.println("\nDigite o produto que você deseja remover do estoque");
	                    String produto1 = ler.nextLine();
	                    if(estoque.contains(produto1)) {
	                        estoque.remove(produto1);
	                    }
	                    else {
	                        System.out.println("\nO produto "+produto1+" não existe no estoque!!!");
	                    }
	                    break;
	                case 3:
	                    ler.nextLine();
	                    System.out.println("\nDigite o nome do produto que quer atualizar: ");
	                    String prodAt = ler.nextLine();
	                    if(estoque.contains(prodAt)) {
	                        System.out.println("\nDigite o nome do produto que entrará no lugar de "+prodAt+": ");
	                        String novo = ler.nextLine();

	                        estoque.remove(prodAt);
	                        estoque.add(novo);
	                    }
	                    else {
	                        System.out.println("O produto "+prodAt+" não existe no estoque!!!");
	                    }
	                    break;
	                case 4:
	                    System.out.println("\nMostrando os produtos do estoque...");
	                    System.out.println(estoque);
	                    break;
	                default:
	                    System.out.println("\nPrograma finalizado");

	            }
	        } while(opcao != 0);

	    }
	}
