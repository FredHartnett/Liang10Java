package chpt11;

import java.util.ArrayList;

public class MyArray {
    private int[][] matrix;
    private ArrayList<Integer> rowIndex = new ArrayList<>();
    private ArrayList<Integer> colIndex = new ArrayList<>();

    public MyArray(){};
    public MyArray(int[][] x) {
        this.matrix = x;
    }

    //process column
    public void processMatrixColumn() {
        int maxCol = 0; //stores the occurrences of '1' in a column
        int indexOfMaxCol;
        int occurrences;

        for(int column = 0; column < matrix[0].length; column++) {
            occurrences = 0;
            indexOfMaxCol = column;
            for(int row = 0; row < matrix.length; row++) {
                if(matrix[row][column] == 1) {
                    occurrences++;
                }
            }
            if(occurrences > maxCol) {
                maxCol = occurrences;
                colIndex.clear();
                colIndex.add(indexOfMaxCol);
            } else
                if(occurrences == maxCol) {
                    colIndex.add(indexOfMaxCol);
                }
        }
    }

    //process row
    public void processMatrixRow() {
        int maxCol = 0; //stores the occurrences of '1' in a row
        int indexOfMaxRow;
        int occurrences;

        for(int row = 0; row < matrix[0].length; row++) {
            occurrences = 0;
            indexOfMaxRow = row;
            for(int col = 0; col < matrix.length; col++) {
                if(matrix[row][col] == 1) {
                    occurrences++;
                }
            }
            if(occurrences > maxCol) {
                maxCol = occurrences;
                rowIndex.clear();
                rowIndex.add(indexOfMaxRow);
            } else
            if(occurrences == maxCol) {
                rowIndex.add(indexOfMaxRow);
            }
        }
    }

    //print columns with the most 1's
    public void printColIndexArrayList() {
        System.out.println("The column(s) with the most 1's are...");
        for(int i = 0; i < colIndex.size(); i++) {
            System.out.print(colIndex.get(i) + " ");
        }
    }

    //print rows with the most 1's
    public void printRowIndexArrayList() {
        System.out.println("The row(s) with the most 1's are...");
        for(int i = 0; i < rowIndex.size(); i++) {
            System.out.print(rowIndex.get(i) + " ");
        }
        System.out.println("");
    }

    //print out the matrix
    public void printMatrixArray() {
        for(int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }


}
