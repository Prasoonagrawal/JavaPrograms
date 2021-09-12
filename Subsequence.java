package com.prasoon;

public class Subsequence {
    public static void main(String[] args) {
        String a="GEEKSFORGEEKS";
        String b="GRGES";
        int i=0;
        int j=0;

        while (i<a.length() && j<b.length())
        {
            if(a.charAt(i)==b.charAt(j))
            {
                i++;
                j++;
            }
            else
            {
                i++;
            }

        }
     //   System.out.println(j);
        System.out.println(j);
        System.out.println(b.length());
        if(j==b.length())
        {
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

    }
}
