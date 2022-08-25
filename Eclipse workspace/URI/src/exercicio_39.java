import java.util.Scanner;

public class XXXIX {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int Idade, Soma, cont;
		double media;
		
		Soma = 0;
		cont = 0;
		
		System.out.print("Digite uma idade: ");
		Idade = sc.nextInt();
		
		while (Idade >= 0) {
			cont = (cont + 1);
			Soma = (Soma + Idade);
			
			System.out.print("Digite uma idade: ");
			Idade = sc.nextInt();
		}
		
		if (cont > 0) {
			media = (double) Soma / cont;
			System.out.printf("A media e igual a %.2f %n" ,media);
		}
		else {
			System.out.print("Impossivel calcular");
		}
		
		sc.close();
	}

}
