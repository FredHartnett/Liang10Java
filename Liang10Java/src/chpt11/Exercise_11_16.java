package chpt11;

/*
(Addition quiz) Rewrite Listing 5.1 RepeatAdditionQuiz.java to alert the user
if an answer is entered again. Hint: use an array list to store answers.
 */

//Exercise 11.16 p.448 (471)
//Class: Exercise_11_16

import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.ws.Response;

public class Exercise_11_16 {

    static ArrayList<Integer> myIntegerList = new ArrayList<>();

    public static void main(String[] args) {

        int number1;
        int number2;

// Create a Scanner
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        int response = 1;

        do {
            number1 = (int)(Math.random() * 10);
            number2 = (int)(Math.random() * 10);

            System.out.print(
                    "What is " + number1 + " + " + number2 + "? ");
            System.out.println("");
            int answer = input.nextInt();

            while (number1 + number2 != answer) {
                if(valueIsInList(answer)) {
                    System.out.println("You already entered that guess!");
                }

                System.out.print("Wrong answer. Try again. What is "
                        + number1 + " + " + number2 + "? ");

                System.out.println("");
                answer = input.nextInt();
            }

            System.out.println("You got it!");
            System.out.println("");

            myIntegerList.clear();

            System.out.println("Do you want to continue? (Yes press '1' - No press '0')");
            System.out.println("");
            response = input.nextInt();

        } while (response == 1);

        System.out.println("Thanks for playing");
    }

    private static boolean valueIsInList(int answer) {
        boolean isFound = false;

        for(int x = 0; x < myIntegerList.size(); x++) {
            if(answer == myIntegerList.get(x)) {
                isFound = true;
                break;
            }
        }

        if(!isFound)
            myIntegerList.add(answer);

        return isFound;
    }
}

