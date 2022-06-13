package com.syntax.class12;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName="Adam";
		String lastName="jones";
		String fullName= firstName+lastName;
		String fullName2=firstName.concat(lastName);// never us this because it can lead you to null pointer exception
		System.out.println(fullName);
		System.out.println(fullName2);
		
		
		String name="";
		System.out.println(name.isEmpty());
		
		String str=" never";
		System.out.println(str.trim());
		
		

	}

}
