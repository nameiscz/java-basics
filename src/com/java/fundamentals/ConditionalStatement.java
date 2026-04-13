package com.java.fundamentals;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); //CREATE A NEW SCANNER OBJECT


        System.out.println("Enter Product price : ");
        int productPrice = sc.nextInt(); // reading input from user

        System.out.println("Enter your membership type(G/S/B/D) : ");
        char membership = sc.next().charAt(0);

        System.out.println("Enter your Age: ");
        byte age = sc.nextByte();

        int discountPrice = 0;


        //Membership Discount
        if (membership == 'G') {
             discountPrice = 20;
        }else if (membership=='S') {
             discountPrice = 15;
        } else if (membership=='B') {
             discountPrice = 10;
        } else if (membership=='D') {
             discountPrice = 50;
        }

        //Age based discount
        if (age>65){
            discountPrice += 10;
        } else if ( (age<65) & (age>45)) {
            discountPrice +=8;
        } else if (age==25) {
            discountPrice += 5;

        } else {
            System.out.println("no additional discount");

        }

        int price = 0;
        int finalPrice = 0;
        float stateTax = 0.025f;
        float centralTax =0.025f;
        price = productPrice - (productPrice * discountPrice/100);
        finalPrice = (int)(price +  (price*stateTax)+(price*centralTax));
        System.out.println("Final price:"+finalPrice);








    }


}
