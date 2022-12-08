package com.java.class34;

public class TestApple {
    public static void main(String[] args) {
       // TouchIDIphones iphone = new TouchIDIphones();

        //IPhone7 ip7 = new IPhone7("iphone7", 512 , "white ", "7");

        //IPhone7 ip8 = new IPhone7("iphone7", 512 , "black ", "7");

    }
    // write the method, which will be able to take iPhone7, iPhone8, iPhone10
    // and return the model

    // Classes that we design, we need to work with the Constructors
    // 2. Write the method where we can pass any iPhone and we return the model

    public static String whichIphone (BaseIphone baseIphone){
        return baseIphone.getModel();
    }
}
