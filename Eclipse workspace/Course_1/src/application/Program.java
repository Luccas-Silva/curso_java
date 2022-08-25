package application;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int escolha;
		
		System.out.println("Insira os dados do produto:");
		System.out.print("Nome: ");
	    String nome = sc.nextLine();
		System.out.print("Preço: ");
		double preco = sc.nextDouble();
		Product product = new Product (nome, preco);
		
		System.out.println();
		System.out.print("Dados do produto: " +product.toString());
		System.out.println("");
		
		do {
			System.out.println("");
			System.out.println("Digite 1 para adicionar produtos ao estoque.");
			System.out.println("Digite 2 para retirada de produtos do estoque.");
			System.out.print("Ou digite 3 para Finalizar: ");
			escolha = sc.nextInt();
			
			if (escolha == 1) {
				System.out.println("");
				System.out.print("Insira o número de produtos a serem adicionados em estoque: ");
				int quantidade = sc.nextInt();
				product.adicionarProdutos(quantidade);
				System.out.println("");
				System.out.println("Dados atualizados: " +product.toString());
			}
			else if (escolha == 2) {
				System.out.println("");
				System.out.print("Insira o número de produtos a serem removidos do estoque: ");
				int quantidade = sc.nextInt();
				product.removerProdutos(quantidade);
				System.out.println("");
				System.out.println("Dados atualizados: " +product.toString());
			}
			
		}while (escolha != 3);
		
		
		System.out.println("");
		System.out.println("Dados atualizados: " +product.toString());
		
		sc.close();

	}

}
