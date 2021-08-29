package com.prasoon;
//https://leetcode.com/problems/find-all-duplicates-in-an-array/submissions/
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        List<Integer>ans=new ArrayList<>();
        int i=0;
        while (i<arr.length)
        {

                int counter=arr[i]-1;
                if(arr[i]!=arr[counter])
                {
                    int temp = arr[i];
                    arr[i] = arr[counter];
                    arr[counter] = temp;
                }

            else {i++;}
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]!=j+1)
                ans.add(arr[j]);

        }
        return ans;
        
    }
}