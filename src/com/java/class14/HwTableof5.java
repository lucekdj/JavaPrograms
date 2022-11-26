package com.java.class14;

import java.util.Scanner;

public class HwTableof5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "  Enter the nr to multiple \n \t by numbers from 1-10 ");
         int User = sc.nextInt();

          while (User <= 10){
              System.out.println(User + " * 5 = " + User*5 );
              User++;
          }







    }
}
