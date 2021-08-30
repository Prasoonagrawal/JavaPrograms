package com.prasoon;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[]arr={1,1};
        mis(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void mis(int[] arr) {
        int i=0;
        while (i<arr.length)
        {
            int counter=arr[i]-1;
            if (arr[i]!=arr[counter])
            {
                int temp = arr[i];
                arr[i] = arr[counter];
                arr[counter] = temp;
            }
            else {
                i++;
            }
        }
        int []num=new int[2];
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j+1)
            {
                num[0]=arr[j];
                num[1]=j+1;
            }
        }
        System.out.println(Arrays.toString(num));
    }
}
