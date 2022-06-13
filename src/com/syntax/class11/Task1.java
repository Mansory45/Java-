package com.syntax.class11;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		// using scanner create an array of interger values.
		// After the array is created calculate the sum of all stored
		// elements in that arry

		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the size of the array that you want to creat");
		int arraySize = scan.nextInt();

		System.out.println("The size of the arrrays is " + arraySize);
		int[] intergerArray = new int[arraySize];
		// we can't use enhanced for loop for inserting our updateing the values of an
		// arry
		System.out.println("Pleaes enter the " + arraySize + " elements ");
		for (int i = 0; i < intergerArray.length; i++) {
			intergerArray[i] = scan.nextInt();
		}
		System.out.println(Arrays.toString(intergerArray));

		int sum = 0;
		for (int element : intergerArray) {
			sum = sum + element; // take the elements fromthe array one by one and add them in the sum vairable
		}
		System.out.println("The sum of all the elements is " + sum);
		scan.close();
	}

}
