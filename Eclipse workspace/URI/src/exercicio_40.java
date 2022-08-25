import java.util.Scanner;

public class XL {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int S;
		//S = Senha//
		
		System.out.print("Digite a Senha: ");
		S = sc.nextInt();
		
		while (S != 2020) {
			
			System.out.println("Senha Invalida");
			System.out.print("Digite a Senha: ");
			S = sc.nextInt();
		}
		
		System.out.print("Acesso Permitido");
		
		sc.close();
	}

}
