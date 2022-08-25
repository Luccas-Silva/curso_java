import java.util.Scanner;

public class XIV {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int N;
		int [][] Mat;
		int [] Vet;
		
		System.out.println("	* Soma das linhas da Matriz *");
		System.out.println("");
		
		do {
			System.out.print("Digite um número maior que 0 para a Matriz quadrada: ");
			N = sc.nextInt();
		}while (N < 1);
		
		Mat = new int [N][N];
		
		System.out.println("");
		for (int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				System.out.print("Digite um número para " +(i+1)+ "º linha " +(j+1)+ "º coluna: ");
				Mat[i][j] = sc.nextInt();
			}
		}
		
		Vet = new int [N];
		
		for (int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				Vet[i] = Vet[i] + Mat[i][j];
			}
		}
		
		System.out.println("");
		for (int i=0; i<N; i++) {
			System.out.println("Soma da " +(i+1)+ "º linha: " +Vet[i]);
		}
		
		
		sc.close();
		
	}

}
