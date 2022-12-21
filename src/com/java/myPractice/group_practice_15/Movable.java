package com.java.myPractice.group_practice_15;

public interface Movable {
       String message = "This animal can move";

       void move();

       default String getMessage() {
        return message;
       }

       static void printMessage() {
        System.out.println(" Hi, Iam movable and I'm from static method ");
       }
 }



