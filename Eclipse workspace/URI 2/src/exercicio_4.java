import java.util.Scanner;

public class IV {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade, cont, contId;
		double media;
		//cont = contador / contId = contador de idade//
		
		cont = 0;
		contId = 0;
		
		System.out.print(" Digite uma idade: ");
		idade = sc.nextInt();
		
		while (idade > 0) {
			
			cont = cont + 1;
			contId = contId + idade;
			
			System.out.print(" Digite outra idade: ");
			idade = sc.nextInt();
			
		}
		
		media = (contId / cont);
		
		System.out.printf(" Valor correspondente à média de idade dos indivíduos: %.2f %n", media);
	
		
		sc.close();

	}

}
