package com.syntax.class10;

public class Task3 {

	public static void main(String[] args) {

		String[][] usa = {

				{ "New Youk", "Albany", "Buffalo" },
				
				{ "los Angeles", " San Fransico ", "san Jose", "San diago", "Redding" },
				
				{ "Miami", "Orlando", "Niceville", "Tampa" }, 
				
				{ "Mclean", "Richmond", "Leesburg" },
				
		};
		System.out.println("Retrive all values using for each loop");
		
		for(String[]state:usa) {
			for(String city:state) {
				System.out.print(city+" ");
			}
			System.out.println();
		}
	}

}
