package application;

import java.util.Scanner;

import entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Insira a largura e a altura do retângulo:");
		System.out.print("");
		retangulo.altura = sc.nextDouble();
		System.out.print("");
		retangulo.largura = sc.nextDouble();
		
		System.out.println();
		System.out.println("AREA = "+ retangulo.area());
		System.out.println("PERIMETER = "+ retangulo.perímetro());
		System.out.println("DIAGONAL = "+ retangulo.diagonal());
		sc.close();

	}

}
