package com.syntax.class10;

public class MoreExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] nums = {

				{ 1, 2, 3, }, 
				
				{ 199, 300, 588 }, 
				
				{ 1900, 4578, 98787 },

		};

		// i loop iterates over row
		// num.length gives # of arrays inside 2D array = 3
		// j loop iterates over columns 
		System.out.println("All values usign only for loop");
		System.out.println("------------------------------");
		for(int i =0; i<nums.length; i++) {
			
			for(int j=0; j<nums[i].length;j++) {
				System.out.print(nums[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("All values usign enhanced for loop");
		// enhance for loop uses variable to access element form an array
		// outer for loop --> iterates over 1D array
		// inner loop --> iterates over elements of each 1D arry
		
		
		for(int [] num :nums) {
			
			for(int n:num) {
				System.out.print(n+" ");
			}
			System.out.println();
		}
		
		
	
		
		
		
		
	
	}

}
