import java.util.Scanner;

public class XXXVIII {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X, Y;
		
		System.out.print(" Deigite um numeros: ");
		X = sc.nextInt();
		System.out.print(" Deigite outro numeros: ");
		Y = sc.nextInt();
		
		while (X != Y) {
			if (X < Y) {
				System.out.println(" (Ordem Crescente)");
			}
			else {
				System.out.println(" (Ordem Decrescente)");
			}
			
			System.out.print(" Deigite um numeros: ");
			X = sc.nextInt();
			System.out.print(" Deigite outro numeros: ");
			Y = sc.nextInt();
		}
		System.out.print(" (São Igual)");
			
		sc.close();

	}

}
