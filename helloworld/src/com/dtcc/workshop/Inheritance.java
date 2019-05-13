package com.dtcc.workshop;

public class Inheritance {
	public static void main(String[] args) {
		System.out.println("Inheritance");
		// Animal a = new Animal(); // fails, since Animal is an abstract class
		Lion l1 = new Lion();
		
		// l1.name = "Hello";
		l1.setName("Lion1");
		l1.setColor("Yellow");
		l1.show();
		 
		
		// l1 object toString automatically invoked
		System.out.println("Lion is "  + l1);

		System.out.println("Lion is "  + l1.toString());
		
		// assignment by reference
		Lion l2 = l1;
		
		// Type Casting. One type to another type
		Animal a = l1; // is a : Lion is an Animal
		a.setName("Lion 2");
		l1.show();
		
		// Casting Error, at compile time
		// Lion l5 = a; // Animal is a Lion [Wrong context]
		
		// explicit casting
		// as a developer, I know that a is an Lion, let the compiler to compile the code
		
		Lion l3 = (Lion) a;
		
		// as a developer, I know that a is an Tiger [we are wrong]
		//, let the compiler to compile the code

		// Crash at runtime, a is a Lion object
		// Compile time type checking
		// Check the type at runtime while executing byte code
		// Tiger t1 = (Tiger) a;
		
		
		l1.showDetails();
		
		l1.talk();
		
		
	}
}
