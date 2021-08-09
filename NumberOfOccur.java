package com.prasoon;

public class NumberOfOccur {
    public static void main(String[] args) {
        int n=888;
        int c=0;
        while(n>0)
        {
            int a=n%10;
            if(a==8){
                c++;
            }
            n=n/10;

        }
        System.out.println(c);
    }
}
