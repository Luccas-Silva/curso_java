import java.util.Scanner;

public class exercicio_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int num, rep, soma = 0;
		
		System.out.println("	* Exercício 05 *");
		System.out.println("");
		
		System.out.print("Digite o número de repetições:  ");
		rep = sc.nextInt();
		
		for (int i=0; i<rep; i++) {
			System.out.print("Digite um número: ");
			num = sc.nextInt();
			soma = soma + num; 
		}
		
		System.out.print("Soma dos números digitados: " +soma);
		
		sc.close();

	}

}
