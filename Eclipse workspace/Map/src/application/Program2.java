package application;

import java.util.HashMap;
import java.util.Map;

import entities.Product;

public class Program2 {

	public static void main(String[] args) {

		Map<Product, Integer> stock = new HashMap<>();
		
		Product p1 = new Product("TV", 950.00);
		Product p2 = new Product("Notebook", 1260.00);
		Product p3 = new Product("Tablet", 450.00);
		
		stock.put(p1, 10000);
		stock.put(p2, 25000);
		stock.put(p3, 15500);
		
		Product ps = new Product("TV", 950.0);
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
		
	}

}
