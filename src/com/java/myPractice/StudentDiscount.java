package com.java.myPractice;

import java.util.Scanner;

public class StudentDiscount {

    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        System.out.println("Are You a student ? \nEnter yes or no ");
         String user = sc.nextLine();


        if ( user.equalsIgnoreCase("Yes") ) {

            System.out.println("You are qualifying to get 20% discount");

        }  else if ( user.equalsIgnoreCase("No")){

                System.out.println("You are not  qualifying to get discount");

        }else{

            System.out.println(" Wrong input, enter yes or no ");

        }
        
    }
}
