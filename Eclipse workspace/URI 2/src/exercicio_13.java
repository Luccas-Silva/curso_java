import java.util.Scanner;

public class XIII {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		int x, y, soma, inicio, fim;
		
		soma = 0;
		
		System.out.println("	Múltiplos de 13");
		System.out.println("");
		System.out.print("  Digite um numero: ");
		x = sc.nextInt();
		System.out.print("  Digite outro numero: ");
		y = sc.nextInt();
		
		if (x <= y) {
			inicio = x;
			fim = y;
		}
		else {
			inicio = y;
			fim = x;
		}
		
		for (int I = inicio; I <= fim; I++) {
			if (!(I % 13 == 0)) {
				soma = (soma + I);
			}
		}
		
		System.out.print(" Soma dos números que não são múltiplos de 13 e igual a: " +soma);
		
		
		sc.close();

	}

}
