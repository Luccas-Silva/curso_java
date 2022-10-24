package aplicacao;

import java.util.Scanner;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Pessoa p1 = new Pessoa(1, "Carla Silva","Carla@gmail.com");
		Pessoa p2 = new Pessoa(2, "Joana torres", "Joana@gmail.com");
		Pessoa p3 = new Pessoa(3, "Ana Maria", "Ana@gmail.com");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		sc.close();

	}

}
