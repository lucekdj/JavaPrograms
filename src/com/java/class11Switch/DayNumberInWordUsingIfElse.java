package com.java.class11Switch;

import java.util.Scanner;

public class DayNumberInWordUsingIfElse {
    public static void main(String[] args) {
        System.out.println("enter nr");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();


        if (num == 0 ) {
            System.out.println("zero");
        } else if (num == 1) {
            System.out.println("one");
        } else if (num == 2) {
            System.out.println("two");
        } else if (num == 3) {
            System.out.println("three");
        } else if (num == 4) {
            System.out.println("four");
        } else if (num == 5) {
            System.out.println("five");
        }else{
            System.out.println("enter correct nr");
        }


    }
}
