package com.prasoon;
//https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3260/
import java.util.Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {
        int [] arr={5,7,9,11,4,3,2,6,8};
        sortArrayByParity2(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sortArrayByParity2(int[] arr) {
        int s=0;
        int e=arr.length-1;
        while(s<=e)
        {
            if(arr[s]%2==0)
                s++;
            else if (arr[e]%2!=0)
            {
                e--;
            }
            else
            {
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                e--;
                s++;
            }
        }

    }

    static void sortArrayByParity1(int[] nums) {
        int [] arr=new int[nums.length];
        int s=0;
        int e=arr.length-1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%2==0)
            {
                arr[s++]=nums[i];
            }
            else
            {
                arr[e--]=nums[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            nums[i]=arr[i];
        }


    }
}
