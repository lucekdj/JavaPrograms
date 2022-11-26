package com.java.class12Chirag;

import java.util.Scanner;

public class HwOddOrEvenUsingFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter whole  nr to check is odd or even ");
        int num = sc.nextInt();
        OddEvenNum(num);
    }
      static void  OddEvenNum( int h ) {
          if (h % 2 == 0) {
              System.out.println(" Entered nr is Even ");
          }else{
              System.out.println(" Entered nr is Odd ");

          }
    }
}