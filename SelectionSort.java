package com.prasoon;

import java.util.Arrays;

// not stable
public class SelectionSort {
    public static void main(String[] args) {
        int [] arr={7,6,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void sort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int last=arr.length-1-i;
            int maxindex=max(arr,0,last);
            swap(arr,maxindex,last);


        }
    }

    private static void swap(int[] arr, int maxindex, int last) {
        int temp=arr[maxindex];
        arr[maxindex]=arr[last];
        arr[last]=temp;
    }

    private static int max(int[] arr, int start, int last) {
        int max=start;
        for (int i=start;i<last+1;i++)
        {
            if(arr[max]<arr[i])
            {
                max=i;
            }
        }
        return max;
    }
}
