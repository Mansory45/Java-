package com.syntax.class05;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		// Loan specialist
		
		Scanner Scanner = new Scanner(System.in);
		System.out.println("What amount of loan is needed?");
		double loan = Scanner.nextDouble();
		
		if (loan <= 200.000) {
			System.out.println("You are aprroved to lend the money.");
		}else {
			System.out.println("You are rejected Sorry!");
		}

	}

}
