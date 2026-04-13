package com.java.fundamentals;

import java.util.Scanner;

public class EcommerceAppSwitchCase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------");
        System.out.println("Welcome to E-Commerce App");
        System.out.println("--------------------------------");

        System.out.println("MENU: \n 1)Customer"+
                "\n 2)Order" +
                "\n 3)Product" +
                "\n 4)Payment" +
                "\n 5)EXIT");
        System.out.println("Enter your input between(1-5) :");
        int input = sc.nextInt();

        switch (input){
            case 1:
                System.out.println("Welcome to Customer Section:"+"\n 1.signup" +
                        "\n 2.Login");
                System.out.println("Select option(1 or 2):");
                int customerSection = sc.nextInt();

                switch (customerSection){
                    case 1:
                        System.out.println("Completed sign up successfully");
                        break;
                    case 2:
                        System.out.println("Completed Login successfully");
                        break;
                }
               break;
            case 2:
                System.out.println("Welcome to Order section:");
                System.out.println(" 1) Add item" +
                        "\n 2) Delete item" +
                        "\n 3) Update item");
                break;

            case 3:
                System.out.println("Welcome to Product section:");
                System.out.println(" 1) Add item" +
                        "\n 2) Delete item" +
                        "\n 3) Update item");
                break;

            case 4:
                System.out.println("Welcome to Payment section:");
                System.out.println("Select  Payment method :");
                System.out.println("1)UPI");
                System.out.println("2)CARD");
                System.out.println("3)CASH");

                int paymentMethod = sc.nextInt();

                switch (paymentMethod){
                    case 1:
                        System.out.println("Your payment is successful via UPI");
                        break;
                    case 2:
                        System.out.println("Your payment is successful via CARD");
                        break;
                    case 3:
                        System.out.println("Your payment is successful via CASH");
                        break;
                }
                System.out.println("Your payment is successful");
                break;

            case 5:
                System.out.println("exit...");

                // Terminate JVM
                System.exit(0);
                break;

            default:
                System.out.println("Selected wrong key");




        }



    }
}
