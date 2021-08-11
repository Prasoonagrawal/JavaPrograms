package com.prasoon;

public class MaxDiff {
    public static void main(String[] args) {
        int [] arr={10,20,30};
        maxdiff1(arr);
    }

     static void maxdiff1(int[] arr) {
        int min=arr[0];
        int diff=arr[1]-arr[0];
         for (int i = 1; i < arr.length; i++) {
             diff=Math.max(diff,arr[i]-min);
             min=Math.min(min,arr[i]);

         }
         System.out.println(diff);
          }
}
