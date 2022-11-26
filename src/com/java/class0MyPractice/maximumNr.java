package com.java.class0MyPractice;

import java.util.Scanner;

public class maximumNr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Please enter first nr ");
        int num1 = sc.nextInt();
        System.out.println(" Please enter the second nr ");
        int num2 = sc.nextInt();

        if (num1<num2){
            System.out.println( num2  + " number is bigger ");
        }else{
            System.out.println( num1 + " number nr is bigger ");
        }


    }
}
