package application;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("");
		System.out.println("		* Produtos *");
		System.out.println("");
		
		int n;
		
		System.out.print("Digite o número de quantos produtos diferentes serão digitados: ");
		n = sc.nextInt();
		
		Product [] vet = new Product [n];
		
		System.out.println("");
		for (int i=0; i<n; i++) {
			sc.nextLine();
			System.out.print("Digite o nome do " +(i+1)+ "º produto: ");
			String nome = sc.nextLine();
			System.out.print("Digite o Preço do " +(i+1)+ "º produto: ");
			double preco = sc.nextDouble();
			vet [i] = new Product(nome, preco);
			System.out.println("");
		}
		
		double media = 0.0;
		for (int i=0; i<n;i++) {
			media += vet[i].getPreco();
		}
		
		media = media / n;
		
		System.out.printf("Média dos preço de todos os produtos: %.2f %n", media);
		
		sc.close();

	}

}
