package com.java.Class05Chirag;

public class RecapExpression {
    public RecapExpression() {
    }
    public static void main(String[] args) {

        // By default, java will consider whole number as an int
        int num = 1456789;
        // By default, java will consider decimal number as a double
        double num1 = 24.0;

        System.out.println(12 * 2 / 6 * (2) - 20 * (3 - 8)); //  108
        System.out.println(12 / 24.0 * 6 + 4);               //  7.0

        // By default, java will consider decimal number as a double
        // 10*5.0= 50.0 /20=2.5 +"Hello" + 12*5 ....2.5Hello60..
        System.out.println(10 * 5.0 / 20  +"Hello" + 12 * 5);

        // By default, java will consider decimal number as a int
        //10*5=50/20=2.5-but java see as whole nr -2 not after dec .5
        // 10*5=50/20=2 +Hello= 128*8=60  ...2Hello60...
        System.out.println(10 * 5 / 20 +"Hello" + 12 * 5);
    }
}
