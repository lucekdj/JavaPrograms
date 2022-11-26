package com.java.class26HomeWork;

 class RoofReplacement {

     String ownerName;
     String typeOfRemodeling;
     String quality;
     double roofSize;
     double roofCost;
     int windowPieces;

     RoofReplacement(String ownerNameFromUser) {
         ownerName = ownerNameFromUser;
         System.out.println("Hello Mr " + ownerNameFromUser + " What type of remodel are you looking for ");
     }

     RoofReplacement(String typeOfRemodelingFromUser, String qualityFromUser, double roofSizeFromUser) {
         typeOfRemodeling = typeOfRemodelingFromUser;
         quality = qualityFromUser;
         roofSize = roofSizeFromUser;

         System.out.println("You choose remodeling type " + typeOfRemodelingFromUser + " quality " + qualityFromUser);
         System.out.println(" You entered that your size of the roof is " + roofSizeFromUser + " squers");
     }

     double roofRepair(double roofSize) {
         roofSize = roofSize * 650;
         roofCost = roofSize;
         return roofCost;




     }

     void windowReplacement(int windowPieces) {
         windowPieces = windowPieces * 550;
         //System.out.println("price " + windowPieces);

     }


     class WindowReplacement {

         String windows;
         double windowCost;
         String gutters;
         double gutterCost;
         int quantity;
         double RoofReplacement;
         int WindowReplacement;
         double GutterReplacement;


         void WindowReplacement(int windowPieces) {
             windowPieces = windowPieces * 550;
         }


         void GutterReplacement(double gutterLength) {
             gutterLength = gutterLength * 11.5;

         }


     }
 }







