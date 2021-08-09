package com.prasoon;

import java.util.Scanner;
import java.util.Scanner;
public class InputZeroLargest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n1=1;
        int lar=0;
        while(n1!=0)
        {
            System.out.println("Enter NUmber: ");
            n1=input.nextInt();
            if(n1>lar)
            {
                lar=n1;
            }

        }
        System.out.println("Sum is: "+ lar);
    }
}
