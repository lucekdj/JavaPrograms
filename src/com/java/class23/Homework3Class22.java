package com.java.class23;

//Write a program to find all duplicates number from the array
//        Example
//        Input : 23, 44, 21, 23, 23, 35, 35, 23, 23, 44, 35
//        Output : Duplicate numbers - 23, 44,35
public class Homework3Class22 {
    public static void main(String[] args) {
        int data[] = {23, 44, 21, 23, 23, 35, 35, 23, 23, 44, 35, 23, 44, 35};

        int duplicatesAlreadyPrinted[] = new int[data.length];

        int count = 0;

        //outer for loop - go over each number one by one
        for (int i = 0; i < data.length - 1; i++) {
            // inner for loop - go over rest of the numbers
            // -starting from number next to the  number at position i
            for (int j = i + 1; j < data.length; j++) {

                // compare each number  with rest of the numbers
                if (data[i] == data[j]) {

                    // If is already printed do not print
                    if (isThisNumberAlreadyInArray(duplicatesAlreadyPrinted, data[i])== false) { // can be simplified to
                                                        // '!isThisNumberAlreadyInArray(duplicatesAlreadyPrinted, data[i])'

                        //  System.out.println(data[i]);
                        duplicatesAlreadyPrinted[count] = data[i];
                        count++;
                    }
                    break;
                }

            }

        }
        for (int i = 0; i < count; i++) {
            System.out.println(duplicatesAlreadyPrinted[i]);


        }
    }


    static boolean isThisNumberAlreadyInArray(int[] duplicatesAlreadyPrinted, int cos) {
        //for (int num : duplicatesAlreadyPrinted) {
         for (int num = 0; num < duplicatesAlreadyPrinted.length; num++ ){
            if (cos == duplicatesAlreadyPrinted[num]) {
                return true;        //if number is present

            //} else {
               // return false;       //if num is  NOT present
            }
        }
        return false;         // Boolean  only true or false  (no null no -1) null is for OBJECT/String
                              //If data we're   passing is 0 than loop will brake ,will  not
                              // execute any single time, so we need this false return
                              // data we're   passing is 0  than definitely there is no target number
                              // and return is false
    }

}
