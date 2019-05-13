package helloworld;

import com.dtcc.workshop.Lion;
import com.dtcc.workshop.models.Order;

public class Hello {
	 public static void main(String[] args) {
	        System.out.println("Hello World");
//	        
//	        Lion l1 = new Lion();
//			
//			l1.name = "Hello";
	        
	        // create an object for class Order
	        // order1, order2 are instance/object of the class Order
	        Order order1 = new Order();
	        order1.id  = "1234567";
	        // order1.amount = 1000;
	        
	        Order order2 = new Order(); 
	        order2.id = "2323232";
	        // order2.amount = 2000;
	        
	     //   System.out.println("Order 1 " + order1.amount);

	       // System.out.println("Order 2 " + order2.amount);
	 
	 }
}
