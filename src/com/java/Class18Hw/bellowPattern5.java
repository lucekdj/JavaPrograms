package com.java.Class18Hw;

public class bellowPattern5 {
    public static void main(String[] args) {
        //     1
        //    000
        //   11111
        //  0000000
        // 111111111
        //  0000000
        //   11111
        //    000
        //     1


            for (int i = 1; i <= 4; i++) {            //row
                for (int s = 0; s<= 5 - i; s++) {       //space
                    System.out.print(" ");
                }
                for (int j = 1; j <= i * 2 - 1; j++) {  //column
                    if(i%2 != 0) {
                        System.out.print("1");
                    } else {
                        System.out.print("0");
                    }

                }
                System.out.println();
            }
            for (int i = 1; i <= 5; i++) {
                for (int s = 0; s <= i - 1; s++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 11 - i * 2; j++) {
                    if(i%2 != 0) {
                        System.out.print("1");
                    }else {
                        System.out.print("0");
                    }

                }
                System.out.println();



            }
        }
    }

