package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of employees: ");
		int numEmp = sc.nextInt();
		
		List<Employee> list = new ArrayList<>();
		
		for (int i=0; i<numEmp; i++) {
			System.out.println();
			System.out.println("Employee #" +(i+1)+ " data: ");
			System.out.print("Outsourced (y/n)? ");
			char yn = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			Double valuePerHours = sc.nextDouble();
			if (yn == 'y') {
				System.out.print("Additional charge: ");
				Double additionalCharge = sc.nextDouble();
				list.add(new OutsourcedEmployee(name, hours, valuePerHours, additionalCharge));
			}
			else {
				list.add(new Employee(name, hours, valuePerHours));
			}
		}
		
		System.out.println();
		System.out.println("PAYMENTS:");
		for (Employee emp : list) {
			System.out.println(emp.getName() +" - $ "+ String.format("%.2f", emp.payment()));
		}
		
		sc.close();

	}

}
