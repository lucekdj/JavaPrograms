package com.java.Class18Hw;

public class bellowPattern1 {
    public static void main(String[] args) {

        //first approach
        for (int i = 5; i >=1; i--) {

            for (int j =1; j <= i*2-1; j++){

                System.out.print(j);
            }

            System.out.println();
        }
        // second approach
        //  123456789
        //  1234567
        //  12345
        //  123
        //  1
        for (int i = 1; i <= 5; i++){

             for (int j =1; j <=11-i*2; j++ ){
                 System.out.print(j);
             }
            System.out.println();
        }


        // another example 5,4,3,2,1
        //                 4,3,2,1
        //                 3,2,1
        //                 2,1
        //                 1

        for (int i =1; i<=5; i++){
             for (int j = 1; j <= 6-i; j++ ){
                 System.out.print(6-j);
             }
            System.out.println();
        }

        // another example 1,2,3,4,5,
        //                 1,2,3,4,
        //                 1,2,3
        //                 1,2
        //                 1

        for (int i =1; i<=5; i++){
            for (int j = 0; j <= 5-i; j++ ){
                System.out.print(j+1);
            }
            System.out.println();
        }

    }

}
