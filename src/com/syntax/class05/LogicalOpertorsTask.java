package com.syntax.class05;

import java.util.Scanner;

public class LogicalOpertorsTask {

	public static void main(String[] args) {
	
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Please enter your height in inches");
		int height = Scanner.nextInt();
		
	if (height<60){
		System.out.println("person is short");
	}else if (height >=60 && height <= 72) {
		System.out.println("Person is Medium");
	}else if (height > 62) {
		System.out.println("Person is Tall");
	}

		
	}

}
