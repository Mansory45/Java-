package com.syntax.calss03;

public class RelationalOperators {

	public static void main(String[] args) {
		
		// >,<,>=,<=,==,!=  RelationalOperators compiares operators 
		
		int num1 =20;
		int num2 = 22;
		System.out.println(num1>num2);// false
		System.out.println(num1<num2);// true
		System.out.println(num1!=num2);// true
		
		System.out.println(num1==num2);//no false
		System.out.println(num1=num2);//22
		System.out.println(num1==num2);// true
		
		
		
		boolean resutl = 100>200;
		System.out.println(resutl);
		
		int resutt1=100+200;
		
		String result2 = "Emrc"+ 10;
		
		int num3=10;
		int num4=11;
		resutl=num3==num4; // if num3 equals to num4 
		
		System.out.println(resutl);// false
		
		resutl =num3!=num4; // check if num3 not equal to num4 
		System.out.println(resutl);
	}
}
