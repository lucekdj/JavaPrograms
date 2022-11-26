package com.java.class16;

import java.util.Scanner;
//Write a program to print sum of each digit from the given number
public class HW1ProgramToPrintSumOfEachDigits {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Please enter a number: ");
            int num= sc.nextInt();

            int reminder=0;
            int sum=0;
            while (num!=0){

                reminder= num%10;        //gives us last number 2
                sum=sum+reminder;

                num=num/10;
            }
            System.out.println(sum);
        }
    }