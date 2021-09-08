package com.prasoon;

import java.util.Arrays;

public class pivot {
    public static void main(String[] args) {
        int[]arr={5,1,3};


        int target=0;
        int resut=pivot1(arr);

        System.out.println(resut);
        int p=pivot1(arr);

        if(p==-1)
            System.out.println(BS(arr, target,0,arr.length-1));
        if(arr[p]==target)
            System.out.println(p);
        if(target>=arr[0])
            System.out.println(BS(arr, target,0,p-1));

        System.out.println( BS(arr, target,p+1,arr.length));
    }

    static int pivot1(int[] arr) {
        int s=0;
        int e=arr.length-1;
        while (s<=e)
        {
            int mid=s+(e-s)/2;
            if(mid<e && arr[mid]>arr[mid+1])
                return mid;
            if(mid>s && arr[mid]<arr[mid-1])
                return mid-1;
            if(arr[mid]<arr[s])
                    e=mid-1;
            else
                s=mid+1;
        }
        return -1;
    }
    static int BS(int [] arr, int target,int start,int end)
    {
        while(start<=end)
        {
            int mid=start +(end-start)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if( arr[mid]<target)
            {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public int findPeakElement(int[] arr) {
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
