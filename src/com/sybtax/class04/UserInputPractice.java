package com.sybtax.class04;

import java.util.Scanner;

public class UserInputPractice {

	public static void main(String[] args) {

			Scanner input = new Scanner(System.in);
			
			System.out.println("Please enter you First name.");
		
			String name = input.next();
			System.out.println(name);
			
			System.out.println(name + " Please enter you sweet age");
			
			int age = input.nextInt();
			
			System.out.println(name + " is " + age + " years old.");
			
			
			// Create a java program in which using Scanner you are going to capture user’s first name,
			// last name and state where he/she lives.

			//2. Create a java program in which using Scanner you are going to capture 2 numbers.
			//And once you capture 2 numbers, please check which one is the largest.
			 
	}

}
