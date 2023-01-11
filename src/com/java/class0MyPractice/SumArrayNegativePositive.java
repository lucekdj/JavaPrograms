package com.java.class0MyPractice;

public class SumArrayNegativePositive {
    public static void main(String[] args) {

        int neg = 0 ;
        int pos = 0 ;



        int negativeSum = 0;
        int positiveSum = 0;
        int sum = 0;


        int myArray[] = {-12, 34, -45, 54, -23, 56, 78, -2, 21};
/*

                 ////here counts how many negatives(=4) and positives(=5) numbers are in array

                // i< -5 , doesn't change anything ,no error

            for (int i = 0; i < myArray.length; i++) {
                //System.out.println(i);          //prints index (position)  the numbers of array
                //System.out.println(myArray);    //prints address of array
                //System.out.println(myArray[i]); //print all number from array

                if (myArray[i] > 0) {
                    pos++;

                } else {
                    neg++;

                }
            }
                System.out.println(neg);  //=4
                System.out.println(pos);  //=5






 */


             /////  here prints sum

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < 0) {
                negativeSum = negativeSum + myArray[i]; // adds all numbers
                //negativeSum++;    //negative + 1;         //counts how many number -not a sum of numbers (can't be together with above)


            } else if (myArray[i] > 0) {
                //positiveSum = positiveSum + myArray[i];
                positiveSum++;

                //System.out.println(positiveSum + "  from positive sum");

            }
            System.out.println(positiveSum+" sum from positive numbers");   //prints all numbers inside the loop
            System.out.println(negativeSum+" sum from negative numbers");   //prints all numbers inside the loop

            //System.out.println(i);          //prints index 0-8(position)  the numbers of array
            //System.out.println(myArray);    //prints address of array
            //System.out.println(myArray[i]); //print all number from array

        }
        System.out.println(positiveSum+" sum from positive numbers");  //prints total sum (outside the loop)
        System.out.println(negativeSum+" sum from negative numbers");  //prints total sum (outside the loop)



    }
}
