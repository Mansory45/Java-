package com.syntax.class11;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [][] arr= { {10,15,10},
		        {20,50,20},
		        {30,30,30}};
		int evenSum=0;
		int oddSum=0;
		
			for(int j=0; j<arr.length;j++) {
			
			for(int i=0;i<arr[j].length; i++) {
				if(arr[j][i]%2==0) {
				evenSum = evenSum+arr[j][i];
				
				}else {oddSum=oddSum+arr[j][j];
			}
		
	}

	}
			System.out.println("odd sum "+ oddSum);
			System.out.println("even sum "+ evenSum);
}
	}
