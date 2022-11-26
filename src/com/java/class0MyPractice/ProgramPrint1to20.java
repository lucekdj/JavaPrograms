package com.java.class0MyPractice;

public class ProgramPrint1to20 {
    public static void main(String[] args) {

        /*
        int i = 10;
         while(i>= 1){
             System.out.println(i);
            i--;
         }
            */
//don't understand this one - should be 10,8,6,4..
         int ia = 1;

         while(ia<= 10) {
             if (ia % 2 == 0) {
                 System.out.println(ia);
             }
             ia++;
         }

        //1 Even 2,4,6,8,...or 1,3,5,7..  if integer = 1
        int d = 2;
        while (d <= 10) {
            System.out.println(d);
            d = d + 2;
        }

        /*
        int a = 9;
        while(a >= 1) {
            if (a % 3 == 0) {
                System.out.println(a);
            }
            a--;
        }


        int b = 1;
        while(b <= 10) {
            if (b % 2 == 0) ;
            System.out.println(b);
            b++;
        }

        int c = 0;
        while(c <= 10) {
            if (c % 2 == 0) ;
            c++;
            System.out.println(c);
            c++;
        }
        /*
        //1 Even 2,4,6,8,...or 1,3,5,7..  if integer = 1
        int d = 2;
        while (d <= 20) {
            System.out.println(d);
            d = d + 2;
        }
        /*
        //2 Even nr 2,4,6..

        int f = 1;
        while (f <= 19) {
            f++;
            System.out.println(f);
            f++;
        }


        /*

        // 1-20
        int e = 1;
         while (e <= 20) {
             System.out.println(e);
             e++;
          }

         */

    }
}
