import java.util.Scanner;

public class exercicio_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double num;
		
		System.out.println("		* Exercício 06 *");
		System.out.println("");
		
		System.out.print("	Digite um numero: ");
		num = sc.nextInt();
		
		if (num >= 0 && num <= 25) {
			System.out.println("	Intervalo de [0,25]");
		}
		else if (num >= 26 && num <= 50) {
			System.out.println("	Intervalo de [25,50]");
		}
		else if (num >= 51 && num <= 75) {
			System.out.println("	Intervalo de [50,75]");
		}
		else if (num >= 76 && num <= 100) {
			System.out.println("	Intervalo de [75,100]");
		}
		else {
			System.out.println("	Fora de intervalo");
		}
		
		sc.close();

	}

}
