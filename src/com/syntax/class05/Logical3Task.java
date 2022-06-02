package com.syntax.class05;

import java.util.Scanner;

public class Logical3Task {

	public static void main(String[] args) {
		
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Please enter a number?");
		int num = Scanner.nextInt();
		
		if (num>=1 && num <=10 ) {
			System.out.println("The number is Samll");
		} else if (num >= 11 && num <= 100) {
			System.out.println("The number is medium");
		}else if (num>= 101 && num <= 1000){
			System.out.println("The number is Largest");
		}

	}

}
