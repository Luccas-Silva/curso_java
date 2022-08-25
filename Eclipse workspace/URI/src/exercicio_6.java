import java.util.Locale;
import java.util.Scanner;

public class MainVI {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double C, S;
		int Z, X;
		
		System.out.print("Numero do empregado: ");
		Z = sc.nextInt();
		System.out.print("Horas trabalhadas 'Ind': ");
		X = sc.nextInt();
		System.out.print("Media do salario");
		C = sc.nextDouble();
		S = X * C;
		
		System.out.println("NUMBER = " + Z);
		System.out.printf("SALARY = US %.2f %n " , S);
	
		sc.close();
	}

}
