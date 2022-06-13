package com.syntax.class14;

public class MethodsDemo3 {
	// write a method that takes an int value if that value is even this method
	//returns true otherwise it retures false
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodsDemo3 md= new MethodsDemo3();
		System.out.println(md.isEven(3));
		System.out.println(md.CheckString("hello"));
	
	}
	// write  a method that takes a String and returns true if number of characters in that String
	// are even otherwise odd
	
	
		boolean CheckString(String str) {
			if(str.length()%2==0) {
				return true;
			}else {
				return false;
			}
		}
	
	
	
	
	boolean isEven(int number) {
		if(number%2==0) {
			return true;
		}else {
			return false;
		}
		
		
		
		
		
		
		
	}

}
