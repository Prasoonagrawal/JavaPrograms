package com.prasoon;

import java.util.ArrayList;

public class IntersectionofTwoArrays {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        int [] arr1={4,9,5};
        int [] arr2={9,4,9,8,4};
        ArrayList<Integer> arr3 = new ArrayList<Integer>();
        for (int i = 0; i < arr1.length; i++) {
            if (BS(arr2,arr1[i])!=-1)
            {
                boolean f=false;
                for (int j = 0; j <arr3.size(); j++) {
                    if(arr3.get(j)==arr1[i])
                    {
                        f=true;
                    }
                }
                if (f=false)
                    arr3.add(arr1[i]);

            }
        }
        for (int i = 0; i < arr3.size(); i++) {
            System.out.print(arr3.get(i)+" ");
        }

    }
    static int BS(int []arr,int target)
    {
        int s=0;
        int e=arr.length-1;
        while (s<=e)
        {
            int m=s+(e-s)/2;
            if(arr[m]==target)
            {
                return m;
            }
            else if(arr[m]>target)
            {
                e=m-1;
            }
            else
            {
                s=m+1;
            }
        }
        return -1;
    }
}
