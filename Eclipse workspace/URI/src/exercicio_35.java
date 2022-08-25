import java.util.Scanner;

public class XXXV {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double n, cnp;
		int cn, p, ne;
		
		//cn = contador de numeros. / cnp = contador de numeros positivos. //
		//p =  positivos. / ne = negativos. //
		
		p = 0;
		ne = 0;
		cn = 0;
		cnp = 0;
		
		System.out.println("--------------------------------");
		System.out.println("  Média, Positivos e Negativos");
		System.out.println("--------------------------------");
		
		System.out.print("  Digite um numero: ");
		n = sc.nextDouble();
		
		if (n > -1) {
			p = (p + 1);
			cnp = (cnp + n);
		}
		else {
			ne = (ne + 1);
		}
		
		while (cn < 5) {
			
			System.out.print("  Digite outro numero: ");
			n = sc.nextDouble();
			
			if (n > -1) {
				p = (p + 1);
				cnp = (cnp + n);
			}
			else {
				ne = (ne + 1);
			}
			
			cn = (cn + 1);
		}
		
		cnp = (cnp / p);
		
		System.out.println(" ------------------------------------------------");
		System.out.println("  Os os valores negativos são iguais a "+ ne);
		System.out.println("  e valores positivos são iguais a "+ p+ ".");
		System.out.printf("  A media dos valores positivos e igual a %.1f %n .", cnp);
		System.out.println("------------------------------------------------");
		sc.close();

	}

}
