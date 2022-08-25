import java.util.Scanner;

public class MainXXI {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int A, B;
		
		System.out.print("Digite um numero: ");
		A = sc.nextInt();
		System.out.print("Digite outro numero: ");
		B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.print("Sao Multiplos");
		}
		else {
			System.out.print("Nao sao Multiplos");
		}
		
		sc.close();
		
	}

}
