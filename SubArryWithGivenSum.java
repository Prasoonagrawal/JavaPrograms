package com.prasoon;

public class SubArryWithGivenSum {
    public static void main(String[] args) {
        int[] arr={15, 2, 4, 8, 9, 5, 10, 23};
        int k=23;
      boolean r=  slidingsum(arr,k);
      System.out.println(r);
    }

static boolean slidingsum(int[] arr, int k) {
int cur_arr=arr[0],start=0;
    for (int i = 0; i <arr.length ; i++) {
        while (cur_arr>k && start<i+1) {
            cur_arr = cur_arr - arr[start];
            start++;

        }
            if (cur_arr == k) {

                return true;
            }
            if(i<arr.length)
            {
                cur_arr=cur_arr+arr[i];
            }

        }
    return false;

    }
}
