import java.util.Locale;
import java.util.Scanner;

public class MainVII {

	public static void main(String[] args) {
	
    Locale.setDefault(Locale.US);	
	Scanner sc = new Scanner(System.in);
	
		String x;
		int z;
		double c;
	
		x = sc.next();
		z = sc.nextInt();
		c = sc.nextDouble();
	
		System.out.println("Você Digitou : ");
		System.out.println(x);
		System.out.println(z);
		System.out.println(c);
	sc.close();
	}

}
