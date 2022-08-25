package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program_Estrutura_BlocoFinally {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\lucca\\OneDrive\\Área de Trabalho\\Programas\\Sun Tzu.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch (FileNotFoundException x) {
				System.out.println("Error opening file: "+ x.getMessage());
		}
		finally {
			if(sc != null) {
				sc.close();
			}
			System.out.println("");
			System.out.println("Finally Block executed");
		}
		
	}
}
