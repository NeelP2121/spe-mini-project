package org.example;

import java.lang.Math;
import java.util.Scanner;

public class Main {
    public static int fact(int num){
        if(num == 1){
            return 1;
        }
        return fact(num-1) * num;
    }

    public static double calculate(int op, float num1, float num2){
        switch (op) {
            case 1 : {
                return Math.sqrt(num1);
            }
            case 2 : {
                return fact((int) num1);
            }
            case 3 : {
                return Math.log(num1);
            }
            case 4 : Math.pow(num1, num2);
        }

        return 0;
    }

    public static double calculate(int op, float num1){
        return calculate(op, num1, 0);
    }

    private static void printMenu(){
        System.out.println("Operations:");
        System.out.println("0: exit");
        System.out.println("1: square root");
        System.out.println("2: factorial");
        System.out.println("3: natural logarithm");
        System.out.println("4: power");
        System.out.printf("Enter operation: ");

    }
    public static void main(String[] args)
    {
        printMenu();

        Scanner sc = new Scanner(System.in);
        int operation = sc.nextInt();
        float num, num2;
        while(operation != 0){
            switch (operation) {
                case 1 : {
                    System.out.printf("Enter number: ");
                    num = sc.nextFloat();
                    System.out.println(calculate(1, num));
                }
                case 2 : {
                    System.out.printf("Enter number: ");
                    num = sc.nextFloat();
                    System.out.println(calculate(2, num));
                }
                case 3 : {
                    System.out.printf("Enter number: ");
                    num = sc.nextFloat();
                    System.out.println(calculate(3, num));
                }
                case 4 : {
                    System.out.printf("Enter number: ");
                    num = sc.nextFloat();
                    num2 = sc.nextFloat();
                    System.out.println(calculate(4, num, num2));
                }
                default : System.out.print("Invalid ");
            }
            printMenu();
            operation = sc.nextInt();
        }
        sc.close();
    }
}
