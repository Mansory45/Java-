package com.snytax.class08;

public class NestedLoop {

	public static void main(String[] args) {// outer loops
		//
		for (int i = 1; i <= 3; i++) {
			System.out.println("hello");

			for (int y = 1; y <= 2; y++) {// nested loops
				System.out.println("bye");

			}

		}

		System.out.println("--------------------------------------------------------");

		for (int i = 1; i <= 3; i++) { // outer loop controls inner loop

			System.out.println(i);

			for (int y = 1; y <= 2; y++) {// inner loop depends on the outer loop

				System.out.println(y);

			}
		}

		System.out.println("--------------------------------------------------------");

		for (int i = 1; i <= 3; i++) {

			for (int y = 1; y <= 2; y++) {

				System.out.println(i + " " + y);

			}

		}

		System.out.println("--------------------------------------------------------");

		for (int i = 1; i <= 3; i++) {

			System.out.println("hello");

			for (int y = 1; y >= 2; y++) {

				System.out.println("bye");

			}

		}
		System.out.println("--------------------------------------------------------");
		
		for (int i = 1; i >= 3; i++) {
			
			System.out.println("Hello");
			
			for (int y = 1; y <= 2; y++) {
				
				System.out.println("Bye");
			}
			
		}
		
		
	}

}
