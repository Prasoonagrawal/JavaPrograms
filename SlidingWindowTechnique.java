package com.prasoon;

public class SlidingWindowTechnique {
    public static void main(String[] args) {
        int[] arr={1,8,30,-5,20,7};
        int k=3;
        sliding(arr,k);
    }

    static void sliding(int[] arr,int k) {
        int sum=0;

        for (int i = 0; i <k ; i++) {
            sum=sum+arr[i];
        }
        int r=sum;
        int a=0;
        int b=k;
        for (int i = k; i <arr.length ; i++) {
            sum=(sum+arr[i]-arr[i-k]);
            r=Math.max(r,sum);
        }
        System.out.println(r);
    }



}
