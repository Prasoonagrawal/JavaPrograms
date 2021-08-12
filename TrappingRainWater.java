package com.prasoon;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TrappingRainWater {
    public static void main(String[] args) {
        int [] arr={4,3,2,1};
        water(arr);
    }

    static void water(int[] arr) {
        int [] lmax=new int[arr.length];
        int [] rmax=new int[arr.length];
        int water=0;

        // computing lmax
        lmax[0]=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            lmax[i]=Math.max(lmax[i-1],arr[i]);
        }
        System.out.println(Arrays.toString(lmax));
        // compiting rmax
        rmax[arr.length-1]=arr[arr.length-1];
        for (int i = arr.length-2; i >=0 ; i--) {
            rmax[i]=Math.max(rmax[i+1],arr[i]);
        }
        System.out.println(Arrays.toString(rmax));

        //total water
        for (int i = 0; i < arr.length; i++) {
            water=water+(Math.min(lmax[i],rmax[i]) - arr[i]);
        }
        System.out.println(water);
    }
}
