package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			boolean boo = !true;
			System.out.println(boo);
			
			boolean boo1 = !false;
			System.out.println(boo1);
			
			/*
			 * if there is no traffic ---> I will reach work on time
			 * 
			 * 
			 */
			
			boolean traffic = true;
			if(traffic) {
				System.out.println("I will reach work on time");
			}
			
			String name = "Reza";
			if (!name.equals("Aimal")) {
				System.out.println("yes your name is " +name);
			}else {
				System.out.println("no your name is not " +name);
			}
			
	}

}
