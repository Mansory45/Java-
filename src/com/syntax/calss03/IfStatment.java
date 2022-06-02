package com.syntax.calss03;

public class IfStatment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * declare a variable rate
		 * if rate is more than 5 --> I am not buying a house
		 */
		double mortgageRate = 4.5;
		
		if(mortgageRate>5) {
			
			System.out.println("i am not buying a house");
		}

		int num1 =99;
		int num2 = 100;
		
		if(num1>num2) {
			System.out.println(num1 +" is greater than " + num2);
		}
		/*
		 * dec;are te,perature ,
		 *  if temp is higher than 74 --> i will go a walk
		 */
		int temp = 89;
		
		if(temp<98) {// code goes inside if{}
			
			System.out.println("I will go for a walk.");
		}else {/// otherwis. code comes to else{}
			// when codition is false
			System.out.println("I am going to study java.");
		} 
		
		System.out.println("-------------------------");
		
		char gender ='m';
		char gender1 ='f';
		
		System.out.println(gender+gender1);
		if(gender=='f') {
			System.out.println("You like shopping");
			
		}else {
			System.out.println("You like wathcing sports");
		}
		
		System.out.println("-------------------------------");
		
		String browser = "Chrome";
		
		if(browser.equals("chrome")) {
			System.out.println("All test case will be executed on chorme");
		} else {
			System.out.println("I am not executing any tes cases");
			
		}
	}

}
