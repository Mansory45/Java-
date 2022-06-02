package com.syntax.class02;

public class NonPrimatives {

	public static void main(String[] args) {
		// Non primitives datatypes 

		String name = "Aimal";
		String lastName = "Mansory";
		long phone = 12345678901L;
		//xxx-xxx-xxxx
		String phoneNumber = "123-456-7890";
		String address = "4750 Aubrun way North";
	
		int age = 30 ;
		String city = "Seattle";
				
		// shortcut for printing 
		// type syso + ctrl and space
		/*
		 * we can use + 
		 * to attach string to string 
		 * to attach string to int 
		 * to attach string to double 
		 * to any other types
		 */
		System.out.println(name +" "+ lastName);
		//Aimal lives in seattle
		System.out.println(name +" live in "+city);
		// Aimal is 30 year old
		
		System.out.println(name +" is "+ age +" years old");
		System.out.println(phoneNumber);
	}

}
