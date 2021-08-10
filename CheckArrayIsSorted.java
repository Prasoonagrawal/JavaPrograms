package com.prasoon;

public class CheckArrayIsSorted {
    public static void main(String[] args) {
        int[] arr={7,8,10,10};
        boolean a=isSorted(arr);// two loop
        System.out.println(a);
    }

    private static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<arr[i-1])
            {
                return false;
            }
        }
        return true;
    }
}
