package com.java.class0MyPractice;

import java.util.Scanner;

public class HwMethodFindGreatestNumberOutOfFourNumbersNesteIFElseReturn {
    public static void main(String[] args) {
        Scanner myob = new Scanner(System.in);


        System.out.println("Please enter first number: ");
        int num1 = myob.nextInt();

        System.out.println("Please enter second number: ");
        int num2 = myob.nextInt();

        System.out.println("Please enter third number: ");
        int num3 = myob.nextInt();

        System.out.println(" Please enter fourth number: ");
        int num4 = myob.nextInt();


         int maxNum = findGreatestOf4(num1, num2, num3 ,num4);


    }

    static int findGreatestOf4(int a1, int b2, int c3, int d4) {

        int maxNum =0;

        if (a1 > b2 && a1 > c3 && a1 > d4) {
            System.out.println("the greatest number is num1 ");
        } else if (b2 > c3 && b2 > d4) {
            System.out.println("the greatest number is num2 ");
        } else if (c3 > d4) {
            System.out.println(" the greatest number is num3 ");
        } else {
            System.out.println("the greatest number is num4 ");
        }

        return  maxNum;
    }

}

// nested if else
        /*
        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("greatest is nr1");
            } else {
                System.out.println("greatest is" + num3);
            }
        } else {
            if (num2 > num3) {
                System.out.println("greatest is nr1");
            } else {
                System.out.println("greatest is " + num3);

        }

        }
       */