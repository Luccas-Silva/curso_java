import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String []vet = new String[] {"Gerson","Andreia","Bia","Luiza","Luccas","João"};
		
		for (String nome : vet) {
			System.out.println(nome);
		}
		
		sc.close();

	}

}
