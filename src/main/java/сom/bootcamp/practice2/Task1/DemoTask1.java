package сom.bootcamp.practice2.Task1;

public class DemoTask1 {
    /*
       Task1: Write a program which creates two dimensional
        array and stores a multiplication table (from 1 - 10) in it.
   Example of output:
       1 * 1 = 1
       1 * 2 = 2
       1 * 3 = 3
       ....
       10 * 9 = 90
       10 * 10 = 100
   Hint:
      1) don't forget that you have to save the values in the array and output them from the array.
      2) Arrays should be the size of [10][10]



        */
    //Task 1:
    public static void main(String[] args) {
        int[][] twoD_arr = new int[10][10];
        int row = 1, column = 1;
        for (int i = 1; i < twoD_arr.length; i++) {
            for (int j = 1; j < twoD_arr[i].length; j++) {
                twoD_arr[i][j] = row * column;
                column = column + 1;
            }
            row = row + 1;
            column = 1;
        }
        for (int i = 1; i < twoD_arr.length; i++) {
            for (int j = 1; j < twoD_arr[i].length; j++) {
                System.out.println(i + " * " + j + " = " + twoD_arr[i][j]);
            }
        }
    }
}
