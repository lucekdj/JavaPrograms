package com.java.class16;
//  2.  Java program to find result of 10 + 1 + 9 + 2 + 8 + 3 + 7 + 4 + 6 + 5
public class Hw2FindResult10_5 {
    public static void main(String[] args) {

        int firstSum = 0;
        for (int i = 10; i >= 6; i--) {
            firstSum = firstSum + i;
        }

        int secondSum = 0;
        for (int j = 1; j <= 5; j++) {
            secondSum = secondSum + j;
        }

        int result = firstSum + secondSum;

        System.out.println("The sum of " +
                "10 + 1 + 9 + 2 + 8 + 3 + 7 + 4 + 6 + 5 = " + result);
    }

}



