package com.prasoon;

public class LongestEvenOddSubarray {
    public static void main(String[] args) {
        int [] arr={10,12,8,6};
        subarray(arr);
    }

     static void subarray(int[] arr) {
        int c=1;
        int a=arr[0];
        int m=1;

         for (int i = 1; i < arr.length; i++) {
            if((arr[i]%2==0 && arr[i-1]%2!=0) ||(arr[i]%2!=0 && arr[i-1]%2==0))
            {
                c=c+1;
            }
            else{
                m=Math.max(m,c);
                c=1;
            }
             m=Math.max(m,c);

         }
         System.out.println(m);
    }


}
