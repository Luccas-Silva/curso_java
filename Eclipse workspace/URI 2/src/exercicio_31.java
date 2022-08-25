import java.util.Scanner;

public class XXXI {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int X, Y;
		
		System.out.println("	Sequência Lógica 2");
		System.out.println("");
		
		System.out.print(" Digite um numero menor que 20: ");
		X = sc.nextInt();
		
		if (X < 1 || X > 20) {
			do {
				System.out.println(" O numero tem que ser maior que 1 e menor que 20.");
				System.out.print("  Digite outro numero: ");
				X = sc.nextInt();
			} while (X < 1 || X > 20);
		}
		
		System.out.println("");
		System.out.print(" Digite um numero que seja maior que " +X+ ": ");
		Y = sc.nextInt();
		
		if (Y < X) {
			System.out.println(" Numero invalido.");
			System.out.print(" Digite outro numero: ");
			Y = sc.nextInt();
		}
		
		for (int i = 1; i <= Y; i++) {
			if (i % X == 0) {
				System.out.println(" " +i+ " ");
			}
			else {
				System.out.print(" " +i);	
			}	
		}
		 
		
		
		sc.close();

	}

}
