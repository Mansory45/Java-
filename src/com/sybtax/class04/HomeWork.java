package com.sybtax.class04;

public class HomeWork {

	public static void main(String[] args) {
		/*
		 * Create a Java program and store values of mortgage rate and mortgage price.
		 *  First, program should check if rate is higher than 4.5 user will not buy a house,
		 *   otherwise user will consider buying.
		 *    Once user decides to buy a house, 
		 *    if price of the house is larger than 50000 than user will take a loan,
		 *     otherwise user will pay cash.
		 */

		double morgageRate = 4.5;
		int morgagePrice = 5000;
		
		if (morgageRate > 4.5) {
			System.out.println("I will not buy house now.");
		}else {
			System.out.println("I will buy house .");
		}if (morgagePrice > 5000) {
			System.out.println("I will take a loan to buy the house");
		} else {
			System.out.println(" I will pay cash to buy house.");
		}
	}
	

}
