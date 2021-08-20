package com.prasoon;

public class kadane {
    public static void main(String[] args) {
        int arr[] = {-22};
        int r=maxSubarraySum(arr,arr.length);
        System.out.println(r);
    }
    static int maxSubarraySum(int arr[], int n){

        int max_sum=-1000;
        int cur_sum=arr[0];
        int i=1;

        for(; i<n;i++)
        {
            if(cur_sum<cur_sum+arr[i])
            {
                cur_sum= Math.max(arr[i],cur_sum+arr[i]);
            }
            else{
                max_sum=Math.max(max_sum,cur_sum);
                cur_sum=Math.max(arr[i],cur_sum+arr[i]);
            }
            max_sum=Math.max(max_sum,cur_sum);
        }
        return max_sum;

    }

}

