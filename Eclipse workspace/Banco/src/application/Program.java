package application;

import java.util.Scanner;

import entities.ContaBancaria;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int decisao;
		
		ContaBancaria conta1 = new ContaBancaria();
		conta1.titular = "Luccas";
		conta1.numConta = 552;
		conta1.saldo = 2000;
		
		System.out.println(conta1.titular+ " titular da conta de numero " +conta1.numConta+ " o saldo da conta é: R$ " +conta1.saldo);
		System.out.println();
		System.out.println("gostaria de Sacar dou de Deposidar?");
		System.out.print("se for Sacar digite [1], "
				+ "se for de Deposidar digite [2] "
				+ "ou se não for nenhum dos dois digite [3]: ");
		decisao = sc.nextInt();
		System.out.println();
		
		if (decisao == 1) {
			System.out.print("Quando voce quer Sacar: ");
			conta1.Sacar(sc.nextDouble());
		}
		else if (decisao == 2) {
			System.out.print("Quando voce quer Deposidar: ");
			conta1.Deposito(sc.nextDouble());
		}
		
		System.out.println();
		System.out.println("     * Dados Atualizados *");
		System.out.println();
		System.out.println(conta1.titular+ " titular da conta de numero " +conta1.numConta+ " o saldo da conta é: R$ " +conta1.saldo);
		System.out.println();
		
		ContaBancaria conta2 = new ContaBancaria();
		conta2.titular = "Maria";
		conta2.numConta = 162;
		conta2.saldo = 1500;
		
		conta1.Transferencia(250, conta2);
		
		System.out.println("     * Dados Atualizados Transferencia feita *");
		System.out.println();
		System.out.println("O saldo sua conta numero "+conta1.numConta+" é: R$ " + conta1.saldo);
		System.out.println("O saldo sua conta numero "+conta2.numConta+" é: R$ " + conta2.saldo);
		
		sc.close();

	}

}
