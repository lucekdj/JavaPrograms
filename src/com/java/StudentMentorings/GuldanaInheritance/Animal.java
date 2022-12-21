package com.java.StudentMentorings.GuldanaInheritance;

class Animal {
    String sayHi="Hi bro";
    Animal() {
        this("Hello from the constructor below");
        System.out.println("hi");
    }
    Animal(String sayHi){
        System.out.println(sayHi);
        System.out.println(this.sayHi);
    }
    void sleep() {
        System.out.println("Zzz");
    }
}
class Cat extends Animal{
    Cat(){
        super();
        System.out.println("Hi from Cat");
    }


}
class Dog extends Animal{
    @Override
    void sleep(){
        super.sleep();
        System.out.println(super.sayHi);
        System.out.println("ZZZ");
    }

}

