package org.example;

import java.lang.Math;
import java.util.Scanner;

public class Main {
	
	// Method to calculate square root 
	public double calcSqrt(double input){
		return Math.sqrt(input);
	}
	
	//Method to calculate Factorial
	public long calcFactorial(int input){
		long val = 1;
		for(int i = 2; i <= input; i++){
			val *= i;
		}
		return val;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("-----------------------------------------");
		System.out.println("--------------------MENU-----------------");
		System.out.println("-  Select one of the following options :-");
		System.out.println("-1.) Square Root.                       -");
		System.out.println("-2.) Factorial.                         -");
		System.out.println("-3.) Natural Logarithm.                 -");
		System.out.println("-4.) Power.                             -");
		System.out.println("-----------------------------------------");

		int choice = sc.nextInt();

		System.out.println();

		switch(choice){
			case 1:
				System.out.println("Enter number to calculate Square Root");
				double inputS = sc.nextDouble();
				System.out.println();
				break;
			case 2:
				System.out.println("Enter number to calculate Factorial");
				int inputF = sc.nextInt();
				System.out.println();
				break;
			case 3:
				System.out.println("Enter number to calculate Natural Logarithm");
				double inputL = sc.nextDouble();
				System.out.println();
				break;
			case 4:
				System.out.println("Enter base number in Power");
				int inputBase = sc.nextInt();
				System.out.println("\nEnter exponent in Power");
				int inputExp = sc.nextInt();
				System.out.println();
				break;
			default:
				System.out.println("-----------------------------------------");
				System.out.println("---Chosen option not existent in menu----");
		}
			
	}
}
