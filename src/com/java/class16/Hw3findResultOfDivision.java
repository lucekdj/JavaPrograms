package com.java.class16;

//Java program to Write a program to find (result) sum  of the given
// number of 1/2 + 2/3 + 3/4 + 4/5 + 5/6 + 6/7 + 7/8 + 8/9 + 9/10 + 10/11
public class Hw3findResultOfDivision {
    public static void main(String[] args) {
        double sum = 0;
        int i;
        int j;

        for (i = 1, j = 2; i <= 10 && j <= 11; i++, j++) {
            double setOfNums = (double) i/j;
            sum = sum + setOfNums;
        }
        System.out.println("The result of 1/2 + 2/3 + 3/4 + 4/5 + 5/6 + 6/7 + 7/8 + 8/9 + 9/10 + 10/11 = " + String.format("%.2f", sum));
    }
}
