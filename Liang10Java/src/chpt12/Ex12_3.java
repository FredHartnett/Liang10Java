package chpt12;
//Intro to Java Programming 10th ed. Y. Daniel Liang
//Ex 12.3

import java.util.Scanner;

public class Ex12_3 {


    public static void main(String[] args) {

        int[] intArray = new int[100];

        for(int f = 0; f < intArray.length; f++) {
            intArray[f] = -1;
        }

        fillArrayWithUniqueInts(intArray);

        boolean goodInput = false;
        Scanner input = new Scanner(System.in);
        System.out.print("What index do  you want to see? Enter an integer < 100...");
        do {
            try {
                int index = input.nextInt();
                System.out.println("Index " + index + " contains: " + intArray[index]);
                goodInput = true;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Index error " + e.getLocalizedMessage());
                System.out.println("enter an in range integer (<100)");
            }
        }while(!goodInput);

    }

    private static void fillArrayWithUniqueInts(int[] array) {
        int randomInt;

        for(int currentArrayIndex = 0;currentArrayIndex < array.length;currentArrayIndex++) {

            boolean valueInserted = false;

            do {
                randomInt = (int)(Math.random() * 201);

                for(int x = 0; x <= currentArrayIndex;x++) {
                    if(array[x] == randomInt) {
                        break;
                    }

                    if(x == currentArrayIndex) {
                        array[currentArrayIndex] = randomInt;
                        valueInserted = true;
                    }
                }

            } while(!valueInserted);
        }
    }
}
