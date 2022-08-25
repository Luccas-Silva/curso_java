import java.util.Scanner;

public class exercicio_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int x, y, z;

		System.out.println("	* Exercício 01 *");
		System.out.println("");

		System.out.print("Digite um numero: ");
		x = sc.nextInt();
		System.out.print("Digite um outro numero: ");
		y = sc.nextInt();

		z = x + y;
		System.out.println("");
		System.out.println("A adição de " + x + " + " + y + " = " + z);

		z = x - y;
		System.out.println("");
		System.out.println("A subtração de " + x + " - " + y + " = " + z);

		z = x * y;
		System.out.println("");
		System.out.println("A Multiplicação de " + x + " * " + y + " = " + z);

		z = x / y;
		System.out.println("");
		System.out.println("A divisão de " + x + " / " + y + " = " + z);

		sc.close();

	}

}
