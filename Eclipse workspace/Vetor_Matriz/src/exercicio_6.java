import java.util.Scanner;

public class VI {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int N;
		int []Idade;
		String []Nome;
		
		System.out.println("	O mais Velho");
		System.out.println("");
		System.out.print(" Digite o número de repetições: ");
		N = sc.nextInt();
		
		Idade = new int [N];
		Nome = new String [N];
		
		for (int I = 0; I < N; I++) {
			System.out.println("");
			System.out.print("  Digite seu nome: ");
			Nome[I] = sc.next();
			System.out.print("  Digite sua idade: ");
			Idade[I] = sc.nextInt();
		}
		
		int MaisV, cont;
		MaisV = 0;
		cont = 0;
		
		for (int I = 0; I < N; I++) {
			if (Idade[I] > MaisV) {
				MaisV = Idade[I];
				cont = I;
			}
		}
		
		System.out.println("");
		System.out.print(" O Mais Velho e o " +Nome[cont]+ " com a idade de " +MaisV+ " anos.");
		
		sc.close();
		
	}

}
