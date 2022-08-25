import java.util.Scanner;

public class exercicio_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int soma = 0, num = 1;
		
		System.out.println("	* Exercício 01 *");
		System.out.println("");
		
		while (num != 0) {
			System.out.print("Digite um numero: ");
			num = sc.nextInt();
			soma += num;
		}
		System.out.print("Soma dos numeros: " +soma);
		
		
		sc.close();

	}

}
