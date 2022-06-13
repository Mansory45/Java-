package com.syntax.class14;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = new String(" haahhaha");
		System.out.println(s.toUpperCase());
		StringBuilder st = new StringBuilder("jajajaja");
		System.out.println(st.reverse());
		
		// String and StringBuilder both are classes that we can use to store and manipulate Strings
		// But String is immutable and StringBuilder is mutable //mutable =changeable immutable = not changeable
		// When we make a lot of changes to a String it creates multiple copies inside your memory and it can be very slow 
		// becaues of this reason because for every change a new variable is created
	}

}
