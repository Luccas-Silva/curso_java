import java.util.Random;
import java.util.Scanner;

public class XVIII {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Random aleatorio = new Random();
		
		int N;
		double SomaP = 0;
		
		System.out.println("		* Exercício 6 *");
		System.out.println("");
		
		do {
			System.out.print("Digite um número maior que 0 para a Matriz quadrada: ");
			N = sc.nextInt();
		}while (N < 1);
		
		double [][] Mat = new double [N][N];
		
		System.out.println("");
		for (int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				System.out.print("Digite um número Real para " +(i+1)+ "º linha " +(j+1)+ "º coluna: ");
				Mat[i][j] = sc.nextDouble();
			}
		}
		
		System.out.println("");
		System.out.println("");
		for (int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				if (Mat[i][j] > 0) {
					SomaP = SomaP + Mat[i][j];
				}
			}
		}
		System.out.printf("Soma dos Número Positivos da Matriz: %.1f %n" ,SomaP);
		
		int Ale = aleatorio.nextInt(N);
		
		System.out.println("");
		System.out.print(Ale+1 +"º Linha Escolhida Aleatoriamente: ");
		for (int i=0; i<N; i++) {
			System.out.print(Mat[Ale][i] +"  ");
		}
		
		System.out.println("");
		System.out.println("");
		System.out.print(Ale+1 +"º Coluna Escolhida Aleatoriamente: ");
		for (int i=0; i<N; i++) {
			System.out.print(Mat[i][Ale] +"  ");
		}
		
		System.out.println("");
		System.out.println("");
		System.out.print("Diagonal Principal: ");
		for (int i=0; i<N; i++) {
			System.out.print(Mat[i][i] +"  ");
		}
		
		System.out.println("");
		System.out.println("");
		System.out.print("Matriz Alterada:");
		for (int i=0; i<N; i++) {
			System.out.println("");
			for (int j=0; j<N; j++) {
				if (Mat[i][j] < 0) {
					Mat[i][j] = Mat[i][j] * Mat[i][j];
				}
				System.out.print(Mat[i][j] +"  ");
			}
		}
		
		sc.close();

	}

}
