package com.snytax.class08;

public class BreakKeyword {

	public static void main(String[] args) {
		
		// break - break block of code
		
		for(int i =1; i <=5; i++) {
			System.out.println("Hello");
			break;
		}
		
		boolean summer=true;
		int temp = 95;
		while(summer) {
			System.out.println("It is hot");
			if(temp<70)
			break;
		}

		temp -=10;
	}

}
