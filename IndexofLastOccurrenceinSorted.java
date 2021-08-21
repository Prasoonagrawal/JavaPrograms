package com.prasoon;

public class IndexofLastOccurrenceinSorted {
    public static void main(String[] args) {
    int []arr={8,10,10,12};
    int target=7;
    int a=index(arr,target);
    System.out.println(a);
}

    private static int index(int[] arr, int target) {
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
}
