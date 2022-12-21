package com.java.class42;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorMaggi {

        public static void main(String[] args) {
            List<Integer> listOfData = new ArrayList<>();

            listOfData.add(10);
            listOfData.add(50);
            listOfData.add(20);
            listOfData.add(45);
//              Ways to print data : 1. 2. 3.
//        //1. Using index Based For Loop - won't work with set because it doesn't have index
//        for (int i = 0; i < listOfData.size(); i++) {
//            System.out.println(listOfData.get(i));
//
//        }
//        // 2. For Each Loop
//        for (Integer item : listOfData) {
//            System.out.println(item);
//        }

            // 3. Using Iterator
            Iterator<Integer> itr = listOfData.iterator();
//        System.out.println(itr.next()); // give current data (first one) and move cursor to next one
//        System.out.println(itr.next());
//        System.out.println(itr.next());
//        System.out.println(itr.next());
            while (itr.hasNext()){
                System.out.println(itr.next()); // do we have next - yes then do next
            }


        }
    }


