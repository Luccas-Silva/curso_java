package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program3 {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"Good Morning", "Good afternoon", "Good night"};
		
		String path = "C:\\Users\\lucca\\OneDrive\\Área de Trabalho\\Programas\\Good.txt";
		
		try (BufferedWriter bw = new BufferedWriter (new FileWriter(path, true))) {
			for (String line: lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e) {
			System.out.print("Error: " + e.getMessage());
		}
	
	}
}
