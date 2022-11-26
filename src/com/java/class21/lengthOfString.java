package com.java.class21;

import java.util.Scanner;

public class lengthOfString {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Please enter some word ");

            String word = sc.nextLine();

               int count =0;

            for (int i = 0; i < word.length(); i++) {
                    count++;


                    System.out.print(count);
                }
            //System.out.println(count);
           // System.out.println(word.lastIndexOf( ""));

            }


        }

