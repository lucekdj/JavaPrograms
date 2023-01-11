package com.java.myPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapFrequencyOfTheNames {
    public static void main (String[] args){
        String names = "chirag maria gulnur ali " +
                "maryna max ali maria max " +
                "ali chirag yana maggie ali " +
                "yana maggie ali maryna max";
        System.out.println( names);

        String[] arrayOfNames = names.split(" ");

        //System.out.println(arrayOfNames + "\n" + names);

        Map<String, Integer> frequency = new HashMap<>();


        for(String name : arrayOfNames) {


            if (frequency.containsKey(name)) {

                frequency.put(name,frequency.get(name)+ 1);

            } else {
                frequency.put(name, 1);
            }
        }
        System.out.println("\n \n \n"+frequency);


        Set<Map.Entry<String ,Integer>> Pairs = frequency.entrySet();

        //String maxfreqName = "",








    }
}
