package сom.bootcamp.practice2.Task2;

import java.util.Random;

public class DemoTask2 {
    /* Task2: Declare and initialize an array with four arbitrary whole numbers.
       Write a Java program to copy this array by iterating it.

     */
    //Task 2:
    public static void main(String[] args) {
        Random rd = new Random();
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(2147483647) + 1;
            System.out.println(arr[i]);
        }
    }
}
