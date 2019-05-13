package com.dtcc.workshop;

// can be relation
// implement the interface contract
// can implement interface contacts
public class Person implements Driver, Coder, Teacher {
	public void drive() {
		System.out.println("Person Drive called");
	}
	
	public void code() {
		System.out.println("Person code called");
	}
	
	public void teach() {
		System.out.println("Person teach called");
	}
}
