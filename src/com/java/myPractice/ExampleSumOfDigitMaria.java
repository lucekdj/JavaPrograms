package com.java.myPractice;

import java.util.Scanner;

public class ExampleSumOfDigitMaria {//Write program to print sum of each digit from the given nr
    //input  - 12345
    //output - 15
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number ");
         int num = sc.nextInt(); //Example : 12345
         int sum = 0;            //1,2,3,4,5, Will be stored in the sum 5+4+3+2+1

         while (num > 0) {       //When condition False - will get out of from the loop and print
            int lastdigit = num%10;  // to get last digit 5 from number 12345 % 10 = 1234 - reminder 5+... 5,4,3,2,1
            sum = sum + lastdigit;   //1store that digit in sum => 5 = 0+5

            num = num/10;        // to remove last digit , now num is 1234 and back to while
                                     //2store  9 = 5+4  new sum is 9
                                     //3 store 12 = 9+3  new sum is 12
                                     //4 store 14 = 12+2     sum 14
                                     //5 store 15 = 14+1   sum 15
         }                           // program stop because there is no more digits

        System.out.println("the sum of digits is "+ sum);
    }
}
