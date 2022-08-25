import java.util.Scanner;

public class VII {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		double []nota1;
		double []nota2;
		double []notaF;
		String []nome;
		
		
		System.out.println("		* Média *");
		System.out.println("");
		System.out.print(" Digite o número de alunos avaliados: ");
		n = sc.nextInt();
		
		nota1 = new double [n];
		nota2 = new double [n];
		notaF = new double [n];
		nome = new String [n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("");
			System.out.print(" Digite o nome do aluno: ");
			nome[i] = sc.next();
			System.out.print(" Digite 1º nota do aluno: ");
			nota1[i] = sc.nextDouble();
			System.out.print(" Digite 2º nota do aluno: ");
			nota2[i] = sc.nextDouble();
		}
		
		System.out.println("");
		System.out.print("   Alunos aprovados:");
		for (int i = 0; i < n; i++) {
			notaF[i] = nota1[i] + nota2[i];
			if (notaF[i] > 6) {
				System.out.println("");
				System.out.println("	*" +nome[i]);
			}
		}
		
		sc.close();

	}

}
