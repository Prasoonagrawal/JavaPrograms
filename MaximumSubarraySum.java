package com.prasoon;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        int[] arr={-3,8,-2,4,-5,6};
        int result=maxsum(arr);
        System.out.println(result);
    }

    static int maxsum(int[] arr) {
        int result=arr[0];
        int ps=arr[0];

        for(int i=1;i<arr.length;i++){
            ps=Math.max(arr[i],ps+arr[i]);
            result=Math.max(ps,result);


        }
        return result;

    }
}
