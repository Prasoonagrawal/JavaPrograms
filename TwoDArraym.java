package com.prasoon;

import java.util.Arrays;

public class TwoDArraym {
    public static void main(String[] args) {
        int[][] matrix={
                {10,20,30},
                {40,50,60},
                {70,80,90}
        };
        System.out.println(Arrays.toString(search(matrix,70)));


    }
    static int[] search(int[][]matrix,int target)
    {
        int r=0;
        int c=matrix.length-1;
        while (r<matrix.length && c>=0)
        {
            if (matrix[r][c]==target) {
                return new int[]{r, c};
            }
                if(matrix[r][c]<target)
            {
                r++;
            }
            else
                c--;
        }
        return new int[]{-1,-1};
    }
    
}
