package com.java.class26HomeWork;
/*

Following previous homework, create three constructors
in your class that is taking different parameters and
create three objects in the MainClass using these constructors
 */

public class MainClassHw {
    public static void main(String[] args) {


        RoofReplacement welcome  = new RoofReplacement("John");

        RoofReplacement roof  = new RoofReplacement("_roof replacement_", " standard ",1);
       // roof.roofSize = 25;
        roof.roofCost = roof.roofRepair(roof.roofSize);
        System.out.println("Total price for yor roof replacement is $ " + roof.roofCost);

        //roof.roofRepair(10);
        System.out.println("roof price " + roof.roofRepair(10));

        roof.windowPieces = 4 ;
        roof.windowReplacement(roof.windowPieces);


        //HouseRemodel window = new HouseRemodel(Windowreplacement);



        //roof.WindowReplacement(int windowPieces);




    }
}
