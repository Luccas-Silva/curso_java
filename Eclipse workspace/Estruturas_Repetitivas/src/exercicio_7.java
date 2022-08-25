import java.util.Scanner;

public class exercicio_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("		* Exercício 07 *");
		System.out.println("");
		
		System.out.println("Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.\r\n"
				+ "Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando\r\n"
				+ "essas informações conforme exemplo (use a palavra \"in\" para dentro do intervalo, e \"out\" para fora do intervalo).");
		System.out.println("");
		
		int numR, num, in=0, out=0;
		
		System.out.print("	Digite o número de repetições: ");
		numR = sc.nextInt();
		System.out.println("");
		
		for (int i=0; i<numR; i++) {
			System.out.print("	Digite um número: ");
			num = sc.nextInt();
			if(num >= 10 && num <= 20) {
				in++;
			}
			else {
				out++;
			}
		}
		
		System.out.println("");
		System.out.println("	in: " +in);
		System.out.println("	out: "+out);
		
		sc.close();

	}

}
