package com.java.fundamentals;

import java.util.Scanner;

public class SwitchCaseTest {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in); //CREATING A SCANNER OBJ
        System.out.println("Enter Day : ");
        int day = sc.nextInt(); // READING USER INPUT

        switch (day){   //SWITCH(EXPRESSION)
            case 1:
                System.out.println("MONDAY");  //BLOCK OF CODE
                break;

            case 2:
                System.out.println("TUESDAY");
                break;

            case 3:
                System.out.println("WEDNESDAY");
                break;

            case 4:
                System.out.println("THURSDAY");
                break;


            case 5:
                System.out.println("FRIDAY");
                break;

            case 6:
                System.out.println("SATURDAY");
                break;

            case 7:
                System.out.println("SUNDAY");
                break;

            default:
                System.out.println("No plans");





        }
    }
}
