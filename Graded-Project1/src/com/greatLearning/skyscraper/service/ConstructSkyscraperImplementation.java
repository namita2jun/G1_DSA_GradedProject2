package com.greatLearning.skyscraper.service;


public class ConstructSkyscraperImplementation {
	
	public static void printconstructSkyscraperOrder(int n, int[] day) {
		int temp =n;
		int flag;
		System.out.println("The order of construction is as follows");
		 for (int i=1; i<=n; i++) {
			 flag =0;
			 System.out.println("Day "+i+":");
			 // find the floor with highest size available
			 while(temp>=1 && day[temp] <=i) {
				 flag =1;
				 System.out.print(temp +" ");
				 
				 // find the next highest floor availble
				 temp --;
			 }
					 //proceed to the next day
					 System.out.println();
			 }
			 
		}
		
		
	
	

}
