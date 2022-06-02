package com.snytax.class08;

public class ContinueKeyword {

	public static void main(String[] args) {
		// Continue - skip current execution / iteration
		// when java executes continue--> go back to the beginnig of the loop,
		// so rest of the code inside loop body
		// will be skipped/ignored
		
		for (int i =1; i<=5; i++) {
			
			if(i == 2) {
				continue;
			}
			
			System.out.println(i +" ");
			System.out.println("let's take a break");
		}

		/// print number form 1 to 10 expect number 5 and 7
		for(int i=1;i<=10;i++) {
			if(i==5 || i ==7) {
				continue;
			}
			System.out.print(i+" ");
		}
	}

}
