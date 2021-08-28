package com.prasoon;

import java.util.Arrays;

public class ReplaceElementswithGreatestElementonRightSide {
    public static void main(String[] args) {
        int [] arr={400};
        replaceElements(arr);
       // System.out.println(Arrays.toString(arr));
    }

    static void replaceElements(int[] arr) {
        int [] lar=new int[arr.length];
      int  max=arr[arr.length-1];
        for (int i = arr.length-1; i >=0 ; i--) {
            lar[i]=max;
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        lar[arr.length-1]=-1;
        for (int i = 0; i <arr.length; i++) {
            arr[i]=lar[i];
        }
    }
}
