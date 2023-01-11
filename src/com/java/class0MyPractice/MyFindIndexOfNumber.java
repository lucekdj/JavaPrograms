package com.java.class0MyPractice;

public class MyFindIndexOfNumber {
    public static void main(String[] args) {

        int[] data = {12, 34, 56, 23, 76, 33, 74, 32, 21};

        int targetNum = 23;
        //System.out.println(findIndex(data,targetNum));

        int findIndex = findIndex(data,targetNum);
        if (findIndex == -1){
            System.out.println("nr not found ");

        }else {
            System.out.println(findIndex);

        }


    }


    static int findIndex(int[] data, int targetNumber){


        for (int i = 0; i < data.length; i++) {     //returns particular index number from 0-8 {12, 34, 56, 23, 76, 33, 74, 32, 21};
                                                    //for i=0 -first index position through all array
            if (data[i] == targetNumber) {

                //return targetNumber;  //returns value 23 what we're passing in the method argument
                //return data[i];      // returns value  23 on particular index number  starts 0,1,2,3, =23

                //return data;        // data []  not allowed here - local int allowed


                //return i;

            }


        }

        return -1;  // we talling java to return something (int) and if condition
                    //  is not true  than is going outside the loop and has to return something
                    //  if targetNumber  is 99 than will be -1  (standard like number not found
                    //  user can identify that something wrong input
    }



}

