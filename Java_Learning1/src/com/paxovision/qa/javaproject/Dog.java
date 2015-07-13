package com.paxovision.qa.javaproject;

public class Dog {

	public Dog(String breedName, int age){
		System.out.println("Name of the dog is: " + breedName);
		System.out.println("Age is: " + age);
	}
	
	public static void main(String [] args){
		Dog dog = new Dog("Tommy", 3);
	}

}
