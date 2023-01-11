package com.java.class0MyPractice;

import java.util.Scanner;

public class DoWhileSwitchCalculator {
    public static void main(String[] args) {

        try {

            int again ;
            String again1;

            do {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter first and second number");
                int num1 = sc.nextInt(), num2 = sc.nextInt();
                //int num3 = sc.nextInt();
                System.out.println("Enter the operation +,-,*,/");
                String operation = sc.next();

                 // System.out.println("Enter second number ");
                //int num2 = sc.nextInt();


                switch (operation) {
                    case "+":
                        System.out.println(num1 + num2);
                        break;

                    case "-":
                        System.out.println(num1 - num2);
                        break;
                    case "*":
                        System.out.println(num1 * num2);
                        break;
                    case "/":
                        System.out.println(num1 / num2);
                        break;
                    default:
                        System.out.println("Wrong input - enter correct operator");

                }


                System.out.println("Do you want to try one more " +
                        "time ? \n tape Yes or enter 1 if yes, or 2 if not ");

                 again1 = sc.next();
                //again = sc.nextInt();
                //sc.next();
               // sc.next();

            } while (again1.equals("yes"));
             //while ( again == 1);

        }catch (Exception e) {
            System.out.println("Catch block - try one more time ");


        }finally {
            System.out.println("The End ");
        }
    }


}
