package com.syntax.class11;

import java.util.Scanner;

public class Dog {

	// attributes how the object will look lik
	String name;
	int age;
	double weight; // properties attributes fields
	String color;
	double height;
	String breed;
	// how that object behave / method behaivor 
	void bark() {
		System.out.println("Dog barks");
	}
	void Walks() {
		System.out.println("Dog walks");
	}
	void eat() {
		System.out.println("Dogs like to eat bone");
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);// ctrl+click on windows 
		scan.next();
		Dog jimmay = new Dog(); // creating an object and storing in a variable
		jimmay.name="jimmay";
		jimmay.age=60;
		jimmay.weight=16;
		jimmay.color="Pink";
		jimmay.height=2.6;
		jimmay.breed="German";
		jimmay.bark();
		
		
		
		//If browser is Chrome or Chrome or CHROME or ChRoMe it should print the:
		
		
		
		
		
		
		
		
		
		
		// new Dog() how we create an object
	}
}
