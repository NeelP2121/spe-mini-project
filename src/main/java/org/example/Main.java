package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.lang.Math;
import java.util.Scanner;

public class Main {

	private static Logger logger = LogManager.getLogger(Main.class);
	String wrong = "NOT CALCULATABLE";
	// Method to calculate square root 
	public double calcSqrt(double input){
		if(input >= 0){
			double result = Math.sqrt(input);
			logger.info("[SQUARE ROOT] - " + input + " - [RESULT] - " + result);
			return result;
		}
		logger.error("[SQUARE ROOT] - " + input + " - [RESULT] - " + wrong);
		return -1;
	}
	
	// Method to calculate Factorial
	public long calcFactorial(int input){
		if(input >=0){
			long val = 1;
			for(int i = 2; i <= input; i++){
				val *= i;
			}
			logger.info("[FACTORIAL] - " + input + " - [RESULT] - " + val);
			return val;
		}
		logger.error("[FACTORIAL] - " + input + " - [RESULT] - " + wrong);
		return -1;
	}

	// Method to calculate Natural Logarithm
	public double calcLogarithm(double input){
		if(input > 0){
			double result = Math.log(input);
			logger.info("[NATURAL_LOG] - " + input + " - [RESULT] - " + result);
			return result;
		}
		logger.error("[NATURAL_LOG] - " + input + " - [RESULT] - " + wrong);
		return -1;
	}

	// Method to calculate Power
	public double calcPower(int base, int exp){
		if(base == 0 && exp == 0){
			logger.error("[POWER] - " + base + " " + exp + " - [RESULT] - " + wrong);
			return -1;
		}
		double result = Math.pow(base, exp);
		logger.info("[POWER] - " + base + " " + exp + " - [RESULT] - " + result);
		return result;
	}

	public static void main(String[] args){
		
		Main obj = new Main();
		while(true){
			Scanner sc = new Scanner(System.in);
			System.out.println("-----------------------------------------");
			System.out.println("--------------------MENU-----------------");
			System.out.println("-  Select one of the following options :-");
			System.out.println("-1.) Square Root.                       -");
			System.out.println("-2.) Factorial.                         -");
			System.out.println("-3.) Natural Logarithm.                 -");
			System.out.println("-4.) Power.                             -");
			System.out.println("-5.) Exit.                              -");
			System.out.println("-----------------------------------------");

			int choice = sc.nextInt();

			System.out.println();

			switch(choice){
				case 1:
					System.out.println("Enter number to calculate Square Root");
					double inputS = sc.nextDouble();
					double resS = obj.calcSqrt(inputS);
					System.out.println(resS == -1 ? "Invalid input" : resS);
					break;
				case 2:
					System.out.println("Enter number to calculate Factorial");
					int inputF = sc.nextInt();
					long resF = obj.calcFactorial(inputF);
					System.out.println(resF == -1 ? "Invalid Input" : resF);
					break;
				case 3:
					System.out.println("Enter number to calculate Natural Logarithm");
					double inputL = sc.nextDouble();
					double resL = obj.calcLogarithm(inputL);
					System.out.println(resL == -1 ? "Invalid Input" : resL);
					break;
				case 4:
					System.out.println("Enter base number in Power");
					int inputBase = sc.nextInt();
					System.out.println("\nEnter exponent in Power");
					int inputExp = sc.nextInt();
					double resP = obj.calcPower(inputBase, inputExp);
					System.out.println(resP == -1 ? "Invalid Input" : resP);
					break;
				case 5:
					return;
				default:
					System.out.println("-----------------------------------------");
					System.out.println("---Chosen option not existent in menu----");
					System.out.println("-----------------------------------------");
					System.out.println();
			}
		}
			
	}
}
