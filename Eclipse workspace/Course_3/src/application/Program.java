package application;

import java.util.Scanner;

import entities.Empregado;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Empregado empregato = new Empregado();
		
		System.out.print("Nome: ");
		empregato.nome = sc.nextLine();
		System.out.print("Salário bruto: ");
		empregato.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		empregato.imposto = sc.nextDouble();
		
		System.out.println();
		System.out.println("Funcionário: "+ empregato.toString());
		System.out.println();
		
		System.out.print("Qual percentual para aumentar o salário? %");
		double porcentagem = sc.nextDouble();
		empregato.aumentoSalario(porcentagem);
		
		System.out.println();
		System.out.print("Dados atualizados: "+ empregato.toString());
	
		sc.close();

	}

}
