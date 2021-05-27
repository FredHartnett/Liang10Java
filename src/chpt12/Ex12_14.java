package chpt12;

//ex.12.14 p.490
//scores.txt file: scores (15), average (71.20), sum (1,068)
//the input in scores.txt can be all on 1 line, or in a list

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex12_14 {
    private static final String scoresFilePath = "resources/scores.txt";
    private static int scoresTotal = 0;
    private static int numScores = 0;

    public static void main(String[] args) throws FileNotFoundException {

        File sourceFile = new File(scoresFilePath);

        if(!sourceFile.exists()) {
            System.out.println("*** source file does not exist ***");
            System.exit(1);
        }

        Scanner input = new Scanner(sourceFile);

        while(input.hasNext()) {
            processScores(input.nextInt());
        }

        printStuff();
    }

    private static void processScores(int score) {
        sumScores(score);
        countScores();
    }

    private static void sumScores(int score) {
        scoresTotal += score;
    }

    private static void countScores() {
        numScores++;
    }

    private static String scoresAverage(int sumOfScores, int numberOfScores) {
        if(numberOfScores == 0) {
            return "0";
        }

        double avg = ((double) sumOfScores / numberOfScores);

        return (String.format("%,.2f",avg));
    }

    private static void printStuff() {
        System.out.println("******************************************************");
        System.out.println("sum of all scores-> " + scoresTotal);
        System.out.println("number of scores-> " + numScores);
        System.out.println("average of scores-> " + scoresAverage(scoresTotal, numScores));
        System.out.println("******************************************************");
    }
}
