import java.util.Scanner;

public class exercicio_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("		* Exercício 10 *");
		System.out.println("");
		System.out.println("Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.\r\n"
				+ "Lembrando que, por definição, fatorial de 0 é 1.");
		System.out.println("");
		
		int N, soma=0;
		
		System.out.print("Digite um numero para ser fatoriado: ");
		N = sc.nextInt();
		
		if(N == 0) {
			soma = 1;
			System.out.println("Resposta: "+soma);
		}
		else {
			for (int i=0; i<=N; i++) {
				soma = N * i;
			}
			System.out.println("Resposta: "+soma);
		}
		
		
		sc.close();

	}

}
