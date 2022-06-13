package com.syntax.class12;

public class phone {
	
	///Create a Class “Phone”. Create 3 Objects of it: iPhone, Pixel, 
	//Samsung with specific attributes and behaviors.
	String model;
	String make;
	double screenSize;
	int RAM;
	int storage;
	int camera;
	
	void call() {
		System.out.println("calling someone");
	}
	void takePicture() {
		System.out.println("use my camera app to take pictures");
	}
	
	
	
	
	public static void main(String[] args) {

		
		phone s22Ultra = new phone();
		s22Ultra.make="Sumsung";
		s22Ultra.model = "Sumsung galaxy s22 ultra";
		s22Ultra.screenSize=6.8;
		s22Ultra.RAM =12;
		s22Ultra.camera=108;
		s22Ultra.storage=512;
		System.out.println(s22Ultra.storage);
		s22Ultra.call();
		
		
		
		
		
		
		
		
		
	}

}
