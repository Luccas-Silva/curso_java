import java.util.Scanner;

public class XI {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("	Diagonal e numeros negativos");
		System.out.println("");
		
		int [][] Mat;
		int N;
		
		do {
			System.out.print("Digite um numero para a matriz quadrada: ");
			N = sc.nextInt();	
		}while (N<1);
		
		Mat = new int [N][N];
		
		System.out.println("");
		for (int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				System.out.print("Digite um numero: ");
				Mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("");
		System.out.print("Diagonal principal: ");
		for (int i=0; i<N; i++) {
			System.out.print(Mat[i][i] + " ");
		}
		
		System.out.println("");
		
		int cont = 0;
		
		for (int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				if (Mat[i][j] < 0) {
					cont++;
				}
			}
		}
		System.out.print("Quantidade de numeros negativos: " +cont);
		
		sc.close();

	}

}
