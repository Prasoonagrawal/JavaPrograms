package com.prasoon;

import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
    int[]arr={7,8,9,11,12};
    int resut=missing(arr);
    System.out.println(Arrays.toString(arr));
    System.out.println(resut);
}

    static int missing(int[] arr) {
int i=0;
while (i<arr.length)
{
    int counter=arr[i]-1;
    if (arr[i]>0&&arr[i]<arr.length&&arr[i]!=arr[counter])
    {
        int temp = arr[i];
        arr[i] = arr[counter];
        arr[counter] = temp;
    }
    else {
        i++;
    }
}
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j+1)
            {
                return j+1;
            }
        }
        return -1;
}


}
