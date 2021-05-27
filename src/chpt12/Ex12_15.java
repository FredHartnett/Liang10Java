package chpt12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ex12_15 {
    public static void main(String[] args) throws FileNotFoundException {
        String outputFilePath = "resources/Exercise12_15.txt";
        int max = 1000001;
        int min = 1;
        int amount = 100;
        File outputFile = new File(outputFilePath);
        int[] array = new int[amount];

        PrintWriter output = new PrintWriter(outputFile);

        for(int i = 0; i < amount; i++) {
            if(i == (amount-1)) {
                output.print(getRandomNumberUsingNextInt(min, max));
            } else {
                output.println(getRandomNumberUsingNextInt(min, max));
            }
        }
        output.close();

        Scanner input = new Scanner(outputFile);

        int arrayIndex = 0;
        while(input.hasNext()) {
            array[arrayIndex] = input.nextInt();
            arrayIndex++;
        }

        sortPrintArray(array);
    }

    private static int getRandomNumberUsingNextInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

    private static void sortPrintArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            for(int x = i + 1; x < array.length; x++) {
                if(array[i] > array[x]) {
                    int tmp = array[x];
                    array[x] = array[i];
                    array[i] = tmp;
                }
            }
        }

        for (int i : array) {
            System.out.println(i);
        }
    }
}