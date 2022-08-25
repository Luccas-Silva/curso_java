import java.util.Scanner;

public class XXXVII {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N;
	    int[] vet;
		
	    System.out.println("	Numeros negativos");
	    System.out.println("");
		System.out.print(" Digite o numero de repetições: ");
		N = sc.nextInt();
		
		vet = new int [N];
		
		System.out.println("");
		for (int I = 0; I < N; I++) {
			System.out.print(" Digite um numero: ");
			vet[I] = sc.nextInt();
		}
		
		System.out.println("");
		System.out.print(" Numeros negativos:");
		for (int I = 0; I < N; I++) {
			if (vet[I] < 0) {
				System.out.print(" "+ vet[I]);
			}
			
		}
		
		
		sc.close();
	}

}
