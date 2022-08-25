import java.util.Scanner;

public class MainII {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, soma;
		
		System.out.print("Digide um numero: ");
		A = sc.nextInt();
		System.out.print("Digide outro numero: ");
		B = sc.nextInt();
		
		soma = A + B;
		
		System.out.println("A SOMA = "+soma);
		
		sc.close();
	}

}
