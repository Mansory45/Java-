package com.sybtax.class04;

public class MoreBestedIF {

	public static void main(String[] args) {

		/*
		 * we need to check if repl ws completed
		 * 
		 * if repl is completed we want to see if you did 15 and more --> you did great
		 * job if you did more than 10 --> you did goo if you did lee than 10 --. try to
		 * complete all assignments
		 * 
		 */
		boolean didRepl = true;
		int assignments;

		if (didRepl) {
			System.out.println("How many assignment have you done?");
			assignments = 17;
			if (assignments > 15) {
				System.out.println("You did a great job.");

			} else if (assignments > 10) {
				System.out.println("You did a good job.");
			} else {
				System.out.println("please complete all reple assignments.");
			}

		} else {
			System.out.println("You should complete your repl HW.");
		}
	}

}
