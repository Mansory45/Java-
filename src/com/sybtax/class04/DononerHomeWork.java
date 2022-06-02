package com.sybtax.class04;

public class DononerHomeWork {

	public static void main(String[] args) {
		// Create a Java program and call it a Donor.
		//In order to be eligible to donate your blood you have to be 18 years old.
		//Also once you identify age eligibility then we have to see if person matches weight requirements. 
		//If person weight it more than 110 lbs → then he/she is eligible, otherwise we cannot accept such a patient.

		double donnerAge = 18;
		int weight = 110;
		if (donnerAge == 18) {
			System.out.println("Your eligible to donet your blood.");
		} else {
			System.out.println("Your are not eligible to donet your blood. Sorry!");
		}
		if (weight < 110) {
			System.out.println("He or she is eligible ");
		} else {
			System.out.println("we can not accept such a patient");
		}

		System.out.println("------------------------------------------------------------");

	}

}
