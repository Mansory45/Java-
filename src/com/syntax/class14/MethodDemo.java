package com.syntax.class14;

import java.util.Scanner;

public class MethodDemo {
	
	//What is a Method ? Method is a block of code a group of java statements that are grouped together 
	// and we can execute those statements by just creating an object of the class
	//that contains that method and by writing the object name .method name.
	void printHello() {
		System.out.println("How are you guygs");
		
	}
	
	boolean returnTrue() {
		return true;
		
	}
	
	
	int returnInt(){
		return 10;
	}
	
	
	
// Method thta return something and Methods tht don't return something
	
	public static void main(String[] args) {
		MethodDemo  md = new MethodDemo();
		md.printHello();
		boolean xs = md.returnTrue();
		int num=md.returnInt();
		System.out.println(num);
		
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
	}
}
