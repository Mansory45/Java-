package com.syntax.class05;

public class LogicalOr {

	public static void main(String[] args) {
		// Logical Or
		
		/* Monday and Friday ---> No class
		 * Tuesday and Wednesday --> Manual Testing
		 * Thursday --> Review
		 * Saturday and Sunday --> Java
		 * 
		 */

		String day = "Saturday";
		
		if (day.equals("Monday") || day.equals("Friday")) {
			System.out.println("I have no class");
			
		}else if (day.equals("Tuesday") || day.equals("Wednesday")){
			System.out.println("I have Manual Testing Class");
			
		}else if (day.equals("Tursday")){
			System.out.println("I have Review class");
		}else if(day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("I have Java Class");
		}
		
		
	}

}
