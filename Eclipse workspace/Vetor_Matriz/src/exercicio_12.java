import java.util.Scanner;

public class XII {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int M, N;
		double [][] Mat;
		double [] Vet;
		
		System.out.println("	* Soma de Linhas em Matriz *");
		System.out.println();
		
		do {
			System.out.print("Digite o número maior que 0 para a Linhas da Matriz: ");
			M = sc.nextInt();
		}while (M<1);
		
		do {
			System.out.print("Digite o número maior que 0 para a Colunas da Matriz: ");
			N = sc.nextInt();
		}while (N<1);
		
		
		Mat = new double [M][N];
		
		System.out.println("");
		for (int i=0; i<M; i++) {
			for (int j=0; j<N; j++) {
				System.out.print("Digite um número para " +(i+1)+ "º linha " +(j+1)+ "º coluna: ");
				Mat[i][j] = sc.nextDouble();
			}
		}
		
		Vet = new double [M];
		
		for (int i=0; i<M; i++) {
			double soma = 0.0;
			for (int j=0; j<N; j++) {
				soma = soma + Mat[i][j];
			}
			Vet[i] = soma;
		}
		
		System.out.println("");
		for (int i=0; i<M; i++) {
			System.out.printf("Soma da " +(i+1)+ "º Linha: %.1f%n", Vet[i]);
		}
		
		
		sc.close();
	}

}
