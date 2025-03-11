package com;

public class Bike extends Vehicle{
	
	int speed = 70;
	
	String name;
	
	/*
	 * Bike(String name){ this.name = name; }
	 */
	
	@Override
	public void display() {
		System.out.println("Bike class");
	}
	
	public void show() {
		System.out.println("Vehicle speed: "+super.speed);
		System.out.println("Bike speed: "+speed);
		display();
		super.display();
	}

	public static void main(String[] args) {
		Bike b = new Bike();
		b.show();
	}
}
