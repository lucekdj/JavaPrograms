package interviewPractice;

public class ArrayMaxNumber {
    public static void main(String[] args) {

        int[] array = {34,65,78,12,32,45};


        int max = array[0];  // number on index 0 =34    imagine that 34 is only 1 nr biggest nr
        for(int i = 0; i< array.length; i++){
            if( array[i] > max) {
                 max = array[i];
            }
            System.out.println(max);
        }
        System.out.println(max);

    }
}
