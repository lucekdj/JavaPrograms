package com.java.class15WhileForToDoLoop;

import java.util.Scanner;


public class FactorialOfGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number");
        int num = sc.nextInt();
        int result = 1;

        for (int i = 1; i <= num; i++) {
            result = result * i;
            System.out.println(i);
        }

        System.out.println(result);

    }
}
