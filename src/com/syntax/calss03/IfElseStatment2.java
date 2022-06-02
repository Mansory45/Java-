package com.syntax.calss03;

public class IfElseStatment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double computerScreen = 27.2;
		
		if (computerScreen < 27.2) {
			
			System.out.println("I will play game!");
		} else {
			System.out.println("I will not pyay game!");
		}
		
		int arifAge = 25;
		int aimalAge = 30;
		
		if(arifAge > aimalAge) {
			System.out.println("Arif is older than aimal .");
		} else {
			System.out.println("Aimal is older than Arif!");
		}

		/*
		 * Create Java program to store 2 values for expected and actual hours. Your program should check

if expected hours are more than actual the program should print “You will love the course and you will succeed”,
otherwise “Course will be very hard for you!“.
		 */
		
		
		
		int expectedHr = 15;
		int actulHr = 12;
		
		if(expectedHr < actulHr) {
			System.out.println("You will love the course and you will succeed");
		} else {
			
		System.out.println("Course will be very hard for you!");
		}
		
		
		
		/*
		 * If you print out the values of the variables x, y it is 10 & 20
Swap there values; make the value of x=20 and the value of y=10
Don’t use any other temporary variable.
 It’s easy but needs a little bit thinking :thinking_face:
[ Did you get it?
		 */
		
		
		
		/*
		 * int a, b, temp;
   a = 15;
   b = 27;
   System.out.println("Before swapping : a, b = "+a+", "+ + b);
   temp = a;
   a = b;
   b = temp;   
  System.out.println("After swapping : a, b = "+a+", "+ + b);
		 */
		System.out.println("------------------------------");
		
		int x = 10;
		int y = 20;
		
		System.out.println("x values is "+x);
		System.out.println("y values is " + y);
		
		y = 10;
		x= 20;
		System.out.println(x);
		System.out.println(y);
	
		int day = 3;
		if (day==3) {
			System.out.println("monday");
		}else if(day==2) {
			System.out.println("tuesday");
		} else if (day ==3) {
			System.out.println("wednesday");
		}else if (day ==4) {
			System.out.println("thursday");
		}else if (day ==5) {
			System.out.println("friday");
		}else if (day ==6) {
			System.out.println("saturday");
		}else if (day ==7) {
			System.out.println("sunday");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
