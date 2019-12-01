package chpt11;
import java.util.Scanner;

//Exercise 11.9 p.447 (470)
//Class: MyArray

/*
(Largest rows and columns) Write a program that randomly fills in 0s and 1s into an n-by-n matrix,
prints the matrix, and finds the rows and columns with the most 1s.
(Hint: Use two ArrayLists to store the row and column indices with the most 1s.) Here is a sample run of the program:

Enter the array size n: 4
The random array is
0011
0011
1101
1010
The largest row index: 2
The largest column index: 2, 3
 */

public class Exercise_11_09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //get matrix size from user and create the matrix
        System.out.print("Enter the array size n: ");
        int s = input.nextInt();
        int[][] matrix = new int[s][s];

        //fill array with random 0's or 1's
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = (int) (Math.round(Math.random()));
            }
        }



 /* just for testing
        int[][] matrix = {
                {1,0,0,1,1},
                {1,1,1,0,1},
                {1,1,0,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1}
        };

  */
        MyArray m = new MyArray(matrix);
        m.processMatrixRow();
        m.processMatrixColumn();
        m.printMatrixArray();
        m.printRowIndexArrayList();
        m.printColIndexArrayList();


    }

}
