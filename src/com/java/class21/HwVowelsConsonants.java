package com.java.class21;

import java.util.Scanner;

public class HwVowelsConsonants {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = sc.nextLine().toLowerCase();
        //String word;
        //word = sc.nextLine();
        int countVowels = 0;
        int countConsonants = 0;


        for (int i = 0; i < word.length(); i++) {
            char x = word.charAt(i);

            if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u'){
                    //|| x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U') {
                countVowels++;

            } else if
                   (x >= 'a' && x <= 'z'){  //|| x <= 'A' && x <= 'Z') {
                                            // (x >='a' && x<='z' || x >='A' && x<='Z')
                countConsonants++;

            } else {

            }

        }
        System.out.println("Total Vowels " + countVowels++);
        System.out.println("Total Consonants " + countConsonants++);

    }
}