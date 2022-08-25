import java.util.Scanner;

public class exercicio_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int num;
		
		System.out.println("		* Exercício 01 *");
		System.out.println("");
		
		System.out.print("	Digite um numero: ");
		num = sc.nextInt();
		
		System.out.println("");
		if (num < 0) {
			System.out.println("	* " +num+ " é um número negativo *");
		}
		else if (num > 0){
			System.out.println("	* "+num+ " é um número positivo *");
		}
		else {
			System.out.println("	* O zero não é um número positivo nem  ");
			System.out.println("	 negativo, já que não é maior nem menor que si mesmo. *");
		}
		
		sc.close();

	}

}
