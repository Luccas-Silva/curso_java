import java.util.Scanner;

public class XXIV {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double X;
		
		System.out.println("        Intervalo");
		System.out.println("");
		System.out.print("Digite um numero com (,): ");
		X = sc.nextDouble();
		System.out.println("");
		
		
		if (X > -1 && X < 25) {
			System.out.println("(" + X + ") Esta no intervalo de 0 e 25");
		}
		else {
			if (X > 25 && X < 50) {
				System.out.println("(" + X + ") Esta no intervalo de 25 e 50");
			}
			else {
				if (X > 50 && X < 75) {
					System.out.println("(" + X + ") Esta no intervalo de 50 e 75");
				}
				else {
					if (X > 75 && X < 100) {
						System.out.println("(" + X + ") Esta no intervalo de 75 e 100");
					}
					else {
						if (X > 100) {
							System.out.println("(" + X + ") Esta fora do intervalo");
						}
					}
				}
			}
		}
		
		
		sc.close();

	}

}
