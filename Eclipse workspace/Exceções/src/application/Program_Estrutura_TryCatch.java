package application;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program_Estrutura_TryCatch {

	public static void main(String[] args) {
		
		method1();
		
		System.out.println("");
	System.out.println("End of Program");
	
	}
	
	public static void method1() {
		System.out.println("*** METHOD-1 START ***");
		
		method2();
		
		System.out.println("*** METHOD-1 END ***");
	}

	public static void method2() {
		System.out.println("");
		System.out.println("### METHOD-2 START ###");
		Scanner sc = new Scanner(System.in);

		System.out.println("");
		try {
			System.out.print("Digite algumas palavras: ");
			String[] vet = sc.nextLine().split(" ");
			System.out.print("Digite a posição de uma palavara: ");
			int posi = sc.nextInt();
			System.out.println(vet[posi]);	
		}
		catch (ArrayIndexOutOfBoundsException x) {
			System.out.println("Invalid position!");
		}
		catch (InputMismatchException x) {
			System.out.println("Input error");
		}

		sc.close();
	
		System.out.println("");
		System.out.println("### METHOD-2 END ###");
		System.out.println("");
	
	}
}

