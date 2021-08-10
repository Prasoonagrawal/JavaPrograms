package com.prasoon;
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter number");
        int n= in.nextInt();
        boolean result=Armstrong(n);
        System.out.println(result);

    }

  static boolean Armstrong(int n) {
        int c=0;
        int n1=n;
        int r=0;
        while (n1>0)
        {
            r=n1%10;
            c=c+(r*r*r);
            n1=n1/10;
        }
      if (c == n) {
          return true;
      }
      return false;
    }
}
