package com.bootcamp.practice1.Task4;

import java.util.Scanner;

public class DemoTask4 {
    /*
    Task4: Ask user to input a whole number and output false, if it is even number and true if it is odd number
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int wholeNum2;
        System.out.println("The dear user input whole number again:");
        wholeNum2 = input.nextInt();
        if (wholeNum2 % 2 != 0) {
            System.out.println("This number is odd:true");
        } else System.out.println("This number is odd: false");

    }

}
