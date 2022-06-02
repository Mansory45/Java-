package com.syntax.class10;

public class Task {

	public static void main(String[] args) {
		// From an array of integer elements find the largest number.
        //Create an array to store char values and then print those in reverse order
		
		int [] array = {5,28,36,1,14,45,48,17};
		int max = array[0];
		
		for(int i=1; i< array.length; i++) {
			
			if (array[i] > max) {
				max =  array [i];
			}
		}
		
		System.out.println("The largest element is " + max);
		
		max = array[0];
		for(int num:array) {
			if (num > max) {
				max = num;
			}
		}
	
		
		
	}

}
