import java.util.Scanner;

public class MainXVII {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int a, b, c;
		
		System.out.println("Digite três numeros: ");
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if (a < b &&  a < c) {
			System.out.println("O menor e" + a);
		}
		else {
			if (b < c) {
				System.out.println("O menor e" + b);
			}
			else {
				System.out.println("O menor e" + c);
			}
		}
		sc.close();

	}

}