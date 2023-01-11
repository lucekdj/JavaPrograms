package com.java.class0MyPractice;

public class Array {

    public static void main(String[] args) {

        int[] data = {23,44,21,23,23,35,35,44,35};
        int[] duplicate = new int[ data.length];
        int count = 0;                                          //duplicate numbers

/*
        for (int x = 0; x < data.length; x++ ){
            for (int j = x+1; j < data.length; j++){


                if( data[x] == data[j]){
                     duplicate[count] =  data[x];                        //System.out.print(data[x] + " ");    // example1  out print  23 23 44 23 35 35 35
                          count++;                                         //break;                              //example2  out Print  23 44 23 35 35




                }

                System.out.println(duplicate[count]);
            }

        }


 */

        //sum of array

        int sum = 0;


        for (int x = 0; x < data.length; x++ ) {

            sum = sum + data[x];

            System.out.println(sum);
        }


    }

}


//System.out.println(data[x]);