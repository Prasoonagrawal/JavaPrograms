package com.prasoon;

public class Exactly3Divisors {
    public static int exactly3Divisors(int N)
    {
        int a=0;


        for (int i=4;i<=N;i++)
        {
            int c=0;
            for(int j=2;j<=i;j++)
            {
                if(i%j==0)
                {
                    c=c+1;
                }

            }
            if(c==2)
            {
                System.out.println(i);
                a=a+1;
            }
        }
        return a;
    }
    public static void main(String[] args) {
       int a= exactly3Divisors(49);
       System.out.println(a);
    }
}
