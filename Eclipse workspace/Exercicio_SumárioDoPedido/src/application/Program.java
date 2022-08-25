package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner (System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
		
		System.out.println("      # Enter Cliente Data #");
		System.out.println("");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth Date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		Client client = new Client (name, email, birthDate);
		System.out.println("");
		
		System.out.println("      # Enter Order Data #");
		System.out.println("");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		Order order = new Order (new Date(), status, client);
		
		System.out.print("How many items to this order?: ");
		int numItems = sc.nextInt();
	
		for (int i=0; i <numItems; i++) {
			System.out.println("");
			System.out.println("Enter #" +(i+1)+ " item data:");
			sc.nextLine();
			System.out.print("Product name: ");
			String ProductName = sc.nextLine();
			System.out.print("Product price: ");
			double ProductPrice = sc.nextDouble(); 
			Product product = new Product(ProductName, ProductPrice);
			
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			OrderItem orderItem = new OrderItem(quantity, ProductPrice, product);
			order.addItems(orderItem);
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("      # ORDER SUMMARY #");
		System.out.println("");
		System.out.println(order);
		
		sc.close();

	}

}


