package com.prasoon;
//best-->O(1)
//worst-->O(n)
public interface LinearSearch {
    public static void main(String[] args) {
        int arr[]={1,4,13,54,2,67};
        int e=6;
        int i=0;
        int result= linear(arr,e);
        if (result!=-1)
        System.out.println("Element find at index=  "+result);
        else {
            System.out.println("Element Not Found");
        }

    }

    static int linear(int[] arr, int e) {
        int i;
        for (i = 0; i < arr.length; i++) {
            if (e == arr[i])
                break;
        }
        if (i > arr.length - 1)
            return -1;
        else
            return i;
    }


}
