import java.util.Scanner;

public class XXXIII {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int N1, N2, soma, maior, menor;
		
		System.out.println("	Sequência de Números e Soma");
		System.out.println("");
		
		System.out.print(" Digite um numero: ");
		N1 = sc.nextInt();
		System.out.print(" Digite outro numero: ");
		N2 = sc.nextInt();
		System.out.println("");
		do {
			if (N1 > N2) {
				maior = N1;
				menor = N2;
			}
			else {
				maior = N2;
				menor = N1;
			}
			
			soma = 0;
			
			for (int I = menor; I <= maior; I++) {
				System.out.print(" "+I);
				soma = soma + I;
			}
			System.out.println(" Sum = "+soma);
			System.out.println("");
			System.out.println(" Digite '0' para parar.");
			System.out.println("");
			System.out.print(" Digite mais um numero: ");
			N1 = sc.nextInt();
			System.out.print(" Digite mais um outro numero: ");
			N2 = sc.nextInt();
			System.out.println("");
			
		} while (N1 != 0 && N2 != 0);
		
		System.out.println("	Fim do progarma");
		
		sc.close();
	}

}
