package com.prasoon;

import jdk.dynalink.beans.StaticClass;

import java.util.Locale;

public class palindrome {
    public void main(String[] args) {
        boolean result=isPalindrome("abcdcba");
    }
    boolean isPalindrome(String str)
    {
        str=str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char s=str.charAt(i);
            char e=str.charAt(str.length()-1-i);
            if (s!=e){
                return false;
            }

        }
        return true;


    }
}
