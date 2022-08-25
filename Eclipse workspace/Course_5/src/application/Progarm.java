package application;

import java.util.Scanner;

import util.Calculator;

public class Progarm {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Entre radius: ");
		double radius = sc.nextDouble();
		
		double circumference = Calculator.circumference(radius);
		
		double volume = Calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f %n", circumference);
		System.out.printf("Volume: %.2f %n", volume);
		System.out.printf("PI value: %.2f %n", Calculator.PI);
		
		sc.close();

	}

}
