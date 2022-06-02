package com.syntax.class07;

import java.util.Scanner;

public class HWcalculatorWithSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two number?");
		double x = scan.nextInt();
		double y = scan.nextInt();
		double result =0; 
		System.out.println("Pleaes enter operator");
		char op = scan.next().charAt(0);
		

		
		switch(op) {
		case '*':
			result = x * y;
			break;
		case '/':
			result = x/y;
			break;
		case '+':
			result = x +y;
			break;
		case '-':
			result = x -y;
			break;
		default:System.out.println("Invalid operator");
			
		}
		if(result !=0) {
			System.out.println(x +" "+ op+" "+ y+" "+ " = "+ result);
		}
		
		
	}

}
