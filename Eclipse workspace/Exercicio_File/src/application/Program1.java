package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\lucca\\OneDrive\\Área de Trabalho\\Programas\\Sun Tzu.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.print(sc.nextLine());
			}
		}
		catch (IOException e) {
			System.out.print("Error: " + e.getMessage());
		}
		finally {
			if (sc != null) {
				sc.close();
			}
			
		}
	}

}
