package com.java.class0MyPractice;

import java.util.Scanner;


        public class Calculator2 {
            public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.println("Please enter your first number");
                int num1 = sc.nextInt();
                System.out.println("Please enter your second number");
                int num2 = sc.nextInt();
                System.out.println("Please enter your third number");
                int num3 = sc.nextInt();
                System.out.println("Please enter your fourth number");
                int num4 = sc.nextInt();
                int result1 = findSumOfFirstNumbers(num1,num2);
                int result2 = findSumOfSecondNumbers(num3,num4);
                int multiplication = findMultiplicationOfNumbers (result1,result2);

                printMultiplicationResult(multiplication);


            }
            static int findSumOfFirstNumbers(int a, int b) {
                // we introduced a local variable
                return a+b;
            }

            static int findSumOfSecondNumbers(int c, int d) {

                return c + d;
            }
            static int findMultiplicationOfNumbers(int r1, int r2) {

                return r1*r2;
            }

            static void printMultiplicationResult(int num){
                System.out.println(num);

            }
        }


