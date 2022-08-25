package application;

import java.util.Scanner;

import entities.Sistema_Pousada;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Sistema_Pousada [] vet =  new Sistema_Pousada [10];
		
		System.out.println("");
		System.out.println("		# Pousada Fachada #");
		System.out.println("");
		
		System.out.println("Bem vindo ao sistema da Pousada Fachada.");
		System.out.print("Digite o número de Estudantesque que vão alugar os quartos: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Estudante #" + i + ":");
			sc.nextLine();
			System.out.print("Digite seu Nome: ");
			String nome = sc.nextLine();
			System.out.print("Digite seu Email: ");
			String email = sc.nextLine();
			System.out.print("Digite o numero do Quarto: ");
			int numQuarto = sc.nextInt();
			vet [numQuarto] = new Sistema_Pousada (nome, email);
		}
		
		System.out.println("");
		System.out.println("Quartos ocupados:");
		for (int i=0; i<10; i++) {
			if (vet [i] != null) {
				System.out.println(i+ ": "+ vet[i]);
			}
		}
		
		
		
		sc.close();
	}

}
