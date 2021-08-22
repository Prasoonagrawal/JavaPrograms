package com.prasoon;

public class SearchInInfiniteSizedArray {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,6,7,8,9,10,11,12,13,14,15,16,17};
    int target=5;
    if(arr[0]==target) {
        System.out.println("element found" + 0);
        return;
    }
    int i=1;
    while(arr[i]<target) {
        i = i * 2;
        if (arr[i] == target) {
            System.out.println("element found" + i);
            return;
        }
    }
       int result= binarysearch(arr,target,i/2+1,i-1);
System.out.println(result);
    }

   static int binarysearch(int[] arr, int target, int s, int e) {
      while (s<=e)
      {
          int m =(s+e)/2;
          if (arr[m]>target)
          e=m-1;
          else if (arr[m]<target)
              s=m+1;
          else
              return m;
      }
      return -1;

    }
}

