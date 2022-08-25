import java.util.Scanner;

public class exercicio_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int A, B;
		
		
		System.out.println("		* Exercício 03 *");
		System.out.println("");
		
		System.out.print("	Digite um numero: ");
		A = sc.nextInt();
		System.out.print("	Digite um outro numero: ");
		B = sc.nextInt();
		
		System.out.println("");
		if (A > B) {
			if (A % B == 0) {
				System.out.println("	" +A+ " e " +B+ " sao Multiplos entre si");
			}
			else {
				System.out.println("	" +A+ " e " +B+ " nao sao Multiplos entre si");
			}
		}
		
		else {
			if (B % A == 0) {
				System.out.println("	" +A+ " e " +B+ " sao Multiplos entre si");
			}
			else {
				System.out.println("	" +A+ " e " +B+ " nao sao Multiplos entre si");
			}
		}
		
		
		sc.close();

	}

}
