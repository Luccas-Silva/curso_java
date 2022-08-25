import java.util.Scanner;

public class XXXII {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int X;
		
		System.out.println("	Sequências Crescentes");
		System.out.println("");
		System.out.print(" Digite um numero para começar a sequências: ");
		X = sc.nextInt();
		
		do {
			for (int i = 1; i <= X; i++) {
				System.out.print(" "+i);	
			}
			System.out.println("");
			System.out.print(" Digite um numero para continuar a sequências ou '0' para parar: ");
			X = sc.nextInt();
		} while (X != 0);
		
		System.out.println("");
		System.out.println("	Fim do progarma");
		
		sc.close();

	}

}
