import java.util.Scanner;

public class II {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, media;
		
		System.out.println("Valida��o de Nota");
		
		System.out.println("");
		System.out.print("Digite a 1� nota: ");
		nota1 = sc.nextDouble();
		
		while (nota1 < 0 || nota1 > 10) {
			
			System.out.println("");
			System.out.println("*Nota invalida*");
			System.out.print("Digite novamente: ");
			nota1 = sc.nextDouble();
		}
		
		System.out.println("");
		System.out.print("Digite a 2� nota: ");
		nota2 = sc.nextDouble();
		
		while (nota2 < 0 || nota2 > 10) {
			
			System.out.println("");
			System.out.println("*Nota invalida*");
			System.out.print("Digite novamente: ");
			nota2 = sc.nextDouble();
		}
		
		media = (nota1 + nota2) / 2;
		
		System.out.println("");
		System.out.printf("M�dia = %.2f %n", media);
		
		
		sc.close();

	}

}
