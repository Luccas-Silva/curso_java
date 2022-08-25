import java.util.Locale;
import java.util.Scanner;

public class MainIV {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double A, B, Media;
		
		System.out.print("Digite a primeira nota: ");
		A = sc.nextDouble();
		System.out.print("Digite a segunda nota: ");
		B = sc.nextDouble();
		
		Media = (A + B) / 2 ;
		
		System.out.printf("MEDIA = %.2f %n" ,Media);
		
		sc.close();

	}

}
