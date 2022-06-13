package com.syntax.class11;

public class Task08 {

	public static void main(String[] args) {
	// Write a Java Program to print the first 10 numbers of Fibonacci series.
	// Fibonacci start with 0 1 1 2 3 5 8 13 21 
		
		int periousNumber=0;
		int currentNumber=1;
		int nextNumber=0;
		int numbersToPrint=10;
		
		System.out.println(0+" ");
		System.out.println(1+" ");
		
		for(int i=0; i<numbersToPrint-2;i++) {
			nextNumber=periousNumber+currentNumber;
			System.out.print(nextNumber+" ");
			periousNumber=currentNumber;
			currentNumber=periousNumber;
		}
		
	}

}
