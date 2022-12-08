package com.java.StudentMentorings;



//.toUpperCase()
//.toLowerCase()
//.equals() T/F
//.equalsIgnoreCase() T/F
//.contains() T/F
//.charAt()
//.indexOf()
//.length
//.isEmpty()
//.isBlank()
//.trim()
//.substring()
//String.format()
//.replace()
//.split

 public class MaxStringMethod {

        public static  void main(String[] args) {

//        String userStr = "Hello everYOne";
//        System.out.println(userStr.toLowerCase());
//        System.out.println(userStr.toUpperCase());
//
//        String str1 = "HELLO wOrld";
//        String str2 = "HELLO WORLD";
//
////        System.out.println(str1.toLowerCase().equals(str2.toLowerCase()));
////        System.out.println(str1.equals(str2));
////
////        System.out.println(str1.equalsIgnoreCase(str2));
//
//        System.out.println(str1.equalsIgnoreCase("hello world"));
//
//        String str3 = "        i";
//        System.out.println(str3.length());
//
//        System.out.println(str3.isEmpty());
//        System.out.println(str3.isBlank());
////        System.out.println(characterString.indexOf(','));
////        System.out.println(characterString.charAt(characterString.indexOf(',')));
//
//        String str4 = "                                 trim me      ";
//        System.out.println(str4.trim());


//        String str = "Hello everyone, this is my first mentoring so far";
//        System.out.println(str.substring(1));
//        System.out.println(str.substring(0,5));
//
//        String str2 = str.substring(0,str.indexOf(' '));
//        System.out.println(str2);

//        String str3 = "Hello %s, how %s are you %s";
//        System.out.println(String.format(str3, "Max", "Ali", "josh"));
//
//        String str4 = "Hello max, how are you Ali";
//        System.out.println(str4.replace("max", "Neveah"));
//
//        String strarray[] = str4.split(" ",3);
//
//        for(int i = 0; i < strarray.length; i++){
//            System.out.println(strarray[i]);
//        }

            String userString = "https://www.bedbathandbeyond.com/store/product/national-tree-company-kingswood-fir-pencil-christmas-tree/3336248";
            String str = userString.substring(userString.lastIndexOf('c'), userString.lastIndexOf('/')).replace('-', ' ');
            System.out.println(str);
        }
    }

