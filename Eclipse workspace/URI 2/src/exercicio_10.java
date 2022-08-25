import java.util.Scanner;

public class X {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		char r;
		
		do {
			System.out.print(" Digite um numero: ");
			n = sc.nextInt();
		
			if (n == 0) {
				System.out.print(" (NULL)");
			}
			else {
				if (n > 0) {
					System.out.print(" (POSITIVE)/");
					if (n % 2 == 0) {
						System.out.print("(EVEN)");
					}
					else {
						System.out.print("(ODD)");
					}
				}
				else {
					if (n < 0) {
						System.out.print(" (NEGATIVE)/");
					
						if (n % 2 == 0) {
							System.out.print("(EVEN)");
						}
						else {
							System.out.print("(ODD)");
						}
					}
				}
			}
			
			System.out.println("");
			System.out.print(" Deseja repetir (s/n)? ");
			r = sc.next().charAt(0);
			
		} while(r != 'n');
		
		sc.close();
	}

}
