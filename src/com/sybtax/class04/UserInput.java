package com.sybtax.class04;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		
		// creating a scanner
		Scanner input = new Scanner(System.in);
		
		// send instruction to the console
		
		System.out.println("please enter you name");
		
		// we need to grab the values form console
		
		
		String name = input.next();
		System.out.println(name);
		
		//let's send instruction 
		System.out.println(name+ " pleae enter your age");
		int age = input.nextInt();
		
		System.out.println(name + " is " +age+ " years old");

	}

}
