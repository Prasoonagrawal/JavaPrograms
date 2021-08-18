package com.prasoon;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/
public class FindFirstandLastPositionofElementinSortedArrayBinarySearch {
    public static void main(String[] args) {
        int [] arr={5,7,7,8,8,10};
        int target=8;
       int []a =position(arr,target);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    private static int[] position(int[] arr, int target) {
        int a[]={-1,-1};
        int start=positionBS(arr,target,true);
        int end=positionBS(arr,target,false);
        a[0]=start;
        a[1]=end;
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        return a;
    }


    private static int positionBS(int[] arr, int target,boolean index) {
        int start=0;
        int end=arr.length-1;
        int ans=-1;

        while(start<=end)
        {
            int mid=(start+end)/2;
            if(target>arr[mid])
            {
                start=mid+1;
            }
            else if (target<arr[mid])
            {
                end=mid-1;
            }
            else{
            ans=mid;
            if(index==true)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
            }
        }
        return ans;
    }
}
