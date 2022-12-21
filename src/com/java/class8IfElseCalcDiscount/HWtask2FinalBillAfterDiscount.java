package com.java.class8IfElseCalcDiscount;

import java.util.Scanner;

public class HWtask2FinalBillAfterDiscount {
    public static void main(String[] args) {

        //Write a program to calculate the final bill of the customer after
        // giving an appropriate discount based on the amount

        Scanner myob = new Scanner(System.in);
        System.out.println("enter the bill amount");
        int bill = myob.nextInt();
        //If total amount equal or above 10000 then give 20% discount
        if (bill >=50000) {
            System.out.println("your bill with discount is:" + (bill * 0.8));
        } else if (bill>=4000) {
            System.out.println("your bill with discount is:" + (bill * 0.85));
        } else if (bill>=2500) {
            System.out.println("your bill with discount is:" + (bill * 0.9));
        } else if (bill>=1000) {
            System.out.println("your bill with discount is:" + (bill * 0.95));
        }else {
            System.out.println("you final bill is" + bill);
    }

    }
}
