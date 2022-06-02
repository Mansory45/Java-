package com.syntax.calss03;

public class PrimitivesCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 100;
		double d =100;
		
		System.out.println(i);
		System.out.println(d);
		
		int x = (int)99.99;
		System.out.println(x);
		
		// types of casting in java 
		//widening/implicit casting
		
		double myDouble = 100.5d;
		int myInt = (int)myDouble;
		
		System.out.println(myInt);
		
		float myFloat = 99.55f;
		int myInt1 = (int)myFloat;
		System.out.println(myFloat);
		System.out.println(myInt1);
		

	}

}
