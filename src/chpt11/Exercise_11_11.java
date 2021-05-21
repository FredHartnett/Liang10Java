package chpt11;

/*
(Sort ArrayList) Write the following method that sorts an ArrayList of numbers:
public static void sort(ArrayList<Integer> list)
Write a test program that prompts the user to enter 5 numbers, stores them in an
array list, and displays them in increasing order.
 */

//Exercise 11.11 p.447 (470)
//Class: MyArrayList

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_11_11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();

        System.out.print("enter 5 numbers... ");

        for(int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }

        System.out.println("before sort... " + list.toString());

        MyArrayList.sort(list);

        System.out.println("after sort... " + list.toString());

    }


}
