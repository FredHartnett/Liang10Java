package chpt11;

/*
(Shuffle ArrayList) Write the following method that shuffles the elements in
an ArrayList of integers.
public static void shuffle(ArrayList<Integer> list)
 */

//Exercise 11.07 p.446 (469)
//Class: MyArrayList

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise_11_07 {

    public static void main(String[] args) {

        Integer[] intArray = new Integer[]{55,21,30,432,11};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(intArray));
       
        System.out.println(MyArrayList.shuffle(list));
       
       

    }
}





