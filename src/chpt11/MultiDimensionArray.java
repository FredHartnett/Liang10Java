package chpt11;

import java.util.Scanner;

//section 8.3 p. 291

public class MultiDimensionArray {
    public static void main(String[] args) {
        int[][] matrix = new int[3][4];
        java.util.Scanner input = new Scanner(System.in);
        System.out.println("Enter " + matrix.length + " rows and " +
                matrix[0].length + " columns: ");

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextInt();
            }
        }
        //print out the maatrix
        /*
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " "); }
            System.out.println();
        }
        */

        //System.out.println("matrix length: " + matrix.length);
        //System.out.println("matrix row length: " +matrix[0].length);

        for (int column = 0; column < matrix[0].length; column++) { int total = 0;
            for (int row = 0; row < matrix.length; row++)
                total += matrix[row][column];
            System.out.println("Sum for column " + column + " is " + total);
        }

    }
}
