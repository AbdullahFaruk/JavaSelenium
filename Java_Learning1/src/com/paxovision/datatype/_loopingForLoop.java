package com.paxovision.datatype;

public class _loopingForLoop {
	
	
	public static void main(String [] args){
		
		for (int i = 0; i <= 10; i++){
			System.out.println("i: " + i);
		}
		System.out.println("<==== Next Count ====>");
		for (int i = 10; i>=0; i--){
			System.out.println("i: " + i);
		}
		System.out.println("<==== Next Count ====>");
		for (int i = 0; i<= 10; i+=2){
			System.out.println("i: " + i);
		}
	}
	
}
