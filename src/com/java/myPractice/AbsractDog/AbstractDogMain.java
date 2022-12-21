package com.java.myPractice.AbsractDog;

public class AbstractDogMain {

    public static void main(String[] args) {
          Chihuahua c = new Chihuahua();
          c.poop();
          c.bark("wilczur");



          
//        c.hashCode();
//        c.equals("");
//        c.toString();
//        System.out.println(c.hashCode());
//        System.out.println(c.equals(""));
//        System.out.println(c.toString());
    }
    abstract static class Dog {

        public void bark(String dog){
            System.out.println("Bark");

        }

        public abstract  void poop();
    }
    static class Chihuahua extends Dog{

        public void poop() {
            System.out.println("Dog pooped");
        }
    }



    static class pitbull implements DogInterfaceClass {
        public void angry(){
            System.out.println("be scary");
        }
   }
}
