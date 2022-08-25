import java.util.Scanner;

public class exercicio_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int x, y;
		
		System.out.println("	* Exercício 03 *");
		System.out.println("");
		
		System.out.print("Digite um número para largura: ");
		x = sc.nextInt();
		System.out.print("Digite um número para altura: ");
		y = sc.nextInt();
		
		while(x != 0 || y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("	1º Quadrante ");
			}
			else if(x < 0 && y > 0) {
				System.out.println(" 	2º Quadrante ");
			}
			else if (x > 0 && y < 0){
				System.out.println(" 	4º Quadrante ");
			}
			else {
				System.out.println(" 	3º Quadrante ");
			}
			
			System.out.println("");
			System.out.print("Digite um número para largura: ");
			x = sc.nextInt();
			System.out.print("Digite um número para altura: ");
			y = sc.nextInt();
			
		}
		
		System.out.println("* Uma das coordenadas e NULA *");
		
		
		sc.close();

	}

}
