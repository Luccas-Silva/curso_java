package application;

import java.util.Scanner;
import entities.Sistema_Banco;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Sistema_Banco Chefe = new Sistema_Banco();
		 int numConta_Chefe = 002;
		 String nomeConta_Chefe = "Luccas";
		 Chefe.Deposido(99999.99);
		
		Sistema_Banco cliente = new Sistema_Banco();
		
		int numConta;
		String nomeConta;
		char res;
		int opcaos;
		
		do {
			System.out.println();
			System.out.println("	* Banco Shield *");
			System.out.println();
			
			System.out.println("------------------------");
			System.out.println("| *  Opções do Banco * |");
			System.out.println("------------------------");
			System.out.println("| (1) Nova Conta       |");
			System.out.println("| (2) Conta Existente  |");
			System.out.println("------------------------");
			
			System.out.print("   Digite uma opção: ");
			opcaos = sc.nextInt();
		} while (opcaos != 1 && opcaos != 2);
		
		System.out.println();
		System.out.println();

		if (opcaos == 1) {
			System.out.println("------------------------");
			System.out.println("|    *  Nova Conta *   |");
			System.out.println("------------------------");
			
			System.out.print("Número da conta: ");
			numConta = sc.nextInt();
			
			System.out.print("Nome do titular da conta: ");
			sc.nextLine();
			nomeConta = sc.nextLine();
			
			System.out.print("Gostaria de um depósito inicial (sim / não)? ");
			res = sc.nextLine().charAt(0);
				if (res == 's' || res == 'S') {
					System.out.print("Insira o valor do depósito: ");
					cliente.Deposido(sc.nextDouble());
				}
				
			cliente.setNumConta(numConta);
			cliente.setNomeConta(nomeConta);
			
		}
		else if (opcaos == 2) {
			System.out.println("--------------------------");
			System.out.println("|  *  Conta Existente *  |");
			System.out.println("--------------------------");
			
			System.out.print("Número da conta: ");
			numConta = sc.nextInt();
			
			if (numConta == 002) {
				System.out.println();
				System.out.println("Bem vindo Sr.Luccas");
				
				Chefe.setNumConta(numConta_Chefe);
				Chefe.setNomeConta(nomeConta_Chefe);
				
				System.out.println();
				System.out.println();
				System.out.println("----------------------------");
				System.out.println("|    * Dados Da Conta *    |");
				System.out.println("----------------------------");
				System.out.println(Chefe.toString());
				
				System.out.println();
				System.out.println();
				
				do {
					do {
						System.out.println("----------------------------------------");
						System.out.println("| *  Opções do Banco *                  |");
						System.out.println("----------------------------------------");
						System.out.println("| (1) Depósito                          |");
						System.out.println("| (2) Saque                             |");
						System.out.println("| (3) Mudar o Nome do Titular da Conta  |");
						System.out.println("| (4) Sair do Sistema                   |");
						System.out.println("----------------------------------------");
						System.out.print("   Digite uma opção: ");
						opcaos = sc.nextInt();
					} while (opcaos != 1 && opcaos != 2 && opcaos != 3 && opcaos != 4);
				
					if (opcaos == 1) {
						System.out.println();
						System.out.print("Insira o valor do depósito: ");
						Chefe.Deposido(sc.nextDouble());
					}
					else if (opcaos == 2) {
						System.out.println();
						System.out.print("Insira o valor do Saque: ");
						Chefe.Saque(sc.nextDouble());
					}
					else if (opcaos == 3) {
						System.out.println();
						System.out.print("Novo Nome do titular da conta: ");
						sc.nextLine();
						nomeConta = sc.nextLine();
						Chefe.setNomeConta(nomeConta_Chefe);
					}
						System.out.println();
						System.out.println();
						System.out.println("----------------------------");
						System.out.println("|    * Dados Da Conta *    |");
						System.out.println("----------------------------");
						System.out.println(Chefe.toString());
						System.out.println();
				} while	(opcaos != 4);
					System.out.println(" Obrigada por usar o sistema do Banco Shield.");
				
			}
			else {
				System.out.println();
				System.out.println("    Conta não Existente");
				System.out.println(" tente novamente mais tarde");
				System.out.println();
				System.out.println("* Obrigada por usar o sistema do Banco Shield. *");
			}
				
		}
		
		if (opcaos == 1) {
			System.out.println();
			System.out.println();
			System.out.println("----------------------------");
			System.out.println("|    * Dados Da Conta *    |");
			System.out.println("----------------------------");
			System.out.println(cliente.toString());
			
			System.out.println();
			System.out.println();
			
			do {
				do {
					System.out.println("----------------------------------------");
					System.out.println("| *  Opções do Banco *                  |");
					System.out.println("----------------------------------------");
					System.out.println("| (1) Depósito                          |");
					System.out.println("| (2) Saque                             |");
					System.out.println("| (3) Mudar o Nome do Titular da Conta  |");
					System.out.println("| (4) Sair do Sistema                   |");
					System.out.println("----------------------------------------");
					System.out.print("   Digite uma opção: ");
					opcaos = sc.nextInt();
				} while (opcaos != 1 && opcaos != 2 && opcaos != 3 && opcaos != 4);
			
				if (opcaos == 1) {
					System.out.println();
					System.out.print("Insira o valor do depósito: ");
					cliente.Deposido(sc.nextDouble());
				}
				else if (opcaos == 2) {
					System.out.println();
					System.out.print("Insira o valor do Saque: ");
					cliente.Saque(sc.nextDouble());
				}
				else if (opcaos == 3) {
					System.out.println();
					System.out.print("Novo Nome do titular da conta: ");
					sc.nextLine();
					nomeConta = sc.nextLine();
					cliente.setNomeConta(nomeConta);
				}
					System.out.println();
					System.out.println();
					System.out.println("----------------------------");
					System.out.println("|    * Dados Da Conta *    |");
					System.out.println("----------------------------");
					System.out.println(cliente.toString());
					System.out.println();
			} while	(opcaos != 4);
				System.out.println(" Obrigada por usar o sistema do Banco Shield.");
		}
		
		sc.close();

	}

}
