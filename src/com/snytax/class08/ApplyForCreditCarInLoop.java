package com.snytax.class08;

import java.util.Scanner;

public class ApplyForCreditCarInLoop {

	public static void main(String[] args) {
		/// Create a program that will keep asking user to apply for a credit card.
		// As soon you get “yes” from a user program should stop asking.

		Scanner scan = new Scanner(System.in);

		String answer = "yes";

		do {
			System.out.println("apply for a credit card");
			answer = scan.nextLine();
		} while (!answer.equals("yes"));

		System.out.println("Ok I will apply");
	}

}
