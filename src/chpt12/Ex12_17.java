package chpt12;

//ex.12.17 p.490
//see also ex.7.35 "hangman" p.284-285

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex12_17 {
    static Scanner continuePlay = new Scanner(System.in);
    static Scanner getLetter = new Scanner(System.in);
    static boolean playTheGame = true;
    static ArrayList<String> listOfWords = new ArrayList<>();
    static String currentWordToSolve;
    static StringBuilder sb = new StringBuilder();
    static int missedTry = 0;

    public static void main(String[] args) throws FileNotFoundException {
        getWordsFromFile();

        while(playTheGame) {
            if(listOfWords.size() > 0) {
                playGame(getWord());
                System.out.print("Do you want to guess another word (y or n)? ");
                String s = continuePlay.nextLine();
                char ch = s.charAt(0);

                if(ch == 'n') {
                    playTheGame = false;
                    System.out.println("Thanks for playing!");
                }
            } else {
                System.out.println("Out of words, thanks for playing!");
                playTheGame = false;
            }
        }
    }

    private static void playGame(String word) {
        fillWithAsterisk(word);
        boolean stillContainsAsterisks = true;

        while(stillContainsAsterisks) {
            System.out.print("(Guess) Enter a letter in word " + sb.toString() + " >");
            String s = getLetter.nextLine();
            char ch = s.charAt(0);

            if(!isLetterInWord(word,ch)) {
                System.out.println(ch + " is not in the word");
                missedTry++;
            }

            if(isLetterInWord(word,ch) && searchStringBuilder(ch)) {
                System.out.println(ch + " is already in the word");
            }

            if(isLetterInWord(word,ch) && !searchStringBuilder(ch)) {
                for(int x = 0; x < word.length(); x++) {
                    if(word.charAt(x) == ch) {
                        sb.setCharAt(x,ch);
                    }
                }
                stillContainsAsterisks = searchStringBuilder('*');

                if(!stillContainsAsterisks) {
                    System.out.print("The word is " + sb.toString());
                    System.out.println(" and you missed " + String.valueOf(missedTry) + " time(s).");
                }
            }
        }
    }

    private static boolean isLetterInWord(String tempWord, char tempChar) {
        boolean isLetterInWord = false;
        for(int x =  0; x < tempWord.length(); x++){
            if(tempWord.charAt(x) == tempChar) {
                isLetterInWord = true;
                break;
            }
        }

        return isLetterInWord;
    }

    public static boolean searchStringBuilder(char ch) {
        for(int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i) == ch) {
                return true;
            }
        }
        return false;
    }

    private static void fillWithAsterisk(String word) {
        if(sb.length() > 0) {
            sb.delete(0,sb.length());
        }

        missedTry = 0;

        for(int i = 0; i < word.length(); i++) {
            sb.append('*');
        }
    }

    private static String getWord() {
        currentWordToSolve = listOfWords.get(0);
        listOfWords.remove(0);
        return currentWordToSolve;
    }

    private static void getWordsFromFile() throws FileNotFoundException {
        String filePath = "resources/Exercise12_17.txt";
        File file = new File(filePath);
        Scanner input = new Scanner(file);

        while(input.hasNext()) {
            String str = input.nextLine();
            listOfWords.add(str);
        }
    }
}