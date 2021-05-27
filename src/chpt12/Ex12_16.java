package chpt12;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex12_16 {
    public static void main(String[] args) throws Exception {
        String filePath = "resources/Exercise12_16.txt";
        File file = new File(filePath);
        Scanner input = new Scanner(file);
        ArrayList<String> al = new ArrayList<>();

        while(input.hasNext()) {
            String s1 = input.nextLine();
            String s2 = s1.replaceAll("e","3");
            al.add(s2);
        }

        PrintWriter output = new PrintWriter(file);

        for(int x = 0; x < al.size(); x++) {
            if(x == (al.size()-1)) {
                output.print(al.get(x));
            } else {
                output.println(al.get(x));
            }
        }
        output.close();
    }
}