import java.util.Scanner;

public class XXXVI {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n, x, cimp, cpar;
		
		//cimp = contador de numeros impar /cpar = contador de numeros par /x = //
		//x = contador//
		
		x = 0;
		cimp = 0;
		cpar = 0;
		
		System.out.print(" Digite um numero: ");
		n = sc.nextInt();
		
		if (n % 2 == 0 ) {
			System.out.println(" O numero e PAR.");
			cpar = (cpar + 1);
		}
		else {
			System.out.println(" O numero e IMPAR.");
			cimp = (cimp + 1);
		}
		
		while (x < 4) {
			
			System.out.print(" Digite outro numero: ");
			n = sc.nextInt();
			
			if (n % 2 == 0 ) {
				System.out.println(" O numero e PAR.");
				cpar = (cpar + 1);
			}
			else {
				System.out.println(" O numero e IMPAR.");
				cimp = (cimp + 1);
			}
			
			x = (x + 1);
			
		}
		
		System.out.println("");
		System.out.println(" A quantidade de numeros PARES: " +cpar);
		System.out.print(" e a quantidade de IMPARES: " +cimp+ ".");
		
		sc.close();
	}

}
