package com.prasoon;

public class LeaderInArray {
    public static void main(String[] args) {
        int [] arr={30,20,10};
        int d=1;
        leader(arr,d);
    }

    static void leader(int[] arr, int d) {
        
   int lar=arr[arr.length-1];
        System.out.println(lar);
        for (int j = arr.length-1; j >=0 ; j--) {

            if(lar<arr[j])
            {
                lar=arr[j];
                System.out.println(lar);
            }
        }
    }
}
