package com.prasoon;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = input.nextInt();
        if(n==1){
            System.out.println("Fact is 1");
            return;
        }
        if (n<1){
            System.out.println("Fact can we find");
            return;
        }

        int f = 1;

        for (int i = 2; i <= n; i++) {
            f = f * i;
        }
        System.out.println("Factorial is: " + f);
    }
}
