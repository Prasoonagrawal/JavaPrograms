package com.prasoon;

import java.sql.Array;
import java.util.Arrays;

public class MoveZeosToEnd {
    public static void main(String[] args) {
        int [] arr={10,8,0,0,12,0};
        movezeros(arr);
    }

    static void movezeros(int[] arr) {
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                int temp=arr[i];
                arr[i]=arr[c];
                arr[c]=temp;

                c++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
