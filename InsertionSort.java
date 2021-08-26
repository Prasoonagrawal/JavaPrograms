package com.prasoon;

import java.util.Arrays;

// less swap than bubble sort
// stable
// use for smaller value of n
// work best for partial sorted array
// use with hybrid sort
public class InsertionSort {
    public static void main(String[] args) {
        int [] arr={7,6,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
  if(arr[j]<arr[j-1])
  {
      swap(arr,j,j-1);
  }
  else{
      break;
  }
            }

        }
    }

    private static void swap(int[] arr, int j, int i) {
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
}
