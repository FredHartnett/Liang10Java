package chpt11;

//Exercise 11.4 p.445 (468)
//Class: MyArrayList

/*
(Maximum element in ArrayList) Write the following method that returns the maximum value in an ArrayList of integers.
The method returns null if the list is null or the list size is 0.

 public static Integer max(ArrayList<Integer> list)

Write a test program that prompts the user to enter a sequence of numbers ending with 0, and invokes this method to return the
largest number in the input.
*/



import java.util.ArrayList;
import java.util.Arrays;

public class Exercise_11_04 {
    public static void main(String[] args) {
        Integer[] array = {100,3, 5, 95, 4, 15, 34, 3, 575,6, 5};
        //Integer[] array = {};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));

        System.out.println("the largest is: " + MyArrayList.max(list));
    }
}
