import java.util.Scanner;

public class XVI {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
		int N, Soma;
		int [][] Mat;
		
		Soma = 0;
		
		System.out.println("	* Soma da Diagonal Principal *");
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
		
		System.out.println("");
		for (int i=0; i<N; i++) {
			Soma = Soma + Mat[i][i];
		}
		System.out.println("A soma dos elementos da diagonal principal: " +Soma);
		
		sc.close();

	}

}
