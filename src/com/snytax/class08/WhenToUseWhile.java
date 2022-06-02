package com.snytax.class08;

import java.util.Scanner;

public class WhenToUseWhile {

	public static void main(String[] args) {
		// declear a secret number
		// you want to ask user to guess your secret number
		//you code shuld keep asking to guess until user get your secret number 
		// once user gets the secret number printn --->you got it
		
		int secretNum = 55;
		int guessdNum;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Guess my secret number?");
			guessdNum =scan.nextInt();
			
		}while(guessdNum != secretNum);
		System.out.println("You got it");

	}

}
