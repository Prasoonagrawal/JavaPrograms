package com.prasoon;

public class CeilingOfNumberUsingBS {
    public static void main(String[] args) {
        int [] arr={2,3,5,9,14,16,18};
        int target=17;
       int result= Ceilingbinarysearch(arr,target);
       if (result<=arr.length-1)
       System.out.println(arr[result]);
       else
           System.out.println("Not found");
    }

    static int Ceilingbinarysearch(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        int mid=0;
        while (start<=end)
        {
             mid=(start+(end))/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            if (arr[mid]>target)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return mid+1;//or start and for floor mid-1 or end
    }
}
