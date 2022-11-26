package com.java.class23;

/*
2. Write a program to find all duplicates number from the array (Implement this program to get unique numbers in the output)
Example
Input : 23, 44, 21, 23, 23, 35, 35, 23, 23, 44, 35
Output : Duplicate numbers - 23, 44, 35
 */

public class HwPrintUniqueNum {
    public static void main(String[] args) {
        int data[] = {23, 44, 21, 23, 23, 35, 35, 23, 23, 44, 35};
        int duplicatecount = 0;

        for (int num =0; num < data.length; num++) {

            for (int j = num + 1; j < data.length; j++) {

                if (data[num] == data[j]) {
                    duplicatecount++;
                }

            }
            if (duplicatecount == 1) {

                System.out.println(data[num]);
            }
            duplicatecount=0;

        }

    }
}
