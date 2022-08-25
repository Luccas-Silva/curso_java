package application;

import java.util.Scanner;

import entities.Estudante;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Estudante estudante = new Estudante();
		
		System.out.print("Digite o nome do aluno(a): ");
		estudante.nomeAluno = sc.nextLine();
		System.out.println();
		
		System.out.print("Digite a 1º nota do aluno(a): ");
		estudante.nota1 = sc.nextDouble();
		System.out.print("Digite a 2º nota do aluno(a): ");
		estudante.nota2 = sc.nextDouble();
		System.out.print("Digite a 3º nota do aluno(a): ");
		estudante.nota3 = sc.nextDouble();
		System.out.println();
		
		System.out.printf("NOTA FINAL: %.2f %n", estudante.notaFinal());
		
		if (estudante.notaFinal() > 60.00) {
			System.out.print("Aprovado");
		}
		else {
			System.out.printf("Pontos Faltando: %.2f %n", estudante.pontosFaltando());
			System.out.print("Reprovado");
		}
		
		
		
		sc.close();

	}

}
