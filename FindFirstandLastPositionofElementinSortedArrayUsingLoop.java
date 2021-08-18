package com.prasoon;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/
public class FindFirstandLastPositionofElementinSortedArrayUsingLoop {
    public static void main(String[] args) {
        int [] arr={};
        int target=6;
        position(arr,target);
    }

    private static void position(int[] arr, int target) {
        int a1=-1;
        int a2=-1;
        int []a={-1,-1};

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==target)
            {
                a1=i;
                break;
            }
        }
        for (int i = arr.length-1; i >-1 ; i--) {
            if(arr[i]==target)
            {
                a2=i;
                break;
            }
        }
        a[0]=a1;
        a[1]=a2;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"  ");

        }


    }
}
