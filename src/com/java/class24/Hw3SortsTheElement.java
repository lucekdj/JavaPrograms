package com.java.class24;
/*
3. Program to sort the elements of an array in ascending order (Same from the previous homework)
Example
Input : 5, 2, 8, 7, 3, 6
Output : Duplicate numbers - 2, 3, 5, 6, 7, 8
 */
public class Hw3SortsTheElement {
    public static void main(String[] args) {

        int data[] = {43, 44, 37, 37, 43, 43, 44, 17, 44, 44, 17};

        int reverseNr[] = new int[data.length];


        for (int i = 0; i < data.length - 1; i++) {

            for (int j = i + 1; j < data.length; j++) {

                if (data[i] == data[j]) {

                    // If is already printed do not print
                    if (isThisNumberAlreadyInArray(reverseNr, data[i]) == false) {


                        System.out.println(data[i]);
                    }
                    break;
                }

            }

        }

    }

    static boolean isThisNumberAlreadyInArray(int data[], int targetNumber) {
        for (int num : data) {
            if (num == targetNumber) {
                return true;        //if number is present

            } else {
                return false;       //if num is  NOT present
            }
        }
        return false;
    }
}
