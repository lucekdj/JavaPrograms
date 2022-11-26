package com.java.class22;
/*
 2. Write a program to find the greatest number from an array
Example
Input : 23, 44, 21, 56, 27, 35, 75, 34, 25
Output : Maximum - 75
 */
public class HwArrayGreatestNumber {
    public static void main(String[] args) {
        int numbers [] ={23, 44, 21, 56, 27, 35, 75, 34, 25};

        int greatest = 0;

        for (int i = 0; i <= numbers.length-1; i++){

            if (numbers[i] > greatest){

                greatest = numbers[i];

            }

        }
        System.out.println("greates nr is " + greatest);


    }
}
