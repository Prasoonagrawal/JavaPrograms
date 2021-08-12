package com.prasoon;

public class MaximumConsecutive1s {
    public static void main(String[] args) {
        int []arr={0,1,1,1,0,1,1};
        int result=Consecutive(arr);
        System.out.println(result);
    }

    static int Consecutive(int[] arr) {
        int result=0;
        int c=0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==1){
                c ++;
            }
            else {
                result=Math.max(result,c);
                c=0;
            }
        }

        return result;
    }
}
