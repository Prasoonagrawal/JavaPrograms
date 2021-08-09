package com.prasoon;

public class DigitsInFactorial {
    public static void main(String[] args) {
        double f=1;
        int N=30;
        long c=0;
        for (int i = 2; i <=N ; i++) {
            f=f*i;
        }
        System.out.println(f);
        while(f>0)
        {
            f=f/10;
            c=c+1;
        }System.out.println(c);
    }
}
