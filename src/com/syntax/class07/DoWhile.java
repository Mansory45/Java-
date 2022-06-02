package com.syntax.class07;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// while loop first check condition
		//and only then executes block of code
		int num1 =1;
		while(num1<=3) {
			System.out.println(num1+" ");
			num1++;
		}
		
		// do while first executes the code 
		// and only then checks the condition
		
		
		int num2 = 10;
		do {
			
			System.out.println(num2+" ");
			
			
		}while (num2<=3);
		
		// print number 1 to 30 using do while loop
		
		
		
		int num3=1;
		 do {
			 System.out.print(num3+" ");
			 num1++;
		 }while (num1<=30);
		
		// print even number form 70 to 30
		 
		
		 int a=70;
			do {
				
				System.out.println(a+" ");
				a+=-2;
			}while (a>=30);
			
			
		
		
		
	}

}
