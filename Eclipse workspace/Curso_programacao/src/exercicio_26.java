import java.util.Scanner;

public class XXVI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N; 
			System.out.println("");
			System.out.print(" Digite o número de vezes que você quer digitar: ");
			N = sc.nextInt();
			
		double[] Vet = new double[N];
		
		for (int I = 0; I < N; I++) {
			System.out.print(" Digite um número: ");
			Vet[I] = sc.nextDouble();
		}
		
		System.out.println("");
		System.out.println(" Números digitados");
		
		for (int I = 0; I < N; I++) {
			System.out.println(" "+Vet[I]);
		}
		
		
		sc.close();

	}

}
