import java.util.Scanner;

public class III {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int N;
		int A[]; int B[]; int C[];
		
		System.out.println("");
		System.out.print("	Digite o número de repetições: ");
		N = sc.nextInt();
		
		A = new int [N]; B = new int [N]; C = new int [N];
		
		System.out.println("");
		System.out.println("  Numeros da coluna 1");
		for (int I = 0; I < N; I++) {
			System.out.print("   Digite um numero: ");
			A [I] = sc.nextInt();
		}
		System.out.println("");
		System.out.println("  Numeros da coluna 2");
		for (int I = 0; I < N; I++) {
			System.out.print("   Digite outros numero: ");
			B [I] = sc.nextInt();
		}
		
		for (int I = 0; I < N; I++) {
			C [I] = A [I] + B [I];
		}
		
		System.out.println("");
		System.out.println("   coluna 1 + coluna 2:");
		for (int I = 0; I < N; I++) {
			System.out.println("	" +A [I]+ " + " +B[I]+ " = " +C[I]);
		}
		
		sc.close();

	}

}
