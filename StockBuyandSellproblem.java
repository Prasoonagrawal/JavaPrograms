package com.prasoon;

public class StockBuyandSellproblem {
    public static void main(String[] args) {
        int []arr={1,5,3,8,12};
        int p=profit(arr);
        System.out.println(p);
    }

    static int profit(int[] arr) {
        int p=0;
        for(int i=1;i<arr.length;i++)
        {
         if(arr[i]>arr[i-1])
         {
             p=p+(arr[i]-arr[i-1]);
         }
        }
        return p;
    }
}
