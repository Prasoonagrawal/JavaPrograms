package com.prasoon;

public class HCF {
    public static void main(String[] args) {
        int n1=36;
        int n2=37;
        while (n1!=n2)
        {
            if(n1>n2)
            {
                n1=n1-n2;

            }
            else {
                n2=n2-n1;

            }
        }
        System.out.println(n1);
    }
}
