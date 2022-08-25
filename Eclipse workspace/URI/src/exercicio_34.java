import java.util.Scanner;

public class XXXIV {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double n;
		int cn, p, ne;
		
		//cn = contador de numeros.//
		//p =  positivos. / ne = negativos. //
		
		p = 0;
		ne = 0;
		cn = 0;
		
		System.out.println(" Números Positivos e Negativos");
		System.out.println("");
		
		System.out.print(" Digite um numero: ");
		n = sc.nextDouble();
		
		if (n > -1) {
			p = (p + 1);
		}
		else {
			ne = (ne + 1);
		}
		
		while (cn < 5) {
			
			System.out.print(" Digite outro numero: ");
			n = sc.nextDouble();
			
			if (n > -1) {
				p = (p + 1);
			}
			else {
				ne = (ne + 1);
			}
			
			cn = (cn + 1);
		}
		
		System.out.println("");
		System.out.println(" Os valores positivos são iguais a "+ p);
		System.out.println(" e os valores negativos são iguais a "+ ne);
		
		sc.close();

	}

}
