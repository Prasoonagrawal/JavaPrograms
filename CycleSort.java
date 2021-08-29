package com.prasoon;
//when we have given number form ranger 1 to N

import java.util.Arrays;

public class CycleSort {

    public static void main(String[] args) {
        int[]arr={3,5,2,1,4};
        cyclesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void cyclesort(int[] arr) {

        int i=0;
        while (i<arr.length)
        {
            int correct=arr[i]-1;
            if (arr[i]!=arr[correct])
            {
                int temp=arr[correct];
                arr[correct]=arr[i];
                arr[i]=temp;
            }
            else i++;

        }
    }
}
