package com.prasoon;
import java.util.Scanner;
public class Fibo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number: ");
        int n1=input.nextInt();
        int a=0;
        int b=1;
        int c=2;
        if(n1==1){
            System.out.println(0);
            return;
        }
        if(n1==2){
            System.out.println(1);
            return;
        }
        while (c<=n1)
        {
            int t=b;
            b=b+a;
            a=t;
            c++;
        }
        System.out.println(b);
    }

}
