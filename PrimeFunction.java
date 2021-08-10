package com.prasoon;
import java.util.Scanner;
public class PrimeFunction {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter number");
        int n= in.nextInt();
        boolean result=Prime(n);
        System.out.println(result);
    }

    static boolean Prime(int n) {
        if(n<=1){
            return false;
        }
        int c=2;
        while (c*c<=n){
            if (n%c==0)
            {
                return false;
            }
            c=c+1;
        }

            return c*c>n;


    }
}
