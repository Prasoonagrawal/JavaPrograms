package com.prasoon;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] arr={5,8,20,10};
        int a=largest(arr);
        System.out.println(a);
    }

  static int largest(int[] arr) {
        int l=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(l<arr[i])
            {
                l=arr[i];
            }
        }
        return l;
    }

}
