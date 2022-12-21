package com.java.class43;

import java.util.HashMap;
import java.util.Map;

    //Bank
//1st page input page
//2nd page review page
//3rd page confirmation details
    public class EnumExampleMaggie {
        public static void main(String[] args) {
            System.out.println("Opening a Bank website");
            Map<String, String> dataOnInput =enterDetailsAndCLickOnContinue();
            Map<String, String> dataOnReview = getDataOnReviewPage();


        }

        private static Map<String, String> getDataOnReviewPage() {
            String fromAcc = "456-234-457-343";
            String toAcc = "3453-234-897-343";
            int amount = 2000;
            String note = " Salary Payment";

            Map<String, String> dataOnReviewPage = new HashMap<>();

            dataOnReviewPage.put("from account", fromAcc);  // hard coding "from account" taking value from variable
            dataOnReviewPage.put("to account", toAcc);
            dataOnReviewPage.put("amount", String.valueOf(amount));
            dataOnReviewPage.put("note", note);
            return dataOnReviewPage;

        }


        public static Map<String, String> enterDetailsAndCLickOnContinue() {
            String fromAcc = "456-234-457-343";
            String toAcc = "3453-234-897-343";
            int amount = 2000;
            String note = " Salary Payment";

            System.out.println(" Entering from account " + fromAcc);
            System.out.println(" Entering to account " + toAcc);
            System.out.println(" Entering amount " + amount);
            System.out.println(" Entering note" + note);
            System.out.println(" Continue Button");

            Map<String, String> dataOnInputPage = new HashMap<>();

            dataOnInputPage.put("from account", fromAcc);  // hard coding "from account" taking value from variable
            dataOnInputPage.put("to account", toAcc);
            dataOnInputPage.put("amount", String.valueOf(amount));
            dataOnInputPage.put("note", note);
            return dataOnInputPage;
        }
    }

