package com.syntax.class05;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("how old are you?");
		int age = scanner.nextInt();
		
		if (age >=18) {
			System.out.println("I will issuce the a driver license for you");
		}else {
			System.out.println("Please get a drivre perimit");
		}

	}

}
