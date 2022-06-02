package com.syntax.class07;

import java.util.Scanner;

public class HWDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Is there a sale? pleae enter yes or no  ");

		String sale = scan.nextLine();
		if (sale.equals("Yes") || sale.equals("yes")) {
			System.out.println("Which item woud you like to buy? ");
			String item = scan.nextLine();
			System.out.println("What is the prices of an item? ");
			int price = scan.nextInt();
			int discountedPrice = 0;
			int discount = 0;

			if (price < 20) {
				discount = 10;

			} else if (price >= 20 && price < 100) {
				discount = 20;

			} else if (price >= 100 && price < 500) {
				discount = 30;

			} else if (price > 500) {
				discount = 50;

			}

			discountedPrice = price - (price * discount / 100);
			System.out.println("After discount of " + discount + "% the price of " + item + " reduce from " + price
					+ "$ to " + discountedPrice + "$.");
		} else if (sale.equals("No") || sale.equals("no")) {
			System.out.println("You are not going shopping.");
		}
		
		/*public class HWDiscount {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);
System.out.println(“Is there a sale? Please enter yes or no”);
String sale = input.next();

double price;
double discount = 0.00, salePrice = 0.00, discountPrice=0.0;;


if (sale.equalsIgnoreCase(“yes”)) {

System.out.println(“Which product do you wish to purchase?“);
String product = input.next();

System.out.println(“Please enter the price of the product”);
price = input.nextDouble();

if (price < 20) {
discount = 10;
} else if (price >= 20 && price <= 100) {
discount = 20;
} else if (price >= 101 && price <= 500) {
discount = 30;
} else {
discount = 50;
}

discountPrice=price * discount/100;
salePrice = price - discountPrice;

System.out.println(“After a discount of $” + discountPrice + ” the price of the item reduced from ” + price
+ ” to ” + salePrice);
} else {
System.out.println(“There is no sale, so you are not going shopping”);
		 * 
		 */
	}

}
