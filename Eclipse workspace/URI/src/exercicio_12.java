import java.util.Locale;
import java.util.Scanner;

public class MainXII {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double r, v, pi;
		
		pi = 3.14159;
		System.out.print("Digite o raio da esfera: ");
		r = sc.nextDouble();
		v =(4.0 / 3.0 * pi * Math.pow(r, 3.0));
		System.out.printf("VOLUME = %.3f %n", v);
		 
		sc.close();
	}

}
