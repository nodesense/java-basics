package com.dtcc.workshop.models;

public class Order {
	// single line
	/* 
	 * multi line
	 */
	
	// Type 1:
	// Object member variables
	// Accessible through objects
	// if we create 100 objects new Order()...
	// 100 copies of id and amount shall be created
	public String id;
	private int  amount = 0;
	public int discount = 0;
	
	// accessible only inside the this class
	private double grandTotal = 0; 
	
	// Type 2: Static type
	// Accessible through Class
	// Order.OrderType
	// only one instance of OrderType created
	public static String OrderType = "ORDER";
	
	// member function/method
	// invoked by object
	public void showPrice() {
		// what is the price variable? 
		// local variable, only within showPrice function 
		double price = amount - (discount/100.0) * amount;
		System.out.println("Price is " + price);
		
		// static method can be called from non-static/member function/method
		showOrderType();
	}
	
	
	public void calculate() {
		grandTotal = amount - (discount/100.0) * amount;
	}
	
	public void showGrandTotal() {
		System.out.println("Show Grand total " + grandTotal);
	}
	
	// static member function
	// invoked by Class
	public static void showOrderType() {
		System.out.println("Order Type " + OrderType);
		
		 //showPrice(); // error, static method cannot call non-static method
		// another static can be called
	}
	
	
	
	// getter/setter methods
	// getter, return the variable value as it is
	
	public int getAmount() {
		return amount;
	}
	
	// setter, set the new value for variable
	public void setAmount(int value) {
		// guard, check the boundary conditions
		// accept value only if in range, otherwise dont' accept, assign value
		
		if (value >= 0) {
		   amount = value;	
		} else {
			// TODO: throw exception
			System.out.println("Invalid amount, rejected");
		}
		
	}
	
}
