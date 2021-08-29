package com.prasoon;

import java.util.Arrays;

public class FindtheDuplicateNumber {
    public static void main(String[] args) {
        int[]arr={1,3,4,2,2};
        int re =duplicatenumber(arr);
        System.out.println(re);
        System.out.println(Arrays.toString(arr));
    }
    static int duplicatenumber(int[] arr) {
        int i=0;
        while (i<arr.length)
        {
            if (arr[i]!=i+1)
            {
                int start=arr[i]-1;
                if (arr[i]!=arr[start])
                    swap(arr, i , start);
                else
                    return arr[i];
            }
            else {
                i++;
            }
        }
        return -1;
      }



    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
