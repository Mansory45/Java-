package com.syntax.class06;

import java.util.Scanner;

public class EnhancedLargestNumber {

	public static void main(String[] args) {
		
		int num1 = 600;
		int num2 = 600;
		int num3 = 6000;

		/*
		 * Compiler can initialize to its default values
		 * int -->0
		 * double -->0.0
		 * boolean -->false
		 * String -->null 
		 */
		int largest = 0;

		if (num1 > num2 && num1 > num3) {
			largest = num1;
		} else if (num3 > num1 && num3 > num2) {
			largest = num3;
		} else if (num2 > num1 && num2 > num3) {
			largest = num1;
			
		}else {
			
			System.out.println("All number are equal");
		
		}
		
		
		
		System.out.println("The largest number is "+ largest);
		
		//The variable largest may not have been initialized
		
	}

}
