package com.prasoon;

public class MinimumConsecutiveFlips {
    public static void main(String[] args) {
        int[] arr={0,0,1,1,0,0,1,1,0};
         maxconfilp(arr);

    }

     static void maxconfilp(int[] arr) {
        int r=0;
         for (int i = 1; i <arr.length ; i++) {
             if(arr[i]!=arr[i-1])
             if (arr[i]!=arr[0])
             {
                 System.out.print("From "+i);
             }
             else{
                 System.out.print(" to "+i +"\n");
             }
         }
         if (arr[arr.length-1]!=arr[0])
         {
             System.out.println(arr.length-1);
         }



    }

}
