package com.prasoon;
import java.util.Scanner;
public class factor {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first  number: ");
        int n1=input.nextInt();
        System.out.println("Factor ");
        for(int i=1;i<=n1;i++)
        {
            if(n1%i==0)
            {
                System.out.println(i);
            }
        }
    }
}
