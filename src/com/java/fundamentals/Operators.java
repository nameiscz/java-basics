package com.java.fundamentals;

public class Operators {
    static void main() {
        byte num1 = 10;
        byte num2 = 20;
        int res  = --num1 + ++num1 - num1-- + num1++ - --num2 + ++num2;
        System.out.println(res);


        int result = 10 + 20 - (10*9) / 7;
        System.out.println(result);

    }
}
