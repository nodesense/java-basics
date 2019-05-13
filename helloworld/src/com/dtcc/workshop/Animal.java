package com.dtcc.workshop;

// abstract class, means, we cannot create instance/object
abstract public class Animal {
	// properties
	// methods and member variables
	
	
	// private: local to this class only, not for child class/outside
	// default access/visiblity for this package
	// protected access specificer, this class and child/derived classes, visiblity for this package,  inheritance
	
	private String name;
	
	private String color;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	public  void show() {
		System.out.println("Animal name is " + name);
	}
	
	
	// abstract method, declaration only, no body for the method
	// the child class should implmenent the abstract method
	// if the child class doesn't implement abstract method, child become a
	abstract void talk(); 

}
