package chpt12;
//Intro to Java Programming 10th ed. Y. Daniel Liang
//Ex 12.2

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex12_2 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integers to sum... ");

        int integer1 = 0;
        int integer2 = 0;

        boolean continueInput = true;

        do {
            try {
                integer1 = input.nextInt();
                integer2 = input.nextInt();

                sumIntegerInput(integer1,integer2);

                continueInput = false;

            } catch (InputMismatchException ex) {
                System.out.println("**** enter integers only ****");
                input.nextLine();
            }

        } while (continueInput);
    }

    private static void sumIntegerInput(int integer1, int integer2) {

        System.out.println(integer1 + " + " + integer2 + " = " + (integer1+integer2));
    }
}
