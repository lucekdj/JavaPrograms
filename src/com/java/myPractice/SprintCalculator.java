package com.java.myPractice;
import java.util.Scanner;
public class SprintCalculator {

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter first number: ");
            int a = sc.nextInt();
            System.out.println("Enter second number");
            int b = sc.nextInt();
            System.out.println("Enter operation");
            String operation = sc.next();
            switch (operation.toLowerCase()) {
                case "add":
                case "+":
                    add(a,b);
                    break;

                case "sub":
                case "-":
                    sub(a,b);
                    break;

                case "mul":
                case "*":
                    mul(a,b);
                    break;

                case "div" :
                case "/":
                    div(a,b);
                    break;

                case "mod":
                case"%":
                    mod(a,b);
                    break;





                default:
                    System.out.println("Please choose right operation");

            }


        }

        static void add(int num1, int num2){
            System.out.println(num1 + num2);

        }

        static void sub(int num1, int num2){
        System.out.println(num1 + num2);

        }

         static void mul(int num1, int num2) {
             System.out.println(num1 + num2);

         }

         static void div(int num1, int num2){
        System.out.println(num1 + num2);

        }

         static void mod(int num1, int num2) {
             System.out.println(num1 % num2);

         }


         //static int  modulo(int a, int b) {
         //    return a % b;

        // }

    }








