package com.java.class26HomeWork;

 class HwRemodeling {

     String ownerName;
     String typeOfRemodeling;
     String quality;
     double roofSize;
     double roofCost;

     HwRemodeling(String ownerNameFromUser) {
         ownerName = ownerNameFromUser;
         System.out.println("Hello Mr " + ownerNameFromUser + " What type of remodel are you looking for ");
     }

     HwRemodeling(String typeOfRemodelingFromUser, String qualityFromUser, double roofSizeFromUser) {
         typeOfRemodeling = typeOfRemodelingFromUser;
         quality = qualityFromUser;
         roofSize = roofSizeFromUser;

         System.out.println("You choose remodeling type " + typeOfRemodelingFromUser + " quality " + qualityFromUser);
         System.out.println(" You entered that your size of the roof is " + roofSizeFromUser + " squers");
     }

     double RoofRepair(double roofSize) {
         roofSize = roofSize * 650;
         roofCost = roofSize;
         return roofCost;

     }


     String windows;
    String gutters;

    double windowCost;
    double gutterCost;

    int quantity;
    double RoofReplacement;
    int WindowReplacement;
    double GutterReplacement;


    void WindowReplacement(int windowPieces){
        windowPieces = windowPieces*550;
    }

    void GutterReplacement(double gutterLength){
         gutterLength = gutterLength * 11.5;

    }







}
