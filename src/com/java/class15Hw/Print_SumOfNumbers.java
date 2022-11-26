package com.java.class15Hw;
// sum of 1 + 2 - 3 + 4 + 5 - 6 + 7 + 8 - 9 + 10 = 19
public class Print_SumOfNumbers {
    public static void main(String[] args) {
            int sum = 0;
        for (int i=1; i<=10; i++){

            if (i % 3 == 0) {
                sum = sum - i;
            }else{
                sum = sum + i;
            }

            System.out.println(sum);


        }

        System.out.println(sum);
    }
}
