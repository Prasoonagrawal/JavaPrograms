package com.prasoon;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first  number: ");
        int n1=input.nextInt();
        System.out.println("Enter Second  number: ");
        int n2=input.nextInt();
        System.out.println("Enter operation(+,-,/,*) ");
        Character o=input.next().charAt(0);
        if(o=='+')
        {
            System.out.println("Sum is: "+(n1+n2));
        }
        if(o=='-')
        {
            System.out.println("Sub is: "+(n1-n2));
        }
        if(o=='*')
        {
            System.out.println("mul is: "+(n1*n2));
        }
        if(o=='/')
        {
            System.out.println("Div is: "+(n1/n2));
        }
    }
}
