package com.syntax.class10;

public class AnotherWayOf2DArray {

	public static void main(String[] args) {

		// create 2d array of states
		/*
		 * 1 array --> Ny-->all cities of NY state 2 array --> CA--> all cities of CA
		 * state 3 array --> FL--> all cities of FL state 2 array --> VA --> all cities
		 * of VA state
		 */

		String[][] usa = {

				{ "New Youk", "Albany", "Buffalo" },
				
				{ "los Angeles", " San Fransico ", "san Jose", "San diago", "Redding" },
				
				{ "Miami", "Orlando", "Niceville", "Tampa" }, 
				
				{ "Mclean", "Richmond", "Leesburg" },
				
		};
		System.out.println(usa[1][2]);// san Jose
		System.out.println(usa[2][0]);// Miami
		System.out.println("Total # of 1D arrays in array usa = "+ usa.length);
		
		//I want to see how many element inside my first array
		int elem1Arry =usa[0].length;
		System.out.println("Number of element in 1 array ="+ elem1Arry);
		int elem2Array =usa[1].length;
		System.out.println("Number of element in 2 array = " +elem2Array );
	}

}
