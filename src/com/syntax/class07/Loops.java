package com.syntax.class07;

public class Loops {

	public static void main(String[] args) {
		// What is loop? loop statement that executes block of code number of time based
		// on the condition.
		// While loop execute block of code while condition is true.

		System.out.println("-------------------------------");
		// while is similar to if statement

		int time = 1;
		if (time < 12) {
			System.out.println("Morning ");
		}
		System.out.println("-------------------------------");

		// while loop - first checks the condition then and only if condition is true
		// execute block of code.
		// For Example: print number form 1 to 10

		int num = 1;
		while (num <= 10) {

			System.out.println(num + " ");
			num++;

		}
		
		System.out.println("-------------------------------");

		// do while loop - executes code at least once before checking the condition.
		// do while first executes the code and only then checks the condition

		int num2 = 10;
		do {

			System.out.print(num2 + " ");

		} while (num2 <= 15);
		
		System.out.println("------------------------------------------");

		// print number 1 to 30 using do while loop

		int num3 = 15;
		do {
			System.out.print(num3 + " ");
			num3++;
		} while (num3 <= 10);

	}

}
