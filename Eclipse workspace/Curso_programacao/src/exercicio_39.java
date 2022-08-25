import java.util.Scanner;

public class XXXIX {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int N;
		int[]idades;
		double[]alturas;
		String[]nomes;
		
		System.out.print(" Digite o numero de repetições: ");
		N = sc.nextInt();
		
		
		idades = new int [N];
		alturas = new double [N];
		nomes = new String [N];
		
		
		
		for (int I = 0; I < N; I++) {
			System.out.println("");
			System.out.print("  Digite um nome: ");
			nomes [I] = sc.next();
			System.out.print("  Digite uma idade: ");
			idades [I] = sc.nextInt();
			System.out.print("  Digite uma altura: ");
			alturas [I] = sc.nextDouble();
		}
		
		double media, soma = 0;
		for (int I = 0; I < N; I++) {
			soma = soma + alturas[I];
		}
		media = soma / N;
		
		int media2, cont = 0;
		for (int I = 0; I < N; I++) {
			if (idades[I] < 16) {
				cont = cont + 1;
			}
		}
		media2 = (cont * 100) / N; 
		
		
		System.out.println("");
		System.out.printf("  Altura média: %.2f %n", media);
		System.out.print("  Pessoas com menos de 16 anos: " +media2+ "%");
		
		sc.close();

	}

}
