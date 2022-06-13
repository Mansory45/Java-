package com.syntax.class14;

public class MethodsDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDemo4 md = new MethodsDemo4();
		System.out.println(md.sumNumbers(10,10));
		md.printManyTimes("Java", 3);

	}
	
	// wirte a method tht takes a string and an int and printout that string on the console
	// that many times that value that we can it int 
	
	
	int sumNumbers(int num1,int num2) {
		return num1+num2;
	}

	void printManyTimes(String str, int times) {
		for(int i =0; i<times;i++) {
			System.out.println(str);
		}
	}
}
