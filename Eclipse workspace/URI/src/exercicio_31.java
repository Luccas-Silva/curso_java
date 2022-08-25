import java.util.Scanner;

public class XXXI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, PouA;
		 
		// PouA = perímetro ou Area //
		
		System.out.println("    Triângulo");
		
		System.out.print(" Digite a medida do lado (A): ");
		a = sc.nextDouble();
		System.out.print(" Digite a medida do lado (B): ");
		b = sc.nextDouble();
		System.out.print(" Digite a medida do lado (C): ");
		c = sc.nextDouble();
		
		if (a < (b+c) && b < (c+a) && c < (b+a)) {
			
			PouA = (a+b+c);
			System.out.printf(" O Perimetro = %.1f %n" ,PouA);
		}
		else {
			PouA = (a+b) * c / 2;
			System.out.printf(" A Area = %.1f %n" ,PouA);
		}
		
		sc.close();

	}

}
