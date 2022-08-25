import java.util.Scanner;

public class exercicio_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int senha;
		
		System.out.println("	* Exercício 02 *");
		System.out.println("");
		
		System.out.print("Digite a Senha: ");
		senha = sc.nextInt();
		
		while (senha != 2004) {
			System.out.println(" *Senha Invalida*");
			System.out.println("");
			System.out.print("Digite a Senha: ");
			senha = sc.nextInt();
			
		}
		System.out.println(" *Acesso Permitido*");
		
		sc.close();

	}

}
