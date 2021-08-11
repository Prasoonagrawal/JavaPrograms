package com.prasoon;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LeftRotationOfArrayByOne {
    public static void main(String[] args) {
        int [] arr={10,8,0,0,12,0};
        leftrotation(arr);
    }

 static void leftrotation(int[] arr) {
        int temp=arr[0];
        if(arr.length>1) {
            for (int i = 1; i<arr.length;i++)
            {
                arr[i-1]=arr[i];
            }
            arr[arr.length-1]=temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
