package com.java.class22ArrayExamples;




/*
 1. Write a program to find the sum of even and odd numbers
Example
Input : 23, 44, 21, 56, 27, 35, 75, 34, 25
Output : Sum Of Even - 134, Sum Of Odd - 206

 */
public class HwArraySum_of_even_and_odd {
    public static void main(String[] args) {

        int numbers [] = { 23, 44, 21, 56, 27, 35, 75, 34, 25 };
        int sumOdd = 0;
        int sumEaven =0;

            for (int i = 0; i < numbers.length; i++) {

                if (numbers[i] % 2 == 0) {
                    sumEaven = sumEaven + numbers[i];


                } else {

                   sumOdd = sumOdd + numbers[i];
                }


            }
        System.out.println("\n" + "Sum of Even nr in array is " + sumEaven);
        System.out.println("Sum of Odd nr in array is " + sumOdd);
        }

    }

