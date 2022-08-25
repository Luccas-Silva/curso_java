import java.util.Scanner;

public class MainXX {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int N;
		
		System.out.print("Digite um numero inteiro : ");
		N = sc.nextInt();
		
		N %= 2;
		
		if (N == 0)  {
			System.out.println("Esse numero e Par.");
		}
		else {
			System.out.println("Esse numero e Impar.");
		}
		sc.close();

	}

}
