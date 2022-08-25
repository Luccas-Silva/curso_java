import java.util.Scanner;

public class XXXVIII {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n;
		double soma, media;
		double [] vet;
		
		soma = 0;
		media = 0;		
		
		System.out.println("	Soma e Media");
		System.out.println("");
		
		System.out.print(" Digite o numero de repetições: ");
		n = sc.nextInt();
		
		vet = new double [n];
		
		System.out.println("");
		for (int i = 0; i < n; i++) {
			System.out.print(" Digite um numero: ");
			vet[i] = sc.nextDouble();
		}
		
		System.out.println("");
		System.out.println(" Numeros digitados:");
		for (int i = 0; i < n; i++) {
			System.out.print(" "+ vet[i]);
			soma = soma + vet[i];
		}
		
		media = soma / n;
		
		System.out.println("");
		System.out.println("");
		System.out.printf(" A soma dos numeros = %.2f %n", soma);
		System.out.printf(" A media dos numeros = %.2f %n", media);
				
		sc.close();

	}

}
