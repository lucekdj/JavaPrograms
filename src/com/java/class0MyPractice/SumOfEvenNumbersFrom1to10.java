package com.java.class0MyPractice;
//print the sum of even numbers from 1 to 10
public class SumOfEvenNumbersFrom1to10 {
    public static void main(String[] args) {
        //2+4+6+8+10=30

        //int i;

        int result = 0;

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                result = result + i;
             /*
               i  | r
                1  | 0
                2  | 2
                3  | 6
                4  | 6
                5  | 12
                6  | 12
                7  | 20
                8  | 20
                10 | 30
             */
            }
            System.out.println(result);
        }
        //System.out.println(result);

        int sum = 0;

        for (int a = 0; a <= 10; a = a + 2){

            sum = sum + a;
            //System.out.println("sum of even nr is: " + sum);
        }
        System.out.println("sum of even nr is: " + sum);
    }
}
