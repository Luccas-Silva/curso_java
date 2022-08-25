import java.util.Locale;
import java.util.Scanner;

public class MainXIII {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		double a, b, c, x, pi;
		pi = 3.14159;
		
		System.out.print("Digite um numero para calcular a aria: ");
		a = sc.nextDouble();
		System.out.print("Digite outro numero para calcular a aria: ");
		b = sc.nextDouble();
		System.out.print("Digite mais um numero para calcular a aria: ");
		c = sc.nextDouble();
		
		x = (a * c / 2);
		System.out.printf("TRIANGULO: %.3f %n", x);
		x = (pi * Math.pow(c, 2.0));
		System.out.printf("CIRCULO: %.3f %n", x);
		x = ((a + b) * c / 2);
		System.out.printf("TRAPEZIO: %.3f %n", x);
		x = (Math.pow(b, 2.0));
		System.out.printf("QUADRADO: %.3f %n", x);
		x = (a * b);
		System.out.printf("RETANGULO: %.3f %n", x);

		sc.close();
	}

}
