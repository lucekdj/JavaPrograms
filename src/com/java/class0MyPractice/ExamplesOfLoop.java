package com.java.class0MyPractice;

import java.util.Scanner;

public class ExamplesOfLoop {
    public static void main(String[] args) {
        int num =10;

        while (num>=1){

            System.out.println(num);
            num--;
        }
        num--;  // here you put after curly bracket when you have if statement

        System.out.println("---------------------");
        int a = 1;

        while (a<=5){
            System.out.println(a);
            a++;
        }

        System.out.println("iiiiiiiiii");


        for(int i = 1; i<=5; i++){
            System.out.println(i);
        }

        System.out.println("zzzzzzzzzzz");
        int j =10;

        for (int z = 5; z>=1; z--){
            System.out.print( z +"  ");
            System.out.println(j);
            j--;


        }
        System.out.println("//////////////");
        int s =10;
        for (int z = 1; z<=5; z++){

            System.out.println(z);
            System.out.println(s);
            s--;
        }

        System.out.println("+++++++++++");

        for(int q = 1, w =10; q<=5; q++,w--){
            System.out.println(q);
            System.out.println(w);
        }

        System.out.println("PPPPPPPPPPPPP");
        int result = 0;

        for(int e =1; e<=5; e++){
            result = result + e;
            System.out.println(result );

        }
        System.out.println(result);



       System.out.println("000000000000" );

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num");
        int num1 = sc.nextInt();

        int factorial = 1;
        for(int f = 1; f<=num1 ;f ++){
            factorial = factorial * f;

            System.out.println(factorial);  // here prints collections of numbers
        }
        System.out.println(factorial);    // here prints sum, result of calculation



    }






}
