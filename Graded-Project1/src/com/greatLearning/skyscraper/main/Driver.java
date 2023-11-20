package com.greatLearning.skyscraper.main;

import java.util.Scanner;

import com.greatLearning.skyscraper.service.ConstructSkyscraperImplementation;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//Read the total number of floors
		System.out.println("enter the total no of floors in the building:");
		int n = sc.nextInt();
		// decalre an array to store the size of each floor
		int[] day = new int[n+1];
		
		// iterate through 1 to n floors/days
		
		for(int i =1; i<=n; i++) {
			System.out.println("Enter the floor size given on day :"+i);
			int size = sc.nextInt();
			//store the day in array with index of the size of the floor
			day[size] =i;
		}
		ConstructSkyscraperImplementation.printconstructSkyscraperOrder(n, day);
		sc.close();
			}

}
