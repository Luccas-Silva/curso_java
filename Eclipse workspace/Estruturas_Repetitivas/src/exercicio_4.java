import java.util.Scanner;

public class exercicio_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		char numR = 'n';
		int prefe, Alcool = 0, Gasolina = 0, Diesel = 0;
		
		System.out.println("	* Exerc�cio 04 *");
		System.out.println("");
		
		System.out.println("Um Posto de combust�veis deseja determinar qual de seus produtos tem a prefer�ncia de seus clientes. Escreva\r\n"
				+ "um algoritmo para ler o tipo de combust�vel abastecido (codificado da seguinte forma: 1.�lcool 2.Gasolina 3.Diesel\r\n"
				+ "). Caso o usu�rio informe um c�digo inv�lido (fora da faixa de 1 a 3) deve ser solicitado um novo c�digo (at�\r\n"
				+ "que seja v�lido). O programa ser� encerrado quando o c�digo informado for o n�o. Deve ser escrito a\r\n"
				+ "mensagem: \"MUITO OBRIGADO\" e a quantidade de clientes que abasteceram cada tipo de combust�vel, conforme\r\n"
				+ "exemplo.");
		System.out.println("");
		
		while (numR != 's') {
			
			System.out.print("Digite um numero sapendo que 1.�lcool 2.Gasolina 3.Diesel : ");
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
				System.out.println("O n�mero digitado n�o est� no sistema.");

			}
			
			System.out.print("Gostaria de encerrar o programa (sim/n�o):�");
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
