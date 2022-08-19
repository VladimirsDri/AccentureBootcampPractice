package com.bootcamp.practice1.Task1;

import java.util.Scanner;

public class DemoTask1 {
    /*
    Task:1
     Ask user to input two numbers, compare them and output result:
   Input:
       Enter value a: 10
       Enter value b: 10
   Expected output:
       is 10 equal to 10? - true
       is 10 less than 10? - false
       is 10 less or equal to 10? - true
       is 10 greater than 10? - false
       is 10 greater or equal to 10? - true
     */
    public static void main(String[] args) {
        int num1,num2;
        Scanner input = new Scanner(System.in);
        System.out.println("The dear user enter two numbers:");
        num1 = input.nextInt();
        num2 = input.nextInt();
        if(num1==num2){
            System.out.println("is "+ num1 + " equal to "+ num2 +"? - true" );

        }else System.out.println("is "+ num1 + " equal to "+ num2 +"? - false");

        if(num1<num2){
            System.out.println("is "+ num1 + " less than "+ num2 +"? - true");
        }else System.out.println("is "+ num1 + " less than "+ num2 +"? - false");

        if(num1<=num2){
            System.out.println("is "+ num1 + " less or equal to "+ num2 +"? - true");
        }else System.out.println("is "+ num1 + " less or equal to "+ num2 +"? - false");

        if(num1>num2){
            System.out.println("is "+ num1 + " greater than "+ num2 +"? - true");
        }else System.out.println("is "+ num1 + " greater than "+ num2 +"? - false");

        if(num1>=num2){
            System.out.println("is "+ num1 + " greater or equal to "+ num2 +"? - true");
        }else System.out.println("is "+ num1 + " greater or equal to "+ num2 +"? - false");
    }

}
