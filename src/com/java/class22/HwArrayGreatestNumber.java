package com.java.class22;
/*
 2. Write a program to find the greatest number from an array
Example
Input : 23, 44, 21, 56, 27, 35, 75, 34, 25
Output : Maximum - 75
 */
public class HwArrayGreatestNumber {
    public static void main(String[] args) {
        int numbers[] = {23, 44, 21, 56, 27, 35, 75, 34, 25};

        int greatest = 0;

        System.out.println(bigNr(numbers,greatest));//my practice using method

        //MaxbigNr(10[] );
        // Chirag
        for (int i = 0; i <= numbers.length-1; i++){

            if (numbers[i] > greatest){

                greatest = numbers[i];

            }

        }
        System.out.println("greates nr is " + greatest);





    }

    static int bigNr(int[] numbers, int greatest) { // my practice using method
        for (int i = 0; i <= numbers.length-1; i++) {

            if (numbers[i] > greatest) {

                greatest = numbers[i];

            }
           // return greatest;//here return index 0(first digit =23 because it loops only once


        }
        return greatest;

        //return -1;
    }
// how to use this void method
    static void MaxbigNr(int[] numbers, int greatest) { // my practice using method void
        for (int i = 0; i <= numbers.length-1; i++) {

            if (numbers[i] > greatest) {

                greatest = numbers[i];

            }

        }
        System.out.println( "is greatest" + greatest    );


    }
}






