import java.util.Scanner;

public class FunçõesInteressantesParaString_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("	* Operação split *");
		System.out.println("");
		
		String s = "potato apple lemon";
		
		String[] vect = s.split(" ");
		
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		
		System.out.println(word1);
		System.out.println(word2);
		System.out.println(word3);
		System.out.println("");
		
		
		String nome;
		System.out.print("Digite seu nome: ");
		nome = sc.nextLine();
		
		String[] vet = nome.split(" ");
		
		System.out.println(vet[0]);
		System.out.println(vet[1]);
		System.out.println(vet[2]);
		
		
		sc.close();
		

	}

}
