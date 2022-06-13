package com.sysntax.class13;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "sfkafdba182475KSMDKASD!@#$((%^^";
		System.out.println(str.replaceAll("[0-9]","#"));
		System.out.println(str.replaceAll("[a-z]","#"));
		System.out.println(str.replaceAll("[A-Z]","#"));
		System.out.println(str.replaceAll("[A-Za-z0-9]","#"));
		System.out.println(str.replaceAll("[^a-z]","_"));
		
		System.out.println(str.replaceAll("[^A-Z]","*"));
		System.out.println(str.replaceAll("[^A-Zz0-9]","*"));
		System.out.println(str.replaceAll("[a-f]","*"));
		str = "sfkafdb18247t8725KSNDSA!@#$(($^^";
		System.out.println();
	}

}
