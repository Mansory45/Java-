package com.sybtax.class04;

import java.util.Scanner;
public class UserInputHomeWork {

	public static void main(String[] args) {
		
		// Create a java program in which using Scanner you are going to capture user’s first name,
		// last name and state where he/she lives.

		//2. Create a java program in which using Scanner you are going to capture 2 numbers.
		//And once you capture 2 numbers, please check which one is the largest.
		 
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your first name?");
		String name = input.next();
		
		System.out.println("Please enter your last name?");
		String lastName = input.next();
		
		System.out.println(name + " " +lastName+ " pleaes enter a state where you live.");
		String state =input.next();
		System.out.println(name + " " +lastName + " is from " + state);
	}

}