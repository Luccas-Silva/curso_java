import java.util.Locale;
import java.util.Scanner;

public class MainX {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		String nome1;
		double a, b, c, media;
		
		System.out.print("Digite o nome do aluno: ");
		nome1 = sc.next();
		System.out.print("Digite a primeira nota: ");
		a = sc.nextDouble();
		System.out.print("Digite a segunda nota: ");
		b = sc.nextDouble();
		System.out.print("Digite a terceira nota: ");
		c =sc.nextDouble();
		
		media = (a + b + c) / 3.0;
		System.out.printf("A media do aluno(a) e igual a : %.1f %n ", media);
	
		sc.close();
	}

}
