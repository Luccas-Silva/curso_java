import java.util.Scanner;

public class exercicio_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("		* Exercício 08 *");
		System.out.println("");
		
		System.out.println("Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste\r\n"
				+ "de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes\r\n"
				+ "conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem\r\n"
				+ "peso 5.");
		System.out.println("");
		
		System.out.print("Digite o número de repetições: ");
		int numR;
		double num;
		
		numR = sc.nextInt();
		
		for (int j=0; j<numR; j++) {
			double media=0, soma=0;
			System.out.println("");
			for (int i=0; i<3; i++) {
				System.out.print("Digite a " +(i+1)+ "º nota do " +(j+1)+ "º aluno: ");
				num = sc.nextDouble();
				soma = soma + num; 
			}
			media = soma / 3;
			System.out.printf("* Media do " +(j+1)+ "º aluno: %.2f * %n " ,media);
		}
		
		sc.close();

	}

}
