import java.util.Scanner;

public class exercicio_7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int numPecas;
		double valPecas, valPago = 0;
		char cont = 's';
		
		System.out.println("	* Exercício 05 *");
		System.out.println("");
		
		do {
			System.out.print("Digite o código do produto: ");
			sc.nextInt();
			
			System.out.print("Digite o valor do produto ao ser comprado: ");
			valPecas = sc.nextDouble();
			
			System.out.print("Digite o número de produto ao ser comprado: ");
			numPecas = sc.nextInt();
			
			valPago = valPago + (numPecas * valPecas);
			
			System.out.println("");
			System.out.print("Desecha continuar (Sim/Não): ");
			cont = sc.next().charAt(0);
			System.out.println("");
			
		}while (cont == 's' || cont == 'S');
		
		
		System.out.printf("	Valor a ser pago: R$ %.2f %n" ,valPago);

		sc.close();

	}

}
