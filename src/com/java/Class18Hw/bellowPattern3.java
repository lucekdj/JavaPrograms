package com.java.Class18Hw;

public class bellowPattern3 {
    public static void main(String[] args) {

        //    1
        //   123
        //  12345
        // 1234567
        //123456789

        for ( int i = 1; i<=5; i++){
            for ( int s = 0; s <= 4-i; s++){
                System.out.print(" ");
            }
            for (int j = 1; j <=  i*2-1; j++ ){
                System.out.print(j);
            }
            System.out.println();
        }

        //     5
        //    444
        //   33333
        //  2222222
        // 111111111

        for ( int i = 1; i<=5; i++){
            for ( int s = 0; s <= 10-i; s++){
                System.out.print(" ");
            }
            for (int j = 1; j <=  2*i-1; j++ ){
                System.out.print(6-i);
                //System.out.println(6-j);
            }
            System.out.println();
        }







    }
}
