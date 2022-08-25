import java.util.Scanner;

public class IV {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int N;
		double [] vet;
		double media;
		
		media = 0;
		
		System.out.println("	Média Real");
		System.out.println("");
		System.out.print(" Digite o número de repetiçoeis: ");
		N = sc.nextInt();
		
		vet = new double [N];
		
		System.out.println("");
		for (int I = 0; I < N; I++) {
			System.out.print("  Digite um número real: ");
			vet[I] = sc.nextDouble();
			
			media = media + vet[I];
		}
		
		media = media / N;
		
		System.out.println("");
		System.out.printf(" Média dos números digitados: %.2f %n", media);
		System.out.println("");
		System.out.println(" Números digitados abaixo da média: ");
		
		for(int I = 0; I < N; I++) {
			if (vet[I] < media) {
				System.out.print("  " +vet[I]);
			}
		}
		
		
		
		sc.close();

	}

}
