import java.util.Scanner;

public class V {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n, media, cont;
		int []vet;
		
		cont = 0;
		media = 0;
		
		System.out.println("	Média de Par");
		System.out.println("");
		System.out.print("  Digite o número de repetiçõeis: ");
		n = sc.nextInt();
		
		vet = new int [n];
		
		System.out.println("");
		for (int i = 0; i < n; i++) {
			System.out.print("	Digite um numero: ");
			vet[i] = sc.nextInt();
			
			if (vet[i] % 2 == 0) {
				cont++;
				media = media + vet[i];
			}
		}
		
		media = media / cont;
		
		System.out.println("");		
		System.out.println("    Média dos números Pares: " +media);		
		
		sc.close();

	}

}
