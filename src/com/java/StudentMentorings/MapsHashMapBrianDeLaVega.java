package com.java.StudentMentorings;

import java.util.HashMap;

public class MapsHashMapBrianDeLaVega {
    public static void main(String[] args) {
        HashMap <String, Long>
                contact = new HashMap<>();
        contact.put("Brian", 8722096350L);
        contact.put("Amber", 7734526984L);
        contact.put("Stacey", 9875643651L);
        System.out.println(contact);
    contact.putIfAbsent("John", 7732096350L);
        System.out.println(contact);

        contact.remove("John");
        System.out.println(contact);









    }
}
