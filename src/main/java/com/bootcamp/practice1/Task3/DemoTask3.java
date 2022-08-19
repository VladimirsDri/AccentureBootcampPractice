package com.bootcamp.practice1.Task3;

import java.util.Scanner;

public class DemoTask3 {
    /* Task 3:
    Ask user to input a whole number and output true, if it is even number and false if it is odd number
    Hint: use remainder operator to divide number by two and get reminder (if reminder is 0 then it means it is even number)-
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int wholeNum1;
        System.out.println("The dear user input whole number:");
        wholeNum1 = input.nextInt();
        if (wholeNum1 % 2 == 0) {
            System.out.println("This is even number: true");
        } else System.out.println("This is even number: false");
    }
}
