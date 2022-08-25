import java.util.Scanner;

public class XV {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N;
		
		System.out.println("	* Divisores *");
		System.out.println("");
		System.out.print("    Digite um numero: ");
		N = sc.nextInt();
		System.out.println("  Valores Divisiveis por "+N+":");
		
		for (int I = 1; I <= N; I++) {
			if (N%I == 0) {
				System.out.println("    " +I);
			}
		}
			
		
		sc.close();

	}

}
