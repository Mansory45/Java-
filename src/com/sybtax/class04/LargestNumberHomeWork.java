package com.sybtax.class04;

public class LargestNumberHomeWork {

	public static void main(String[] args) {
		//  Write a program to find largest number among three numbers using nested if provided by a user (numbers must be distinct)

		
		double num1 =4.5;
		double num2 =3.5;
		double num3 =2.5;
		
		if(num1 >= num2 && num1 >= num3) {
			System.out.println(num1 +" is the larget number");
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println(num2 +" is the larget number");
		}else {
			System.out.println(num2 + " is the larget number");
		}
	}

}
