import java.util.Scanner;

public class MainV {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int A, B, C, D, dif;
		
		System.out.print("Digide um numero: ");
		A = sc.nextInt();
		System.out.print("digide outro numero :");
		B = sc.nextInt();
		System.out.print("digide outro numero :");
		C = sc.nextInt();
		System.out.print("digide outro numero :");
		D = sc.nextInt();
		
		dif = (A * B - C * D);
		
		System.out.println("DIFERENCA = " + dif); 
		
		sc.close();

	}

}
