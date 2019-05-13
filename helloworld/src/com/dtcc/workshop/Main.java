package com.dtcc.workshop;

import com.dtcc.workshop.models.Order;

public class Main {
	
	public static int add(int a, int b) {
		int c = a + b;
		return c;
	}
	
	public static void main(String[] args) {
		Order order = new Order();
		order.id = "434343";
		
		// order.amount = -4000;
		
		order.setAmount(-4000);
		System.out.println("Amount " + order.getAmount());
		
		order.discount = 10;
		
		order.calculate();
		
		// order.grandTotal = 10; // since grandTotal is private variable
		// System.out.println(order.grandTotal); // 
		
		order.showGrandTotal();
		
		// order is an object
		// id is member of the order object
		System.out.println(order.id);
		
		// static variable
		System.out.println(Order.OrderType);
		Order.OrderType = "WholesaleOrder";
		// Static method, invoked/called by class name
		Order.showOrderType();
			
		order.showPrice();
		
		int sum = add(10, 20);
		System.out.println(sum);
		
		sum = add(100, 400);
		System.out.println(sum);

		
	}
}
