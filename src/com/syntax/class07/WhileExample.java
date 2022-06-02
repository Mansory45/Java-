package com.syntax.class07;

public class WhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int time = 1;
		if (time < 12) {
			System.out.println("Morning ");
		}
		System.out.println("-------------------------------");
		
		//print number form 1 to 10 
		
		int num =1;
		while(num <=10) {
			
			System.out.print(num+" ");
			num++;
			
		}
		
		System.out.println("-------------------------------");
		//repetitive 
		////print number form 1 to 10 
		
		int number=0;
		
		while(number <10) {
			number++;
			System.out.print(number+" ");
		
			
		}
		
		System.out.println("-------------------------------");
		
		
		
		

		
		  	while (time < 12) {
			System.out.println("Morning ");// infinite
			time++;
		}
		  	
		System.out.println("-------------------------------");
		
		System.out.print("Hello");
		int c = 2;
		while (c >= 12) {
			System.out.print(c + " ");
			c--;
		}
		System.out.println("-------------------------------");
		
		int num5 = -1;
		while (num5 <= -10) {
			System.out.println(num5 + " ");
			;
			num5++;
			
			System.out.println("-------------------------------");
		}
		
		//Using while loops that print out even numbers from 1 to 13
		int e = 2;
		while (e <= 12) {
			System.out.print(e + " ");
			e += 2;
		}
		
		 
	
	}
}
	


