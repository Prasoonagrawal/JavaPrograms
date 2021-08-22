package com.prasoon;

import java.util.Arrays;

//bubble sort or exchange sort or Sinking sort
//if we don't create extra space than its now as inplace sorting algo
//it is stable --> when original order mantain
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {12, 345, 6, 7, 8, 9, 1,-1,0};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubblesort(int[] arr) {
        boolean swap = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swap = true;
                }
            }
            if (!swap)
                break;
        }


    }
}

