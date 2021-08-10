package com.prasoon;

import java.util.Arrays;

public class RemoveDuplicatesFromASortedArray {
    public static void main(String[] args) {
        int[] arr={7,7,15,17,10,10};
        sorted(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] sorted(int[] arr) {
        int r=1;

        for (int i = 1; i < arr.length ; i++) {
            if (arr[i]!=arr[r])
            {
                arr[r]=arr[i];
                r++;

            }
        }
        System.out.println("distinct element in array  "+r);
        return arr;
    }
}
