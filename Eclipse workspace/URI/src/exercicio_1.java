import java.util.Locale;
import java.util.Scanner;

public class MainI {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		double A, R, N;
		
		System.out.print("Digite o raio do circulo: ");
		R = sc.nextDouble();
		N = 3.14159;
		A = N * R * R;
		
		System.out.printf("Area = %.4f %n" ,A);
		
		sc.close();
	}

}
