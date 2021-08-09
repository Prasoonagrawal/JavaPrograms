package com.prasoon;

public class ReverseNumber {
    public static void main(String[] args) {
        int n= 12345678;
        int r=0;
        int a=0;
        while (n>=1)
        {
            r=n%10;
            n=n/10;
            a=a*10+r;
        }
        System.out.println(a);

    }
}
