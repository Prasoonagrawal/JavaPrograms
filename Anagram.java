package com.prasoon;

public class Anagram {
    public static void main(String[] args) {
        int c=256;
        String a="GEEKSFORGEEKSP";
        String b="GESFORGEEKSERK";
        if (a.length()!=b.length())
        {
            System.out.println(false);
            return;
        }
         int arr[]=new int[c];
        for (int i = 0; i < a.length(); i++) {
            arr[a.charAt(i)]++;
            arr[b.charAt(i)]--;
        }
        for (int i = 0; i < c; i++) {
            if(arr[i]!=0) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
