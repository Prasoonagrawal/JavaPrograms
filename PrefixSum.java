package com.prasoon;

public class PrefixSum {
    public static void main(String[] args) {
        int arr[]={3,4,8,-9,20,6};
        int sum=0;
        int arr_new[]=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr_new[i]=arr[i]+sum;
            sum=arr_new[i];
        }
        for (int i = 0; i < arr_new.length; i++) {
            System.out.println(arr_new[i]);
        }


       int result= getSum(0,2,arr_new);
        System.out.println(result);


    }

    private static int getSum(int start, int end, int[] arr_new) {
       if (start==0)
       {
           return arr_new[end];
       }
        return arr_new[end]-arr_new[start-1];
    }
}
