package interviewPractice;

public class GetReverse {


    public static void main(String[] args) {

        // get revers string

        String str = "We love Java";


        for (int i = str.length()-1; i>=0 ; i--){

            System.out.print(str.charAt(i));
        }

        System.out.println();

        //Print string


        int i ;
        for (i = 0; i <= str.length() - 1; i++) { //forgot to put  (int i =0) but declared  above for loop and it works
            System.out.print(str.charAt(i));

        }

//
//        for ( int i = 0; i <= str.length() - 1; i++) {
//            System.out.print(str.charAt(i));
//
//        }


    }



}




