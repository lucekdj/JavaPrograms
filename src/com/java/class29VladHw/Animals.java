package com.java.class29VladHw;

public class Animals {     // parent class
   private String name;                   // instance variables of the class
   private int age, weight;            // instance variables of the class
   Animals(){}                        // no parameters constructor
   Animals(String name, int age, int weight){     // parameterised constructor
      this.name = name;
      this.age = age;
      this.weight = weight;
   }
   public String getName() { // Getter
      return name;
   }
   public void setName(String name) {  // Setter
      this.name = name;
   }
   public int getAge() { // Getter
      return age;
   }
   public void setAge(int age) {  // Setter
      this.age = age;
   }
   public int getWeight() { // Getter
      return weight;
   }
   public void setWeight(int weight) { // Setter
      this.weight = weight;
   }
}
