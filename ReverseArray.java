package com.prasoon;
import java.util.*;
import java.lang.reflect.Array;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={7,8,15,17,10};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int [] reverse(int[] arr) {
        int l=0;
        int temp=0;
        int h=arr.length-1;
        while(l<h){
            temp=arr[l];
            arr[l]=arr[h];
            arr[h]=temp;
            l++;
            h--;
        }
        return arr;
    }

}
