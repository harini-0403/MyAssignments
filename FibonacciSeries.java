package com.assignment.week1;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the range: ");
        int range = sc.nextInt();

        int a = 0, b = 1;
        System.out.print(a + " " + b);

        int c = a + b;
        while (c <= range) {
            System.out.print(" " + c);
            a = b;
            b = c;
            c = a + b;
        }
    }
}
