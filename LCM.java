package com.prasoon;

public class LCM {
    public static void main(String[] args) {
        int a=5;
        int b=7;
        int l=Math.max(a,b);
        int s=Math.min(a,b);
        for(int i=l;;i+=l)
        {
            if(i%s==0)
            {
                System.out.println(i);
                return;
            }

        }

    }

}
