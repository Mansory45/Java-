package com.syntax.class10;

public class AllEelementsFrom2DArray {

	public static void main(String[] args) {

		String[][] usa = {

				{ "New Youk ", " Albany", " Buffalo" },

				{ "los Angeles ", " San Fransico ", " san Jose", " San diago", " Redding" },

				{ "Miami", " Orlando", " Niceville", " Tampa" },

				{ "Mclean ", "Richmond ", "Leesburg" },

		};

		// Outter loop iterates over rows
		// inner loops iterates over colums

		for (int row = 0; row < usa.length; row++) {

			for (int col = 0; col < usa[row].length; col++) {

				System.out.print(usa[row][col]);
			}
			System.out.println();
		}
		

	}

}
