import java.util.Locale;
import java.util.Scanner;

public class MianXII {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 		
		Locale.setDefault(Locale.US);
		
		String nome1, nome2;
		int idade1, idade2;
		double media;
		
		System.out.println("Escreva os nomes e idades de duas pessoas.");
		
		System.out.print("nome:");
		nome1 = sc.next();
		
		System.out.print("nome:");
		nome2 = sc.next();
		
		System.out.print("Idade:");
		idade1 = sc.nextInt();
		
		System.out.print("Idade:");
		idade2 = sc.nextInt();
		
		media = (double)(idade1 + idade2) / 2.0;
		
		System.out.printf("A media da idade de %s e %s e igual a %.1f", nome1, nome2, media);
		
		
	}

}
