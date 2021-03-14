package chpt11;
/*
(Addition quiz) Rewrite Listing 5.1 RepeatAdditionQuiz.java to alert the user
if an answer is entered again.  Hint: use an array list to store answers.
 */

//Exercise 11.16 p.448 (471)
//Intro to Java Programming 10th ed. Y. Daniel Liang

import java.util.ArrayList;
import java.util.Scanner;

public class RepeatAdditionQuiz {
    public static void main(String[] args) {

        ArrayList<Integer> answers = new ArrayList<Integer>();
        boolean give_question = true;
        int number1;
        int number2;
        int cont; //continue
        int count = 0;

        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

       while(give_question) {
            number1 = (int) (Math.random() * 10);
            number2 = (int) (Math.random() * 10);

            //Scanner input = new Scanner(System.in);

            System.out.print("What is " + number1 + " + " + number2 + "?  ");
            int answer = input1.nextInt();

            while(number1 + number2 != answer) {
                if (answers.contains(answer))
                    System.out.println("You already tried " + answer + "!!!");

                    System.out.println("Wrong answer. Try again. What is "
                            + number1 + " + " + number2 + "? ");
                    answers.add(answer);

                answer = input1.nextInt();
            }
                /* old attempt
                answers.add(answer);

                for(int i = 0; i < answers.size(); i++) {
                    if(answers.get(i) == answer)
                        count++;
                }

                if(count > 1)
                    System.out.println("You already tried " + answer);
                System.out.println("Wrong answer. Try again!");
                System.out.print("What is " + number1 + " + " + number2 + "?  ");
                count = 0;
                answer = input1.nextInt();
            } */
            System.out.println("You got it!!!");
            answers.clear();

            System.out.print("Press 1 to get another question or 0 to leave... ");
            cont = input2.nextInt();

            if(cont == 0)
                give_question = false;

       }
    }
}
