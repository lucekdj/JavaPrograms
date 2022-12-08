package com.java.class35;

public class Demo {

    public static void main(String[] args){
        Patient general = new GeneralPatient();
        Patient child = new ChildPatient();
        Patient senior = new SeniorPatient();
        Patient disabled = new DisabledPatient();

        SeniorPatient seniorPatient = new SeniorPatient();
        System.out.println(seniorPatient.takePayment(1000,200));

        ChildPatient childPatient = new ChildPatient();
        GeneralPatient generalPatient = new GeneralPatient();
        DisabledPatient disabledPatient = new DisabledPatient();

        System.out.println(childPatient.takePayment(1000,200));
        System.out.println(generalPatient.takePayment(1000,200));
        System.out.println(disabledPatient.takePayment(1000,200));


        general.takeTylenol();
        child.takeTylenol();
        senior.takeTylenol();
        disabled.takeTylenol();


    }
}
