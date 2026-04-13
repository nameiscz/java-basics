package com.java.fundamentals;

import java.util.Scanner;

public class InputFromUser {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);  //CREATE A NEW SCANNER OBJECT


        System.out.println("Enter AGE:"); //byte
        Byte age = x.nextByte(); //read from user
        System.out.println("AGE:"+ age);

        System.out.println("Enter MARKS:");//short
        Short marks = x.nextShort();
        System.out.println("MARKS:"+ marks);

        System.out.println("Enter Salary:");//INT
        int salary = x.nextInt();
        System.out.println("Salary:"+ salary);

        System.out.println("Enter Phone.NO:");//LONG
        Long phone  = x.nextLong();
        System.out.println("Phone.no:"+phone);

        System.out.println("Enter Discount % : ");//FLOAT
        float discount  = x.nextFloat();
        System.out.println("discount percentage %:"+discount);

        System.out.println("Enter product stock (true/false) : ");//BOOLEAN
        Boolean product  = x.nextBoolean();
        System.out.println("Product status:"+product);

        System.out.println("Enter Product average :");//double
        double average = x.nextDouble();
        System.out.println("product average:"+average);

        System.out.println("Enter Genfer(MALE/FEMALE) :");//double
        char gender = x.next().charAt(0);
        System.out.println("GENDER:"+gender);
        x.close();




















    }

}
