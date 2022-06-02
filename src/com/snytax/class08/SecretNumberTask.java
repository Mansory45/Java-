package com.snytax.class08;

import java.util.Scanner;

public class SecretNumberTask {

	public static void main(String[] args) {
		// declear a secret number
		// you want to ask user to guess your secret number
		//you code shuld keep asking to guess until user get your secret number 
		// once user gets the secret number printn --->you got it
	
		Scanner scan = new  Scanner(System.in);
		int scretNumber = 45;
		
		do {
			System.out.println("Guess my secret number?");
			scretNumber = scan.nextInt();	
		}while(scretNumber !=45 );
		
		System.out.println("You Got it");

	}

}

