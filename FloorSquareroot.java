package com.prasoon;

import java.nio.file.ClosedWatchServiceException;

public class FloorSquareroot {
    public static void main(String[] args) {
        int n=20;
        int result=root(n);
        System.out.println(result);
    }

    private static int root(int n) {
        int start=1;
        int end=n;
        int ans=-1;
        while (start<=end) {
            int mid = (start + end) / 2;
            int sq = mid * mid;
            if (sq == n)
                return mid;
            else if (sq > n)
            {
                end=mid-1;
            }
            else {
                start=mid+1;
                ans=mid;
            }

        }
        return ans;
    }
}
