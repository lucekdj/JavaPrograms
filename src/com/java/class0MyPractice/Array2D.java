package com.java.class0MyPractice;

public class Array2D {
    public static void main(String[] args) {

        //sum output  88
        //118
        //87

        int my2D[][] = {
                {23,44,21},
                {45,42,31},
                {73,14,0}
        };

        int sumSingleArray =0;


        for(int i = 0;i< my2D.length;i++) {
            sumSingleArray = 0;
            for (int j = 0; j < my2D[i].length; j++) {
                sumSingleArray = sumSingleArray + my2D[i][j];

                                                                //System.out.print(my2D[i][j] + ",");
                                                                // System.out.println(i);
            }
            System.out.println(sumSingleArray);
            //sumSingleArray = 0;

                                                                //System.out.println();
        }

    }
}
