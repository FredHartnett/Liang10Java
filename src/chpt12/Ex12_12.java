package chpt12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

//ex. 12.12 p.489

public class Ex12_12 {
    public static void main(String[] args) throws FileNotFoundException {
        String inputFile = "resources/TestInput.java";
        String outputFile = "resources/TestOutput.java";
        File targetFile = new File(outputFile);
        ArrayList<String> oldFormat = new ArrayList<>();
        ArrayList<String> newFormat = new ArrayList<>();

        //Check if source file exists
        File sourceFile = new File(inputFile);
        if(!sourceFile.exists()) {
            System.out.println("*** source file does not exist ***");
            System.exit(1);
        }

        Scanner input = new Scanner(sourceFile);

        PrintWriter output = new PrintWriter(targetFile);

        while (input.hasNext()) {
            oldFormat.add(input.nextLine());
        }

        newFormat = reformatTheBraces(oldFormat);

        for (String str : newFormat) {
            output.println(str);
        }

        output.close();
    }

    private static ArrayList<String> reformatTheBraces(ArrayList<String> reformatBracesList) {

        for (int i = 0; i < reformatBracesList.size(); i++) {
            String tmp = reformatBracesList.get(i);
            tmp = tmp.trim();

            if(tmp.equals("{")) {
                reformatBracesList.set(i-1,reformatBracesList.get(i-1) + " {");
                reformatBracesList.remove(i);
            }
        }
        return reformatBracesList;
    }
}