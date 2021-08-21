package com.prasoon;

public class CountOccurrencesinSorted {
    public static void main(String[] args) {
        int[] arr = {10,20,20,20,20,40,40};
        int target = 20;
        int first = first_index(arr, target);
        if (first == -1) {
            System.out.println(-1);
            return;
        }
        int last = last_index(arr, target);
        System.out.println(last-first+1);

    }

    private static int last_index(int[] arr, int target) {
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
            else if(target<arr[mid])
            {
                end=mid-1;
            }
            else
            {
                if ( mid==arr.length-1  || arr[mid+1]!=arr[mid])
                {
                    return mid;
                }
                else{
                    start=mid+1;

                }

            }
        }
        return ans;
    }

    private static int first_index(int[] arr, int target) {
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
            else if(target<arr[mid])
            {
                end=mid-1;
            }
            else
            {
                if ( mid==0  || arr[mid-1]!=arr[mid])
                {
                    return mid;
                }
                else{
                    end=mid-1;

                }

            }
        }
        return ans;
    }
}
