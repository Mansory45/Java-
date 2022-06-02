package com.sybtax.class04;

public class IfElseIf {

	public static void main(String[] args) {

		/*
		 * declare 2 numbers and verify which one is the largest
		 */
		// the moment java finds true condition
		// it execute that block and exit entire If statement
		int num1 = 20;
		int num2 = 20;

		if (num1 > num2) {
			System.out.println(num1 + " is the larger than " + num2);
		} else if (num2 > num1) {
			System.out.println(num2 + " is the larger than " + num1);
		} else {
			System.out.println(num1 + " is equal to " + num2);
		}
	}

}
