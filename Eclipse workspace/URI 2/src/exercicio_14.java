import java.util.Scanner;

public class XIV {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N, FS;
		
		FS = 1;
		
		System.out.println("	Fatorial Simples");
		System.out.println("");
		System.out.print("   Digite um numero: ");
		N = sc.nextInt();
		
		for (int I = N; I >= 1; I--) {
			FS = FS * I;
		}
		System.out.print(" O Fatorial "+N+" é igual a: "+FS);
		
		sc.close();

	}

}
