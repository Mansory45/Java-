package com.syntax.class07;

public class WhileLoop {

	public static void main(String[] args) {
		// While loop
		
		
	
		int time = 2;
		
		if(time<12) {
			System.out.println("Wellcome to if statement");
			
		}
		System.out.println("---------------------------------------------------");
		
		/*
		 * while(time<12) {
			System.out.println("Wellcom to loop"); // this is infinite loop 
		}
		 * 
		 */
		while(time<13) {
			System.out.println("Morning"); // this is infinite loop 
			time++;
		}
		
		
		// 
		int aimal = 30;
		do {
			System.out.println("Hello");
		} while(aimal <20);
		

	}

}
