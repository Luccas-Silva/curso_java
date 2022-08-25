import java.util.Scanner;

public class MainIXX {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int A, B, C, D;
		
		System.out.print("Digite 4 numeros inteiros: ");
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		if (B > C && D > A && (C + D) > (A + B) && A % 2 == 0) {
			System.out.print("Valores aceitos");
		}
		else {
			System.out.print("Valores não foram aceitos");
		}
		
		sc.close();

	}

}
