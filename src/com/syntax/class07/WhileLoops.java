package com.syntax.class07;

public class WhileLoops {

	public static void main(String[] args) {
		// While loop repeats block of code based on the condition .
		// We need a loop to do repetitive tasks

		int time = 11;

		while (time <= 12) {
			System.out.println("Morning");
			time++;// count variable will control our loops
		}

		System.out.println("Hello");
		System.out.println("---------------------------------------------------------");

		// print number from 1 to 10.

		int num = 1;
		while (num <= 10) {

			System.out.print(num + " ");
			num++;
		}
		// print number from 1 to 10
		System.out.println();

		int num1 = 0;
		while (num1 < 10) {
			num1++;
			System.out.print(num1 + " ");
		}

		// print number from 10 to 100

		System.out.println();

		int num3 = 10;
		while (num3 <= 100) {

			System.out.print(num3 + " ");
			num3++;
		}
		System.out.println();
		System.out.println("---------------------------------------------------------");

		// print number from 10 to 1

		int b = 10;
		while (b >= 1) {
			System.out.print(b + " ");
			b--;
		}
		System.out.println();

		// print number from 100 to 50

		int num4 = 100;
		while (num4 >= 50) {
			System.out.print(num4 + " ");
			num4--;

		}

		// print number from -1 to -10
		System.out.println();

		int c = -1;
		while (c >= -10) {
			System.out.print(c + " ");
			c--;
		}
		// print number from 1 to 20 but only even numbers
		System.out.println();

		// 1 way

		int e = 2;
		while (e <= 20) {
			System.out.print(e + " ");
			e += 2;
		}

		System.out.println();
		System.out.println("---------------------------------------------------------");
		// way
		// print number from 1 to 20 but only even numbers
		int f = 1;
		while (f <= 20) {
			if (f % 2 == 0) {
				System.out.print(f + " ");
			
			}
			f++;
		}

		System.out.println();
		System.out.println("---------------------------------------------------------");
// print only odd number from 100 to 1.
		int r =100;
		while(r>=1) {
			if(r%2 !=0) {
				System.out.print(r+" ");
			}
			r--;
		}
		
		System.out.println();
		System.out.println("---------------------------------------------------------");
		// another way
		
		int d =100;
		while (d>=1) {
			System.out.print(d+" ");
			d-=2;
		}
		
		
		
		
		
		
		
		
	}

}
