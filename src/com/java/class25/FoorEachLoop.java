package com.java.class25;

public class FoorEachLoop {
    public static void main(String[] args) {
        // Print given array into the console in the table format

                int data[][] = {
                        {23, 44, 21},
                        {45, 42, 31},
                        {73, 14, 0}
                };

                for (int row[] : data){

                                                                  //for (int i = 0; i < info.length; i++) {
                    for (int num : row) {
                        System.out.print(num + ", ");
                    }
                    System.out.println();
                }

          // 2nd
        for ( int i =0; i < data.length; i++){

            for (int j = 0; j < data[i].length; j++){
                System.out.print(data[i][j]+ " ");
            }


        }
        System.out.println();

        //3rd

        for(int inner [] : data){

            for (int value : inner){
                System.out.print(value + " ");
            }
        }

    }
}
