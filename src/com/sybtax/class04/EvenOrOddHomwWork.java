package com.sybtax.class04;

import java.util.Scanner;
public class EvenOrOddHomwWork {

	public static void main(String[] args) {
		// Write a Java Program to check whether number is Even or Odd.

		

		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		int num = reader.nextInt();
		if(num % 2 ==0) {
			System.out.println(" is even number");
		}else {
			System.out.println(" is odd number");
		}
		
		
		System.out.println("-------------------------------------------------------------");
		
	
	}
}
