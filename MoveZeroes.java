package com.prasoon;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int [] arr={4,2,4,0,0,3,0,5,1,0};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void moveZeroes(int[] arr) {

        int c=0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0)
            {
                arr[c++]=arr[i];
            }
        }
        while (c<arr.length)
        {
            arr[c++]=0;
        }
    }

}
