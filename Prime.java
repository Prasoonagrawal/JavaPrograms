package com.prasoon;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=input.nextInt();
        int c=2;
        if(a<=1)
        {
            System.out.println("Not print and composite");
            return;
        }
if(a==4)
{
    System.out.println("Not prime");
    return;
}
        else
        {
            while (c*c<a)
            {
                if(a%c==0)
                {
                    System.out.println("Not Prime");
                    return;
                }
                c=c+1;
            }


        }
        if(c*c>a)
        {
            System.out.println("Prime");
        }
    }
}
