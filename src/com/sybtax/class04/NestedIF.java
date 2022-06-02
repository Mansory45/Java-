package com.sybtax.class04;

public class NestedIF {

	public static void main(String[] args) {

		boolean vaccine = true;
		int dose = 1;

		if (vaccine) {

			System.out.println("let me check how many dose you have! ");
			if (dose == 1) {
				System.out.println("you need 1 more shot");
			} else {
				System.out.println("You are fully vacinated.");
			}
		}
		System.out.println("-----------------------------");

		String month = "June";
		int day = 19;
		if (month.equals("May")) {
			System.out.println("let me check what is today's date.");

			if (day == 8) {
				System.out.println("Today is mother day!");

			} else if (month.equals("June")) {
				System.out.println("let me check what is today' date");
				if (day == 19) {
					System.out.println("Today is father day!");
				}

			}

		}
	}

}
