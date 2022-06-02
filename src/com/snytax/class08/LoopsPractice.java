package com.snytax.class08;

public class LoopsPractice {

	public static void main(String[] args) {
		// While loop
		
		int a = 1;
		while(a<=10) {
			a++;
			System.out.println( a+" while loop");
			
		}
		System.out.println("------------------Do While Loop--------------------");
		
		
		/*The example below uses a do/while loop. The loop will always be executed at least once, 
		 * even if the condition is false,
		 * because the code block is executed before the condition is tested:
		 */
		
		int i = 1;
		do {
		  System.out.println(i);
		  i++;
		}
		while (i <=8);
		
		System.out.println("------------------Java For Loop--------------------");
		
		for(int age = 1 ; age <=20; age++) {
			
			System.out.print(age + " ");
		}

	}

}
