package com.paxovision.qa.javaproject;

public class _Car {
	
	public _Car(String name, String color, double price){
		System.out.println("Name of my car is: " + name);
		System.out.println("Color is: " + color);
		System.out.println("Price is: " + price);
		
	}
	
	public static void main(String [] args){
		_Car car = new _Car("BMW", "Blue", 45000);
		_Car car2	= new _Car("Toyota", "Red", 22000);
	}
}
