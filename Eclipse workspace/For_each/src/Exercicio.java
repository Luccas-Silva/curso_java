import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("	*Exercicio de Fixação*");
		System.out.println("");
		
		System.out.print("Digite o número de Linhas da Matriz: ");
		int n = sc.nextInt();
		System.out.print("Digite o número de Colunas da Matriz: ");
		int m = sc.nextInt();
		
		int [][]mat = new int [n][m];
		
		System.out.println("");
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
				System.out.print("Digite o número que vai ficar "+ i +" Linha,"+ j +" Coluna: ");
				mat[i][j] = sc.nextInt();
			}
			System.out.println("");
		}
		
		System.out.println(" Matriz");
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
				System.out.print(mat[i][j] +" ");
			}
			System.out.println("");
		}
		
		System.out.println("");
		System.out.print("Digite um número da matriz: ");
		int nMat = sc.nextInt();
		
		System.out.println("");
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
				if (nMat == mat[i][j]) {
					System.out.println("Posição: " +i+","+j);
					if (j > 0) {
						System.out.println("A DIREITA do número: " +(mat[i][j-1]));	
					}
					if (j < (m-1)) {
						System.out.println("A ESQUERDA do número: " +mat[i][j+1]);
					}
					if (i > 0) {
						System.out.println("A CIMA do número: " +mat[i-1][j]);
					}
					if (i < (n-1)) {
						System.out.println("A BAIXO do número: " +mat[i+1][j]);
					}
				}
			}
			System.out.println("");
		}
		
		sc.close();

	}

}
