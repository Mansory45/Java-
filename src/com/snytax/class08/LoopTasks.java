package com.snytax.class08;

public class LoopTasks {

	public static void main(String[] args) {
		//Print numbers from 1 to 100 in 1 line with space

		
		for(int a =1; a<=100; a++) {
			System.out.print(a+" ");
		}
		//Print numbers from 100 to 1
		
		System.out.println("----------------------------------");
		for(int a =100; a>=1; a--) {
			System.out.print(a+" ");
		}
		System.out.println("----------------------------------");
		//Print even numbers from 20 to 1 (2 ways)

		for(int a=20; a>=1;a-=2) {
			System.out.print(a+" ");
		}
		System.out.println("-------------------------------------");
		//Print odd numbers between 20 and 50 (2 ways)
		for(int a =1; a<=11;a+=2) {
			System.out.print(a+" ");
			
		}
		System.out.println("----------------------");
		//Print odd numbers between 20 and 50 (2 ways)
		for(int a =21; a<=50;a++) {
			if(a % 2 !=0) {
				System.out.print(a+" ");
			}
		}
			
		
	}

}
