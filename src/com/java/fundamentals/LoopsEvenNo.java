package com.java.fundamentals;

import java.util.Scanner;

public class LoopsEvenNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Range:");

        int x = sc.nextInt();
        int i = 1;

        while (i <= x)
        {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;


        }
    }
}
