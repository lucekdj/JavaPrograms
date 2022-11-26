package com.java.class28Inheritance;

 class mycat {


        public void intro(){
            System.out.println("my cat name is Kitek");

        }

        public void age(int a) {
            System.out.println( "he is " + a + " years old ");
        }
    }



class moreInfoAboutCat extends mycat{

    public void legs(int a,int b){


        System.out.println(" he has  " + (a + b) + "legs");

    }


class myCatSpeed extends moreInfoAboutCat{


}

}