import java.util.Scanner;

public class XXIII {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N;
		
		System.out.print("Digite um numero: ");
		N = sc.nextInt();
		
		for (int I = 1; I <= 10; I++) {
			
			int produto = I * N;
			
			System.out.println(I+" X "+N+" = " +produto);
			
		}
		
		sc.close();

	}

}
