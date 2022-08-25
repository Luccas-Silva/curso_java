import java.util.Scanner;

public class XVIII {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("Digite um numero: ");
		n = sc.nextInt();
		
		if (n <= 0) {
			do {
				System.out.println("O numero tem que ser maior que zero.");
				System.out.print("Digite outro numero: ");
				n = sc.nextInt();
			}while (n <= 0);
		}
		
		n = n * 4;
		
		for (int i = 1; i <= n; i++) {
			if (i % 4 == 0) {
				System.out.println(" PUM");	
			}
			else {
				System.out.print(" " +i+ ",");
			}
			
		}
		
		sc.close();

	}

}
