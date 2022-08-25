package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		Order order = new Order(222, new Date(), OrderStatus.PROCESSING);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		order = new Order(555, (new Date()), os1);
		System.out.println(order);
		
		OrderStatus os2 = OrderStatus.valueOf("PENDING_PAYMENT");
		order = new Order(775, new Date(), os2);
		System.out.println(order);
		
	}

}
