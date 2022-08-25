import java.util.Scanner;

public class XXIV {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, y, min, max, soma;
		
		soma = 0;
		
		System.out.println("Soma de Impares Consecutivos");
		System.out.println("");
		System.out.print("Digite o 1º numero: ");
		x = sc.nextInt();
		System.out.print("Digite o 2º numero: ");
		y = sc.nextInt();
		
		if (x < y) {
			min = x;
			max = y;
		}
		else {
			min = y;
			max = x;
		}
		
		for (int i = min+1; i<max; i++) {
			if (i % 2 != 0) {
				soma = soma + i;
			}
		}
		
		System.out.print("Soma: "+soma);
		
		sc.close();

	}

}
