package com.syntax.class05;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		// Number of worked year.

		Scanner Scanner = new Scanner(System.in);
		System.out.println("Please Enter the number of worked years");
		int workYear = Scanner.nextInt();

		System.out.println("Pleae enter your salary amount ?");
		double salary = Scanner.nextDouble();

		if (workYear >= 5 && salary > 50000) {
			System.out.println("You are eligible to receive $5000 bouns!");
		} else if (workYear <= 5 && salary <= 50000) {
			System.out.println(" Your are eligible to receive $3000 bouns");
			
		}else{
			System.out.println("Your not eligible to receive bouns ");
		}
			
System.out.println("--------------------------------------------------------------------------------");

Scanner scan = new Scanner(System.in);
System.out.println("Please enter number of worked years");
int years = scan.nextInt();
if (years >= 5) {
	System.out.println("You are eligble for bonus");
	System.out.println("Please enter your annual salary");
	int wage = scan.nextInt();
	if (wage > 50000) {
		System.out.println("You get a 5000 bonus");
	} else if (wage <= 50000) {
		System.out.println("You get a 3000 bonus");
	}
} else {
	System.out.println("You don't get any bonus");
}

System.out.println("---------------------------------------------------");


		} 

	}

