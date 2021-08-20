package com.prasoon;

public class EquilibriumPointPerfixSum {
    public static void main(String[] args) {
        int arr[] = {2,-1,-1,4,};
        int sum = 0;
        for (int i = 0; i <arr.length ; i++) {
            sum=sum+arr[i];
        }
        int l_sum=0;
        for (int i = 0; i < arr.length; i++) {
            if (l_sum==sum-arr[i])
            {
                System.out.println("True");
                return;
            }
            else {
                l_sum +=arr[i];
                sum -=arr[i];
            }
        }
        System.out.println("False");
        return;
        }
    }

