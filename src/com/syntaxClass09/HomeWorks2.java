package com.syntaxClass09;

public class HomeWorks2 {

	public static void main(String[] args) {

		// Create an array of animals and store 5 elements into it.
		// Using 2 different loops print all elements from the array

		String[] animals = { "lion", "Tiger", "Wolf", "Dog", "Cat" };

		for (int i = 0; i < animals.length; i++) {
			System.out.print(animals[i] + " ");
		}

		System.out.println();
		System.out.println("-------Other ways----------------");
		

		String[] animalsScndWay = { "lion", "Tiger", "Wolf", "Dog", "Cat" };

		for (String wildAnimals : animalsScndWay) {
			System.out.print(wildAnimals + " ");
		}
	}

}
