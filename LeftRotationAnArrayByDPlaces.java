package com.prasoon;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LeftRotationAnArrayByDPlaces {
    public static void main(String[] args) {
        int [] arr={10,8,0,0,12,0};
        int d=1;
        leftrotationbyD(arr,d);
    }

    static void leftrotationbyD(int[] arr ,int d) {
        reverse(arr,0,d-1);
        reverse(arr,d,arr.length-1);
        reverse(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));

    }
    static void reverse(int []arr,int low, int high)
    {
        while(low<high)
        {
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }
}
