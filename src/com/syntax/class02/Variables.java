package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {
		// part A
		String StudentName = "Aimal ";
		char grade = 'A';
		String city = "seattle ";
		String state = "Washington";
		long Number = 2064445555l;
		
	System.out.println("My name is " +StudentName+ "I am in grade " + grade + " and I live in " +city+ "my phone number is " + " " +Number);
	System.out.println(grade);
	System.out.println(city);
	System.out.println(state);
	System.out.println(Number);
	
	
	//part B
	city = "Tacoma ";
	state = "california";
	Number = 2068881012l;
	grade = 'B';
	System.out.println(city);
	System.out.println(state);
	System.out.println(Number);
	
	System.out.println("My Name is  " + StudentName  +"I am in grade "+ grade + " and I moved to new city in "+city+state+ " My new phone number is "+ Number);
	
		// Rules for identifiers
		// 1. no space
		//2. no keywords
		// 3. can not start with numbers (number can be use after )
		// can not have special character except -,$
	
	/*
	 * Naming conventions
	 * follow camel casing
	 * variable / methods name should start with lower case and then follow camel case 
	 * class name should start with uppercase 
	 */
	
	String myCity = "New Yourk";

	}

}
