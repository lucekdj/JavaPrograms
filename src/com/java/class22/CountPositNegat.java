package com.java.class22;

public class CountPositNegat {
    public static void main(String[] args) {

        int data[] = {-12, 34, -45, 54, -23, 56, 78, -2, 21};
        int countpositive = 0;
        int countnegative = 0;


        for (int i = 0; i < data.length; i++) {
            if (data[i] > 0) {
                countpositive++;

               } else {

                countnegative++;

            }
        }
        System.out.println("The number of positive is" + countpositive +
                           "\n and negatives is" + countnegative  );

    }
}
