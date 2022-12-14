package com.java.class42Chirag;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {

        List<Integer> listOfData = new ArrayList<>();

        listOfData.add(10);
        listOfData.add(50);
        listOfData.add(20);
        listOfData.add(45);
        listOfData.add(50);
        listOfData.add(20);
        listOfData.add(45);

        System.out.println(listOfData);


        Set<Integer> setOfData = new HashSet<>();

        setOfData.add(45);
        setOfData.add(50);
        setOfData.add(20);
        setOfData.add(10);  // doesn't duplicate elements
        setOfData.add(10);  // it won't print only one time 10
        setOfData.add(31);
        

        System.out.println(setOfData);

        // You can retrieve data from set by using for each loop only
        for(int num : setOfData){
            System.out.println(num);
        }

    }
}
