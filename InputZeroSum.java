package com.prasoon;
import java.util.Scanner;
public class InputZeroSum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n1=1;
        int sum=0;
        while(n1!=0)
        {
            System.out.println("Enter NUmber: ");
            n1=input.nextInt();
            sum=sum+n1;

        }
        System.out.println("Sum is: "+ sum);
    }
}
