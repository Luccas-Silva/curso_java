import java.util.Scanner;

public class mainXXI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, soma, i, x;
		
		soma = 0;
		
		System.out.print("Digite a quantidade de numeros: ");
		n = sc.nextInt();
		
		for (i=0; i<n; i++) {
			
			System.out.print("Digite um numero: ");
			x = sc.nextInt();
			
			soma = soma + x;
			
		}
		
		System.out.print("A soma de todos os numeros e : " +soma);
		
		sc.close();

	}

}
