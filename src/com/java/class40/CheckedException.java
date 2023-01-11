package com.java.class40;

import java.io.IOException;
import java.util.Scanner;

public class CheckedException {
    public static void main(String[] args) {  //throws IOException  {
           try{
               openBrowser();
           }catch   (IOException e){       //(Exception e){
               System.out.println( " Invalid Browser ");
           }


        // openBrowser();

    }

    public static void openBrowser() throws IOException {
        Scanner sc = new Scanner(System.in);
        String browser = sc.nextLine();

        if (browser.equals("Chrome")) {
            System.out.println("Opening Chrome");
        } else if (browser.equals("Firefox")) {
            System.out.println("Opening Firefox");
        } else {
                throw new IOException("Invalid Browser");
        }
    }
}
