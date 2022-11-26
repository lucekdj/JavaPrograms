package com.java.myPractice;
/*
import com.java.class22.Homework22;

public class Homework24 {
    public static void main(String[] args) {
        //Task1
        Homework22 homework22 = new Homework22();
        System.out.println("\t\t---Task1---");
        int data[] = {43, 44, 37, 37, 43, 43, 44, 17, 44, 44, 17};
        homework22.show(data);
        System.out.print("(Logic 1) Duplicates: ");
        duplicatesLogicOne(data);
        System.out.print("\n(Logic 2) Duplicates: ");
        duplicatesLogicTwo(data);

        //Task2
        System.out.println("\n\n\t\t---Task2---");
        int info[][] = {    {23, 44, 21},
                {45, 42, 31},
                {73, 14, 0} };
        int sum[]=new int[info.length];
        for( int i=0; i< info.length;i++){
            for(int j=0; j<info[i].length; j++){
                sum[i]+=info[j][i];
            }
            System.out.println("Sum of column "+i+" is "+ sum[i]);
        }

        //Task3
        System.out.println("\n\t\t---Task3---");
        int arr[]={5, 2, 8, 7, 3, 6,6,2,1};
        homework22.show(arr);
        System.out.print("Sorted ");
        int sorted[]=sortingAscending(arr);
        homework22.show(sorted);
    }
    static void duplicatesLogicOne(int arr[]){
        for(int i=0; i< arr.length-1;i++){
            int count=0;
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.print(arr[i]+" ");
            }
        }
    }
    static void duplicatesLogicTwo(int data []){
        int duplicates[] = new int[data.length];
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] == data[j]) {
                    if (findDuplicates(duplicates, data[i]) == false) {
                        System.out.print(data[i]+" ");
                        duplicates[i] = data[i];
                    }
                }
            }
        }
    }
    static boolean findDuplicates(int[] arr, int targetNumber) {
        boolean boo = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == targetNumber) {
                boo = true;
                break;
            } else
                boo = false;
        }
        return boo;
    }
    static int [] sortingAscending(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1;j<arr.length;j++)
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
        }
        return arr;
    }
}*/