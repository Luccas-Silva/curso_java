import java.util.Scanner;

public class exercicio_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("		* Exercício 11 *");
		System.out.println("");
		System.out.println("Ler um número inteiro N e calcular todos os seus divisores.");
		
		int N;
		
		System.out.print("Digite um número:");
		N = sc.nextInt();
		
		for (int i=1; i<=N; i++) {
			if (N % i == 0) {
				System.out.print(" " +i);
			}
		}
		
		sc.close();
	}

}
