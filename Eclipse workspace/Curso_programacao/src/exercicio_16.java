import java.util.Locale;
import java.util.Scanner;

public class MainXVI {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double a, b, c, delta, r1, r2 ;
		
		System.out.println(" Fórmula de Bhaskara ");
		System.out.print("A = ");
		a = sc.nextDouble();
		System.out.print("B = ");
		b = sc.nextDouble();
		System.out.print("C = ");
		c = sc.nextDouble();
		
		delta = b * b - 4.0 * a * c; 
		
		if (a == 0 || delta < 0.0 ) {
			System.out.println("Impossivel Calcular");
		}
		else {
		    r1 = (-b + Math.sqrt(delta)) / (2 * a);	
		    r2 = (-b - Math.sqrt(delta)) / (2 * a);
		    System.out.printf("R1 = %.0f %n", r1 );
		    System.out.printf("R2 = %.0f %n", r2 );
		}
		
		sc.close();
	}

}
