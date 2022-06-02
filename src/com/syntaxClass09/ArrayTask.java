package com.syntaxClass09;

public class ArrayTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] grades = new String[6];
		grades[0] = "A";
		grades[1] = "B";
		grades[2] = "C";
		grades[3] = "D";
		grades[4] = "E";
		grades[5] = "F";

		System.out.println(grades[0]);

		System.out.println("----------Another Way--------------");

		String[] gradesSecond = { "A", "B", "C", "D", "E", "F" };// I should use char instated of String
		System.out.println(gradesSecond[2]);

		/*
		 * String [] word = new String[4]; word[0] = "Java"; word[1] = "Saturday";
		 * word[2] = "day"; word[3] = "coding"; System.out.println(word[2] + " is "+
		 * word[3]+ word[4]+ "day");
		 */

		String[] word = { "Java", "Saturday", "day" };
		// I want to retrive all elements
		for (int i = 0; i < word.length; i++) {
			System.out.println(word[i] + " ");

		}
		// Enhanced for loop / adacanced loop / for each loop
		/*
		 Can be used only when we work with array or collections.
		 
		*/
		
		String[] colors = { "pink ", "blue", " white"," black" };
		for(String color:colors) {
			System.out.print(color + "");
		}
		System.out.println();
		int [] numbers = {10,20,30,40};
		for(int num:numbers){
			System.out.print(num+" ");
		}
		
	}

}
