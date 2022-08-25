import java.util.Scanner;

public class exercicio_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int a, b, c, d, dif;
		
		System.out.println("	* Exercício 03 *");
		System.out.println("");
		
		System.out.print("Digite um numero: ");
		a = sc.nextInt();
		System.out.print("Digite um outro numero: ");
		b = sc.nextInt();
		System.out.print("Digite um outro numero: ");
		c = sc.nextInt();
		System.out.print("Digite um outro numero: ");
		d = sc.nextInt();
		
		dif = (a * b - c * d);
				
		System.out.println("A diferença dos numeros e = " +dif);
		
		sc.close();

	}

}
