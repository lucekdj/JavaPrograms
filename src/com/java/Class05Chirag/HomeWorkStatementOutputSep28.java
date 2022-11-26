package com.java.Class05Chirag;

public class HomeWorkStatementOutputSep28 {
    public static void main(String[] args) {

        String  str1 = "HelloWorld", str2 = "Java";
        int i =10, j = 20;


        System.out.println(i + j);              //statement 1 - 30
        System.out.println("i + j");            //statement 2 - i+j
        System.out.println(str1 + i);           //statement 3 - Hello10
        System.out.println(str1 + i + j);       //statement 4 - Hello1020
        System.out.println(i + j +str1);        //statement 5 - 30Hello
        System.out.println(str1 + i * j);       //statement 6 - Hello200
        //System.out.println(str1 + i - j);       //statement 7 - Error??????
        System.out.println(str1 + i + j + str2);//statement 8 - Hello1020Java
    }
}
