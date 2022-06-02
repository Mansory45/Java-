package com.syntax.calss03;

public class additionOrConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 20;
		
		String c = "Hello";
		String d = "Hi";
		
		System.out.println(a+b+c+d);
		System.out.println(a+c+b+d);
		System.out.println(c+d+a+b);// anything we attache to string it will be goign big string.
		System.out.println(c+d+(a+b));// anything between bracket () will execute first.

		boolean boo = true;
		System.out.println(c+boo);
	
		
	}

}
