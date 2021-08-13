package com.prasoon;

public class MaximumCircularSumSubarray {
    public static void main(String[] args) {
        int [] arr={8,-4,3,-5,4};
       int r =subarraySum(arr);
       System.out.println(r);
    }

    static int subarraySum(int[] arr) {
        int sum1=normalSum(arr);
        if(sum1<0)
        {
            return sum1;
        }
        int sum2=0;
        for (int i = 0; i < arr.length; i++) {
            sum2+=arr[i];
            arr[i]=-arr[i];

        }
        return Math.max(sum1,sum2);
    }

    static int normalSum(int[] arr) {
        int sum=arr[0];
        int m=arr[0];
    for (int i = 1; i < arr.length; i++) {
        m=Math.max(arr[i],m+arr[i]);
        sum=Math.max(sum,m);
    }
    return (sum);
    }
}
