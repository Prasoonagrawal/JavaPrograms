package com.prasoon;

public class SearrchIn2DArray {
    public static void main(String[] args) {
        int [][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int target=17;
        search(arr,target);
    }

   static void search(int[][] arr, int target) {
       for (int i = 0; i <arr.length ; i++) {
           for (int j = 0; j < arr[i].length; j++) {
if(target==arr[i][j])
{
    System.out.println("Element  found");
    return;
}
           }
       }
       System.out.println("Not Found");
    }


}
