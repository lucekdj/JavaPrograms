package com.java.Class18Hw;

public class bellowPattern4 {
    public static void main(String[] args) {
        //     1
        //    123
        //   12345
        //  1234567
        // 123456789
        //  1234567
        //   12345
        //    123
        //     1
        for (int i = 1; i <= 5 - 1; i++) {
            for (int s = 0; s <= 5 - i; s++) {

                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        for (int i = 1; i <= 5 ; i++) {
            for (int s = 0; s <= i - 1; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 11 -i *2; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

}

