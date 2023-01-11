package com.java.class0MyPractice;

public class PrintEvenNr1_20 {
    public static void main(String[] args) {

        int num = 1;

       /* while(num<=20){
            System.out.println(num);            odd numbers
            num ++;                //= num +1;
            System.out.println(num);            even numbers
            num++;               // = num+1;

        */
        while(num <= 10) {
            if (num % 2 == 0) {
                System.out.println(num);
                num++;   //
                num++;   //
                 num ++;  //    it adds only if modulo is ==0
                System.out.println(num);  //it prints only if modulo is ==0

            }
            num++;  // it adds 1
        }
    }



}
