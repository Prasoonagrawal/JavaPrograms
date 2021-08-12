package com.prasoon;

public class FrequenciesinaSortedArray {
    public static void main(String[] args) {
        int[] arr={10,20,30,40};
        frequency(arr);
    }

     static void frequency(int[] arr) {
        int c=0;
        int a=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(a!=arr[i])
            {
                System.out.println(a +" "+ c);
                a=arr[i];
                c=0;
            }
            c++;

        }
         System.out.println(a +" "+ c);
    }
}
