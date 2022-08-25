import java.util.Scanner;

public class mainXIV {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double x;
		
		System.out.print("Que horas ? ");
		x = sc.nextDouble();
		System.out.print("Então,");
		
		if (x < 12.00) {
			System.out.println(" Bom Dia !");
		}
		else {
			if (x < 18.00) {
			System.out.println(" Boa Tarde !");
		    }
			else {
				System.out.print(" Boa Noite !");
			}  
		}
			
		sc.close();

	}
}


		