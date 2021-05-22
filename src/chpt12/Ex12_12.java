package chpt12;

import java.io.File;

//Ex. 12.12 p.489

public class Ex12_12 {
    public static void main(String[] args) {

        String file = "resources/Test.java";

        // Check if source file exists
        File sourceFile = new File(file);
        if (!sourceFile.exists()) {
            System.out.println("*** source file does not exist ***");
            System.exit(1);
        }
    }
}
