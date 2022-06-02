package com.snytax.class08;

public class LoopTask {

	public static void main(String[] args) {
		// write a program to find sum of all even and all odd number from 1 to 70

		int sum1 = 0;
		for (int i = 1; i <= 70; i++) {
			if (i % 2 == 0) {
				sum1 += 1;
			}
		}
		System.out.println("sum of all even =" + sum1);
		
		//Other ways
		
		int sumEven = 0;
		int sumOdd = 0;
		
		for(int i = 1; i<= 70; i++) {
			
			if (i % 2 ==0) {
				sumEven+=1;
			}else {
				sumOdd+=i;
			}
		}
		System.out.println("sum even number is  " +sumEven);
		System.out.println("sum even number is  " +sumOdd);

	}

}
