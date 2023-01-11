package com.java.class26HomeWork;

 class HouseRepair {

     String ownerName;
     String typeOfRemodeling;
     String quality;
     double roofSize;
     double roofCost;
     int windowPieces;

     HouseRepair(String ownerNameFromUser) {
         ownerName = ownerNameFromUser;
         System.out.println("Hello Mr " + ownerNameFromUser + " What type of remodel are you looking for ? ");
     }

     HouseRepair(String typeOfRemodelingFromUser, String qualityFromUser, double roofSizeFromUser) {
         typeOfRemodeling = typeOfRemodelingFromUser;
         quality = qualityFromUser;
         roofSize = roofSizeFromUser;

         System.out.println("You choose option  " + typeOfRemodelingFromUser + " quality " + qualityFromUser);
         System.out.println(" You entered  your size of the roof is " + roofSizeFromUser + " squers");
         System.out.println("Total price for roof replacement is $ " + roofCost);
     }

     double roofRepair(double roofSizeFromUser) {
         roofSize = roofSize * 650;
         roofCost = roofSize;
         return roofCost;


     }



     class WindowReplacement {


         double windowCost;

         int windowReplacement;



         void windowReplacement(int windowPieces) {
             windowPieces = windowPieces * 550;
             //System.out.println("price " + windowPieces);

         }

         void WindowReplacement(int windowPieces) {
             windowPieces = windowPieces * 550;
             windowCost = windowPieces;
         }




     }
     class gutterReplacement{

         //double gutterReplacement;
        // double gutterCost;

         double getGutterReplacement(double gutterLength) {
             gutterLength = gutterLength * 11.5;
             return gutterLength;
         }




     }

 }







