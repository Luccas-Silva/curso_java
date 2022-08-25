import java.util.Scanner;

public class X {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int [][] mat;
		
		System.out.print("Digite o Número de Linhas: ");
		int linha = sc.nextInt();
		System.out.print("Digite o Número de Colunas: ");
		int coluna = sc.nextInt();
		
		mat = new int [linha][coluna];
		
		System.out.println();
		
		for (int i=0; i<linha; i++) {
			for (int j=0; j<coluna; j++) {
				System.out.print("Digite um numero: ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("      Coluna");
		
		for (int i=0; i<linha; i++) {
			System.out.print("Linha ");
			for (int j=0; j<coluna; j++) {
				System.out.print(mat[i][j] +" ");
			}
			System.out.println();
		}
		
		sc.close();

	}

}
