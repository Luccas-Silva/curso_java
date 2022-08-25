import java.util.Scanner;

public class exercicio_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		char numR = 'n';
		int prefe, Alcool = 0, Gasolina = 0, Diesel = 0;
		
		System.out.println("	* Exercício 04 *");
		System.out.println("");
		
		System.out.println("Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva\r\n"
				+ "um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel\r\n"
				+ "). Caso o usuário informe um código inválido (fora da faixa de 1 a 3) deve ser solicitado um novo código (até\r\n"
				+ "que seja válido). O programa será encerrado quando o código informado for o não. Deve ser escrito a\r\n"
				+ "mensagem: \"MUITO OBRIGADO\" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme\r\n"
				+ "exemplo.");
		System.out.println("");
		
		while (numR != 's') {
			
			System.out.print("Digite um numero sapendo que 1.Álcool 2.Gasolina 3.Diesel : ");
			prefe = sc.nextInt();
			System.out.println("");
			
			switch (prefe) {
			case 1:
				Alcool += +1;
				break;
			case 2:
				Gasolina += +1;
				break;
			case 3:
				Diesel += +1;
				break;
			default:
				System.out.println("O número digitado não está no sistema.");

			}
			
			System.out.print("Gostaria de encerrar o programa (sim/não): ");
			numR = sc.next().charAt(0);	
			System.out.println("");
		}
		System.out.println("	* MUITO OBRIGADO *");
		System.out.println("	    Alcool: " +Alcool);
		System.out.println("	    Gasolina: " +Gasolina);
		System.out.println("	    Diesel: " +Diesel);
		
		sc.close();

	}

}
