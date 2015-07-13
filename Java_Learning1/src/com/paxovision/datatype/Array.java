package com.paxovision.datatype;

public class Array {
	
	public static void main(String [] args){
		String [] myArray ={"BMW", "Toyota", "Mercedez"};
		
		//I need to know the size of my array:
		
		int arrayLength = myArray.length;
		System.out.println("The size of myArray is: " + arrayLength);
		
		System.out.println("*******************************************");
		
		//access the first element of myArray
		
		String myArratBMW = myArray[0];
		System.out.println("The first car is: " + myArratBMW);
		
		//access the last value of myArray
		
		String myArrayLastValue = myArray[arrayLength - 1];
		System.out.println("The last car is: " + myArrayLastValue);
	}
	
	

}
