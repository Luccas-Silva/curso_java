package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Rectangle;
import entities.Circle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		List <Shape> list = new ArrayList <>();
		
		System.out.print("Enter the number of shapes: ");
		int numShapes = sc.nextInt();
		
		for (int i=1; i<=numShapes; i++) {
			System.out.println("");
			System.out.println("Shape #"+i+" data: ");
			System.out.print("Rectangle or Circle (r/c)? ");
			char rc = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next()); 
			
			if (rc == 'r') {
				System.out.print("Height: ");
				double height = sc.nextDouble();
				System.out.print("Width: ");
				double width = sc.nextDouble();
				list.add(new Rectangle(color, height, width));
			}
			else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				list.add(new Circle(color, radius));
			}
		}
		System.out.println("");
		System.out.println("SHAPE AREAS: ");
		for (Shape shape: list) {
			System.out.printf("%.2f %n",shape.area());
		}
		
		sc.close();

	}

}
