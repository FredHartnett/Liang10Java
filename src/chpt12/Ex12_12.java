package chpt12;

import java.io.File;

public class Ex12_12 {
    public static void main(String[] args) {
        String file = "/Users/fredhartnett/IdeaProjects/Liang10Chpt12/resources/Ex12Reformat.txt";

        // Check if source file exists
        File sourceFile = new File(file);
        if (!sourceFile.exists()) {
            System.out.println("*** source file does not exist ***");
            System.exit(2);
        }
    }
}
