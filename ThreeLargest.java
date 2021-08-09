package com.prasoon;
import java.util.Scanner;
public class ThreeLArgest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number: ");
        int n1=input.nextInt();
        int n2=input.nextInt();
        int n3=input.nextInt();

        int max=n1;
        if(n2>max)
        {
            max=n2;
        }
        if(n3>n2)
        {
            max=n3;
        }
        System.out.println(max);
    }
}
