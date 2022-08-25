import java.util.Scanner;

public class XXX {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("     Sort Simples");
		System.out.println("Digite numeros inteiros");
		System.out.print("Digite o 1º numero: ");
		n1 = sc.nextInt();
		System.out.print("Digite o 2º numero: ");
		n2 = sc.nextInt();
		System.out.print("Digite o 3º numero: ");
		n3 = sc.nextInt();
		
		System.out.println("Ordem Crescente");
		
		if (n1 <= n2 && n1 <= n3) {
			System.out.println( n1);
			
			if(n2 <= n3) {
				System.out.println( n2);
				System.out.println( n3);
			}
			else {
				System.out.println( n3);
				System.out.println( n2);
			}
		}
		else {
			if (n2 <= n3 ) {
				System.out.println( n2);
		
			if (n1 <= n3) {
				System.out.println( n1);
				System.out.println( n3);
			}
			else {
				System.out.println( n3);
				System.out.println( n1);
			}
			}
			else {
				System.out.println( n3);
			}
			if (n1 <= n2) {
				System.out.println( n1);
				System.out.println( n2);
			}
			else {
				System.out.println( n2);
				System.out.println( n1);
			}
				
			
		}
		System.out.println("Ordem Original");
		System.out.println( n1);
		System.out.println( n2);
		System.out.println( n3);
		
				
			
		sc.close();

	}

}
