package com.prasoon;

import java.util.Arrays;

//https://leetcode.com/problems/missing-number/
public class MissingNumber {
    public static void main(String[] args) {
        int[]arr={4,3,0,1};
        int re =missingnumber(arr);
        System.out.println(re);
        System.out.println(Arrays.toString(arr));
    }

    private static int missingnumber(int[] arr) {

        int i=0;
        while (i<arr.length)
        {
            int correct=arr[i];
            if (arr[i]<arr.length &&  arr[i]!=arr[correct])
            {
                int temp=arr[correct];
                arr[correct]=arr[i];
                arr[i]=temp;
            }
            else i++;

        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]!=j)
            {
                return j;
            }

            
        }
        return arr.length;


    }
}
