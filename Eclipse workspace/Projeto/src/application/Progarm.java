package application;

import java.util.Scanner;

import entities.Conversor;

public class Progarm {

	public static void main(String[] args) {
		Conversor comverda = new Conversor();
		Scanner sc = new Scanner (System.in);
		
		System.out.println("	* Conversor de Texto *");
		System.out.println();
		
		System.out.println("Insira o texto: ");
		String textoOriginal = sc.nextLine();
		System.out.println();
		
		System.out.println("Texto Convertido: ");
		String textoAtualizado = comverda.textoConvertido(textoOriginal);
		System.out.println(textoAtualizado);
		System.out.println();
		
		sc.close();
	}		

}
