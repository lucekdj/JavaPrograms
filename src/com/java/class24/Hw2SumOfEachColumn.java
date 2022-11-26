package com.java.class24;
/*
2. Write a program to print the sum of each COLUMN from a 2D array
Example
Array:
{23, 44, 21},
{45, 42, 31},
{73, 14, 0}
Output : Sum of columns numbers - 141, 100 ,52
 */
public class Hw2SumOfEachColumn {
    public static void main(String[] args) {

        int nums[][] = {{23, 44, 21},
                        {45, 42, 31},
                        {73, 14, 0}};

        int sum ;

        for (int i = 0; i < nums.length; i ++){

            sum = 0;

            for (int j = 0; j < nums[i].length; j++){
                sum = sum + nums[j][i];

                //sum = sum + nums[j][i];
                //sum = sum + nums[i][i];
                //sum = sum + nums[j][j];
                //sum = sum + nums[1][1];

                //System.out.println(sum);
            }
            System.out.println(sum);

        }


    }
}
