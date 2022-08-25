import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite um numero para a Matriz ordenada: ");
		int n = sc.nextInt();
		
		int [][]mat = new int [n][n];
		
		for (int i=0; i<n; i++) {
			System.out.println("");
			for (int j=0; j<n; j++) {
				System.out.print("Digite um numero para ficar na linha "+i+" coluna "+j+": ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("");
		System.out.println("Numeros na diagonal:");
		for (int i=0; i<n; i++) {
			System.out.print(mat[i][i]+" ");
		}
		
		System.out.println("");
		int con=0;
		for (int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if (mat[i][j] < 0) {
					con++;
				}
			}
		}
		System.out.print("Contador de números negativos: " +con);
		
		sc.close();

	}

}
