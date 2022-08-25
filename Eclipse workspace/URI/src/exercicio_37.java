import java.util.Scanner;

public class XXXVII {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n, x, cimp, cpar, cp, cn;
		
		//cimp = contador de numeros impar /cpar = contador de numeros par /x = //
		//x = contador / cp = contador de positivos / cn = contador de negativos//
		
		x = 0;
		cp = 0;
		cn = 0;
		cimp = 0;
		cpar = 0;
		
		
		System.out.println("Pares, Ímpares, Positivos e Negativos");
		System.out.println("");
		
		while (x < 5) {
			System.out.print("Digite um numero: ");
			n = sc.nextInt();
			
			if (n > 0) {
				cp = (cp + 1);
			}
			else {
				if (n < 0) {
					cn = (cn + 1);
				}
			}
			
			if (n % 2 == 0) {
				cpar = (cpar + 1);
			}
			else {
				cimp = (cimp + 1);
			}
			
			x = (x + 1);
		}	
		
		System.out.println("");
		System.out.println(cp + " Valor(es) Positivo(s)");
		System.out.println(cn + " Valor(es) Negativo(s)");
		System.out.println(cimp + " Valor(es) Ímpar(es)");
		System.out.println(cpar + " Valor(es) Par(es)");
		
			
		sc.close();

	}

}
