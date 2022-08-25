import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, X;
		
		System.out.print("Digite um numero: ");
		A = sc.nextInt();
		System.out.print("Digite outro numero: ");
		B = sc.nextInt();
		
		X = A + B;
					
		System.out.println("A soma e " + X);
				
	    sc.close();
	}

}
