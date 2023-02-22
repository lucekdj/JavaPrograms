package com.java.class22ArrayExamples;
/*
  3. Write a program to find all duplicates number from the array (Tricky, do enough brainstorm before solving)
Example
Input : 23, 44, 21, 23, 27, 35, 75, 44, 25
Output : Duplicate numbers - 23, 44
 */
public class HwDuplicatesNumber {
    public static void main(String[] args) {

        int numbers[] = {23, 44, 21, 23, 27, 35, 75, 44, 25};

        int duplicate = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            //for (int i = 0; i < numbers.length-1; i++) {
            // because last nr is 25 and got nothing to compare
            // with ...remember it is 'int i' outer loop
            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] == numbers[j]) {

                    System.out.print(numbers[i]+ " ");  //[i}

                }

            }

        }


    }
}

