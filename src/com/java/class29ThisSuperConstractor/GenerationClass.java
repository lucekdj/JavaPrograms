package com.java.class29ThisSuperConstractor;

public class GenerationClass {



    class Grandpa {


        Grandpa() {

            System.out.println("My name is Grandpa ");
        }

        Grandpa(int xYears) {
            System.out.println("I am " + xYears + " years old ");
        }

        Grandpa(String sonName, int sonYears) {
            System.out.println(" My son name is " + sonName + " and he is " + sonYears + " old ");

            //void ageDifference(yearsYounger){
            //void ageDifference(int a,int b){
            // System.out.println(" he has  " + (a + b) + "years");
        }
    }

    class Papa extends com.java.class29ThisSuperConstractor.Grandpa {

        Papa (){
            System.out.println(" My Name is John ,I'm Grandpa's son");
        }

        Papa (int PYears){
            System.out.println( "I'm " + PYears + " older than my son  ");
        }

        Papa (String childName, int childYears){

            System.out.println( childName + " is  my son . He is " + childYears + " years old" );

        }


    }
    class YoungOne extends com.java.class29ThisSuperConstractor.Papa {

        YoungOne(){

            System.out.println( " My name is Joe I don't know these guys ");
        }
    }


}
