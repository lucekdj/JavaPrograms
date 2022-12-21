package com.java.class42;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class duplicated {
    public static void main(String[] args) {
        List<String> listOfData = new ArrayList<String>();

        listOfData.add("Banana");
        listOfData.add("Apple");
        listOfData.add("Potato");
        listOfData.add("Tomato");
        listOfData.add("Banana");
        listOfData.add("Banana2");
        listOfData.add("Apple");
        listOfData.add("Orange");
        listOfData.add("Cucumber");
        listOfData.add("Mango");
        listOfData.add("Tomato");
        listOfData.add("Apple");
        listOfData.add("Banana");

        //System.out.println(findDuplicates(listOfData));

        // System.out.println(listOfData);

        Set<String> setOfWords = new HashSet<>();
        Set<String> uniqueItem = new HashSet<>();

        for (String item : listOfData) {
            if (setOfWords.add(item) == false) {
                setOfWords.add(item);

                //System.out.println(item);
                //System.out.println(listOfData);
                System.out.println(setOfWords);
            }
            System.out.println("Duplicate items " + setOfWords);


        }

/*
    static Set findDuplicates (List < String > list) {
            Set<String> duplicates = new HashSet<>();
            Set<String> unique = new HashSet<>();
            for (String s : list) {
                if (!unique.add(s)) {
                    duplicates.add(s);

                }
            }
            return duplicates;

    }


 */

    }

}
