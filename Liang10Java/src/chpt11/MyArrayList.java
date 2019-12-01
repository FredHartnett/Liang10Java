package chpt11;

import java.util.ArrayList;

public class MyArrayList {

    //exercise 11.4
    public static Integer max(ArrayList<Integer> list) {
        if(list.isEmpty())
            return null;

        Integer largest = list.get(0);
        for(int i = 1; i < list.size(); i++) {
            if(list.get(i) > largest)
                largest = list.get(i);
        }
        return largest;
    }

    //exercise 11.11
    public static void sort(ArrayList<Integer> list) {
        // easy way to sort-> java.util.Collections.sort(list);
        int temp_i;
        int temp_j;

        for(int i = 0; i < list.size(); i++) {
            for(int j = i + 1; j < list.size(); j++) {
                if(list.get(i) > list.get(j)) {
                    temp_j = list.get(j);
                    list.set(j, list.get(i));
                    list.set(i, temp_j);
                }
            }
        }
    }
}


