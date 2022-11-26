package com.java.class15Hw;

//to print the sum of 1 to 50 numbers which are divisible by 5 or by 3
public class SumOf1To50NumbersWhichAreDivisibleBy5OrBy3 {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0 || i % 5 == 0) {

                // sum = sum + i;
                sum += i;

            }
        }
        System.out.println("sum of numbers  is " + sum);
    }
}
