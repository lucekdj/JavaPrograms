package com.java.Class18Hw;

public class primeNumbers1_100 {
    public static void main(String[] args) {



        for ( int i = 1; i <= 100; i++){
            int divisor = 0;
            for (int j = 1; j<=100; j++){

                 if (i % j==0)
                    divisor++;
            }


            if (divisor == 2 ) {
                System.out.println( i);
            }

        }
    }
}
//fdfbdfvsv
//rvrs///        sdvd