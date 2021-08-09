package com.prasoon;
import java.util.Scanner;
public class Even_Odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = input.nextInt();
        if (n <= 1) {
            System.out.println("Can't determine");
        } else {
            if (n % 2 == 0) {
                System.out.println("Even  Number");
            } else {
                System.out.println("Odd Number");
            }
        }
    }
}
