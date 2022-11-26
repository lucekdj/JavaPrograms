package com.java.class25;

public class LengthOfEachWord {
    public static void main(String[] args) {

        String str = "Today is Monday, it started well ";


          String splitwords[] = str.split( " ");

          // 1st method

          for (int i = 0; i< splitwords.length; i++ ){

              System.out.println(splitwords[i].length());
          }
          System.out.println();

          // Second method

          for (String printword : splitwords){

              System.out.println(printword + "=" + printword.length());

          }
    }
}
