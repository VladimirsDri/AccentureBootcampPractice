package com.bootcamp.practice1.Task2;

import java.util.Scanner;

public class DemoTask2 {
    /* Task2:
     Ask user to input two boolean values and compare them.
    Input:
       Enter b1: true
       Enter b2: false
    Expected output:
       Is b1 and b2 equal? - false
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean b1, b2;
        System.out.println("The dear user input two booleans values, like true or false");
        System.out.println("Enter b1:");
        b1 = input.nextBoolean();
        System.out.println("Enter b2:");
        b2 = input.nextBoolean();
        if (b1 == b2) {
            System.out.println("Is b1 and b2 equal? - true");
        } else System.out.println("Is b1 and b2 equal? - false");
    }
}
