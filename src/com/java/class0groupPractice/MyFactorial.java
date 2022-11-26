package com.java.class0groupPractice;


import java.util.Scanner;

public class MyFactorial {
    public static void main(String[] args) {

        // TODO write your code here

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter  a number ");
        int num = sc.nextInt();

        if (num <0) {

            System.out.println(" Enter the positive nr ");

        }else{
            calculate (num);


        }

        // factor = 1, factor = 2, factor = 6  -> 6! = 1*2*3


    }
    public static void calculate(long number){
        // TODO IMPLEMENT METHOD

        long factor = 1;
        for (long i = 1; i <= number; i++){

            factor = factor * i ;

        }

        System.out.println(" Factorial result: " + factor);
}   }

