package application;

import java.util.Scanner;

import entities.Conversor;

public class Progarm2 {

	public static void main(String[] args) {
		Conversor comverda = new Conversor();
		Scanner sc = new Scanner (System.in);
		
		System.out.println("	* Conversor de Texto *");
		System.out.println();
		
		System.out.println("Insira o texto criptografado: ");
		String textoOriginal = sc.nextLine();
		System.out.println();
		
		String textoAtualizado = comverda.textoConvertido2(textoOriginal);
		System.out.println("Texto Convertido: ");
		textoAtualizado = comverda.textoConvertido2(textoAtualizado);
		System.out.println(textoAtualizado);
		
		
		sc.close();

	}

}
