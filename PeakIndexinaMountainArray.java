package com.prasoon;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/submissions/
public class PeakIndexinaMountainArray {
    public static void main(String[] args) {
        int [] arr={3,4,5,1};
        int result=peak(arr);
        System.out.println(result);
    }

    private static int peak(int[] arr) {
         int start=0;
        int end=arr.length-1;

        while (start<end)
        {
            int mid= (start+end)/2;
            if(arr[mid]>arr[mid+1])
            {
                    end=mid;

            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
}
