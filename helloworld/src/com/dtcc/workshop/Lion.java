package com.dtcc.workshop;

// @ is called annotation, add meta data

// extends is to inherit from base/parent class
public class Lion extends Animal {
	
	// overriding base class's show() method
	@Override
	public void show() {
		// to call base class method
		super.show(); // super keyword refers to base/parent class
		System.out.println("Lion Name " + getName());
	}
	
	
	public void showDetails() {
		super.show(); // calls Animal.show method
		show(); // Lion.show()
		this.show(); // Lion.show()
	}
	
	// "" + lion, should invoke toString automatically
	// override the default toString method
	@Override
	public String toString() {
		System.out.println("Lion's toString called");;
		return "Name " + getName() + "  color " + getColor();
	}
	
	@Override
	public void talk() {
		System.out.println("Lion Talk");
	}
}
