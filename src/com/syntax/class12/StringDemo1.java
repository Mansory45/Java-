package com.syntax.class12;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = new String("Aimal");// proper way creating an oject from a classs
		String name2 ="Aimal"; // its same as String name = new String("Aimal");
		// All the classes in java can be treated as data types.
		// if a class is present inside the same package or if a class belongs to java.lan package
		name.length();
		System.out.println(name.length());
		String captain ="NAWEED";
		System.out.println(captain.toLowerCase());
		captain="aimal";
		System.out.println(captain.toUpperCase());
	}

}
