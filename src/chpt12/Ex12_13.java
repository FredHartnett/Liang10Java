package chpt12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//ex. 12.13 p.489
//File CountStuff.txt has...
//291 characters
//53 words
//3 lines

public class Ex12_13 {
    private static int characterCount = 0;
    private static int wordCount = 0;
    private static int lineCount = 0;
    private static final String inputFilePath = "resources/CountStuff.txt";

    public static void main(String[] args) throws FileNotFoundException {

        //Check if source file exists
        File sourceFile = new File(inputFilePath);
        if(!sourceFile.exists()) {
            System.out.println("*** source file does not exist ***");
            System.exit(1);
        }

        Scanner input = new Scanner(sourceFile);

        while (input.hasNext()) {
            countStuff(input.nextLine());
        }
        printStuff();
    }

    private static void countStuff(String lineOfCharacters) {
        characterCount = characterCount + countLetters(lineOfCharacters);
        wordCount = wordCount + countWords(lineOfCharacters);
        lineCount++;
    }

    private static int countLetters(String lineOfCharacters) {
        if(lineOfCharacters.isEmpty()) {
            return 0;
        }
        return lineOfCharacters.length();
    }

    private static int countWords(String lineOfCharacters) {
        String trim = lineOfCharacters.trim();
        int count = 0;

        if(trim.isEmpty()) {
            return 0;
        }

        for(int i = 0; i < trim.length(); i++) {
            if(trim.charAt(i) == ' ' || (i == trim.length() - 1)) {
                count++;
            }
        }
        return count;
    }

    private static void printStuff() {
        System.out.println("File " + inputFilePath + " has...");
        System.out.println(characterCount + " characters");
        System.out.println(wordCount + " words");
        System.out.println(lineCount + " lines");
    }

//Using the split function
//    private static int countWords(String lineOfCharacters) {
//        String trim = lineOfCharacters.trim();
//
//        if(trim.isEmpty()) {
//            return 0;
//        }
//        return trim.split("\\s+").length;
//    }
}