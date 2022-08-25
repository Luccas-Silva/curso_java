import java.util.Scanner;

public class II {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n, cont;
		int vet[];
		
		cont = 0;
		
		System.out.println("");
		System.out.print("	Digite o número de repetições: ");
		n = sc.nextInt();
		
		vet = new int [n];
		
		System.out.println("");
		for (int i = 0; i < n; i++) {
			System.out.print("   Digite um numero: ");
			vet [i] = sc.nextInt();
		}
		
		System.out.println("");
		System.out.println("   Numeros digitados Pares:");
		for (int i = 0; i < n; i++) {
			if (vet [i] % 2 == 0) {
				System.out.print("   "+vet[i]);
				cont++;
			}
			
		}
		System.out.println("");
		System.out.println("   Quandidade de numeros pares: " +cont);
		
		sc.close();

	}

}
