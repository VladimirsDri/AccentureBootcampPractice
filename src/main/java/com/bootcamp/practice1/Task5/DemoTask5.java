package com.bootcamp.practice1.Task5;

import java.util.Scanner;

public class DemoTask5 {
    /* Task 5:Write a program which reads boolean value from user and prints out the opposite value:
    Example input:
        Enter boolean value: true
    Expected output:
        Opposite of "true" is "false"

     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean b3;
        System.out.println("The dear user user input boolean value, like false or true:");
        b3 = input.nextBoolean();
        if (b3) {
            System.out.println("Opposite of true is false");
        } else System.out.println("Opposite of false if true");
    }
}
