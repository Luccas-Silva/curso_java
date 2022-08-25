import java.util.Scanner;

public class XVI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N, X, Maior, Posi;
		
		Maior = 0;
		Posi = 0;
		
		System.out.println("	Maior e Posição");
		System.out.println("");
		System.out.print("  Digite a quantidade de repetições: ");
		N = sc.nextInt();
		System.out.println("");
		
		for (int i = 1; i <= N; i++) {
			System.out.print("  Digite "+i+"º Numero: ");
			X = sc.nextInt();
			
			if(X > Maior) {
				Maior = X;
				Posi = i;
			}
			
		}
		
		System.out.println("");
		System.out.println("   Maior Numero: " +Maior);
		System.out.println("     Posição: " +Posi);
		
		sc.close();

	}

}
