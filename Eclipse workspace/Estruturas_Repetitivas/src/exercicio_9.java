import java.util.Scanner;

public class exercicio_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("		* Exercício 09 *");
		System.out.println("");
		System.out.println("Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo\r\n"
				+ "segundo. Se o denominador for igual a zero, mostrar a mensagem \"divisao impossivel\".");
		System.out.println("");
		
		int numR;
		double X, Y, Z=0;
		
		System.out.print("Digite o número de repetições: ");
		numR = sc.nextInt();
		
		System.out.println("");
		for (int i=0; i<numR; i++) {
			
			System.out.print("Digite 1º número: ");
			X = sc.nextInt();
			System.out.print("Digite 2º número: ");
			Y = sc.nextInt();
			
			if (Y == 0) {
				System.out.println("* Divisao impossivel *");
				System.out.println("");
			}
			else {
				Z = X / Y;
				System.out.print(" "+X+ " / " +Y+ " = ");
				System.out.printf("%.2f %n",Z);
				System.out.println("");
			}
		}
		
		
		sc.close();

	}

}
