package com.java.class18;

import java.util.Scanner;

public class palindromeReverseWithInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter a nr"); // 12321
        int num = sc.nextInt();
        int originalNum = num;
        int rev = 0;

        while (num != 0) {               //   int Last Digit separating from 874  and storing in reverse
            int lastDigit = num % 10;    // 1  last digit = 874 % 10 = 87 (reminder is 4
                                         // 2  now Combine last digit with previous value (0) of reverse number  -
            rev = rev * 10 + lastDigit;  //    reverse = reverse(0) * 10 + 4 = so new reverse is 4 (storing in revers)
            num = num / 10;              // 3  now (removing last digit 4)   874 /10  = 87.4 but int so new num = 87
             //  num/=10;
                                         //  Start from beginning new nr is 87
                                         // 1  87 % 10 =   8.7   (reminder is 7)
                                         // 2  reverse = 4 -(number from revers) * 10 = 40 +7 =47 is new reverse
                                         // 3  now (removing last digit 7)   87/10  = 8.7 but int so new num = 8

                                         //  Start from beginning new nr is 8
                                         // 1  8 % 10 =   8 (reminder)
                                         // 2  47 -(number from reverse) * 10 = 470 +8 =478 is new reverse
                                         // 3  reverse = reverse(47) * 10 + 4 = 474 so new revers is 474 (storing in reverse)
                                         // 4  now (removing last digit 8)   8/10  = 0.8 but int so new num = 0
                                         // while (num !=0)  is NOT equal - now false because is 0 => so go out from loop to print


        }
        System.out.println();
               System.out.println(" reverse is " + rev);

            if (originalNum == rev) {

                System.out.println(" Palindrome ");

            } else {
                System.out.println(" Not Palindrome ");
            }

        }
    }

