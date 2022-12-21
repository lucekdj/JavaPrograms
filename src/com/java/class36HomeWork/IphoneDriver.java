package com.java.class36HomeWork;

import com.java.class36HomeWork.iphone.BaseIphone1;
import com.java.class36HomeWork.iphone.Iphone10;
import com.java.class36HomeWork.iphone.Iphone7;
import com.java.class36HomeWork.iphone.Iphone8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IphoneDriver {

    public static void main(String[] args) {
        //Use Scanner
        //use -> dynamic polymorphism
        //hint: you might have to tweak baseIphone, iphone7,8,10 classes.
        //WRAP your program in a while loop => so that I can check battery, then chargeBattery then checkBattery again
        // -> until Im done using the program

        // do not change private access modifiers
        //the default values of instance variables of Iphone Objects should be
        //batterylife=60;
        //MessageText="Welcome"
        //isLocked=false;


        //write an app that asks the user to pick Iphone
        //once the user picks an iphone
        //ask them what action they want to perform
        //options are:
        //1. Check BatteryLife
        //2. Charge Iphone
        //3. SendMessage
        //4. ReadLastMessage
        //5. check if iphone is locked
        //6. lock iphone
        //7. unlock iphone

        Scanner sc = new Scanner(System.in);

        BaseIphone1 b;

        int askAgain = 0;

        System.out.println("Witch Iphone do you want to choose - 7 , 8 or 10");
        int choice = sc.nextInt();

        switch (choice){

            case 7 :
                b = new Iphone7();
                break;

            case 8:
                b = new Iphone8();
                break;

            case 10:
                b = new Iphone10();
                break;

            default:
                System.out.println("Please select the model from given option only");
            b = null;

            throw new InputMismatchException("Please enter number from 7,8,or 10");



        }

        do {
            System.out.println("Which function do you want to access:\n" +
                    "        1. Check BatteryLife\n" +
                    "        2. Charge Iphone\n" +
                    "        3. SendMessage\n" +
                    "        4. ReadLastMessage\n" +
                    "        5. check if iphone is locked\n" +
                    "        6. lock iphone\n" +
                    "        7. unlock iphone");

        int function = sc.nextInt();

        switch (function) {
            case 1:
                System.out.println("Your battery level is at: " + b.getBatteryLevel1() + "%");
                break;

            case 2:
                b.chargeBattery1();
                System.out.println("Your battery level is at: " + b.getBatteryLevel1() + "%");
                break;
            case 3:
                System.out.println("Please enter your message: ");
                String message = sc.next();
                b.sendMessage1(message);
                break;
            case 4:
                b.readMessage1();
                break;
            case 5:
                System.out.println(b.isLocked());
                break;
            case 6:
                b.lock1();
                break;
            case 7:
                b.unlock1();
                break;
            default:
                System.out.println("Please select the functions from given options only!");
        }
                System.out.println("Enter 1 to run again" + "\n" + "or 2 to stop: ");

        askAgain = sc.nextInt();
    }  while (askAgain == 1);



}
}

