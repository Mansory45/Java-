package com.syntaxClass09;

public class HomeWork3 {

	public static void main(String[] args) {
		// Create an array to store double values and then print all elements using 2
		// different loops

		double[] price = { 1.99, 2.99, 3.99, 4.99 };

		for (int i = 0; i < price.length; i++) {
			System.out.print(price[i] + " ");
		}

		System.out.println();
		System.out.println("-------Other ways----------------");

		double[] price2 = { 1.99, 2.99, 3.99, 4.99 };
		for (double prices : price2) {
			System.out.print(prices + " ");
		}
	}

}
