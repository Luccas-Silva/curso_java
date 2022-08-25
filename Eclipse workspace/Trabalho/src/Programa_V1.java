import java.util.Random;
import java.util.Scanner;

public class Programa_V1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Random gerador = new Random();
		
		
		System.out.println("Tabela de 1 a 60");
		System.out.println("+-------------------------------+");
		System.out.print("| 01 02 03 04 05 06 07 08 09 10 |\r\n"
				+ "| 11 12 13 14 15 16 17 18 19 20 |\r\n"
				+ "| 21 22 23 24 25 26 27 28 29 30 |\r\n"
				+ "| 31 32 33 34 35 36 37 38 39 40 |\r\n"
				+ "| 41 42 43 44 45 46 47 48 49 50 |\r\n"
				+ "| 51 52 53 54 55 56 57 58 59 60 |\r\n"
				+ "+-------------------------------+");
		System.out.println();
		
		System.out.println();
		System.out.println("Sorteio de 10 numeros aleatorios de 1 a 60.");
		System.out.print("para o sorteio digite (sim / não)? ");
		char res = sc.nextLine().charAt(0);
		
		System.out.println();
		if (res == 's' || res == 'S') {
			System.out.print("  [");
			for (int i=0; i<10; i++) {
				int n = gerador.nextInt(59)+1;
				System.out.print(" " + n);
			}
			System.out.print(" ]");
		}
		
		sc.close();
	}

}
